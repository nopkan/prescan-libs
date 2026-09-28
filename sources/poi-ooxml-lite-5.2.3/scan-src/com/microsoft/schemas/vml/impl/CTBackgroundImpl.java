/*
 * XML Type:  CT_Background
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTBackground
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Background(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTBackgroundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTBackground {
    private static final long serialVersionUID = 1L;

    public CTBackgroundImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "fill"),
        new QName("", "id"),
        new QName("", "filled"),
        new QName("", "fillcolor"),
        new QName("urn:schemas-microsoft-com:office:office", "bwmode"),
        new QName("urn:schemas-microsoft-com:office:office", "bwpure"),
        new QName("urn:schemas-microsoft-com:office:office", "bwnormal"),
        new QName("urn:schemas-microsoft-com:office:office", "targetscreensize"),
    };


    /**
     * Gets the "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill getFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "fill" element
     */
    @Override
    public boolean isSetFill() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "fill" element
     */
    @Override
    public void setFill(com.microsoft.schemas.vml.CTFill fill) {
        generatedSetterHelperImpl(fill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fill" element
     */
    @Override
    public com.microsoft.schemas.vml.CTFill addNewFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTFill target = null;
            target = (com.microsoft.schemas.vml.CTFill)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "fill" element
     */
    @Override
    public void unsetFill() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetId() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(id);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId(org.apache.xmlbeans.XmlString id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
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
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "filled" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getFilled() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "filled" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "filled" attribute
     */
    @Override
    public boolean isSetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "filled" attribute
     */
    @Override
    public void setFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum filled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(filled);
        }
    }

    /**
     * Sets (as xml) the "filled" attribute
     */
    @Override
    public void xsetFilled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse filled) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(filled);
        }
    }

    /**
     * Unsets the "filled" attribute
     */
    @Override
    public void unsetFilled() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "fillcolor" attribute
     */
    @Override
    public java.lang.String getFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "fillcolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "fillcolor" attribute
     */
    @Override
    public boolean isSetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "fillcolor" attribute
     */
    @Override
    public void setFillcolor(java.lang.String fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(fillcolor);
        }
    }

    /**
     * Sets (as xml) the "fillcolor" attribute
     */
    @Override
    public void xsetFillcolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType fillcolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(fillcolor);
        }
    }

    /**
     * Unsets the "fillcolor" attribute
     */
    @Override
    public void unsetFillcolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "bwmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "bwmode" attribute
     */
    @Override
    public boolean isSetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "bwmode" attribute
     */
    @Override
    public void setBwmode(com.microsoft.schemas.office.office.STBWMode.Enum bwmode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(bwmode);
        }
    }

    /**
     * Sets (as xml) the "bwmode" attribute
     */
    @Override
    public void xsetBwmode(com.microsoft.schemas.office.office.STBWMode bwmode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(bwmode);
        }
    }

    /**
     * Unsets the "bwmode" attribute
     */
    @Override
    public void unsetBwmode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "bwpure" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwpure" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "bwpure" attribute
     */
    @Override
    public boolean isSetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "bwpure" attribute
     */
    @Override
    public void setBwpure(com.microsoft.schemas.office.office.STBWMode.Enum bwpure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setEnumValue(bwpure);
        }
    }

    /**
     * Sets (as xml) the "bwpure" attribute
     */
    @Override
    public void xsetBwpure(com.microsoft.schemas.office.office.STBWMode bwpure) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(bwpure);
        }
    }

    /**
     * Unsets the "bwpure" attribute
     */
    @Override
    public void unsetBwpure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "bwnormal" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode.Enum getBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STBWMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "bwnormal" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STBWMode xgetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "bwnormal" attribute
     */
    @Override
    public boolean isSetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "bwnormal" attribute
     */
    @Override
    public void setBwnormal(com.microsoft.schemas.office.office.STBWMode.Enum bwnormal) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setEnumValue(bwnormal);
        }
    }

    /**
     * Sets (as xml) the "bwnormal" attribute
     */
    @Override
    public void xsetBwnormal(com.microsoft.schemas.office.office.STBWMode bwnormal) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STBWMode target = null;
            target = (com.microsoft.schemas.office.office.STBWMode)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STBWMode)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(bwnormal);
        }
    }

    /**
     * Unsets the "bwnormal" attribute
     */
    @Override
    public void unsetBwnormal() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "targetscreensize" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STScreenSize.Enum getTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : (com.microsoft.schemas.office.office.STScreenSize.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "targetscreensize" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STScreenSize xgetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STScreenSize target = null;
            target = (com.microsoft.schemas.office.office.STScreenSize)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "targetscreensize" attribute
     */
    @Override
    public boolean isSetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "targetscreensize" attribute
     */
    @Override
    public void setTargetscreensize(com.microsoft.schemas.office.office.STScreenSize.Enum targetscreensize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setEnumValue(targetscreensize);
        }
    }

    /**
     * Sets (as xml) the "targetscreensize" attribute
     */
    @Override
    public void xsetTargetscreensize(com.microsoft.schemas.office.office.STScreenSize targetscreensize) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STScreenSize target = null;
            target = (com.microsoft.schemas.office.office.STScreenSize)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STScreenSize)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(targetscreensize);
        }
    }

    /**
     * Unsets the "targetscreensize" attribute
     */
    @Override
    public void unsetTargetscreensize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }
}
