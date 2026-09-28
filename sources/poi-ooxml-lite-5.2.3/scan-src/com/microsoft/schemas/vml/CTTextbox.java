/*
 * XML Type:  CT_Textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTTextbox
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Textbox(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTTextbox extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTTextbox> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "cttextboxf712type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "txbxContent" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent getTxbxContent();

    /**
     * True if has "txbxContent" element
     */
    boolean isSetTxbxContent();

    /**
     * Sets the "txbxContent" element
     */
    void setTxbxContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent txbxContent);

    /**
     * Appends and returns a new empty "txbxContent" element
     */
    org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent addNewTxbxContent();

    /**
     * Unsets the "txbxContent" element
     */
    void unsetTxbxContent();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();

    /**
     * True if has "id" attribute
     */
    boolean isSetId();

    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "style" attribute
     */
    java.lang.String getStyle();

    /**
     * Gets (as xml) the "style" attribute
     */
    org.apache.xmlbeans.XmlString xgetStyle();

    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();

    /**
     * Sets the "style" attribute
     */
    void setStyle(java.lang.String style);

    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(org.apache.xmlbeans.XmlString style);

    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();

    /**
     * Gets the "inset" attribute
     */
    java.lang.String getInset();

    /**
     * Gets (as xml) the "inset" attribute
     */
    org.apache.xmlbeans.XmlString xgetInset();

    /**
     * True if has "inset" attribute
     */
    boolean isSetInset();

    /**
     * Sets the "inset" attribute
     */
    void setInset(java.lang.String inset);

    /**
     * Sets (as xml) the "inset" attribute
     */
    void xsetInset(org.apache.xmlbeans.XmlString inset);

    /**
     * Unsets the "inset" attribute
     */
    void unsetInset();

    /**
     * Gets the "singleclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getSingleclick();

    /**
     * Gets (as xml) the "singleclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetSingleclick();

    /**
     * True if has "singleclick" attribute
     */
    boolean isSetSingleclick();

    /**
     * Sets the "singleclick" attribute
     */
    void setSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum singleclick);

    /**
     * Sets (as xml) the "singleclick" attribute
     */
    void xsetSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse singleclick);

    /**
     * Unsets the "singleclick" attribute
     */
    void unsetSingleclick();

    /**
     * Gets the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode();

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    com.microsoft.schemas.office.office.STInsetMode xgetInsetmode();

    /**
     * True if has "insetmode" attribute
     */
    boolean isSetInsetmode();

    /**
     * Sets the "insetmode" attribute
     */
    void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode);

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode);

    /**
     * Unsets the "insetmode" attribute
     */
    void unsetInsetmode();
}
