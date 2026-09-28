/*
 * XML Type:  VisioDocument_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VisioDocument_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class VisioDocumentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType {
    private static final long serialVersionUID = 1L;

    public VisioDocumentTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DocumentSettings"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Colors"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "FaceNames"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "StyleSheets"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "DocumentSheet"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "EventList"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "HeaderFooter"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "PublishSettings"),
    };


    /**
     * Gets the "DocumentSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType getDocumentSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DocumentSettings" element
     */
    @Override
    public boolean isSetDocumentSettings() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "DocumentSettings" element
     */
    @Override
    public void setDocumentSettings(com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType documentSettings) {
        generatedSetterHelperImpl(documentSettings, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DocumentSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType addNewDocumentSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "DocumentSettings" element
     */
    @Override
    public void unsetDocumentSettings() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Colors" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorsType getColors() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ColorsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ColorsType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Colors" element
     */
    @Override
    public boolean isSetColors() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Colors" element
     */
    @Override
    public void setColors(com.microsoft.schemas.office.visio.x2012.main.ColorsType colors) {
        generatedSetterHelperImpl(colors, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Colors" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ColorsType addNewColors() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ColorsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ColorsType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Colors" element
     */
    @Override
    public void unsetColors() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "FaceNames" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNamesType getFaceNames() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FaceNamesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FaceNamesType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "FaceNames" element
     */
    @Override
    public boolean isSetFaceNames() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "FaceNames" element
     */
    @Override
    public void setFaceNames(com.microsoft.schemas.office.visio.x2012.main.FaceNamesType faceNames) {
        generatedSetterHelperImpl(faceNames, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "FaceNames" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FaceNamesType addNewFaceNames() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FaceNamesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FaceNamesType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "FaceNames" element
     */
    @Override
    public void unsetFaceNames() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "StyleSheets" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType getStyleSheets() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "StyleSheets" element
     */
    @Override
    public boolean isSetStyleSheets() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "StyleSheets" element
     */
    @Override
    public void setStyleSheets(com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType styleSheets) {
        generatedSetterHelperImpl(styleSheets, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StyleSheets" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType addNewStyleSheets() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "StyleSheets" element
     */
    @Override
    public void unsetStyleSheets() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "DocumentSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType getDocumentSheet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "DocumentSheet" element
     */
    @Override
    public boolean isSetDocumentSheet() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "DocumentSheet" element
     */
    @Override
    public void setDocumentSheet(com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType documentSheet) {
        generatedSetterHelperImpl(documentSheet, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DocumentSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType addNewDocumentSheet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DocumentSheetType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "DocumentSheet" element
     */
    @Override
    public void unsetDocumentSheet() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "EventList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventListType getEventList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.EventListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.EventListType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "EventList" element
     */
    @Override
    public boolean isSetEventList() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "EventList" element
     */
    @Override
    public void setEventList(com.microsoft.schemas.office.visio.x2012.main.EventListType eventList) {
        generatedSetterHelperImpl(eventList, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "EventList" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.EventListType addNewEventList() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.EventListType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.EventListType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "EventList" element
     */
    @Override
    public void unsetEventList() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "HeaderFooter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType getHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType)get_store().find_element_user(PROPERTY_QNAME[6], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "HeaderFooter" element
     */
    @Override
    public boolean isSetHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]) != 0;
        }
    }

    /**
     * Sets the "HeaderFooter" element
     */
    @Override
    public void setHeaderFooter(com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType headerFooter) {
        generatedSetterHelperImpl(headerFooter, PROPERTY_QNAME[6], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HeaderFooter" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType addNewHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.HeaderFooterType)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Unsets the "HeaderFooter" element
     */
    @Override
    public void unsetHeaderFooter() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], 0);
        }
    }

    /**
     * Gets the "PublishSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType getPublishSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType)get_store().find_element_user(PROPERTY_QNAME[7], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "PublishSettings" element
     */
    @Override
    public boolean isSetPublishSettings() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]) != 0;
        }
    }

    /**
     * Sets the "PublishSettings" element
     */
    @Override
    public void setPublishSettings(com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType publishSettings) {
        generatedSetterHelperImpl(publishSettings, PROPERTY_QNAME[7], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PublishSettings" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType addNewPublishSettings() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PublishSettingsType)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Unsets the "PublishSettings" element
     */
    @Override
    public void unsetPublishSettings() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], 0);
        }
    }
}
