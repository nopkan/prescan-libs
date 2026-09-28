/*
 * XML Type:  CT_IdMap
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTIdMap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_IdMap(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTIdMap extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTIdMap> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctidmap63fatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt.Enum getExt();

    /**
     * Gets (as xml) the "ext" attribute
     */
    com.microsoft.schemas.vml.STExt xgetExt();

    /**
     * True if has "ext" attribute
     */
    boolean isSetExt();

    /**
     * Sets the "ext" attribute
     */
    void setExt(com.microsoft.schemas.vml.STExt.Enum ext);

    /**
     * Sets (as xml) the "ext" attribute
     */
    void xsetExt(com.microsoft.schemas.vml.STExt ext);

    /**
     * Unsets the "ext" attribute
     */
    void unsetExt();

    /**
     * Gets the "data" attribute
     */
    java.lang.String getData();

    /**
     * Gets (as xml) the "data" attribute
     */
    org.apache.xmlbeans.XmlString xgetData();

    /**
     * True if has "data" attribute
     */
    boolean isSetData();

    /**
     * Sets the "data" attribute
     */
    void setData(java.lang.String data);

    /**
     * Sets (as xml) the "data" attribute
     */
    void xsetData(org.apache.xmlbeans.XmlString data);

    /**
     * Unsets the "data" attribute
     */
    void unsetData();
}
