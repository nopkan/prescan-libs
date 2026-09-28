/*
 * XML Type:  Page_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PageType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Page_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface PageType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.PageType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "pagetype2fcatype");
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
     * Gets the "Background" attribute
     */
    boolean getBackground();

    /**
     * Gets (as xml) the "Background" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBackground();

    /**
     * True if has "Background" attribute
     */
    boolean isSetBackground();

    /**
     * Sets the "Background" attribute
     */
    void setBackground(boolean background);

    /**
     * Sets (as xml) the "Background" attribute
     */
    void xsetBackground(org.apache.xmlbeans.XmlBoolean background);

    /**
     * Unsets the "Background" attribute
     */
    void unsetBackground();

    /**
     * Gets the "BackPage" attribute
     */
    long getBackPage();

    /**
     * Gets (as xml) the "BackPage" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetBackPage();

    /**
     * True if has "BackPage" attribute
     */
    boolean isSetBackPage();

    /**
     * Sets the "BackPage" attribute
     */
    void setBackPage(long backPage);

    /**
     * Sets (as xml) the "BackPage" attribute
     */
    void xsetBackPage(org.apache.xmlbeans.XmlUnsignedInt backPage);

    /**
     * Unsets the "BackPage" attribute
     */
    void unsetBackPage();

    /**
     * Gets the "ViewScale" attribute
     */
    double getViewScale();

    /**
     * Gets (as xml) the "ViewScale" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetViewScale();

    /**
     * True if has "ViewScale" attribute
     */
    boolean isSetViewScale();

    /**
     * Sets the "ViewScale" attribute
     */
    void setViewScale(double viewScale);

    /**
     * Sets (as xml) the "ViewScale" attribute
     */
    void xsetViewScale(org.apache.xmlbeans.XmlDouble viewScale);

    /**
     * Unsets the "ViewScale" attribute
     */
    void unsetViewScale();

    /**
     * Gets the "ViewCenterX" attribute
     */
    double getViewCenterX();

    /**
     * Gets (as xml) the "ViewCenterX" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetViewCenterX();

    /**
     * True if has "ViewCenterX" attribute
     */
    boolean isSetViewCenterX();

    /**
     * Sets the "ViewCenterX" attribute
     */
    void setViewCenterX(double viewCenterX);

    /**
     * Sets (as xml) the "ViewCenterX" attribute
     */
    void xsetViewCenterX(org.apache.xmlbeans.XmlDouble viewCenterX);

    /**
     * Unsets the "ViewCenterX" attribute
     */
    void unsetViewCenterX();

    /**
     * Gets the "ViewCenterY" attribute
     */
    double getViewCenterY();

    /**
     * Gets (as xml) the "ViewCenterY" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetViewCenterY();

    /**
     * True if has "ViewCenterY" attribute
     */
    boolean isSetViewCenterY();

    /**
     * Sets the "ViewCenterY" attribute
     */
    void setViewCenterY(double viewCenterY);

    /**
     * Sets (as xml) the "ViewCenterY" attribute
     */
    void xsetViewCenterY(org.apache.xmlbeans.XmlDouble viewCenterY);

    /**
     * Unsets the "ViewCenterY" attribute
     */
    void unsetViewCenterY();

    /**
     * Gets the "ReviewerID" attribute
     */
    long getReviewerID();

    /**
     * Gets (as xml) the "ReviewerID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetReviewerID();

    /**
     * True if has "ReviewerID" attribute
     */
    boolean isSetReviewerID();

    /**
     * Sets the "ReviewerID" attribute
     */
    void setReviewerID(long reviewerID);

    /**
     * Sets (as xml) the "ReviewerID" attribute
     */
    void xsetReviewerID(org.apache.xmlbeans.XmlUnsignedInt reviewerID);

    /**
     * Unsets the "ReviewerID" attribute
     */
    void unsetReviewerID();

    /**
     * Gets the "AssociatedPage" attribute
     */
    long getAssociatedPage();

    /**
     * Gets (as xml) the "AssociatedPage" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetAssociatedPage();

    /**
     * True if has "AssociatedPage" attribute
     */
    boolean isSetAssociatedPage();

    /**
     * Sets the "AssociatedPage" attribute
     */
    void setAssociatedPage(long associatedPage);

    /**
     * Sets (as xml) the "AssociatedPage" attribute
     */
    void xsetAssociatedPage(org.apache.xmlbeans.XmlUnsignedInt associatedPage);

    /**
     * Unsets the "AssociatedPage" attribute
     */
    void unsetAssociatedPage();
}
