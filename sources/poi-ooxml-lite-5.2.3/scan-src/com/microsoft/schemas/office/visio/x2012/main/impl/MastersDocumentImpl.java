/*
 * An XML document type.
 * Localname: Masters
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MastersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Masters(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public class MastersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.MastersDocument {
    private static final long serialVersionUID = 1L;

    public MastersDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Masters"),
    };


    /**
     * Gets the "Masters" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MastersType getMasters() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MastersType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MastersType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Masters" element
     */
    @Override
    public void setMasters(com.microsoft.schemas.office.visio.x2012.main.MastersType masters) {
        generatedSetterHelperImpl(masters, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Masters" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MastersType addNewMasters() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MastersType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MastersType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
