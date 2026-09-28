/*
 * XML Type:  StyleSheets_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML StyleSheets_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface StyleSheetsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stylesheetstypeb706type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "StyleSheet" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.StyleSheetType> getStyleSheetList();

    /**
     * Gets array of all "StyleSheet" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetType[] getStyleSheetArray();

    /**
     * Gets ith "StyleSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetType getStyleSheetArray(int i);

    /**
     * Returns number of "StyleSheet" element
     */
    int sizeOfStyleSheetArray();

    /**
     * Sets array of all "StyleSheet" element
     */
    void setStyleSheetArray(com.microsoft.schemas.office.visio.x2012.main.StyleSheetType[] styleSheetArray);

    /**
     * Sets ith "StyleSheet" element
     */
    void setStyleSheetArray(int i, com.microsoft.schemas.office.visio.x2012.main.StyleSheetType styleSheet);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StyleSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetType insertNewStyleSheet(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "StyleSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetType addNewStyleSheet();

    /**
     * Removes the ith "StyleSheet" element
     */
    void removeStyleSheet(int i);
}
