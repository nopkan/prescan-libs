/*
 * XML Type:  CT_Shadow
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTShadow
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Shadow(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTShadow extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTShadow> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctshadowdfdetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


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
     * Gets the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn();

    /**
     * Gets (as xml) the "on" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn();

    /**
     * True if has "on" attribute
     */
    boolean isSetOn();

    /**
     * Sets the "on" attribute
     */
    void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on);

    /**
     * Sets (as xml) the "on" attribute
     */
    void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on);

    /**
     * Unsets the "on" attribute
     */
    void unsetOn();

    /**
     * Gets the "type" attribute
     */
    com.microsoft.schemas.vml.STShadowType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.vml.STShadowType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.vml.STShadowType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.vml.STShadowType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

    /**
     * Gets the "obscured" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getObscured();

    /**
     * Gets (as xml) the "obscured" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetObscured();

    /**
     * True if has "obscured" attribute
     */
    boolean isSetObscured();

    /**
     * Sets the "obscured" attribute
     */
    void setObscured(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum obscured);

    /**
     * Sets (as xml) the "obscured" attribute
     */
    void xsetObscured(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse obscured);

    /**
     * Unsets the "obscured" attribute
     */
    void unsetObscured();

    /**
     * Gets the "color" attribute
     */
    java.lang.String getColor();

    /**
     * Gets (as xml) the "color" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor();

    /**
     * True if has "color" attribute
     */
    boolean isSetColor();

    /**
     * Sets the "color" attribute
     */
    void setColor(java.lang.String color);

    /**
     * Sets (as xml) the "color" attribute
     */
    void xsetColor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color);

    /**
     * Unsets the "color" attribute
     */
    void unsetColor();

    /**
     * Gets the "opacity" attribute
     */
    java.lang.String getOpacity();

    /**
     * Gets (as xml) the "opacity" attribute
     */
    org.apache.xmlbeans.XmlString xgetOpacity();

    /**
     * True if has "opacity" attribute
     */
    boolean isSetOpacity();

    /**
     * Sets the "opacity" attribute
     */
    void setOpacity(java.lang.String opacity);

    /**
     * Sets (as xml) the "opacity" attribute
     */
    void xsetOpacity(org.apache.xmlbeans.XmlString opacity);

    /**
     * Unsets the "opacity" attribute
     */
    void unsetOpacity();

    /**
     * Gets the "offset" attribute
     */
    java.lang.String getOffset();

    /**
     * Gets (as xml) the "offset" attribute
     */
    org.apache.xmlbeans.XmlString xgetOffset();

    /**
     * True if has "offset" attribute
     */
    boolean isSetOffset();

    /**
     * Sets the "offset" attribute
     */
    void setOffset(java.lang.String offset);

    /**
     * Sets (as xml) the "offset" attribute
     */
    void xsetOffset(org.apache.xmlbeans.XmlString offset);

    /**
     * Unsets the "offset" attribute
     */
    void unsetOffset();

    /**
     * Gets the "color2" attribute
     */
    java.lang.String getColor2();

    /**
     * Gets (as xml) the "color2" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor2();

    /**
     * True if has "color2" attribute
     */
    boolean isSetColor2();

    /**
     * Sets the "color2" attribute
     */
    void setColor2(java.lang.String color2);

    /**
     * Sets (as xml) the "color2" attribute
     */
    void xsetColor2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color2);

    /**
     * Unsets the "color2" attribute
     */
    void unsetColor2();

    /**
     * Gets the "offset2" attribute
     */
    java.lang.String getOffset2();

    /**
     * Gets (as xml) the "offset2" attribute
     */
    org.apache.xmlbeans.XmlString xgetOffset2();

    /**
     * True if has "offset2" attribute
     */
    boolean isSetOffset2();

    /**
     * Sets the "offset2" attribute
     */
    void setOffset2(java.lang.String offset2);

    /**
     * Sets (as xml) the "offset2" attribute
     */
    void xsetOffset2(org.apache.xmlbeans.XmlString offset2);

    /**
     * Unsets the "offset2" attribute
     */
    void unsetOffset2();

    /**
     * Gets the "origin" attribute
     */
    java.lang.String getOrigin();

    /**
     * Gets (as xml) the "origin" attribute
     */
    org.apache.xmlbeans.XmlString xgetOrigin();

    /**
     * True if has "origin" attribute
     */
    boolean isSetOrigin();

    /**
     * Sets the "origin" attribute
     */
    void setOrigin(java.lang.String origin);

    /**
     * Sets (as xml) the "origin" attribute
     */
    void xsetOrigin(org.apache.xmlbeans.XmlString origin);

    /**
     * Unsets the "origin" attribute
     */
    void unsetOrigin();

    /**
     * Gets the "matrix" attribute
     */
    java.lang.String getMatrix();

    /**
     * Gets (as xml) the "matrix" attribute
     */
    org.apache.xmlbeans.XmlString xgetMatrix();

    /**
     * True if has "matrix" attribute
     */
    boolean isSetMatrix();

    /**
     * Sets the "matrix" attribute
     */
    void setMatrix(java.lang.String matrix);

    /**
     * Sets (as xml) the "matrix" attribute
     */
    void xsetMatrix(org.apache.xmlbeans.XmlString matrix);

    /**
     * Unsets the "matrix" attribute
     */
    void unsetMatrix();
}
