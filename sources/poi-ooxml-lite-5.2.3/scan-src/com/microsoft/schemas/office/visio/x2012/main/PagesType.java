/*
 * XML Type:  Pages_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PagesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Pages_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PagesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PagesType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pagestypef2e7type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Page" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.PageType> getPageList();

    /**
     * Gets array of all "Page" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.PageType[] getPageArray();

    /**
     * Gets ith "Page" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageType getPageArray(int i);

    /**
     * Returns number of "Page" element
     */
    int sizeOfPageArray();

    /**
     * Sets array of all "Page" element
     */
    void setPageArray(com.microsoft.schemas.office.visio.x2012.main.PageType[] pageArray);

    /**
     * Sets ith "Page" element
     */
    void setPageArray(int i, com.microsoft.schemas.office.visio.x2012.main.PageType page);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Page" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageType insertNewPage(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Page" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageType addNewPage();

    /**
     * Removes the ith "Page" element
     */
    void removePage(int i);
}
