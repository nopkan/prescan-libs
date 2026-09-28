/*
 * XML Type:  Master_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MasterType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Master_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class MasterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.MasterType {
    private static final long serialVersionUID = 1L;

    public MasterTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "PageSheet"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Rel"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Icon"),
        new QName("", "ID"),
        new QName("", "BaseID"),
        new QName("", "UniqueID"),
        new QName("", "MatchByName"),
        new QName("", "Name"),
        new QName("", "NameU"),
        new QName("", "IsCustomName"),
        new QName("", "IsCustomNameU"),
        new QName("", "IconSize"),
        new QName("", "PatternFlags"),
        new QName("", "Prompt"),
        new QName("", "Hidden"),
        new QName("", "IconUpdate"),
        new QName("", "AlignName"),
        new QName("", "MasterType"),
    };


    /**
     * Gets the "PageSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageSheetType getPageSheet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageSheetType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "PageSheet" element
     */
    @Override
    public boolean isSetPageSheet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "PageSheet" element
     */
    @Override
    public void setPageSheet(com.microsoft.schemas.office.visio.x2012.main.PageSheetType pageSheet) {
        generatedSetterHelperImpl(pageSheet, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PageSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageSheetType addNewPageSheet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageSheetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "PageSheet" element
     */
    @Override
    public void unsetPageSheet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType getRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Rel" element
     */
    @Override
    public void setRel(com.microsoft.schemas.office.visio.x2012.main.RelType rel) {
        generatedSetterHelperImpl(rel, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Rel" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.RelType addNewRel() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.RelType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.RelType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets the "Icon" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.IconType getIcon() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.IconType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.IconType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Icon" element
     */
    @Override
    public boolean isSetIcon() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Icon" element
     */
    @Override
    public void setIcon(com.microsoft.schemas.office.visio.x2012.main.IconType icon) {
        generatedSetterHelperImpl(icon, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Icon" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.IconType addNewIcon() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.IconType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.IconType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "Icon" element
     */
    @Override
    public void unsetIcon() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "ID" attribute
     */
    @Override
    public long getID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Sets the "ID" attribute
     */
    @Override
    public void setID(long id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(id);
        }
    }

    /**
     * Sets (as xml) the "ID" attribute
     */
    @Override
    public void xsetID(org.apache.xmlbeans.XmlUnsignedInt id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "BaseID" attribute
     */
    @Override
    public java.lang.String getBaseID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BaseID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBaseID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "BaseID" attribute
     */
    @Override
    public boolean isSetBaseID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "BaseID" attribute
     */
    @Override
    public void setBaseID(java.lang.String baseID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(baseID);
        }
    }

    /**
     * Sets (as xml) the "BaseID" attribute
     */
    @Override
    public void xsetBaseID(org.apache.xmlbeans.XmlString baseID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(baseID);
        }
    }

    /**
     * Unsets the "BaseID" attribute
     */
    @Override
    public void unsetBaseID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "UniqueID" attribute
     */
    @Override
    public java.lang.String getUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "UniqueID" attribute
     */
    @Override
    public boolean isSetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "UniqueID" attribute
     */
    @Override
    public void setUniqueID(java.lang.String uniqueID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(uniqueID);
        }
    }

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    @Override
    public void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(uniqueID);
        }
    }

    /**
     * Unsets the "UniqueID" attribute
     */
    @Override
    public void unsetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "MatchByName" attribute
     */
    @Override
    public boolean getMatchByName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "MatchByName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetMatchByName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "MatchByName" attribute
     */
    @Override
    public boolean isSetMatchByName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "MatchByName" attribute
     */
    @Override
    public void setMatchByName(boolean matchByName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(matchByName);
        }
    }

    /**
     * Sets (as xml) the "MatchByName" attribute
     */
    @Override
    public void xsetMatchByName(org.apache.xmlbeans.XmlBoolean matchByName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(matchByName);
        }
    }

    /**
     * Unsets the "MatchByName" attribute
     */
    @Override
    public void unsetMatchByName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Gets the "Name" attribute
     */
    @Override
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Name" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "Name" attribute
     */
    @Override
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "Name" attribute
     */
    @Override
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "Name" attribute
     */
    @Override
    public void xsetName(org.apache.xmlbeans.XmlString name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(name);
        }
    }

    /**
     * Unsets the "Name" attribute
     */
    @Override
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Gets the "NameU" attribute
     */
    @Override
    public java.lang.String getNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "NameU" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * True if has "NameU" attribute
     */
    @Override
    public boolean isSetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
        }
    }

    /**
     * Sets the "NameU" attribute
     */
    @Override
    public void setNameU(java.lang.String nameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.setStringValue(nameU);
        }
    }

    /**
     * Sets (as xml) the "NameU" attribute
     */
    @Override
    public void xsetNameU(org.apache.xmlbeans.XmlString nameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[8]);
            }
            target.set(nameU);
        }
    }

    /**
     * Unsets the "NameU" attribute
     */
    @Override
    public void unsetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "IsCustomName" attribute
     */
    @Override
    public boolean getIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "IsCustomName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "IsCustomName" attribute
     */
    @Override
    public boolean isSetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "IsCustomName" attribute
     */
    @Override
    public void setIsCustomName(boolean isCustomName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setBooleanValue(isCustomName);
        }
    }

    /**
     * Sets (as xml) the "IsCustomName" attribute
     */
    @Override
    public void xsetIsCustomName(org.apache.xmlbeans.XmlBoolean isCustomName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(isCustomName);
        }
    }

    /**
     * Unsets the "IsCustomName" attribute
     */
    @Override
    public void unsetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "IsCustomNameU" attribute
     */
    @Override
    public boolean getIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "IsCustomNameU" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "IsCustomNameU" attribute
     */
    @Override
    public boolean isSetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "IsCustomNameU" attribute
     */
    @Override
    public void setIsCustomNameU(boolean isCustomNameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setBooleanValue(isCustomNameU);
        }
    }

    /**
     * Sets (as xml) the "IsCustomNameU" attribute
     */
    @Override
    public void xsetIsCustomNameU(org.apache.xmlbeans.XmlBoolean isCustomNameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(isCustomNameU);
        }
    }

    /**
     * Unsets the "IsCustomNameU" attribute
     */
    @Override
    public void unsetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "IconSize" attribute
     */
    @Override
    public int getIconSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "IconSize" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetIconSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "IconSize" attribute
     */
    @Override
    public boolean isSetIconSize() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "IconSize" attribute
     */
    @Override
    public void setIconSize(int iconSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setIntValue(iconSize);
        }
    }

    /**
     * Sets (as xml) the "IconSize" attribute
     */
    @Override
    public void xsetIconSize(org.apache.xmlbeans.XmlUnsignedShort iconSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(iconSize);
        }
    }

    /**
     * Unsets the "IconSize" attribute
     */
    @Override
    public void unsetIconSize() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "PatternFlags" attribute
     */
    @Override
    public int getPatternFlags() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "PatternFlags" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetPatternFlags() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "PatternFlags" attribute
     */
    @Override
    public boolean isSetPatternFlags() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "PatternFlags" attribute
     */
    @Override
    public void setPatternFlags(int patternFlags) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setIntValue(patternFlags);
        }
    }

    /**
     * Sets (as xml) the "PatternFlags" attribute
     */
    @Override
    public void xsetPatternFlags(org.apache.xmlbeans.XmlUnsignedShort patternFlags) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(patternFlags);
        }
    }

    /**
     * Unsets the "PatternFlags" attribute
     */
    @Override
    public void unsetPatternFlags() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "Prompt" attribute
     */
    @Override
    public java.lang.String getPrompt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Prompt" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPrompt() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "Prompt" attribute
     */
    @Override
    public boolean isSetPrompt() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "Prompt" attribute
     */
    @Override
    public void setPrompt(java.lang.String prompt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setStringValue(prompt);
        }
    }

    /**
     * Sets (as xml) the "Prompt" attribute
     */
    @Override
    public void xsetPrompt(org.apache.xmlbeans.XmlString prompt) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(prompt);
        }
    }

    /**
     * Unsets the "Prompt" attribute
     */
    @Override
    public void unsetPrompt() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "Hidden" attribute
     */
    @Override
    public boolean getHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "Hidden" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "Hidden" attribute
     */
    @Override
    public boolean isSetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "Hidden" attribute
     */
    @Override
    public void setHidden(boolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setBooleanValue(hidden);
        }
    }

    /**
     * Sets (as xml) the "Hidden" attribute
     */
    @Override
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(hidden);
        }
    }

    /**
     * Unsets the "Hidden" attribute
     */
    @Override
    public void unsetHidden() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "IconUpdate" attribute
     */
    @Override
    public boolean getIconUpdate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "IconUpdate" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIconUpdate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "IconUpdate" attribute
     */
    @Override
    public boolean isSetIconUpdate() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "IconUpdate" attribute
     */
    @Override
    public void setIconUpdate(boolean iconUpdate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setBooleanValue(iconUpdate);
        }
    }

    /**
     * Sets (as xml) the "IconUpdate" attribute
     */
    @Override
    public void xsetIconUpdate(org.apache.xmlbeans.XmlBoolean iconUpdate) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(iconUpdate);
        }
    }

    /**
     * Unsets the "IconUpdate" attribute
     */
    @Override
    public void unsetIconUpdate() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "AlignName" attribute
     */
    @Override
    public int getAlignName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "AlignName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetAlignName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "AlignName" attribute
     */
    @Override
    public boolean isSetAlignName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "AlignName" attribute
     */
    @Override
    public void setAlignName(int alignName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setIntValue(alignName);
        }
    }

    /**
     * Sets (as xml) the "AlignName" attribute
     */
    @Override
    public void xsetAlignName(org.apache.xmlbeans.XmlUnsignedShort alignName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(alignName);
        }
    }

    /**
     * Unsets the "AlignName" attribute
     */
    @Override
    public void unsetAlignName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Gets the "MasterType" attribute
     */
    @Override
    public int getMasterType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "MasterType" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetMasterType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * True if has "MasterType" attribute
     */
    @Override
    public boolean isSetMasterType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[17]) != null;
        }
    }

    /**
     * Sets the "MasterType" attribute
     */
    @Override
    public void setMasterType(int masterType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.setIntValue(masterType);
        }
    }

    /**
     * Sets (as xml) the "MasterType" attribute
     */
    @Override
    public void xsetMasterType(org.apache.xmlbeans.XmlUnsignedShort masterType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_attribute_user(PROPERTY_QNAME[17]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_attribute_user(PROPERTY_QNAME[17]);
            }
            target.set(masterType);
        }
    }

    /**
     * Unsets the "MasterType" attribute
     */
    @Override
    public void unsetMasterType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[17]);
        }
    }
}
