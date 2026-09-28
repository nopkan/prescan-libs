/*
 * XML Type:  StyleSheets_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StyleSheets_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class StyleSheetsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.StyleSheetsType {
    private static final long serialVersionUID = 1L;

    public StyleSheetsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "StyleSheet"),
    };


    /**
     * Gets a List of "StyleSheet" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.StyleSheetType> getStyleSheetList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getStyleSheetArray,
                this::setStyleSheetArray,
                this::insertNewStyleSheet,
                this::removeStyleSheet,
                this::sizeOfStyleSheetArray
            );
        }
    }

    /**
     * Gets array of all "StyleSheet" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetType[] getStyleSheetArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.StyleSheetType[0]);
    }

    /**
     * Gets ith "StyleSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetType getStyleSheetArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.StyleSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.StyleSheetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "StyleSheet" element
     */
    @Override
    public int sizeOfStyleSheetArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "StyleSheet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setStyleSheetArray(com.microsoft.schemas.office.visio.x2012.main.StyleSheetType[] styleSheetArray) {
        check_orphaned();
        arraySetterHelper(styleSheetArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "StyleSheet" element
     */
    @Override
    public void setStyleSheetArray(int i, com.microsoft.schemas.office.visio.x2012.main.StyleSheetType styleSheet) {
        generatedSetterHelperImpl(styleSheet, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "StyleSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetType insertNewStyleSheet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.StyleSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.StyleSheetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "StyleSheet" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.StyleSheetType addNewStyleSheet() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.StyleSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.StyleSheetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "StyleSheet" element
     */
    @Override
    public void removeStyleSheet(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
