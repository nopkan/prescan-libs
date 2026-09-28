/*
 * XML Type:  Connect_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ConnectType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Connect_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ConnectType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ConnectType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "connecttypeea41type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "FromSheet" attribute
     */
    long getFromSheet();

    /**
     * Gets (as xml) the "FromSheet" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFromSheet();

    /**
     * Sets the "FromSheet" attribute
     */
    void setFromSheet(long fromSheet);

    /**
     * Sets (as xml) the "FromSheet" attribute
     */
    void xsetFromSheet(org.apache.xmlbeans.XmlUnsignedInt fromSheet);

    /**
     * Gets the "FromCell" attribute
     */
    java.lang.String getFromCell();

    /**
     * Gets (as xml) the "FromCell" attribute
     */
    org.apache.xmlbeans.XmlString xgetFromCell();

    /**
     * True if has "FromCell" attribute
     */
    boolean isSetFromCell();

    /**
     * Sets the "FromCell" attribute
     */
    void setFromCell(java.lang.String fromCell);

    /**
     * Sets (as xml) the "FromCell" attribute
     */
    void xsetFromCell(org.apache.xmlbeans.XmlString fromCell);

    /**
     * Unsets the "FromCell" attribute
     */
    void unsetFromCell();

    /**
     * Gets the "FromPart" attribute
     */
    int getFromPart();

    /**
     * Gets (as xml) the "FromPart" attribute
     */
    org.apache.xmlbeans.XmlInt xgetFromPart();

    /**
     * True if has "FromPart" attribute
     */
    boolean isSetFromPart();

    /**
     * Sets the "FromPart" attribute
     */
    void setFromPart(int fromPart);

    /**
     * Sets (as xml) the "FromPart" attribute
     */
    void xsetFromPart(org.apache.xmlbeans.XmlInt fromPart);

    /**
     * Unsets the "FromPart" attribute
     */
    void unsetFromPart();

    /**
     * Gets the "ToSheet" attribute
     */
    long getToSheet();

    /**
     * Gets (as xml) the "ToSheet" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetToSheet();

    /**
     * Sets the "ToSheet" attribute
     */
    void setToSheet(long toSheet);

    /**
     * Sets (as xml) the "ToSheet" attribute
     */
    void xsetToSheet(org.apache.xmlbeans.XmlUnsignedInt toSheet);

    /**
     * Gets the "ToCell" attribute
     */
    java.lang.String getToCell();

    /**
     * Gets (as xml) the "ToCell" attribute
     */
    org.apache.xmlbeans.XmlString xgetToCell();

    /**
     * True if has "ToCell" attribute
     */
    boolean isSetToCell();

    /**
     * Sets the "ToCell" attribute
     */
    void setToCell(java.lang.String toCell);

    /**
     * Sets (as xml) the "ToCell" attribute
     */
    void xsetToCell(org.apache.xmlbeans.XmlString toCell);

    /**
     * Unsets the "ToCell" attribute
     */
    void unsetToCell();

    /**
     * Gets the "ToPart" attribute
     */
    int getToPart();

    /**
     * Gets (as xml) the "ToPart" attribute
     */
    org.apache.xmlbeans.XmlInt xgetToPart();

    /**
     * True if has "ToPart" attribute
     */
    boolean isSetToPart();

    /**
     * Sets the "ToPart" attribute
     */
    void setToPart(int toPart);

    /**
     * Sets (as xml) the "ToPart" attribute
     */
    void xsetToPart(org.apache.xmlbeans.XmlInt toPart);

    /**
     * Unsets the "ToPart" attribute
     */
    void unsetToPart();
}
