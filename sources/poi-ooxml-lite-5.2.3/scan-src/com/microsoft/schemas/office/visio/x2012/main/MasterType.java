/*
 * XML Type:  Master_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MasterType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Master_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface MasterType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.MasterType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "mastertype2d97type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PageSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageSheetType getPageSheet();

    /**
     * True if has "PageSheet" element
     */
    boolean isSetPageSheet();

    /**
     * Sets the "PageSheet" element
     */
    void setPageSheet(com.microsoft.schemas.office.visio.x2012.main.PageSheetType pageSheet);

    /**
     * Appends and returns a new empty "PageSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PageSheetType addNewPageSheet();

    /**
     * Unsets the "PageSheet" element
     */
    void unsetPageSheet();

    /**
     * Gets the "Rel" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RelType getRel();

    /**
     * Sets the "Rel" element
     */
    void setRel(com.microsoft.schemas.office.visio.x2012.main.RelType rel);

    /**
     * Appends and returns a new empty "Rel" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RelType addNewRel();

    /**
     * Gets the "Icon" element
     */
    com.microsoft.schemas.office.visio.x2012.main.IconType getIcon();

    /**
     * True if has "Icon" element
     */
    boolean isSetIcon();

    /**
     * Sets the "Icon" element
     */
    void setIcon(com.microsoft.schemas.office.visio.x2012.main.IconType icon);

    /**
     * Appends and returns a new empty "Icon" element
     */
    com.microsoft.schemas.office.visio.x2012.main.IconType addNewIcon();

    /**
     * Unsets the "Icon" element
     */
    void unsetIcon();

    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);

    /**
     * Gets the "BaseID" attribute
     */
    java.lang.String getBaseID();

    /**
     * Gets (as xml) the "BaseID" attribute
     */
    org.apache.xmlbeans.XmlString xgetBaseID();

    /**
     * True if has "BaseID" attribute
     */
    boolean isSetBaseID();

    /**
     * Sets the "BaseID" attribute
     */
    void setBaseID(java.lang.String baseID);

    /**
     * Sets (as xml) the "BaseID" attribute
     */
    void xsetBaseID(org.apache.xmlbeans.XmlString baseID);

    /**
     * Unsets the "BaseID" attribute
     */
    void unsetBaseID();

    /**
     * Gets the "UniqueID" attribute
     */
    java.lang.String getUniqueID();

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueID();

    /**
     * True if has "UniqueID" attribute
     */
    boolean isSetUniqueID();

    /**
     * Sets the "UniqueID" attribute
     */
    void setUniqueID(java.lang.String uniqueID);

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID);

    /**
     * Unsets the "UniqueID" attribute
     */
    void unsetUniqueID();

    /**
     * Gets the "MatchByName" attribute
     */
    boolean getMatchByName();

    /**
     * Gets (as xml) the "MatchByName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMatchByName();

    /**
     * True if has "MatchByName" attribute
     */
    boolean isSetMatchByName();

    /**
     * Sets the "MatchByName" attribute
     */
    void setMatchByName(boolean matchByName);

    /**
     * Sets (as xml) the "MatchByName" attribute
     */
    void xsetMatchByName(org.apache.xmlbeans.XmlBoolean matchByName);

    /**
     * Unsets the "MatchByName" attribute
     */
    void unsetMatchByName();

    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "Name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "Name" attribute
     */
    void unsetName();

    /**
     * Gets the "NameU" attribute
     */
    java.lang.String getNameU();

    /**
     * Gets (as xml) the "NameU" attribute
     */
    org.apache.xmlbeans.XmlString xgetNameU();

    /**
     * True if has "NameU" attribute
     */
    boolean isSetNameU();

    /**
     * Sets the "NameU" attribute
     */
    void setNameU(java.lang.String nameU);

    /**
     * Sets (as xml) the "NameU" attribute
     */
    void xsetNameU(org.apache.xmlbeans.XmlString nameU);

    /**
     * Unsets the "NameU" attribute
     */
    void unsetNameU();

    /**
     * Gets the "IsCustomName" attribute
     */
    boolean getIsCustomName();

    /**
     * Gets (as xml) the "IsCustomName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomName();

    /**
     * True if has "IsCustomName" attribute
     */
    boolean isSetIsCustomName();

    /**
     * Sets the "IsCustomName" attribute
     */
    void setIsCustomName(boolean isCustomName);

    /**
     * Sets (as xml) the "IsCustomName" attribute
     */
    void xsetIsCustomName(org.apache.xmlbeans.XmlBoolean isCustomName);

    /**
     * Unsets the "IsCustomName" attribute
     */
    void unsetIsCustomName();

    /**
     * Gets the "IsCustomNameU" attribute
     */
    boolean getIsCustomNameU();

    /**
     * Gets (as xml) the "IsCustomNameU" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomNameU();

    /**
     * True if has "IsCustomNameU" attribute
     */
    boolean isSetIsCustomNameU();

    /**
     * Sets the "IsCustomNameU" attribute
     */
    void setIsCustomNameU(boolean isCustomNameU);

    /**
     * Sets (as xml) the "IsCustomNameU" attribute
     */
    void xsetIsCustomNameU(org.apache.xmlbeans.XmlBoolean isCustomNameU);

    /**
     * Unsets the "IsCustomNameU" attribute
     */
    void unsetIsCustomNameU();

    /**
     * Gets the "IconSize" attribute
     */
    int getIconSize();

    /**
     * Gets (as xml) the "IconSize" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetIconSize();

    /**
     * True if has "IconSize" attribute
     */
    boolean isSetIconSize();

    /**
     * Sets the "IconSize" attribute
     */
    void setIconSize(int iconSize);

    /**
     * Sets (as xml) the "IconSize" attribute
     */
    void xsetIconSize(org.apache.xmlbeans.XmlUnsignedShort iconSize);

    /**
     * Unsets the "IconSize" attribute
     */
    void unsetIconSize();

    /**
     * Gets the "PatternFlags" attribute
     */
    int getPatternFlags();

    /**
     * Gets (as xml) the "PatternFlags" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetPatternFlags();

    /**
     * True if has "PatternFlags" attribute
     */
    boolean isSetPatternFlags();

    /**
     * Sets the "PatternFlags" attribute
     */
    void setPatternFlags(int patternFlags);

    /**
     * Sets (as xml) the "PatternFlags" attribute
     */
    void xsetPatternFlags(org.apache.xmlbeans.XmlUnsignedShort patternFlags);

    /**
     * Unsets the "PatternFlags" attribute
     */
    void unsetPatternFlags();

    /**
     * Gets the "Prompt" attribute
     */
    java.lang.String getPrompt();

    /**
     * Gets (as xml) the "Prompt" attribute
     */
    org.apache.xmlbeans.XmlString xgetPrompt();

    /**
     * True if has "Prompt" attribute
     */
    boolean isSetPrompt();

    /**
     * Sets the "Prompt" attribute
     */
    void setPrompt(java.lang.String prompt);

    /**
     * Sets (as xml) the "Prompt" attribute
     */
    void xsetPrompt(org.apache.xmlbeans.XmlString prompt);

    /**
     * Unsets the "Prompt" attribute
     */
    void unsetPrompt();

    /**
     * Gets the "Hidden" attribute
     */
    boolean getHidden();

    /**
     * Gets (as xml) the "Hidden" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHidden();

    /**
     * True if has "Hidden" attribute
     */
    boolean isSetHidden();

    /**
     * Sets the "Hidden" attribute
     */
    void setHidden(boolean hidden);

    /**
     * Sets (as xml) the "Hidden" attribute
     */
    void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden);

    /**
     * Unsets the "Hidden" attribute
     */
    void unsetHidden();

    /**
     * Gets the "IconUpdate" attribute
     */
    boolean getIconUpdate();

    /**
     * Gets (as xml) the "IconUpdate" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIconUpdate();

    /**
     * True if has "IconUpdate" attribute
     */
    boolean isSetIconUpdate();

    /**
     * Sets the "IconUpdate" attribute
     */
    void setIconUpdate(boolean iconUpdate);

    /**
     * Sets (as xml) the "IconUpdate" attribute
     */
    void xsetIconUpdate(org.apache.xmlbeans.XmlBoolean iconUpdate);

    /**
     * Unsets the "IconUpdate" attribute
     */
    void unsetIconUpdate();

    /**
     * Gets the "AlignName" attribute
     */
    int getAlignName();

    /**
     * Gets (as xml) the "AlignName" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetAlignName();

    /**
     * True if has "AlignName" attribute
     */
    boolean isSetAlignName();

    /**
     * Sets the "AlignName" attribute
     */
    void setAlignName(int alignName);

    /**
     * Sets (as xml) the "AlignName" attribute
     */
    void xsetAlignName(org.apache.xmlbeans.XmlUnsignedShort alignName);

    /**
     * Unsets the "AlignName" attribute
     */
    void unsetAlignName();

    /**
     * Gets the "MasterType" attribute
     */
    int getMasterType();

    /**
     * Gets (as xml) the "MasterType" attribute
     */
    org.apache.xmlbeans.XmlUnsignedShort xgetMasterType();

    /**
     * True if has "MasterType" attribute
     */
    boolean isSetMasterType();

    /**
     * Sets the "MasterType" attribute
     */
    void setMasterType(int masterType);

    /**
     * Sets (as xml) the "MasterType" attribute
     */
    void xsetMasterType(org.apache.xmlbeans.XmlUnsignedShort masterType);

    /**
     * Unsets the "MasterType" attribute
     */
    void unsetMasterType();
}
