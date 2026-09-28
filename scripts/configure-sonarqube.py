#!/usr/bin/env python3
"""Interactively configure private local projects without sharing credentials."""
import base64
from getpass import getpass
import json
import os
from urllib.error import HTTPError
from urllib.parse import urlencode
from urllib.request import Request, urlopen
from uuid import uuid4

from runtime import ROOT

URL = 'http://127.0.0.1:9000'


def api(path, creds, params=None, post=False):
    encoded = urlencode(params or {}).encode()
    request = Request(URL + path + (('?' + encoded.decode()) if params and not post else ''),
                      data=encoded if post else None)
    request.add_header('Authorization', 'Basic ' + base64.b64encode(
        (creds['login'] + ':' + creds['password']).encode()).decode())
    with urlopen(request, timeout=60) as response:
        body = response.read()
        return json.loads(body) if body else {}


def secret(path, content):
    # Restrictive permissions from creation, before any secret bytes are written.
    fd = os.open(path, os.O_WRONLY | os.O_CREAT | os.O_TRUNC, 0o600)
    os.fchmod(fd, 0o600)
    with os.fdopen(fd, 'w') as out:
        out.write(content)


def main():
    private = ROOT / 'private'
    private.mkdir(mode=0o700, exist_ok=True)
    path = private / 'sonarqube-local.json'
    if path.exists():
        creds = json.loads(path.read_text())
    else:
        print('Connect to your local server. A fresh installation starts with admin / admin.')
        creds = {'login': input('Administrator username [admin]: ').strip() or 'admin',
                 'password': getpass('Current administrator password: ')}
    if not api('/api/authentication/validate', creds).get('valid'):
        raise SystemExit('Invalid login. Check your local dashboard credentials.')
    if creds['password'] == 'admin':
        password = getpass('Choose a new local administrator password: ')
        if not password or password == 'admin' or password != getpass('Confirm new password: '):
            raise SystemExit('Passwords must match and replace the default password.')
        api('/api/users/change_password', creds,
            {'login': creds['login'], 'previousPassword': creds['password'], 'password': password}, post=True)
        creds['password'] = password
    secret(path, json.dumps(creds, indent=2) + '\n')
    inputs = json.loads((ROOT / 'metadata/libraries.json').read_text())
    for item in inputs:
        _, artifact, version = item['coordinates'].split(':')
        key = f'lib-prescan-{artifact}-{version}'
        projects = api('/api/projects/search', creds, {'projects': key})
        if not projects.get('components'):
            api('/api/projects/create', creds,
                {'project': key, 'name': item['coordinates'], 'visibility': 'private'}, post=True)
        token = private / f'{key}.token'
        if not token.exists():
            generated = api('/api/user_tokens/generate', creds,
                            {'name': f'prescan-{artifact}-{uuid4().hex[:12]}',
                             'type': 'PROJECT_ANALYSIS_TOKEN', 'projectKey': key}, post=True)
            secret(token, generated['token'] + '\n')
        print(f'Ready: {key}')
    print('Credentials stay in ignored private/. Run python3 scripts/scan-sources.py.')


if __name__ == '__main__':
    try:
        main()
    except HTTPError as error:
        raise SystemExit(f'SonarQube HTTP {error.code}. Check server status and administrator permissions.') from None
