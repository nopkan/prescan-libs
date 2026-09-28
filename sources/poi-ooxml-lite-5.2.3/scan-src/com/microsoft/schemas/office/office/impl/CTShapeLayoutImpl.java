/*
 * XML Type:  CT_ShapeLayout
 * Namespace: urn:schemas-microsoft-com:office:office
 * Java type: com.microsoft.schemas.office.office.CTShapeLayout
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.office.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ShapeLayout(@urn:schemas-microsoft-com:office:office).
 *
 * This is a complex type.
 */
public class CTShapeLayoutImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.office.CTShapeLayout {
    private static final long serialVersionUID = 1L;

    public CTShapeLayoutImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:office", "idmap"),
        new QName("urn:schemas-microsoft-com:office:office", "regrouptable"),
        new QName("urn:schemas-microsoft-com:office:office", "rules"),
        new QName("urn:schemas-microsoft-com:vml", "ext"),
    };


    /**
     * Gets the "idmap" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTIdMap getIdmap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTIdMap target = null;
            target = (com.microsoft.schemas.office.office.CTIdMap)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "idmap" element
     */
    @Override
    public boolean isSetIdmap() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "idmap" element
     */
    @Override
    public void setIdmap(com.microsoft.schemas.office.office.CTIdMap idmap) {
        generatedSetterHelperImpl(idmap, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "idmap" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTIdMap addNewIdmap() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTIdMap target = null;
            target = (com.microsoft.schemas.office.office.CTIdMap)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "idmap" element
     */
    @Override
    public void unsetIdmap() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "regrouptable" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTRegroupTable getRegrouptable() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTRegroupTable target = null;
            target = (com.microsoft.schemas.office.office.CTRegroupTable)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "regrouptable" element
     */
    @Override
    public boolean isSetRegrouptable() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "regrouptable" element
     */
    @Override
    public void setRegrouptable(com.microsoft.schemas.office.office.CTRegroupTable regrouptable) {
        generatedSetterHelperImpl(regrouptable, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "regrouptable" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTRegroupTable addNewRegrouptable() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTRegroupTable target = null;
            target = (com.microsoft.schemas.office.office.CTRegroupTable)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "regrouptable" element
     */
    @Override
    public void unsetRegrouptable() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "rules" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTRules getRules() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTRules target = null;
            target = (com.microsoft.schemas.office.office.CTRules)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "rules" element
     */
    @Override
    public boolean isSetRules() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "rules" element
     */
    @Override
    public void setRules(com.microsoft.schemas.office.office.CTRules rules) {
        generatedSetterHelperImpl(rules, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rules" element
     */
    @Override
    public com.microsoft.schemas.office.office.CTRules addNewRules() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.office.CTRules target = null;
            target = (com.microsoft.schemas.office.office.CTRules)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "rules" element
     */
    @Override
    public void unsetRules() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt.Enum getExt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : (com.microsoft.schemas.vml.STExt.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "ext" attribute
     */
    @Override
    public com.microsoft.schemas.vml.STExt xgetExt() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "ext" attribute
     */
    @Override
    public boolean isSetExt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "ext" attribute
     */
    @Override
    public void setExt(com.microsoft.schemas.vml.STExt.Enum ext) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setEnumValue(ext);
        }
    }

    /**
     * Sets (as xml) the "ext" attribute
     */
    @Override
    public void xsetExt(com.microsoft.schemas.vml.STExt ext) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.STExt target = null;
            target = (com.microsoft.schemas.vml.STExt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (com.microsoft.schemas.vml.STExt)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(ext);
        }
    }

    /**
     * Unsets the "ext" attribute
     */
    @Override
    public void unsetExt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }
}
