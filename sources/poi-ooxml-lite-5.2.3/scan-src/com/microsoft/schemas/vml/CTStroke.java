/*
 * XML Type:  CT_Stroke
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTStroke
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_Stroke(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public interface CTStroke extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.vml.CTStroke> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctstrokee2f6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "left" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getLeft();

    /**
     * True if has "left" element
     */
    boolean isSetLeft();

    /**
     * Sets the "left" element
     */
    void setLeft(com.microsoft.schemas.office.office.CTStrokeChild left);

    /**
     * Appends and returns a new empty "left" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewLeft();

    /**
     * Unsets the "left" element
     */
    void unsetLeft();

    /**
     * Gets the "top" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getTop();

    /**
     * True if has "top" element
     */
    boolean isSetTop();

    /**
     * Sets the "top" element
     */
    void setTop(com.microsoft.schemas.office.office.CTStrokeChild top);

    /**
     * Appends and returns a new empty "top" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewTop();

    /**
     * Unsets the "top" element
     */
    void unsetTop();

    /**
     * Gets the "right" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getRight();

    /**
     * True if has "right" element
     */
    boolean isSetRight();

    /**
     * Sets the "right" element
     */
    void setRight(com.microsoft.schemas.office.office.CTStrokeChild right);

    /**
     * Appends and returns a new empty "right" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewRight();

    /**
     * Unsets the "right" element
     */
    void unsetRight();

    /**
     * Gets the "bottom" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getBottom();

    /**
     * True if has "bottom" element
     */
    boolean isSetBottom();

    /**
     * Sets the "bottom" element
     */
    void setBottom(com.microsoft.schemas.office.office.CTStrokeChild bottom);

    /**
     * Appends and returns a new empty "bottom" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewBottom();

    /**
     * Unsets the "bottom" element
     */
    void unsetBottom();

    /**
     * Gets the "column" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild getColumn();

    /**
     * True if has "column" element
     */
    boolean isSetColumn();

    /**
     * Sets the "column" element
     */
    void setColumn(com.microsoft.schemas.office.office.CTStrokeChild column);

    /**
     * Appends and returns a new empty "column" element
     */
    com.microsoft.schemas.office.office.CTStrokeChild addNewColumn();

    /**
     * Unsets the "column" element
     */
    void unsetColumn();

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
     * Gets the "weight" attribute
     */
    java.lang.String getWeight();

    /**
     * Gets (as xml) the "weight" attribute
     */
    org.apache.xmlbeans.XmlString xgetWeight();

    /**
     * True if has "weight" attribute
     */
    boolean isSetWeight();

    /**
     * Sets the "weight" attribute
     */
    void setWeight(java.lang.String weight);

    /**
     * Sets (as xml) the "weight" attribute
     */
    void xsetWeight(org.apache.xmlbeans.XmlString weight);

    /**
     * Unsets the "weight" attribute
     */
    void unsetWeight();

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
     * Gets the "linestyle" attribute
     */
    com.microsoft.schemas.vml.STStrokeLineStyle.Enum getLinestyle();

    /**
     * Gets (as xml) the "linestyle" attribute
     */
    com.microsoft.schemas.vml.STStrokeLineStyle xgetLinestyle();

    /**
     * True if has "linestyle" attribute
     */
    boolean isSetLinestyle();

    /**
     * Sets the "linestyle" attribute
     */
    void setLinestyle(com.microsoft.schemas.vml.STStrokeLineStyle.Enum linestyle);

    /**
     * Sets (as xml) the "linestyle" attribute
     */
    void xsetLinestyle(com.microsoft.schemas.vml.STStrokeLineStyle linestyle);

    /**
     * Unsets the "linestyle" attribute
     */
    void unsetLinestyle();

    /**
     * Gets the "miterlimit" attribute
     */
    java.math.BigDecimal getMiterlimit();

    /**
     * Gets (as xml) the "miterlimit" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMiterlimit();

    /**
     * True if has "miterlimit" attribute
     */
    boolean isSetMiterlimit();

    /**
     * Sets the "miterlimit" attribute
     */
    void setMiterlimit(java.math.BigDecimal miterlimit);

    /**
     * Sets (as xml) the "miterlimit" attribute
     */
    void xsetMiterlimit(org.apache.xmlbeans.XmlDecimal miterlimit);

    /**
     * Unsets the "miterlimit" attribute
     */
    void unsetMiterlimit();

    /**
     * Gets the "joinstyle" attribute
     */
    com.microsoft.schemas.vml.STStrokeJoinStyle.Enum getJoinstyle();

    /**
     * Gets (as xml) the "joinstyle" attribute
     */
    com.microsoft.schemas.vml.STStrokeJoinStyle xgetJoinstyle();

    /**
     * True if has "joinstyle" attribute
     */
    boolean isSetJoinstyle();

    /**
     * Sets the "joinstyle" attribute
     */
    void setJoinstyle(com.microsoft.schemas.vml.STStrokeJoinStyle.Enum joinstyle);

    /**
     * Sets (as xml) the "joinstyle" attribute
     */
    void xsetJoinstyle(com.microsoft.schemas.vml.STStrokeJoinStyle joinstyle);

    /**
     * Unsets the "joinstyle" attribute
     */
    void unsetJoinstyle();

    /**
     * Gets the "endcap" attribute
     */
    com.microsoft.schemas.vml.STStrokeEndCap.Enum getEndcap();

    /**
     * Gets (as xml) the "endcap" attribute
     */
    com.microsoft.schemas.vml.STStrokeEndCap xgetEndcap();

    /**
     * True if has "endcap" attribute
     */
    boolean isSetEndcap();

    /**
     * Sets the "endcap" attribute
     */
    void setEndcap(com.microsoft.schemas.vml.STStrokeEndCap.Enum endcap);

    /**
     * Sets (as xml) the "endcap" attribute
     */
    void xsetEndcap(com.microsoft.schemas.vml.STStrokeEndCap endcap);

    /**
     * Unsets the "endcap" attribute
     */
    void unsetEndcap();

    /**
     * Gets the "dashstyle" attribute
     */
    java.lang.String getDashstyle();

    /**
     * Gets (as xml) the "dashstyle" attribute
     */
    org.apache.xmlbeans.XmlString xgetDashstyle();

    /**
     * True if has "dashstyle" attribute
     */
    boolean isSetDashstyle();

    /**
     * Sets the "dashstyle" attribute
     */
    void setDashstyle(java.lang.String dashstyle);

    /**
     * Sets (as xml) the "dashstyle" attribute
     */
    void xsetDashstyle(org.apache.xmlbeans.XmlString dashstyle);

    /**
     * Unsets the "dashstyle" attribute
     */
    void unsetDashstyle();

    /**
     * Gets the "filltype" attribute
     */
    com.microsoft.schemas.vml.STFillType.Enum getFilltype();

    /**
     * Gets (as xml) the "filltype" attribute
     */
    com.microsoft.schemas.vml.STFillType xgetFilltype();

    /**
     * True if has "filltype" attribute
     */
    boolean isSetFilltype();

    /**
     * Sets the "filltype" attribute
     */
    void setFilltype(com.microsoft.schemas.vml.STFillType.Enum filltype);

    /**
     * Sets (as xml) the "filltype" attribute
     */
    void xsetFilltype(com.microsoft.schemas.vml.STFillType filltype);

    /**
     * Unsets the "filltype" attribute
     */
    void unsetFilltype();

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
     * Gets the "imageaspect" attribute
     */
    com.microsoft.schemas.vml.STImageAspect.Enum getImageaspect();

    /**
     * Gets (as xml) the "imageaspect" attribute
     */
    com.microsoft.schemas.vml.STImageAspect xgetImageaspect();

    /**
     * True if has "imageaspect" attribute
     */
    boolean isSetImageaspect();

    /**
     * Sets the "imageaspect" attribute
     */
    void setImageaspect(com.microsoft.schemas.vml.STImageAspect.Enum imageaspect);

    /**
     * Sets (as xml) the "imageaspect" attribute
     */
    void xsetImageaspect(com.microsoft.schemas.vml.STImageAspect imageaspect);

    /**
     * Unsets the "imageaspect" attribute
     */
    void unsetImageaspect();

    /**
     * Gets the "imagesize" attribute
     */
    java.lang.String getImagesize();

    /**
     * Gets (as xml) the "imagesize" attribute
     */
    org.apache.xmlbeans.XmlString xgetImagesize();

    /**
     * True if has "imagesize" attribute
     */
    boolean isSetImagesize();

    /**
     * Sets the "imagesize" attribute
     */
    void setImagesize(java.lang.String imagesize);

    /**
     * Sets (as xml) the "imagesize" attribute
     */
    void xsetImagesize(org.apache.xmlbeans.XmlString imagesize);

    /**
     * Unsets the "imagesize" attribute
     */
    void unsetImagesize();

    /**
     * Gets the "imagealignshape" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getImagealignshape();

    /**
     * Gets (as xml) the "imagealignshape" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetImagealignshape();

    /**
     * True if has "imagealignshape" attribute
     */
    boolean isSetImagealignshape();

    /**
     * Sets the "imagealignshape" attribute
     */
    void setImagealignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum imagealignshape);

    /**
     * Sets (as xml) the "imagealignshape" attribute
     */
    void xsetImagealignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse imagealignshape);

    /**
     * Unsets the "imagealignshape" attribute
     */
    void unsetImagealignshape();

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
     * Gets the "startarrow" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowType.Enum getStartarrow();

    /**
     * Gets (as xml) the "startarrow" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowType xgetStartarrow();

    /**
     * True if has "startarrow" attribute
     */
    boolean isSetStartarrow();

    /**
     * Sets the "startarrow" attribute
     */
    void setStartarrow(com.microsoft.schemas.vml.STStrokeArrowType.Enum startarrow);

    /**
     * Sets (as xml) the "startarrow" attribute
     */
    void xsetStartarrow(com.microsoft.schemas.vml.STStrokeArrowType startarrow);

    /**
     * Unsets the "startarrow" attribute
     */
    void unsetStartarrow();

    /**
     * Gets the "startarrowwidth" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowWidth.Enum getStartarrowwidth();

    /**
     * Gets (as xml) the "startarrowwidth" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowWidth xgetStartarrowwidth();

    /**
     * True if has "startarrowwidth" attribute
     */
    boolean isSetStartarrowwidth();

    /**
     * Sets the "startarrowwidth" attribute
     */
    void setStartarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth.Enum startarrowwidth);

    /**
     * Sets (as xml) the "startarrowwidth" attribute
     */
    void xsetStartarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth startarrowwidth);

    /**
     * Unsets the "startarrowwidth" attribute
     */
    void unsetStartarrowwidth();

    /**
     * Gets the "startarrowlength" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowLength.Enum getStartarrowlength();

    /**
     * Gets (as xml) the "startarrowlength" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowLength xgetStartarrowlength();

    /**
     * True if has "startarrowlength" attribute
     */
    boolean isSetStartarrowlength();

    /**
     * Sets the "startarrowlength" attribute
     */
    void setStartarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength.Enum startarrowlength);

    /**
     * Sets (as xml) the "startarrowlength" attribute
     */
    void xsetStartarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength startarrowlength);

    /**
     * Unsets the "startarrowlength" attribute
     */
    void unsetStartarrowlength();

    /**
     * Gets the "endarrow" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowType.Enum getEndarrow();

    /**
     * Gets (as xml) the "endarrow" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowType xgetEndarrow();

    /**
     * True if has "endarrow" attribute
     */
    boolean isSetEndarrow();

    /**
     * Sets the "endarrow" attribute
     */
    void setEndarrow(com.microsoft.schemas.vml.STStrokeArrowType.Enum endarrow);

    /**
     * Sets (as xml) the "endarrow" attribute
     */
    void xsetEndarrow(com.microsoft.schemas.vml.STStrokeArrowType endarrow);

    /**
     * Unsets the "endarrow" attribute
     */
    void unsetEndarrow();

    /**
     * Gets the "endarrowwidth" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowWidth.Enum getEndarrowwidth();

    /**
     * Gets (as xml) the "endarrowwidth" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowWidth xgetEndarrowwidth();

    /**
     * True if has "endarrowwidth" attribute
     */
    boolean isSetEndarrowwidth();

    /**
     * Sets the "endarrowwidth" attribute
     */
    void setEndarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth.Enum endarrowwidth);

    /**
     * Sets (as xml) the "endarrowwidth" attribute
     */
    void xsetEndarrowwidth(com.microsoft.schemas.vml.STStrokeArrowWidth endarrowwidth);

    /**
     * Unsets the "endarrowwidth" attribute
     */
    void unsetEndarrowwidth();

    /**
     * Gets the "endarrowlength" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowLength.Enum getEndarrowlength();

    /**
     * Gets (as xml) the "endarrowlength" attribute
     */
    com.microsoft.schemas.vml.STStrokeArrowLength xgetEndarrowlength();

    /**
     * True if has "endarrowlength" attribute
     */
    boolean isSetEndarrowlength();

    /**
     * Sets the "endarrowlength" attribute
     */
    void setEndarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength.Enum endarrowlength);

    /**
     * Sets (as xml) the "endarrowlength" attribute
     */
    void xsetEndarrowlength(com.microsoft.schemas.vml.STStrokeArrowLength endarrowlength);

    /**
     * Unsets the "endarrowlength" attribute
     */
    void unsetEndarrowlength();

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
     * Gets the "forcedash" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getForcedash();

    /**
     * Gets (as xml) the "forcedash" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetForcedash();

    /**
     * True if has "forcedash" attribute
     */
    boolean isSetForcedash();

    /**
     * Sets the "forcedash" attribute
     */
    void setForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum forcedash);

    /**
     * Sets (as xml) the "forcedash" attribute
     */
    void xsetForcedash(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse forcedash);

    /**
     * Unsets the "forcedash" attribute
     */
    void unsetForcedash();

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
     * Gets the "insetpen" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getInsetpen();

    /**
     * Gets (as xml) the "insetpen" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetInsetpen();

    /**
     * True if has "insetpen" attribute
     */
    boolean isSetInsetpen();

    /**
     * Sets the "insetpen" attribute
     */
    void setInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum insetpen);

    /**
     * Sets (as xml) the "insetpen" attribute
     */
    void xsetInsetpen(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse insetpen);

    /**
     * Unsets the "insetpen" attribute
     */
    void unsetInsetpen();

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
