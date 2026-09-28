/*
 * An XML document type.
 * Localname: Masters
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MastersDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one Masters(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface MastersDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.MastersDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "masters0341doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Masters" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MastersType getMasters();

    /**
     * Sets the "Masters" element
     */
    void setMasters(com.microsoft.schemas.office.visio.x2012.main.MastersType masters);

    /**
     * Appends and returns a new empty "Masters" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MastersType addNewMasters();
}
