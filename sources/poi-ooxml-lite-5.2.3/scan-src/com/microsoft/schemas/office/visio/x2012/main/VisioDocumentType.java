/*
 * XML Type:  VisioDocument_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VisioDocument_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface VisioDocumentType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "visiodocumenttypebfcatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DocumentSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType getDocumentSettings();

    /**
     * True if has "DocumentSettings" element
     */
    boolean isSetDocumentSettings();

    /**
     * Sets the "DocumentSettings" element
     */
    void setDocumentSettings(com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType documentSettings);

    /**
     * Appends and returns a new empty "DocumentSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType addNewDocumentSettings();

    /**
     * Unsets the "DocumentSettings" element
     */
    void unsetDocumentSettings();

    /**
     * Gets the "Colors" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorsType getColors();

    /**
     * True if has "Colors" element
     */
    boolean isSetColors();

    /**
     * Sets the "Colors" element
     */
    void setColors(com.microsoft.schemas.office.visio.x2012.main.ColorsType colors);

    /**
     * Appends and returns a new empty "Colors" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ColorsType addNewColors();

    /**
     * Unsets the "Colors" element
     */
    void unsetColors();

    /**
     * Gets the "FaceNames" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNamesType getFaceNames();

    /**
     * True if has "FaceNames" element
     */
    boolean isSetFaceNames();

    /**
     * Sets the "FaceNames" element
     */
    void setFaceNames(com.microsoft.schemas.office.visio.x2012.main.FaceNamesType faceNames);

    /**
     * Appends and returns a new empty "FaceNames" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FaceNamesType addNewFaceNames();

    /**
     * Unsets the "FaceNames" element
     */
    void unsetFaceNames();

    /**
     * Gets the "StyleSheets" element
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType getStyleSheets();

    /**
     * True if has "StyleSheets" element
     */
    boolean isSetStyleSheets();

    /**
     * Sets the "StyleSheets" element
     */
    void setStyleSheets(com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType styleSheets);

    /**
     * Appends and returns a new empty "StyleSheets" element
     */
    com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType addNewStyleSheets();

    /**
     * Unsets the "StyleSheets" element
     */
    void unsetStyleSheets();

    /**
     * Gets the "DocumentSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType getDocumentSheet();

    /**
     * True if has "DocumentSheet" element
     */
    boolean isSetDocumentSheet();

    /**
     * Sets the "DocumentSheet" element
     */
    void setDocumentSheet(com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType documentSheet);

    /**
     * Appends and returns a new empty "DocumentSheet" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType addNewDocumentSheet();

    /**
     * Unsets the "DocumentSheet" element
     */
    void unsetDocumentSheet();

    /**
     * Gets the "EventList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.EventListType getEventList();

    /**
     * True if has "EventList" element
     */
    boolean isSetEventList();

    /**
     * Sets the "EventList" element
     */
    void setEventList(com.microsoft.schemas.office.visio.x2012.main.EventListType eventList);

    /**
     * Appends and returns a new empty "EventList" element
     */
    com.microsoft.schemas.office.visio.x2012.main.EventListType addNewEventList();

    /**
     * Unsets the "EventList" element
     */
    void unsetEventList();

    /**
     * Gets the "HeaderFooter" element
     */
    com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType getHeaderFooter();

    /**
     * True if has "HeaderFooter" element
     */
    boolean isSetHeaderFooter();

    /**
     * Sets the "HeaderFooter" element
     */
    void setHeaderFooter(com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType headerFooter);

    /**
     * Appends and returns a new empty "HeaderFooter" element
     */
    com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType addNewHeaderFooter();

    /**
     * Unsets the "HeaderFooter" element
     */
    void unsetHeaderFooter();

    /**
     * Gets the "PublishSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType getPublishSettings();

    /**
     * True if has "PublishSettings" element
     */
    boolean isSetPublishSettings();

    /**
     * Sets the "PublishSettings" element
     */
    void setPublishSettings(com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType publishSettings);

    /**
     * Appends and returns a new empty "PublishSettings" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType addNewPublishSettings();

    /**
     * Unsets the "PublishSettings" element
     */
    void unsetPublishSettings();
}
