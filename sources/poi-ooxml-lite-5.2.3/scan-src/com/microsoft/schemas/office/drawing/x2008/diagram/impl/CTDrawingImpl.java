/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Drawing(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public class CTDrawingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing {
    private static final long serialVersionUID = 1L;

    public CTDrawingImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "spTree"),
    };


    /**
     * Gets the "spTree" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape getSpTree() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "spTree" element
     */
    @Override
    public void setSpTree(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape spTree) {
        generatedSetterHelperImpl(spTree, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "spTree" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape addNewSpTree() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
