/*
 * An XML document type.
 * Localname: VisioDocument
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VisioDocument(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface VisioDocumentDocument1 extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.VisioDocumentDocument1> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "visiodocumentd431doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VisioDocument" element
     */
    com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType getVisioDocument();

    /**
     * Sets the "VisioDocument" element
     */
    void setVisioDocument(com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType visioDocument);

    /**
     * Appends and returns a new empty "VisioDocument" element
     */
    com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType addNewVisioDocument();
}
