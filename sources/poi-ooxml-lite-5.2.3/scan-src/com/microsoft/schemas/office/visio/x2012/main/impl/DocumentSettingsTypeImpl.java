/*
 * XML Type:  DocumentSettings_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML DocumentSettings_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class DocumentSettingsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType {
    private static final long serialVersionUID = 1L;

    public DocumentSettingsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "GlueSettings"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapSettings"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapExtensions"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapAngles"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DynamicGridEnabled"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectStyles"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectShapes"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectMasters"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectBkgnds"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CustomMenusFile"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "CustomToolbarsFile"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "AttachedToolbars"),
        new QName("", "TopPage"),
        new QName("", "DefaultTextStyle"),
        new QName("", "DefaultLineStyle"),
        new QName("", "DefaultFillStyle"),
        new QName("", "DefaultGuideStyle"),
    };


    /**
     * Gets the "GlueSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType getGlueSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "GlueSettings" element
     */
    @Override
    public boolean isSetGlueSettings() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "GlueSettings" element
     */
    @Override
    public void setGlueSettings(com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType glueSettings) {
        generatedSetterHelperImpl(glueSettings, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GlueSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType addNewGlueSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "GlueSettings" element
     */
    @Override
    public void unsetGlueSettings() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "SnapSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType getSnapSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SnapSettings" element
     */
    @Override
    public boolean isSetSnapSettings() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "SnapSettings" element
     */
    @Override
    public void setSnapSettings(com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType snapSettings) {
        generatedSetterHelperImpl(snapSettings, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SnapSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType addNewSnapSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "SnapSettings" element
     */
    @Override
    public void unsetSnapSettings() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "SnapExtensions" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType getSnapExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SnapExtensions" element
     */
    @Override
    public boolean isSetSnapExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "SnapExtensions" element
     */
    @Override
    public void setSnapExtensions(com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType snapExtensions) {
        generatedSetterHelperImpl(snapExtensions, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SnapExtensions" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType addNewSnapExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "SnapExtensions" element
     */
    @Override
    public void unsetSnapExtensions() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "SnapAngles" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType getSnapAngles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "SnapAngles" element
     */
    @Override
    public boolean isSetSnapAngles() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "SnapAngles" element
     */
    @Override
    public void setSnapAngles(com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType snapAngles) {
        generatedSetterHelperImpl(snapAngles, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SnapAngles" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType addNewSnapAngles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "SnapAngles" element
     */
    @Override
    public void unsetSnapAngles() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "DynamicGridEnabled" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType getDynamicGridEnabled() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DynamicGridEnabled" element
     */
    @Override
    public boolean isSetDynamicGridEnabled() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "DynamicGridEnabled" element
     */
    @Override
    public void setDynamicGridEnabled(com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType dynamicGridEnabled) {
        generatedSetterHelperImpl(dynamicGridEnabled, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DynamicGridEnabled" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType addNewDynamicGridEnabled() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "DynamicGridEnabled" element
     */
    @Override
    public void unsetDynamicGridEnabled() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "ProtectStyles" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType getProtectStyles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ProtectStyles" element
     */
    @Override
    public boolean isSetProtectStyles() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "ProtectStyles" element
     */
    @Override
    public void setProtectStyles(com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType protectStyles) {
        generatedSetterHelperImpl(protectStyles, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProtectStyles" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType addNewProtectStyles() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "ProtectStyles" element
     */
    @Override
    public void unsetProtectStyles() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "ProtectShapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType getProtectShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ProtectShapes" element
     */
    @Override
    public boolean isSetProtectShapes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "ProtectShapes" element
     */
    @Override
    public void setProtectShapes(com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType protectShapes) {
        generatedSetterHelperImpl(protectShapes, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProtectShapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType addNewProtectShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "ProtectShapes" element
     */
    @Override
    public void unsetProtectShapes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "ProtectMasters" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType getProtectMasters() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ProtectMasters" element
     */
    @Override
    public boolean isSetProtectMasters() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "ProtectMasters" element
     */
    @Override
    public void setProtectMasters(com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType protectMasters) {
        generatedSetterHelperImpl(protectMasters, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProtectMasters" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType addNewProtectMasters() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "ProtectMasters" element
     */
    @Override
    public void unsetProtectMasters() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }

    /**
     * Gets the "ProtectBkgnds" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType getProtectBkgnds() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType)get_store().find_element_user(PROPERTY_QNAME[8], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ProtectBkgnds" element
     */
    @Override
    public boolean isSetProtectBkgnds() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]) != 0;
        }
    }

    /**
     * Sets the "ProtectBkgnds" element
     */
    @Override
    public void setProtectBkgnds(com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType protectBkgnds) {
        generatedSetterHelperImpl(protectBkgnds, PROPERTY_QNAME[8], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ProtectBkgnds" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType addNewProtectBkgnds() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Unsets the "ProtectBkgnds" element
     */
    @Override
    public void unsetProtectBkgnds() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], 0);
        }
    }

    /**
     * Gets the "CustomMenusFile" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType getCustomMenusFile() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType)get_store().find_element_user(PROPERTY_QNAME[9], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CustomMenusFile" element
     */
    @Override
    public boolean isSetCustomMenusFile() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]) != 0;
        }
    }

    /**
     * Sets the "CustomMenusFile" element
     */
    @Override
    public void setCustomMenusFile(com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType customMenusFile) {
        generatedSetterHelperImpl(customMenusFile, PROPERTY_QNAME[9], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CustomMenusFile" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType addNewCustomMenusFile() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Unsets the "CustomMenusFile" element
     */
    @Override
    public void unsetCustomMenusFile() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], 0);
        }
    }

    /**
     * Gets the "CustomToolbarsFile" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType getCustomToolbarsFile() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType)get_store().find_element_user(PROPERTY_QNAME[10], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CustomToolbarsFile" element
     */
    @Override
    public boolean isSetCustomToolbarsFile() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]) != 0;
        }
    }

    /**
     * Sets the "CustomToolbarsFile" element
     */
    @Override
    public void setCustomToolbarsFile(com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType customToolbarsFile) {
        generatedSetterHelperImpl(customToolbarsFile, PROPERTY_QNAME[10], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CustomToolbarsFile" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType addNewCustomToolbarsFile() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Unsets the "CustomToolbarsFile" element
     */
    @Override
    public void unsetCustomToolbarsFile() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], 0);
        }
    }

    /**
     * Gets the "AttachedToolbars" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType getAttachedToolbars() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType)get_store().find_element_user(PROPERTY_QNAME[11], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "AttachedToolbars" element
     */
    @Override
    public boolean isSetAttachedToolbars() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]) != 0;
        }
    }

    /**
     * Sets the "AttachedToolbars" element
     */
    @Override
    public void setAttachedToolbars(com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType attachedToolbars) {
        generatedSetterHelperImpl(attachedToolbars, PROPERTY_QNAME[11], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttachedToolbars" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType addNewAttachedToolbars() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Unsets the "AttachedToolbars" element
     */
    @Override
    public void unsetAttachedToolbars() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], 0);
        }
    }

    /**
     * Gets the "TopPage" attribute
     */
    @Override
    public long getTopPage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "TopPage" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetTopPage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "TopPage" attribute
     */
    @Override
    public boolean isSetTopPage() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "TopPage" attribute
     */
    @Override
    public void setTopPage(long topPage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setLongValue(topPage);
        }
    }

    /**
     * Sets (as xml) the "TopPage" attribute
     */
    @Override
    public void xsetTopPage(org.apache.xmlbeans.XmlUnsignedInt topPage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(topPage);
        }
    }

    /**
     * Unsets the "TopPage" attribute
     */
    @Override
    public void unsetTopPage() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "DefaultTextStyle" attribute
     */
    @Override
    public long getDefaultTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "DefaultTextStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetDefaultTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "DefaultTextStyle" attribute
     */
    @Override
    public boolean isSetDefaultTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "DefaultTextStyle" attribute
     */
    @Override
    public void setDefaultTextStyle(long defaultTextStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setLongValue(defaultTextStyle);
        }
    }

    /**
     * Sets (as xml) the "DefaultTextStyle" attribute
     */
    @Override
    public void xsetDefaultTextStyle(org.apache.xmlbeans.XmlUnsignedInt defaultTextStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(defaultTextStyle);
        }
    }

    /**
     * Unsets the "DefaultTextStyle" attribute
     */
    @Override
    public void unsetDefaultTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "DefaultLineStyle" attribute
     */
    @Override
    public long getDefaultLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "DefaultLineStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetDefaultLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "DefaultLineStyle" attribute
     */
    @Override
    public boolean isSetDefaultLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "DefaultLineStyle" attribute
     */
    @Override
    public void setDefaultLineStyle(long defaultLineStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setLongValue(defaultLineStyle);
        }
    }

    /**
     * Sets (as xml) the "DefaultLineStyle" attribute
     */
    @Override
    public void xsetDefaultLineStyle(org.apache.xmlbeans.XmlUnsignedInt defaultLineStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(defaultLineStyle);
        }
    }

    /**
     * Unsets the "DefaultLineStyle" attribute
     */
    @Override
    public void unsetDefaultLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "DefaultFillStyle" attribute
     */
    @Override
    public long getDefaultFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "DefaultFillStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetDefaultFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "DefaultFillStyle" attribute
     */
    @Override
    public boolean isSetDefaultFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "DefaultFillStyle" attribute
     */
    @Override
    public void setDefaultFillStyle(long defaultFillStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setLongValue(defaultFillStyle);
        }
    }

    /**
     * Sets (as xml) the "DefaultFillStyle" attribute
     */
    @Override
    public void xsetDefaultFillStyle(org.apache.xmlbeans.XmlUnsignedInt defaultFillStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(defaultFillStyle);
        }
    }

    /**
     * Unsets the "DefaultFillStyle" attribute
     */
    @Override
    public void unsetDefaultFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "DefaultGuideStyle" attribute
     */
    @Override
    public long getDefaultGuideStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "DefaultGuideStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetDefaultGuideStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "DefaultGuideStyle" attribute
     */
    @Override
    public boolean isSetDefaultGuideStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "DefaultGuideStyle" attribute
     */
    @Override
    public void setDefaultGuideStyle(long defaultGuideStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setLongValue(defaultGuideStyle);
        }
    }

    /**
     * Sets (as xml) the "DefaultGuideStyle" attribute
     */
    @Override
    public void xsetDefaultGuideStyle(org.apache.xmlbeans.XmlUnsignedInt defaultGuideStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(defaultGuideStyle);
        }
    }

    /**
     * Unsets the "DefaultGuideStyle" attribute
     */
    @Override
    public void unsetDefaultGuideStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }
}
