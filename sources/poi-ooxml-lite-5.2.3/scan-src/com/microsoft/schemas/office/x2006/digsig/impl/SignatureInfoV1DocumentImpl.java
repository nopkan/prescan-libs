/*
 * An XML document type.
 * Localname: SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig) element.
 *
 * This is a complex type.
 */
public class SignatureInfoV1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document {
    private static final long serialVersionUID = 1L;

    public SignatureInfoV1DocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureInfoV1"),
    };


    /**
     * Gets the "SignatureInfoV1" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 getSignatureInfoV1() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SignatureInfoV1" element
     */
    @Override
    public void setSignatureInfoV1(com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 signatureInfoV1) {
        generatedSetterHelperImpl(signatureInfoV1, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SignatureInfoV1" element
     */
    @Override
    public com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 addNewSignatureInfoV1() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 target = null;
            target = (com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
