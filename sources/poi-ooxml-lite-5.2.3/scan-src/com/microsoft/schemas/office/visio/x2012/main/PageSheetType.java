/*
 * XML Type:  PageSheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageSheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML PageSheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PageSheetType extends com.microsoft.schemas.office.visio.x2012.main.SheetType {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PageSheetType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pagesheettype679btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "UniqueID" attribute
     */
    java.lang.String getUniqueID();

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueID();

    /**
     * True if has "UniqueID" attribute
     */
    boolean isSetUniqueID();

    /**
     * Sets the "UniqueID" attribute
     */
    void setUniqueID(java.lang.String uniqueID);

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID);

    /**
     * Unsets the "UniqueID" attribute
     */
    void unsetUniqueID();
}
