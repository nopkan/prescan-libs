/*
 * An XML document type.
 * Localname: shapelayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.ShapelayoutDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one shapelayout(@urn:schemas-microsoft-com:office:office) element.
 *
 * This is a complex type.
 */
public interface ShapelayoutDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.ShapelayoutDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapelayoutebb0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "shapelayout" element
     */
    com.microsoft.schemas.office.office.CTShapeLayout getShapelayout();

    /**
     * Sets the "shapelayout" element
     */
    void setShapelayout(com.microsoft.schemas.office.office.CTShapeLayout shapelayout);

    /**
     * Appends and returns a new empty "shapelayout" element
     */
    com.microsoft.schemas.office.office.CTShapeLayout addNewShapelayout();
}
