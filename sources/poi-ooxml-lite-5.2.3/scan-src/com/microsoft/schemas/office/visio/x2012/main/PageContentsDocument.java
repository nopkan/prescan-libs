/*
 * An XML document type.
 * Localname: PageContents
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PageContents(@http://schemas.microsoft.com/office/visio/2012/main) element.
 *
 * This is a complex type.
 */
public interface PageContentsDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PageContentsDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pagecontentsfc8bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PageContents" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageContentsType getPageContents();

    /**
     * Sets the "PageContents" element
     */
    void setPageContents(com.microsoft.schemas.office.visio.x2012.main.PageContentsType pageContents);

    /**
     * Appends and returns a new empty "PageContents" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageContentsType addNewPageContents();
}
