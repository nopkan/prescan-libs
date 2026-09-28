/*
 * XML Type:  CT_OLEObject
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTOLEObject
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_OLEObject(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTOLEObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTOLEObject {
    private static final long serialVersionUID = 1L;

    public CTOLEObjectImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "LinkType"),
        new QName("urn:schemas-microsoft-com:office:office", "LockedField"),
        new QName("urn:schemas-microsoft-com:office:office", "FieldCodes"),
        new QName("", "Type"),
        new QName("", "ProgID"),
        new QName("", "ShapeID"),
        new QName("", "DrawAspect"),
        new QName("", "ObjectID"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id"),
        new QName("", "UpdateMode"),
    };


    /**
     * Gets the "LinkType" element
     */
    @Override
    public java.lang.String getLinkType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LinkType" element
     */
    @Override
    public com.microsoft.schemas.office.office.STOLELinkType xgetLinkType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLELinkType target = null;
            target = (com.microsoft.schemas.office.office.STOLELinkType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "LinkType" element
     */
    @Override
    public boolean isSetLinkType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "LinkType" element
     */
    @Override
    public void setLinkType(java.lang.String linkType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(linkType);
        }
    }

    /**
     * Sets (as xml) the "LinkType" element
     */
    @Override
    public void xsetLinkType(com.microsoft.schemas.office.office.STOLELinkType linkType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLELinkType target = null;
            target = (com.microsoft.schemas.office.office.STOLELinkType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STOLELinkType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(linkType);
        }
    }

    /**
     * Unsets the "LinkType" element
     */
    @Override
    public void unsetLinkType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "LockedField" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getLockedField() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "LockedField" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetLockedField() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "LockedField" element
     */
    @Override
    public boolean isSetLockedField() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "LockedField" element
     */
    @Override
    public void setLockedField(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum lockedField) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(lockedField);
        }
    }

    /**
     * Sets (as xml) the "LockedField" element
     */
    @Override
    public void xsetLockedField(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank lockedField) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(lockedField);
        }
    }

    /**
     * Unsets the "LockedField" element
     */
    @Override
    public void unsetLockedField() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "FieldCodes" element
     */
    @Override
    public java.lang.String getFieldCodes() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FieldCodes" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFieldCodes() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "FieldCodes" element
     */
    @Override
    public boolean isSetFieldCodes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "FieldCodes" element
     */
    @Override
    public void setFieldCodes(java.lang.String fieldCodes) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(fieldCodes);
        }
    }

    /**
     * Sets (as xml) the "FieldCodes" element
     */
    @Override
    public void xsetFieldCodes(org.apache.xmlbeans.XmlString fieldCodes) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(fieldCodes);
        }
    }

    /**
     * Unsets the "FieldCodes" element
     */
    @Override
    public void unsetFieldCodes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "Type" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STOLEType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "Type" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEType target = null;
            target = (com.microsoft.schemas.office.office.STOLEType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "Type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "Type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.office.STOLEType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "Type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.office.STOLEType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEType target = null;
            target = (com.microsoft.schemas.office.office.STOLEType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STOLEType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "Type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "ProgID" attribute
     */
    @Override
    public java.lang.String getProgID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ProgID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetProgID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "ProgID" attribute
     */
    @Override
    public boolean isSetProgID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "ProgID" attribute
     */
    @Override
    public void setProgID(java.lang.String progID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(progID);
        }
    }

    /**
     * Sets (as xml) the "ProgID" attribute
     */
    @Override
    public void xsetProgID(org.apache.xmlbeans.XmlString progID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(progID);
        }
    }

    /**
     * Unsets the "ProgID" attribute
     */
    @Override
    public void unsetProgID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "ShapeID" attribute
     */
    @Override
    public java.lang.String getShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShapeID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "ShapeID" attribute
     */
    @Override
    public boolean isSetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "ShapeID" attribute
     */
    @Override
    public void setShapeID(java.lang.String shapeID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(shapeID);
        }
    }

    /**
     * Sets (as xml) the "ShapeID" attribute
     */
    @Override
    public void xsetShapeID(org.apache.xmlbeans.XmlString shapeID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(shapeID);
        }
    }

    /**
     * Unsets the "ShapeID" attribute
     */
    @Override
    public void unsetShapeID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "DrawAspect" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEDrawAspect.Enum getDrawAspect() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STOLEDrawAspect.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "DrawAspect" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEDrawAspect xgetDrawAspect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEDrawAspect target = null;
            target = (com.microsoft.schemas.office.office.STOLEDrawAspect)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "DrawAspect" attribute
     */
    @Override
    public boolean isSetDrawAspect() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "DrawAspect" attribute
     */
    @Override
    public void setDrawAspect(com.microsoft.schemas.office.office.STOLEDrawAspect.Enum drawAspect) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(drawAspect);
        }
    }

    /**
     * Sets (as xml) the "DrawAspect" attribute
     */
    @Override
    public void xsetDrawAspect(com.microsoft.schemas.office.office.STOLEDrawAspect drawAspect) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEDrawAspect target = null;
            target = (com.microsoft.schemas.office.office.STOLEDrawAspect)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STOLEDrawAspect)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(drawAspect);
        }
    }

    /**
     * Unsets the "DrawAspect" attribute
     */
    @Override
    public void unsetDrawAspect() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "ObjectID" attribute
     */
    @Override
    public java.lang.String getObjectID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetObjectID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "ObjectID" attribute
     */
    @Override
    public boolean isSetObjectID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "ObjectID" attribute
     */
    @Override
    public void setObjectID(java.lang.String objectID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(objectID);
        }
    }

    /**
     * Sets (as xml) the "ObjectID" attribute
     */
    @Override
    public void xsetObjectID(org.apache.xmlbeans.XmlString objectID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(objectID);
        }
    }

    /**
     * Unsets the "ObjectID" attribute
     */
    @Override
    public void unsetObjectID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId(java.lang.String id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(id);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "UpdateMode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEUpdateMode.Enum getUpdateMode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STOLEUpdateMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "UpdateMode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STOLEUpdateMode xgetUpdateMode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEUpdateMode target = null;
            target = (com.microsoft.schemas.office.office.STOLEUpdateMode)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "UpdateMode" attribute
     */
    @Override
    public boolean isSetUpdateMode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "UpdateMode" attribute
     */
    @Override
    public void setUpdateMode(com.microsoft.schemas.office.office.STOLEUpdateMode.Enum updateMode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setEnumValue(updateMode);
        }
    }

    /**
     * Sets (as xml) the "UpdateMode" attribute
     */
    @Override
    public void xsetUpdateMode(com.microsoft.schemas.office.office.STOLEUpdateMode updateMode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STOLEUpdateMode target = null;
            target = (com.microsoft.schemas.office.office.STOLEUpdateMode)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STOLEUpdateMode)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(updateMode);
        }
    }

    /**
     * Unsets the "UpdateMode" attribute
     */
    @Override
    public void unsetUpdateMode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }
}
