/*
 * An XML document type.
 * Localname: Pages
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PagesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Pages(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class PagesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PagesDocument {
    private static final long serialVersionUID = 1L;

    public PagesDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Pages"),
    };


    /**
     * Gets the "Pages" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PagesType getPages() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PagesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PagesType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Pages" element
     */
    @Override
    public void setPages(com.microsoft.schemas.office.visio.x2012.main.PagesType pages) {
        generatedSetterHelperImpl(pages, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Pages" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PagesType addNewPages() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PagesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PagesType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
