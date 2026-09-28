/*
 * XML Type:  CT_OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTOLEObject
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_OLEObject(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public interface CTOLEObject extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.office.CTOLEObject> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctoleobjecte5c0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LinkType" element
     */
    java.lang.String getLinkType();

    /**
     * Gets (as xml) the "LinkType" element
     */
    com.microsoft.schemas.office.office.STOLELinkType xgetLinkType();

    /**
     * True if has "LinkType" element
     */
    boolean isSetLinkType();

    /**
     * Sets the "LinkType" element
     */
    void setLinkType(java.lang.String linkType);

    /**
     * Sets (as xml) the "LinkType" element
     */
    void xsetLinkType(com.microsoft.schemas.office.office.STOLELinkType linkType);

    /**
     * Unsets the "LinkType" element
     */
    void unsetLinkType();

    /**
     * Gets the "LockedField" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getLockedField();

    /**
     * Gets (as xml) the "LockedField" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetLockedField();

    /**
     * True if has "LockedField" element
     */
    boolean isSetLockedField();

    /**
     * Sets the "LockedField" element
     */
    void setLockedField(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum lockedField);

    /**
     * Sets (as xml) the "LockedField" element
     */
    void xsetLockedField(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank lockedField);

    /**
     * Unsets the "LockedField" element
     */
    void unsetLockedField();

    /**
     * Gets the "FieldCodes" element
     */
    java.lang.String getFieldCodes();

    /**
     * Gets (as xml) the "FieldCodes" element
     */
    org.apache.xmlbeans.XmlString xgetFieldCodes();

    /**
     * True if has "FieldCodes" element
     */
    boolean isSetFieldCodes();

    /**
     * Sets the "FieldCodes" element
     */
    void setFieldCodes(java.lang.String fieldCodes);

    /**
     * Sets (as xml) the "FieldCodes" element
     */
    void xsetFieldCodes(org.apache.xmlbeans.XmlString fieldCodes);

    /**
     * Unsets the "FieldCodes" element
     */
    void unsetFieldCodes();

    /**
     * Gets the "Type" attribute
     */
    com.microsoft.schemas.office.office.STOLEType.Enum getType();

    /**
     * Gets (as xml) the "Type" attribute
     */
    com.microsoft.schemas.office.office.STOLEType xgetType();

    /**
     * True if has "Type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "Type" attribute
     */
    void setType(com.microsoft.schemas.office.office.STOLEType.Enum type);

    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(com.microsoft.schemas.office.office.STOLEType type);

    /**
     * Unsets the "Type" attribute
     */
    void unsetType();

    /**
     * Gets the "ProgID" attribute
     */
    java.lang.String getProgID();

    /**
     * Gets (as xml) the "ProgID" attribute
     */
    org.apache.xmlbeans.XmlString xgetProgID();

    /**
     * True if has "ProgID" attribute
     */
    boolean isSetProgID();

    /**
     * Sets the "ProgID" attribute
     */
    void setProgID(java.lang.String progID);

    /**
     * Sets (as xml) the "ProgID" attribute
     */
    void xsetProgID(org.apache.xmlbeans.XmlString progID);

    /**
     * Unsets the "ProgID" attribute
     */
    void unsetProgID();

    /**
     * Gets the "ShapeID" attribute
     */
    java.lang.String getShapeID();

    /**
     * Gets (as xml) the "ShapeID" attribute
     */
    org.apache.xmlbeans.XmlString xgetShapeID();

    /**
     * True if has "ShapeID" attribute
     */
    boolean isSetShapeID();

    /**
     * Sets the "ShapeID" attribute
     */
    void setShapeID(java.lang.String shapeID);

    /**
     * Sets (as xml) the "ShapeID" attribute
     */
    void xsetShapeID(org.apache.xmlbeans.XmlString shapeID);

    /**
     * Unsets the "ShapeID" attribute
     */
    void unsetShapeID();

    /**
     * Gets the "DrawAspect" attribute
     */
    com.microsoft.schemas.office.office.STOLEDrawAspect.Enum getDrawAspect();

    /**
     * Gets (as xml) the "DrawAspect" attribute
     */
    com.microsoft.schemas.office.office.STOLEDrawAspect xgetDrawAspect();

    /**
     * True if has "DrawAspect" attribute
     */
    boolean isSetDrawAspect();

    /**
     * Sets the "DrawAspect" attribute
     */
    void setDrawAspect(com.microsoft.schemas.office.office.STOLEDrawAspect.Enum drawAspect);

    /**
     * Sets (as xml) the "DrawAspect" attribute
     */
    void xsetDrawAspect(com.microsoft.schemas.office.office.STOLEDrawAspect drawAspect);

    /**
     * Unsets the "DrawAspect" attribute
     */
    void unsetDrawAspect();

    /**
     * Gets the "ObjectID" attribute
     */
    java.lang.String getObjectID();

    /**
     * Gets (as xml) the "ObjectID" attribute
     */
    org.apache.xmlbeans.XmlString xgetObjectID();

    /**
     * True if has "ObjectID" attribute
     */
    boolean isSetObjectID();

    /**
     * Sets the "ObjectID" attribute
     */
    void setObjectID(java.lang.String objectID);

    /**
     * Sets (as xml) the "ObjectID" attribute
     */
    void xsetObjectID(org.apache.xmlbeans.XmlString objectID);

    /**
     * Unsets the "ObjectID" attribute
     */
    void unsetObjectID();

    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();

    /**
     * Gets (as xml) the "id" attribute
     */
    org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId();

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
    void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id);

    /**
     * Unsets the "id" attribute
     */
    void unsetId();

    /**
     * Gets the "UpdateMode" attribute
     */
    com.microsoft.schemas.office.office.STOLEUpdateMode.Enum getUpdateMode();

    /**
     * Gets (as xml) the "UpdateMode" attribute
     */
    com.microsoft.schemas.office.office.STOLEUpdateMode xgetUpdateMode();

    /**
     * True if has "UpdateMode" attribute
     */
    boolean isSetUpdateMode();

    /**
     * Sets the "UpdateMode" attribute
     */
    void setUpdateMode(com.microsoft.schemas.office.office.STOLEUpdateMode.Enum updateMode);

    /**
     * Sets (as xml) the "UpdateMode" attribute
     */
    void xsetUpdateMode(com.microsoft.schemas.office.office.STOLEUpdateMode updateMode);

    /**
     * Unsets the "UpdateMode" attribute
     */
    void unsetUpdateMode();
}
