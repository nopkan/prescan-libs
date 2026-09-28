/*
 * XML Type:  CT_Wrap
 * Namespace: urn:schemas-microsoft-com:office:word
 * Java type: com.microsoft.schemas.office.word.CTWrap
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.word.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Wrap(@urn:schemas-microsoft-com:office:word).
 *
 * This is a complex type.
 */
public class CTWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.word.CTWrap {
    private static final long serialVersionUID = 1L;

    public CTWrapImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "type"),
        new QName("", "side"),
        new QName("", "anchorx"),
        new QName("", "anchory"),
    };


    /**
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STWrapType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STWrapType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STWrapType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STWrapType target = null;
            target = (com.microsoft.schemas.office.word.STWrapType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.office.word.STWrapType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.office.word.STWrapType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STWrapType target = null;
            target = (com.microsoft.schemas.office.word.STWrapType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STWrapType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "side" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STWrapSide.Enum getSide() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STWrapSide.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "side" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STWrapSide xgetSide() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STWrapSide target = null;
            target = (com.microsoft.schemas.office.word.STWrapSide)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "side" attribute
     */
    @Override
    public boolean isSetSide() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "side" attribute
     */
    @Override
    public void setSide(com.microsoft.schemas.office.word.STWrapSide.Enum side) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setEnumValue(side);
        }
    }

    /**
     * Sets (as xml) the "side" attribute
     */
    @Override
    public void xsetSide(com.microsoft.schemas.office.word.STWrapSide side) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STWrapSide target = null;
            target = (com.microsoft.schemas.office.word.STWrapSide)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STWrapSide)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(side);
        }
    }

    /**
     * Unsets the "side" attribute
     */
    @Override
    public void unsetSide() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "anchorx" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STHorizontalAnchor.Enum getAnchorx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STHorizontalAnchor.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "anchorx" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STHorizontalAnchor xgetAnchorx() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STHorizontalAnchor target = null;
            target = (com.microsoft.schemas.office.word.STHorizontalAnchor)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "anchorx" attribute
     */
    @Override
    public boolean isSetAnchorx() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "anchorx" attribute
     */
    @Override
    public void setAnchorx(com.microsoft.schemas.office.word.STHorizontalAnchor.Enum anchorx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(anchorx);
        }
    }

    /**
     * Sets (as xml) the "anchorx" attribute
     */
    @Override
    public void xsetAnchorx(com.microsoft.schemas.office.word.STHorizontalAnchor anchorx) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STHorizontalAnchor target = null;
            target = (com.microsoft.schemas.office.word.STHorizontalAnchor)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STHorizontalAnchor)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(anchorx);
        }
    }

    /**
     * Unsets the "anchorx" attribute
     */
    @Override
    public void unsetAnchorx() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "anchory" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STVerticalAnchor.Enum getAnchory() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (com.microsoft.schemas.office.word.STVerticalAnchor.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "anchory" attribute
     */
    @Override
    public com.microsoft.schemas.office.word.STVerticalAnchor xgetAnchory() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STVerticalAnchor target = null;
            target = (com.microsoft.schemas.office.word.STVerticalAnchor)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "anchory" attribute
     */
    @Override
    public boolean isSetAnchory() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "anchory" attribute
     */
    @Override
    public void setAnchory(com.microsoft.schemas.office.word.STVerticalAnchor.Enum anchory) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(anchory);
        }
    }

    /**
     * Sets (as xml) the "anchory" attribute
     */
    @Override
    public void xsetAnchory(com.microsoft.schemas.office.word.STVerticalAnchor anchory) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.word.STVerticalAnchor target = null;
            target = (com.microsoft.schemas.office.word.STVerticalAnchor)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.office.word.STVerticalAnchor)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(anchory);
        }
    }

    /**
     * Unsets the "anchory" attribute
     */
    @Override
    public void unsetAnchory() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
