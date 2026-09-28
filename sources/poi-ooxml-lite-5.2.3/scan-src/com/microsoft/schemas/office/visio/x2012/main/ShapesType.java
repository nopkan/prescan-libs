/*
 * XML Type:  Shapes_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ShapesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Shapes_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ShapesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ShapesType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapestypef507type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Shape" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType> getShapeList();

    /**
     * Gets array of all "Shape" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType[] getShapeArray();

    /**
     * Gets ith "Shape" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType getShapeArray(int i);

    /**
     * Returns number of "Shape" element
     */
    int sizeOfShapeArray();

    /**
     * Sets array of all "Shape" element
     */
    void setShapeArray(com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType[] shapeArray);

    /**
     * Sets ith "Shape" element
     */
    void setShapeArray(int i, com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType shape);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Shape" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType insertNewShape(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Shape" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType addNewShape();

    /**
     * Removes the ith "Shape" element
     */
    void removeShape(int i);
}
