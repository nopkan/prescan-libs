/*
 * XML Type:  DocumentSettings_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML DocumentSettings_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface DocumentSettingsType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "documentsettingstype945btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "GlueSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType getGlueSettings();

    /**
     * True if has "GlueSettings" element
     */
    boolean isSetGlueSettings();

    /**
     * Sets the "GlueSettings" element
     */
    void setGlueSettings(com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType glueSettings);

    /**
     * Appends and returns a new empty "GlueSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType addNewGlueSettings();

    /**
     * Unsets the "GlueSettings" element
     */
    void unsetGlueSettings();

    /**
     * Gets the "SnapSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType getSnapSettings();

    /**
     * True if has "SnapSettings" element
     */
    boolean isSetSnapSettings();

    /**
     * Sets the "SnapSettings" element
     */
    void setSnapSettings(com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType snapSettings);

    /**
     * Appends and returns a new empty "SnapSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType addNewSnapSettings();

    /**
     * Unsets the "SnapSettings" element
     */
    void unsetSnapSettings();

    /**
     * Gets the "SnapExtensions" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType getSnapExtensions();

    /**
     * True if has "SnapExtensions" element
     */
    boolean isSetSnapExtensions();

    /**
     * Sets the "SnapExtensions" element
     */
    void setSnapExtensions(com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType snapExtensions);

    /**
     * Appends and returns a new empty "SnapExtensions" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType addNewSnapExtensions();

    /**
     * Unsets the "SnapExtensions" element
     */
    void unsetSnapExtensions();

    /**
     * Gets the "SnapAngles" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType getSnapAngles();

    /**
     * True if has "SnapAngles" element
     */
    boolean isSetSnapAngles();

    /**
     * Sets the "SnapAngles" element
     */
    void setSnapAngles(com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType snapAngles);

    /**
     * Appends and returns a new empty "SnapAngles" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType addNewSnapAngles();

    /**
     * Unsets the "SnapAngles" element
     */
    void unsetSnapAngles();

    /**
     * Gets the "DynamicGridEnabled" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType getDynamicGridEnabled();

    /**
     * True if has "DynamicGridEnabled" element
     */
    boolean isSetDynamicGridEnabled();

    /**
     * Sets the "DynamicGridEnabled" element
     */
    void setDynamicGridEnabled(com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType dynamicGridEnabled);

    /**
     * Appends and returns a new empty "DynamicGridEnabled" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType addNewDynamicGridEnabled();

    /**
     * Unsets the "DynamicGridEnabled" element
     */
    void unsetDynamicGridEnabled();

    /**
     * Gets the "ProtectStyles" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType getProtectStyles();

    /**
     * True if has "ProtectStyles" element
     */
    boolean isSetProtectStyles();

    /**
     * Sets the "ProtectStyles" element
     */
    void setProtectStyles(com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType protectStyles);

    /**
     * Appends and returns a new empty "ProtectStyles" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType addNewProtectStyles();

    /**
     * Unsets the "ProtectStyles" element
     */
    void unsetProtectStyles();

    /**
     * Gets the "ProtectShapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType getProtectShapes();

    /**
     * True if has "ProtectShapes" element
     */
    boolean isSetProtectShapes();

    /**
     * Sets the "ProtectShapes" element
     */
    void setProtectShapes(com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType protectShapes);

    /**
     * Appends and returns a new empty "ProtectShapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType addNewProtectShapes();

    /**
     * Unsets the "ProtectShapes" element
     */
    void unsetProtectShapes();

    /**
     * Gets the "ProtectMasters" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType getProtectMasters();

    /**
     * True if has "ProtectMasters" element
     */
    boolean isSetProtectMasters();

    /**
     * Sets the "ProtectMasters" element
     */
    void setProtectMasters(com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType protectMasters);

    /**
     * Appends and returns a new empty "ProtectMasters" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType addNewProtectMasters();

    /**
     * Unsets the "ProtectMasters" element
     */
    void unsetProtectMasters();

    /**
     * Gets the "ProtectBkgnds" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType getProtectBkgnds();

    /**
     * True if has "ProtectBkgnds" element
     */
    boolean isSetProtectBkgnds();

    /**
     * Sets the "ProtectBkgnds" element
     */
    void setProtectBkgnds(com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType protectBkgnds);

    /**
     * Appends and returns a new empty "ProtectBkgnds" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType addNewProtectBkgnds();

    /**
     * Unsets the "ProtectBkgnds" element
     */
    void unsetProtectBkgnds();

    /**
     * Gets the "CustomMenusFile" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType getCustomMenusFile();

    /**
     * True if has "CustomMenusFile" element
     */
    boolean isSetCustomMenusFile();

    /**
     * Sets the "CustomMenusFile" element
     */
    void setCustomMenusFile(com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType customMenusFile);

    /**
     * Appends and returns a new empty "CustomMenusFile" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType addNewCustomMenusFile();

    /**
     * Unsets the "CustomMenusFile" element
     */
    void unsetCustomMenusFile();

    /**
     * Gets the "CustomToolbarsFile" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType getCustomToolbarsFile();

    /**
     * True if has "CustomToolbarsFile" element
     */
    boolean isSetCustomToolbarsFile();

    /**
     * Sets the "CustomToolbarsFile" element
     */
    void setCustomToolbarsFile(com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType customToolbarsFile);

    /**
     * Appends and returns a new empty "CustomToolbarsFile" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType addNewCustomToolbarsFile();

    /**
     * Unsets the "CustomToolbarsFile" element
     */
    void unsetCustomToolbarsFile();

    /**
     * Gets the "AttachedToolbars" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType getAttachedToolbars();

    /**
     * True if has "AttachedToolbars" element
     */
    boolean isSetAttachedToolbars();

    /**
     * Sets the "AttachedToolbars" element
     */
    void setAttachedToolbars(com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType attachedToolbars);

    /**
     * Appends and returns a new empty "AttachedToolbars" element
     */
    com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType addNewAttachedToolbars();

    /**
     * Unsets the "AttachedToolbars" element
     */
    void unsetAttachedToolbars();

    /**
     * Gets the "TopPage" attribute
     */
    long getTopPage();

    /**
     * Gets (as xml) the "TopPage" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTopPage();

    /**
     * True if has "TopPage" attribute
     */
    boolean isSetTopPage();

    /**
     * Sets the "TopPage" attribute
     */
    void setTopPage(long topPage);

    /**
     * Sets (as xml) the "TopPage" attribute
     */
    void xsetTopPage(org.apache.xmlbeans.XmlUnsignedInt topPage);

    /**
     * Unsets the "TopPage" attribute
     */
    void unsetTopPage();

    /**
     * Gets the "DefaultTextStyle" attribute
     */
    long getDefaultTextStyle();

    /**
     * Gets (as xml) the "DefaultTextStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDefaultTextStyle();

    /**
     * True if has "DefaultTextStyle" attribute
     */
    boolean isSetDefaultTextStyle();

    /**
     * Sets the "DefaultTextStyle" attribute
     */
    void setDefaultTextStyle(long defaultTextStyle);

    /**
     * Sets (as xml) the "DefaultTextStyle" attribute
     */
    void xsetDefaultTextStyle(org.apache.xmlbeans.XmlUnsignedInt defaultTextStyle);

    /**
     * Unsets the "DefaultTextStyle" attribute
     */
    void unsetDefaultTextStyle();

    /**
     * Gets the "DefaultLineStyle" attribute
     */
    long getDefaultLineStyle();

    /**
     * Gets (as xml) the "DefaultLineStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDefaultLineStyle();

    /**
     * True if has "DefaultLineStyle" attribute
     */
    boolean isSetDefaultLineStyle();

    /**
     * Sets the "DefaultLineStyle" attribute
     */
    void setDefaultLineStyle(long defaultLineStyle);

    /**
     * Sets (as xml) the "DefaultLineStyle" attribute
     */
    void xsetDefaultLineStyle(org.apache.xmlbeans.XmlUnsignedInt defaultLineStyle);

    /**
     * Unsets the "DefaultLineStyle" attribute
     */
    void unsetDefaultLineStyle();

    /**
     * Gets the "DefaultFillStyle" attribute
     */
    long getDefaultFillStyle();

    /**
     * Gets (as xml) the "DefaultFillStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDefaultFillStyle();

    /**
     * True if has "DefaultFillStyle" attribute
     */
    boolean isSetDefaultFillStyle();

    /**
     * Sets the "DefaultFillStyle" attribute
     */
    void setDefaultFillStyle(long defaultFillStyle);

    /**
     * Sets (as xml) the "DefaultFillStyle" attribute
     */
    void xsetDefaultFillStyle(org.apache.xmlbeans.XmlUnsignedInt defaultFillStyle);

    /**
     * Unsets the "DefaultFillStyle" attribute
     */
    void unsetDefaultFillStyle();

    /**
     * Gets the "DefaultGuideStyle" attribute
     */
    long getDefaultGuideStyle();

    /**
     * Gets (as xml) the "DefaultGuideStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetDefaultGuideStyle();

    /**
     * True if has "DefaultGuideStyle" attribute
     */
    boolean isSetDefaultGuideStyle();

    /**
     * Sets the "DefaultGuideStyle" attribute
     */
    void setDefaultGuideStyle(long defaultGuideStyle);

    /**
     * Sets (as xml) the "DefaultGuideStyle" attribute
     */
    void xsetDefaultGuideStyle(org.apache.xmlbeans.XmlUnsignedInt defaultGuideStyle);

    /**
     * Unsets the "DefaultGuideStyle" attribute
     */
    void unsetDefaultGuideStyle();
}
