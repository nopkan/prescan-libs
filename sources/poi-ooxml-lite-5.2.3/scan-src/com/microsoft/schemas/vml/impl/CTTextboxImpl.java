/*
 * XML Type:  CT_Textbox
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTTextbox
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Textbox(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTTextboxImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTTextbox {
    private static final long serialVersionUID = 1L;

    public CTTextboxImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "txbxContent"),
        new QName("", "id"),
        new QName("", "style"),
        new QName("", "inset"),
        new QName("urn:schemas-microsoft-com:office:office", "singleclick"),
        new QName("urn:schemas-microsoft-com:office:office", "insetmode"),
    };


    /**
     * Gets the "txbxContent" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent getTxbxContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "txbxContent" element
     */
    @Override
    public boolean isSetTxbxContent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "txbxContent" element
     */
    @Override
    public void setTxbxContent(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent txbxContent) {
        generatedSetterHelperImpl(txbxContent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "txbxContent" element
     */
    @Override
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent addNewTxbxContent() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTxbxContent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "txbxContent" element
     */
    @Override
    public void unsetTxbxContent() {
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
     * Gets the "style" attribute
     */
    @Override
    public java.lang.String getStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "style" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "style" attribute
     */
    @Override
    public boolean isSetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "style" attribute
     */
    @Override
    public void setStyle(java.lang.String style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(style);
        }
    }

    /**
     * Sets (as xml) the "style" attribute
     */
    @Override
    public void xsetStyle(org.apache.xmlbeans.XmlString style) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(style);
        }
    }

    /**
     * Unsets the "style" attribute
     */
    @Override
    public void unsetStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "inset" attribute
     */
    @Override
    public java.lang.String getInset() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "inset" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetInset() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "inset" attribute
     */
    @Override
    public boolean isSetInset() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "inset" attribute
     */
    @Override
    public void setInset(java.lang.String inset) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(inset);
        }
    }

    /**
     * Sets (as xml) the "inset" attribute
     */
    @Override
    public void xsetInset(org.apache.xmlbeans.XmlString inset) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(inset);
        }
    }

    /**
     * Unsets the "inset" attribute
     */
    @Override
    public void unsetInset() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "singleclick" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum getSingleclick() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "singleclick" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse xgetSingleclick() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "singleclick" attribute
     */
    @Override
    public boolean isSetSingleclick() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "singleclick" attribute
     */
    @Override
    public void setSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse.Enum singleclick) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setEnumValue(singleclick);
        }
    }

    /**
     * Sets (as xml) the "singleclick" attribute
     */
    @Override
    public void xsetSingleclick(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse singleclick) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalse)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(singleclick);
        }
    }

    /**
     * Unsets the "singleclick" attribute
     */
    @Override
    public void unsetSingleclick() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode.Enum getInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return (target == null) ? null : (com.microsoft.schemas.office.office.STInsetMode.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "insetmode" attribute
     */
    @Override
    public com.microsoft.schemas.office.office.STInsetMode xgetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_default_attribute_value(PROPERTY_QNAME[5]);
            }
            return target;
        }
    }

    /**
     * True if has "insetmode" attribute
     */
    @Override
    public boolean isSetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "insetmode" attribute
     */
    @Override
    public void setInsetmode(com.microsoft.schemas.office.office.STInsetMode.Enum insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setEnumValue(insetmode);
        }
    }

    /**
     * Sets (as xml) the "insetmode" attribute
     */
    @Override
    public void xsetInsetmode(com.microsoft.schemas.office.office.STInsetMode insetmode) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.STInsetMode target = null;
            target = (com.microsoft.schemas.office.office.STInsetMode)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (com.microsoft.schemas.office.office.STInsetMode)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(insetmode);
        }
    }

    /**
     * Unsets the "insetmode" attribute
     */
    @Override
    public void unsetInsetmode() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
}
