/*
 * An XML document type.
 * Localname: VisioDocument
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one VisioDocument(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class VisioDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1 {
    private static final long serialVersionUID = 1L;

    public VisioDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "VisioDocument"),
    };


    /**
     * Gets the "VisioDocument" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType getVisioDocument() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "VisioDocument" element
     */
    @Override
    public void setVisioDocument(com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType visioDocument) {
        generatedSetterHelperImpl(visioDocument, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "VisioDocument" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType addNewVisioDocument() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
