/*
 * An XML document type.
 * Localname: shapelayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ShapelayoutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one shapelayout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public class ShapelayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.ShapelayoutDocument {
    private static final long serialVersionUID = 1L;

    public ShapelayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "shapelayout"),
    };


    /**
     * Gets the "shapelayout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTShapeLayout getShapelayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTShapeLayout target = null;
            target = (com.microsoft.schemas.office.office.CTShapeLayout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "shapelayout" element
     */
    @Override
    public void setShapelayout(com.microsoft.schemas.office.office.CTShapeLayout shapelayout) {
        generatedSetterHelperImpl(shapelayout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "shapelayout" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTShapeLayout addNewShapelayout() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTShapeLayout target = null;
            target = (com.microsoft.schemas.office.office.CTShapeLayout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
