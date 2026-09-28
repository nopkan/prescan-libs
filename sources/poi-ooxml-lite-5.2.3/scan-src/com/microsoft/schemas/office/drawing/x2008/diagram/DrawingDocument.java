/*
 * An XML document type.
 * Localname: drawing
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.DrawingDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one drawing(@http://schemas.microsoft.com/office/drawing/2008/diagram) element.
 *
 * This is a complex type.
 */
public interface DrawingDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.drawing.x2008.diagram.DrawingDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "drawing324ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "drawing" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing getDrawing();

    /**
     * Sets the "drawing" element
     */
    void setDrawing(com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing drawing);

    /**
     * Appends and returns a new empty "drawing" element
     */
    com.microsoft.schemas.office.drawing.x2008.diagram.CTDrawing addNewDrawing();
}
