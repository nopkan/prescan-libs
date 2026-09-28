/*
 * XML Type:  CT_Fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTFill
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Fill(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTFill extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTFill> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctfillb241type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "fill" element
     */
    com.microsoft.schemas.office.office.CTFill getFill();

    /**
     * True if has "fill" element
     */
    boolean isSetFill();

    /**
     * Sets the "fill" element
     */
    void setFill(com.microsoft.schemas.office.office.CTFill fill);

    /**
     * Appends and returns a new empty "fill" element
     */
    com.microsoft.schemas.office.office.CTFill addNewFill();

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
     * Gets the "type" attribute
     */
    com.microsoft.schemas.vml.STFillType.Enum getType();

    /**
     * Gets (as xml) the "type" attribute
     */
    com.microsoft.schemas.vml.STFillType xgetType();

    /**
     * True if has "type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "type" attribute
     */
    void setType(com.microsoft.schemas.vml.STFillType.Enum type);

    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.microsoft.schemas.vml.STFillType type);

    /**
     * Unsets the "type" attribute
     */
    void unsetType();

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
     * Gets the "src" attribute
     */
    java.lang.String getSrc();

    /**
     * Gets (as xml) the "src" attribute
     */
    org.apache.xmlbeans.XmlString xgetSrc();

    /**
     * True if has "src" attribute
     */
    boolean isSetSrc();

    /**
     * Sets the "src" attribute
     */
    void setSrc(java.lang.String src);

    /**
     * Sets (as xml) the "src" attribute
     */
    void xsetSrc(org.apache.xmlbeans.XmlString src);

    /**
     * Unsets the "src" attribute
     */
    void unsetSrc();

    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();

    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlString xgetHref();

    /**
     * True if has "href" attribute
     */
    boolean isSetHref();

    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);

    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlString href);

    /**
     * Unsets the "href" attribute
     */
    void unsetHref();

    /**
     * Gets the "althref" attribute
     */
    java.lang.String getAlthref();

    /**
     * Gets (as xml) the "althref" attribute
     */
    org.apache.xmlbeans.XmlString xgetAlthref();

    /**
     * True if has "althref" attribute
     */
    boolean isSetAlthref();

    /**
     * Sets the "althref" attribute
     */
    void setAlthref(java.lang.String althref);

    /**
     * Sets (as xml) the "althref" attribute
     */
    void xsetAlthref(org.apache.xmlbeans.XmlString althref);

    /**
     * Unsets the "althref" attribute
     */
    void unsetAlthref();

    /**
     * Gets the "size" attribute
     */
    java.lang.String getSize();

    /**
     * Gets (as xml) the "size" attribute
     */
    org.apache.xmlbeans.XmlString xgetSize();

    /**
     * True if has "size" attribute
     */
    boolean isSetSize();

    /**
     * Sets the "size" attribute
     */
    void setSize(java.lang.String size);

    /**
     * Sets (as xml) the "size" attribute
     */
    void xsetSize(org.apache.xmlbeans.XmlString size);

    /**
     * Unsets the "size" attribute
     */
    void unsetSize();

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
     * Gets the "position" attribute
     */
    java.lang.String getPosition();

    /**
     * Gets (as xml) the "position" attribute
     */
    org.apache.xmlbeans.XmlString xgetPosition();

    /**
     * True if has "position" attribute
     */
    boolean isSetPosition();

    /**
     * Sets the "position" attribute
     */
    void setPosition(java.lang.String position);

    /**
     * Sets (as xml) the "position" attribute
     */
    void xsetPosition(org.apache.xmlbeans.XmlString position);

    /**
     * Unsets the "position" attribute
     */
    void unsetPosition();

    /**
     * Gets the "aspect" attribute
     */
    com.microsoft.schemas.vml.STImageAspect.Enum getAspect();

    /**
     * Gets (as xml) the "aspect" attribute
     */
    com.microsoft.schemas.vml.STImageAspect xgetAspect();

    /**
     * True if has "aspect" attribute
     */
    boolean isSetAspect();

    /**
     * Sets the "aspect" attribute
     */
    void setAspect(com.microsoft.schemas.vml.STImageAspect.Enum aspect);

    /**
     * Sets (as xml) the "aspect" attribute
     */
    void xsetAspect(com.microsoft.schemas.vml.STImageAspect aspect);

    /**
     * Unsets the "aspect" attribute
     */
    void unsetAspect();

    /**
     * Gets the "colors" attribute
     */
    java.lang.String getColors();

    /**
     * Gets (as xml) the "colors" attribute
     */
    org.apache.xmlbeans.XmlString xgetColors();

    /**
     * True if has "colors" attribute
     */
    boolean isSetColors();

    /**
     * Sets the "colors" attribute
     */
    void setColors(java.lang.String colors);

    /**
     * Sets (as xml) the "colors" attribute
     */
    void xsetColors(org.apache.xmlbeans.XmlString colors);

    /**
     * Unsets the "colors" attribute
     */
    void unsetColors();

    /**
     * Gets the "angle" attribute
     */
    java.math.BigDecimal getAngle();

    /**
     * Gets (as xml) the "angle" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetAngle();

    /**
     * True if has "angle" attribute
     */
    boolean isSetAngle();

    /**
     * Sets the "angle" attribute
     */
    void setAngle(java.math.BigDecimal angle);

    /**
     * Sets (as xml) the "angle" attribute
     */
    void xsetAngle(org.apache.xmlbeans.XmlDecimal angle);

    /**
     * Unsets the "angle" attribute
     */
    void unsetAngle();

    /**
     * Gets the "alignshape" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAlignshape();

    /**
     * Gets (as xml) the "alignshape" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAlignshape();

    /**
     * True if has "alignshape" attribute
     */
    boolean isSetAlignshape();

    /**
     * Sets the "alignshape" attribute
     */
    void setAlignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum alignshape);

    /**
     * Sets (as xml) the "alignshape" attribute
     */
    void xsetAlignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse alignshape);

    /**
     * Unsets the "alignshape" attribute
     */
    void unsetAlignshape();

    /**
     * Gets the "focus" attribute
     */
    java.lang.String getFocus();

    /**
     * Gets (as xml) the "focus" attribute
     */
    org.apache.xmlbeans.XmlString xgetFocus();

    /**
     * True if has "focus" attribute
     */
    boolean isSetFocus();

    /**
     * Sets the "focus" attribute
     */
    void setFocus(java.lang.String focus);

    /**
     * Sets (as xml) the "focus" attribute
     */
    void xsetFocus(org.apache.xmlbeans.XmlString focus);

    /**
     * Unsets the "focus" attribute
     */
    void unsetFocus();

    /**
     * Gets the "focussize" attribute
     */
    java.lang.String getFocussize();

    /**
     * Gets (as xml) the "focussize" attribute
     */
    org.apache.xmlbeans.XmlString xgetFocussize();

    /**
     * True if has "focussize" attribute
     */
    boolean isSetFocussize();

    /**
     * Sets the "focussize" attribute
     */
    void setFocussize(java.lang.String focussize);

    /**
     * Sets (as xml) the "focussize" attribute
     */
    void xsetFocussize(org.apache.xmlbeans.XmlString focussize);

    /**
     * Unsets the "focussize" attribute
     */
    void unsetFocussize();

    /**
     * Gets the "focusposition" attribute
     */
    java.lang.String getFocusposition();

    /**
     * Gets (as xml) the "focusposition" attribute
     */
    org.apache.xmlbeans.XmlString xgetFocusposition();

    /**
     * True if has "focusposition" attribute
     */
    boolean isSetFocusposition();

    /**
     * Sets the "focusposition" attribute
     */
    void setFocusposition(java.lang.String focusposition);

    /**
     * Sets (as xml) the "focusposition" attribute
     */
    void xsetFocusposition(org.apache.xmlbeans.XmlString focusposition);

    /**
     * Unsets the "focusposition" attribute
     */
    void unsetFocusposition();

    /**
     * Gets the "method" attribute
     */
    com.microsoft.schemas.vml.STFillMethod.Enum getMethod();

    /**
     * Gets (as xml) the "method" attribute
     */
    com.microsoft.schemas.vml.STFillMethod xgetMethod();

    /**
     * True if has "method" attribute
     */
    boolean isSetMethod();

    /**
     * Sets the "method" attribute
     */
    void setMethod(com.microsoft.schemas.vml.STFillMethod.Enum method);

    /**
     * Sets (as xml) the "method" attribute
     */
    void xsetMethod(com.microsoft.schemas.vml.STFillMethod method);

    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();

    /**
     * Gets the "detectmouseclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDetectmouseclick();

    /**
     * Gets (as xml) the "detectmouseclick" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDetectmouseclick();

    /**
     * True if has "detectmouseclick" attribute
     */
    boolean isSetDetectmouseclick();

    /**
     * Sets the "detectmouseclick" attribute
     */
    void setDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum detectmouseclick);

    /**
     * Sets (as xml) the "detectmouseclick" attribute
     */
    void xsetDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse detectmouseclick);

    /**
     * Unsets the "detectmouseclick" attribute
     */
    void unsetDetectmouseclick();

    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();

    /**
     * Gets (as xml) the "title" attribute
     */
    org.apache.xmlbeans.XmlString xgetTitle();

    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();

    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);

    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);

    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();

    /**
     * Gets the "opacity2" attribute
     */
    java.lang.String getOpacity2();

    /**
     * Gets (as xml) the "opacity2" attribute
     */
    org.apache.xmlbeans.XmlString xgetOpacity2();

    /**
     * True if has "opacity2" attribute
     */
    boolean isSetOpacity2();

    /**
     * Sets the "opacity2" attribute
     */
    void setOpacity2(java.lang.String opacity2);

    /**
     * Sets (as xml) the "opacity2" attribute
     */
    void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2);

    /**
     * Unsets the "opacity2" attribute
     */
    void unsetOpacity2();

    /**
     * Gets the "recolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getRecolor();

    /**
     * Gets (as xml) the "recolor" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetRecolor();

    /**
     * True if has "recolor" attribute
     */
    boolean isSetRecolor();

    /**
     * Sets the "recolor" attribute
     */
    void setRecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum recolor);

    /**
     * Sets (as xml) the "recolor" attribute
     */
    void xsetRecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse recolor);

    /**
     * Unsets the "recolor" attribute
     */
    void unsetRecolor();

    /**
     * Gets the "rotate" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getRotate();

    /**
     * Gets (as xml) the "rotate" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetRotate();

    /**
     * True if has "rotate" attribute
     */
    boolean isSetRotate();

    /**
     * Sets the "rotate" attribute
     */
    void setRotate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum rotate);

    /**
     * Sets (as xml) the "rotate" attribute
     */
    void xsetRotate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse rotate);

    /**
     * Unsets the "rotate" attribute
     */
    void unsetRotate();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId2();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId2();

    /**
     * True if has "id" attribute
     */
    boolean isSetId2();

    /**
     * Sets the "id" attribute
     */
    void setId2(java.lang.String id2);

    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId2(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id2);

    /**
     * Unsets the "id" attribute
     */
    void unsetId2();

    /**
     * Gets the "relid" attribute
     */
    java.lang.String getRelid();

    /**
     * Gets (as xml) the "relid" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetRelid();

    /**
     * True if has "relid" attribute
     */
    boolean isSetRelid();

    /**
     * Sets the "relid" attribute
     */
    void setRelid(java.lang.String relid);

    /**
     * Sets (as xml) the "relid" attribute
     */
    void xsetRelid(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId relid);

    /**
     * Unsets the "relid" attribute
     */
    void unsetRelid();
}
