/*
 * XML Type:  CT_Background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTBackground
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Background(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTBackground extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTBackground> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctbackgroundd4ectype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fill" element
     */
    com.microsoft.schemas.vml.CTFill getFill();

    /**
     * True if has "fill" element
     */
    boolean isSetFill();

    /**
     * Sets the "fill" element
     */
    void setFill(com.microsoft.schemas.vml.CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    com.microsoft.schemas.vml.CTFill addNewFill();

    /**
     * Unsets the "fill" element
     */
    void unsetFill();

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
     * Gets the "filled" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFilled();

    /**
     * Gets (as xml) the "filled" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFilled();

    /**
     * True if has "filled" attribute
     */
    boolean isSetFilled();

    /**
     * Sets the "filled" attribute
     */
    void setFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum filled);

    /**
     * Sets (as xml) the "filled" attribute
     */
    void xsetFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse filled);

    /**
     * Unsets the "filled" attribute
     */
    void unsetFilled();

    /**
     * Gets the "fillcolor" attribute
     */
    java.lang.String getFillcolor();

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor();

    /**
     * True if has "fillcolor" attribute
     */
    boolean isSetFillcolor();

    /**
     * Sets the "fillcolor" attribute
     */
    void setFillcolor(java.lang.String fillcolor);

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor);

    /**
     * Unsets the "fillcolor" attribute
     */
    void unsetFillcolor();

    /**
     * Gets the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwmode();

    /**
     * Gets (as xml) the "bwmode" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwmode();

    /**
     * True if has "bwmode" attribute
     */
    boolean isSetBwmode();

    /**
     * Sets the "bwmode" attribute
     */
    void setBwmode(com.microsoft.schemas.office.office.STBWMode.Enum bwmode);

    /**
     * Sets (as xml) the "bwmode" attribute
     */
    void xsetBwmode(com.microsoft.schemas.office.office.STBWMode bwmode);

    /**
     * Unsets the "bwmode" attribute
     */
    void unsetBwmode();

    /**
     * Gets the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwpure();

    /**
     * Gets (as xml) the "bwpure" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwpure();

    /**
     * True if has "bwpure" attribute
     */
    boolean isSetBwpure();

    /**
     * Sets the "bwpure" attribute
     */
    void setBwpure(com.microsoft.schemas.office.office.STBWMode.Enum bwpure);

    /**
     * Sets (as xml) the "bwpure" attribute
     */
    void xsetBwpure(com.microsoft.schemas.office.office.STBWMode bwpure);

    /**
     * Unsets the "bwpure" attribute
     */
    void unsetBwpure();

    /**
     * Gets the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode.Enum getBwnormal();

    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    com.microsoft.schemas.office.office.STBWMode xgetBwnormal();

    /**
     * True if has "bwnormal" attribute
     */
    boolean isSetBwnormal();

    /**
     * Sets the "bwnormal" attribute
     */
    void setBwnormal(com.microsoft.schemas.office.office.STBWMode.Enum bwnormal);

    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    void xsetBwnormal(com.microsoft.schemas.office.office.STBWMode bwnormal);

    /**
     * Unsets the "bwnormal" attribute
     */
    void unsetBwnormal();

    /**
     * Gets the "targetscreensize" attribute
     */
    com.microsoft.schemas.office.office.STScreenSize.Enum getTargetscreensize();

    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    com.microsoft.schemas.office.office.STScreenSize xgetTargetscreensize();

    /**
     * True if has "targetscreensize" attribute
     */
    boolean isSetTargetscreensize();

    /**
     * Sets the "targetscreensize" attribute
     */
    void setTargetscreensize(com.microsoft.schemas.office.office.STScreenSize.Enum targetscreensize);

    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    void xsetTargetscreensize(com.microsoft.schemas.office.office.STScreenSize targetscreensize);

    /**
     * Unsets the "targetscreensize" attribute
     */
    void unsetTargetscreensize();
}
