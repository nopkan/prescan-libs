/*
 * An XML document type.
 * Localname: drawing
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.DrawingDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one drawing(@http://schemas.microsoft.com/office/drawing/2008/diagram) element.
 *
 * This is a complex type.
 */
public class DrawingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.DrawingDocument {
    private static final long serialVersionUID = 1L;

    public DrawingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "drawing"),
    };


    /**
     * Gets the "drawing" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing getDrawing() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "drawing" element
     */
    @Override
    public void setDrawing(com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing drawing) {
        generatedSetterHelperImpl(drawing, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "drawing" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing addNewDrawing() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
