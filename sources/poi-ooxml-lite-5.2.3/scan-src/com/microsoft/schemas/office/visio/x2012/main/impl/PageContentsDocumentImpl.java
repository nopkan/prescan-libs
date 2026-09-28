/*
 * An XML document type.
 * Localname: PageContents
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PageContents(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class PageContentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument {
    private static final long serialVersionUID = 1L;

    public PageContentsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "PageContents"),
    };


    /**
     * Gets the "PageContents" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageContentsType getPageContents() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageContentsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageContentsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PageContents" element
     */
    @Override
    public void setPageContents(com.microsoft.schemas.office.visio.x2012.main.PageContentsType pageContents) {
        generatedSetterHelperImpl(pageContents, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PageContents" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageContentsType addNewPageContents() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageContentsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageContentsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
