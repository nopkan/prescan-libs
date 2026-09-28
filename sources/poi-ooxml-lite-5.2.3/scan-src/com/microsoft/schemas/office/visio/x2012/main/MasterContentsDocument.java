/*
 * An XML document type.
 * Localname: MasterContents
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MasterContentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one MasterContents(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface MasterContentsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.MasterContentsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "mastercontentscb9edoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "MasterContents" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageContentsType getMasterContents();

    /**
     * Sets the "MasterContents" element
     */
    void setMasterContents(com.microsoft.schemas.office.visio.x2012.main.PageContentsType masterContents);

    /**
     * Appends and returns a new empty "MasterContents" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageContentsType addNewMasterContents();
}
