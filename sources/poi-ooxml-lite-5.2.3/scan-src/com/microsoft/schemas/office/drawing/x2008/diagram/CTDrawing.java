/*
 * XML Type:  CT_Drawing
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Drawing(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public interface CTDrawing extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctdrawingc4f9type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "spTree" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape getSpTree();

    /**
     * Sets the "spTree" element
     */
    void setSpTree(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape spTree);

    /**
     * Appends and returns a new empty "spTree" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape addNewSpTree();
}
