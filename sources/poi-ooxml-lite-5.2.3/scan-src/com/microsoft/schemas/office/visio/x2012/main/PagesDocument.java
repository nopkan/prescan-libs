/*
 * An XML document type.
 * Localname: Pages
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PagesDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Pages(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface PagesDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PagesDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pages52f4doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Pages" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PagesType getPages();

    /**
     * Sets the "Pages" element
     */
    void setPages(com.microsoft.schemas.office.visio.x2012.main.PagesType pages);

    /**
     * Appends and returns a new empty "Pages" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PagesType addNewPages();
}
