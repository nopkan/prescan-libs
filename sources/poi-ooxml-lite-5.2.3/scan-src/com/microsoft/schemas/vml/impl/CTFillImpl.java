/*
 * XML Type:  CT_Fill
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTFill
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Fill(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTFillImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTFill {
    private static final long serialVersionUID = 1L;

    public CTFillImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "fill"),
        new QName("", "id"),
        new QName("", "type"),
        new QName("", "on"),
        new QName("", "color"),
        new QName("", "opacity"),
        new QName("", "color2"),
        new QName("", "src"),
        new QName("urn:schemas-microsoft-com:office:office", "href"),
        new QName("urn:schemas-microsoft-com:office:office", "althref"),
        new QName("", "size"),
        new QName("", "origin"),
        new QName("", "position"),
        new QName("", "aspect"),
        new QName("", "colors"),
        new QName("", "angle"),
        new QName("", "alignshape"),
        new QName("", "focus"),
        new QName("", "focussize"),
        new QName("", "focusposition"),
        new QName("", "method"),
        new QName("urn:schemas-microsoft-com:office:office", "detectmouseclick"),
        new QName("urn:schemas-microsoft-com:office:office", "title"),
        new QName("urn:schemas-microsoft-com:office:office", "opacity2"),
        new QName("", "recolor"),
        new QName("", "rotate"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "id"),
        new QName("urn:schemas-microsoft-com:office:office", "relid"),
    };


    /**
     * Gets the "fill" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTFill getFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTFill target = null;
            target = (com.microsoft.schemas.office.office.CTFill)get_store().find_element_user(PROPERTY_QNAME[0], 0);
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
    public void setFill(com.microsoft.schemas.office.office.CTFill fill) {
        generatedSetterHelperImpl(fill, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "fill" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTFill addNewFill() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTFill target = null;
            target = (com.microsoft.schemas.office.office.CTFill)get_store().add_element_user(PROPERTY_QNAME[0]);
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
     * Gets the "type" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillType.Enum getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STFillType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "type" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillType xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillType target = null;
            target = (com.microsoft.schemas.vml.STFillType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
    @Override
    public void setType(com.microsoft.schemas.vml.STFillType.Enum type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(type);
        }
    }

    /**
     * Sets (as xml) the "type" attribute
     */
    @Override
    public void xsetType(com.microsoft.schemas.vml.STFillType type) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillType target = null;
            target = (com.microsoft.schemas.vml.STFillType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STFillType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
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
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "on" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getOn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "on" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetOn() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "on" attribute
     */
    @Override
    public boolean isSetOn() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "on" attribute
     */
    @Override
    public void setOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum on) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(on);
        }
    }

    /**
     * Sets (as xml) the "on" attribute
     */
    @Override
    public void xsetOn(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse on) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(on);
        }
    }

    /**
     * Unsets the "on" attribute
     */
    @Override
    public void unsetOn() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "color" attribute
     */
    @Override
    public java.lang.String getColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "color" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "color" attribute
     */
    @Override
    public boolean isSetColor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "color" attribute
     */
    @Override
    public void setColor(java.lang.String color) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(color);
        }
    }

    /**
     * Sets (as xml) the "color" attribute
     */
    @Override
    public void xsetColor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(color);
        }
    }

    /**
     * Unsets the "color" attribute
     */
    @Override
    public void unsetColor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "opacity" attribute
     */
    @Override
    public java.lang.String getOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "opacity" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "opacity" attribute
     */
    @Override
    public boolean isSetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "opacity" attribute
     */
    @Override
    public void setOpacity(java.lang.String opacity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(opacity);
        }
    }

    /**
     * Sets (as xml) the "opacity" attribute
     */
    @Override
    public void xsetOpacity(org.apache.xmlbeans.XmlString opacity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(opacity);
        }
    }

    /**
     * Unsets the "opacity" attribute
     */
    @Override
    public void unsetOpacity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "color2" attribute
     */
    @Override
    public java.lang.String getColor2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "color2" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType xgetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "color2" attribute
     */
    @Override
    public boolean isSetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "color2" attribute
     */
    @Override
    public void setColor2(java.lang.String color2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setStringValue(color2);
        }
    }

    /**
     * Sets (as xml) the "color2" attribute
     */
    @Override
    public void xsetColor2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType color2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STColorType)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(color2);
        }
    }

    /**
     * Unsets the "color2" attribute
     */
    @Override
    public void unsetColor2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "src" attribute
     */
    @Override
    public java.lang.String getSrc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "src" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "src" attribute
     */
    @Override
    public boolean isSetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "src" attribute
     */
    @Override
    public void setSrc(java.lang.String src) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(src);
        }
    }

    /**
     * Sets (as xml) the "src" attribute
     */
    @Override
    public void xsetSrc(org.apache.xmlbeans.XmlString src) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(src);
        }
    }

    /**
     * Unsets the "src" attribute
     */
    @Override
    public void unsetSrc() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "href" attribute
     */
    @Override
    public java.lang.String getHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "href" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetHref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "href" attribute
     */
    @Override
    public boolean isSetHref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "href" attribute
     */
    @Override
    public void setHref(java.lang.String href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(href);
        }
    }

    /**
     * Sets (as xml) the "href" attribute
     */
    @Override
    public void xsetHref(org.apache.xmlbeans.XmlString href) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(href);
        }
    }

    /**
     * Unsets the "href" attribute
     */
    @Override
    public void unsetHref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "althref" attribute
     */
    @Override
    public java.lang.String getAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "althref" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "althref" attribute
     */
    @Override
    public boolean isSetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "althref" attribute
     */
    @Override
    public void setAlthref(java.lang.String althref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setStringValue(althref);
        }
    }

    /**
     * Sets (as xml) the "althref" attribute
     */
    @Override
    public void xsetAlthref(org.apache.xmlbeans.XmlString althref) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(althref);
        }
    }

    /**
     * Unsets the "althref" attribute
     */
    @Override
    public void unsetAlthref() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "size" attribute
     */
    @Override
    public java.lang.String getSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "size" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "size" attribute
     */
    @Override
    public boolean isSetSize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "size" attribute
     */
    @Override
    public void setSize(java.lang.String size) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setStringValue(size);
        }
    }

    /**
     * Sets (as xml) the "size" attribute
     */
    @Override
    public void xsetSize(org.apache.xmlbeans.XmlString size) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(size);
        }
    }

    /**
     * Unsets the "size" attribute
     */
    @Override
    public void unsetSize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "origin" attribute
     */
    @Override
    public java.lang.String getOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "origin" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "origin" attribute
     */
    @Override
    public boolean isSetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "origin" attribute
     */
    @Override
    public void setOrigin(java.lang.String origin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setStringValue(origin);
        }
    }

    /**
     * Sets (as xml) the "origin" attribute
     */
    @Override
    public void xsetOrigin(org.apache.xmlbeans.XmlString origin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(origin);
        }
    }

    /**
     * Unsets the "origin" attribute
     */
    @Override
    public void unsetOrigin() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "position" attribute
     */
    @Override
    public java.lang.String getPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "position" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "position" attribute
     */
    @Override
    public boolean isSetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "position" attribute
     */
    @Override
    public void setPosition(java.lang.String position) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(position);
        }
    }

    /**
     * Sets (as xml) the "position" attribute
     */
    @Override
    public void xsetPosition(org.apache.xmlbeans.XmlString position) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(position);
        }
    }

    /**
     * Unsets the "position" attribute
     */
    @Override
    public void unsetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "aspect" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STImageAspect.Enum getAspect() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STImageAspect.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "aspect" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STImageAspect xgetAspect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STImageAspect target = null;
            target = (com.microsoft.schemas.vml.STImageAspect)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "aspect" attribute
     */
    @Override
    public boolean isSetAspect() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "aspect" attribute
     */
    @Override
    public void setAspect(com.microsoft.schemas.vml.STImageAspect.Enum aspect) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setEnumValue(aspect);
        }
    }

    /**
     * Sets (as xml) the "aspect" attribute
     */
    @Override
    public void xsetAspect(com.microsoft.schemas.vml.STImageAspect aspect) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STImageAspect target = null;
            target = (com.microsoft.schemas.vml.STImageAspect)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STImageAspect)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(aspect);
        }
    }

    /**
     * Unsets the "aspect" attribute
     */
    @Override
    public void unsetAspect() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "colors" attribute
     */
    @Override
    public java.lang.String getColors() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "colors" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetColors() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "colors" attribute
     */
    @Override
    public boolean isSetColors() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "colors" attribute
     */
    @Override
    public void setColors(java.lang.String colors) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setStringValue(colors);
        }
    }

    /**
     * Sets (as xml) the "colors" attribute
     */
    @Override
    public void xsetColors(org.apache.xmlbeans.XmlString colors) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(colors);
        }
    }

    /**
     * Unsets the "colors" attribute
     */
    @Override
    public void unsetColors() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "angle" attribute
     */
    @Override
    public java.math.BigDecimal getAngle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? null : target.getBigDecimalValue();
        }
    }

    /**
     * Gets (as xml) the "angle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlDecimal xgetAngle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "angle" attribute
     */
    @Override
    public boolean isSetAngle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "angle" attribute
     */
    @Override
    public void setAngle(java.math.BigDecimal angle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setBigDecimalValue(angle);
        }
    }

    /**
     * Sets (as xml) the "angle" attribute
     */
    @Override
    public void xsetAngle(org.apache.xmlbeans.XmlDecimal angle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(angle);
        }
    }

    /**
     * Unsets the "angle" attribute
     */
    @Override
    public void unsetAngle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "alignshape" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getAlignshape() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "alignshape" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetAlignshape() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "alignshape" attribute
     */
    @Override
    public boolean isSetAlignshape() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "alignshape" attribute
     */
    @Override
    public void setAlignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum alignshape) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setEnumValue(alignshape);
        }
    }

    /**
     * Sets (as xml) the "alignshape" attribute
     */
    @Override
    public void xsetAlignshape(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse alignshape) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(alignshape);
        }
    }

    /**
     * Unsets the "alignshape" attribute
     */
    @Override
    public void unsetAlignshape() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "focus" attribute
     */
    @Override
    public java.lang.String getFocus() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "focus" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFocus() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "focus" attribute
     */
    @Override
    public boolean isSetFocus() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "focus" attribute
     */
    @Override
    public void setFocus(java.lang.String focus) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setStringValue(focus);
        }
    }

    /**
     * Sets (as xml) the "focus" attribute
     */
    @Override
    public void xsetFocus(org.apache.xmlbeans.XmlString focus) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(focus);
        }
    }

    /**
     * Unsets the "focus" attribute
     */
    @Override
    public void unsetFocus() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Gets the "focussize" attribute
     */
    @Override
    public java.lang.String getFocussize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "focussize" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFocussize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * True if has "focussize" attribute
     */
    @Override
    public boolean isSetFocussize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[18]) != null;
        }
    }

    /**
     * Sets the "focussize" attribute
     */
    @Override
    public void setFocussize(java.lang.String focussize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.setStringValue(focussize);
        }
    }

    /**
     * Sets (as xml) the "focussize" attribute
     */
    @Override
    public void xsetFocussize(org.apache.xmlbeans.XmlString focussize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[18]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[18]);
            }
            target.set(focussize);
        }
    }

    /**
     * Unsets the "focussize" attribute
     */
    @Override
    public void unsetFocussize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Gets the "focusposition" attribute
     */
    @Override
    public java.lang.String getFocusposition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "focusposition" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFocusposition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * True if has "focusposition" attribute
     */
    @Override
    public boolean isSetFocusposition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[19]) != null;
        }
    }

    /**
     * Sets the "focusposition" attribute
     */
    @Override
    public void setFocusposition(java.lang.String focusposition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[19]);
            }
            target.setStringValue(focusposition);
        }
    }

    /**
     * Sets (as xml) the "focusposition" attribute
     */
    @Override
    public void xsetFocusposition(org.apache.xmlbeans.XmlString focusposition) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[19]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[19]);
            }
            target.set(focusposition);
        }
    }

    /**
     * Unsets the "focusposition" attribute
     */
    @Override
    public void unsetFocusposition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Gets the "method" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillMethod.Enum getMethod() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STFillMethod.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "method" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STFillMethod xgetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillMethod target = null;
            target = (com.microsoft.schemas.vml.STFillMethod)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * True if has "method" attribute
     */
    @Override
    public boolean isSetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[20]) != null;
        }
    }

    /**
     * Sets the "method" attribute
     */
    @Override
    public void setMethod(com.microsoft.schemas.vml.STFillMethod.Enum method) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.setEnumValue(method);
        }
    }

    /**
     * Sets (as xml) the "method" attribute
     */
    @Override
    public void xsetMethod(com.microsoft.schemas.vml.STFillMethod method) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STFillMethod target = null;
            target = (com.microsoft.schemas.vml.STFillMethod)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STFillMethod)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.set(method);
        }
    }

    /**
     * Unsets the "method" attribute
     */
    @Override
    public void unsetMethod() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Gets the "detectmouseclick" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getDetectmouseclick() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "detectmouseclick" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetDetectmouseclick() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * True if has "detectmouseclick" attribute
     */
    @Override
    public boolean isSetDetectmouseclick() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[21]) != null;
        }
    }

    /**
     * Sets the "detectmouseclick" attribute
     */
    @Override
    public void setDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum detectmouseclick) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.setEnumValue(detectmouseclick);
        }
    }

    /**
     * Sets (as xml) the "detectmouseclick" attribute
     */
    @Override
    public void xsetDetectmouseclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse detectmouseclick) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.set(detectmouseclick);
        }
    }

    /**
     * Unsets the "detectmouseclick" attribute
     */
    @Override
    public void unsetDetectmouseclick() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Gets the "title" attribute
     */
    @Override
    public java.lang.String getTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "title" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * True if has "title" attribute
     */
    @Override
    public boolean isSetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[22]) != null;
        }
    }

    /**
     * Sets the "title" attribute
     */
    @Override
    public void setTitle(java.lang.String title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[22]);
            }
            target.setStringValue(title);
        }
    }

    /**
     * Sets (as xml) the "title" attribute
     */
    @Override
    public void xsetTitle(org.apache.xmlbeans.XmlString title) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[22]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[22]);
            }
            target.set(title);
        }
    }

    /**
     * Unsets the "title" attribute
     */
    @Override
    public void unsetTitle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Gets the "opacity2" attribute
     */
    @Override
    public java.lang.String getOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "opacity2" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * True if has "opacity2" attribute
     */
    @Override
    public boolean isSetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[23]) != null;
        }
    }

    /**
     * Sets the "opacity2" attribute
     */
    @Override
    public void setOpacity2(java.lang.String opacity2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[23]);
            }
            target.setStringValue(opacity2);
        }
    }

    /**
     * Sets (as xml) the "opacity2" attribute
     */
    @Override
    public void xsetOpacity2(org.apache.xmlbeans.XmlString opacity2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[23]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[23]);
            }
            target.set(opacity2);
        }
    }

    /**
     * Unsets the "opacity2" attribute
     */
    @Override
    public void unsetOpacity2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Gets the "recolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getRecolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "recolor" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetRecolor() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * True if has "recolor" attribute
     */
    @Override
    public boolean isSetRecolor() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[24]) != null;
        }
    }

    /**
     * Sets the "recolor" attribute
     */
    @Override
    public void setRecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum recolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[24]);
            }
            target.setEnumValue(recolor);
        }
    }

    /**
     * Sets (as xml) the "recolor" attribute
     */
    @Override
    public void xsetRecolor(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse recolor) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[24]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[24]);
            }
            target.set(recolor);
        }
    }

    /**
     * Unsets the "recolor" attribute
     */
    @Override
    public void unsetRecolor() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Gets the "rotate" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getRotate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "rotate" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetRotate() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * True if has "rotate" attribute
     */
    @Override
    public boolean isSetRotate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[25]) != null;
        }
    }

    /**
     * Sets the "rotate" attribute
     */
    @Override
    public void setRotate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum rotate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[25]);
            }
            target.setEnumValue(rotate);
        }
    }

    /**
     * Sets (as xml) the "rotate" attribute
     */
    @Override
    public void xsetRotate(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse rotate) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[25]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[25]);
            }
            target.set(rotate);
        }
    }

    /**
     * Unsets the "rotate" attribute
     */
    @Override
    public void unsetRotate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Gets the "id" attribute
     */
    @Override
    public java.lang.String getId2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "id" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetId2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * True if has "id" attribute
     */
    @Override
    public boolean isSetId2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[26]) != null;
        }
    }

    /**
     * Sets the "id" attribute
     */
    @Override
    public void setId2(java.lang.String id2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[26]);
            }
            target.setStringValue(id2);
        }
    }

    /**
     * Sets (as xml) the "id" attribute
     */
    @Override
    public void xsetId2(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId id2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[26]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(PROPERTY_QNAME[26]);
            }
            target.set(id2);
        }
    }

    /**
     * Unsets the "id" attribute
     */
    @Override
    public void unsetId2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[26]);
        }
    }

    /**
     * Gets the "relid" attribute
     */
    @Override
    public java.lang.String getRelid() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[27]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "relid" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId xgetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * True if has "relid" attribute
     */
    @Override
    public boolean isSetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[27]) != null;
        }
    }

    /**
     * Sets the "relid" attribute
     */
    @Override
    public void setRelid(java.lang.String relid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[27]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[27]);
            }
            target.setStringValue(relid);
        }
    }

    /**
     * Sets (as xml) the "relid" attribute
     */
    @Override
    public void xsetRelid(org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId relid) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().find_attribute_user(PROPERTY_QNAME[27]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId)get_store().add_attribute_user(PROPERTY_QNAME[27]);
            }
            target.set(relid);
        }
    }

    /**
     * Unsets the "relid" attribute
     */
    @Override
    public void unsetRelid() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[27]);
        }
    }
}
