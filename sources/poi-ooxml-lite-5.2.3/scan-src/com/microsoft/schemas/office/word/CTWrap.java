/*
 * XML Type:  CT_Wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.CTWrap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Wrap(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public interface CTWrap extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.word.CTWrap> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctwrapbc3btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.office.word.STWrapType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.office.word.STWrapType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.office.word.STWrapType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.office.word.STWrapType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "side" attribute
     */
    com.microsoft.schemas.office.word.STWrapSide.Enum getSide();

    /**
     * Gets (as xml) the "side" attribute
     */
    com.microsoft.schemas.office.word.STWrapSide xgetSide();

    /**
     * True if has "side" attribute
     */
    boolean isSetSide();

    /**
     * Sets the "side" attribute
     */
    void setSide(com.microsoft.schemas.office.word.STWrapSide.Enum side);

    /**
     * Sets (as xml) the "side" attribute
     */
    void xsetSide(com.microsoft.schemas.office.word.STWrapSide side);

    /**
     * Unsets the "side" attribute
     */
    void unsetSide();

    /**
     * Gets the "anchorx" attribute
     */
    com.microsoft.schemas.office.word.STHorizontalAnchor.Enum getAnchorx();

    /**
     * Gets (as xml) the "anchorx" attribute
     */
    com.microsoft.schemas.office.word.STHorizontalAnchor xgetAnchorx();

    /**
     * True if has "anchorx" attribute
     */
    boolean isSetAnchorx();

    /**
     * Sets the "anchorx" attribute
     */
    void setAnchorx(com.microsoft.schemas.office.word.STHorizontalAnchor.Enum anchorx);

    /**
     * Sets (as xml) the "anchorx" attribute
     */
    void xsetAnchorx(com.microsoft.schemas.office.word.STHorizontalAnchor anchorx);

    /**
     * Unsets the "anchorx" attribute
     */
    void unsetAnchorx();

    /**
     * Gets the "anchory" attribute
     */
    com.microsoft.schemas.office.word.STVerticalAnchor.Enum getAnchory();

    /**
     * Gets (as xml) the "anchory" attribute
     */
    com.microsoft.schemas.office.word.STVerticalAnchor xgetAnchory();

    /**
     * True if has "anchory" attribute
     */
    boolean isSetAnchory();

    /**
     * Sets the "anchory" attribute
     */
    void setAnchory(com.microsoft.schemas.office.word.STVerticalAnchor.Enum anchory);

    /**
     * Sets (as xml) the "anchory" attribute
     */
    void xsetAnchory(com.microsoft.schemas.office.word.STVerticalAnchor anchory);

    /**
     * Unsets the "anchory" attribute
     */
    void unsetAnchory();
}
