/*
 * XML Type:  Pages_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.PagesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Pages_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class PagesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.PagesType {
    private static final long serialVersionUID = 1L;

    public PagesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Page"),
    };


    /**
     * Gets a List of "Page" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.PageType> getPageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPageArray,
                this::setPageArray,
                this::insertNewPage,
                this::removePage,
                this::sizeOfPageArray
            );
        }
    }

    /**
     * Gets array of all "Page" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageType[] getPageArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.PageType[0]);
    }

    /**
     * Gets ith "Page" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageType getPageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Page" element
     */
    @Override
    public int sizeOfPageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Page" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPageArray(com.microsoft.schemas.office.visio.x2012.main.PageType[] pageArray) {
        check_orphaned();
        arraySetterHelper(pageArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Page" element
     */
    @Override
    public void setPageArray(int i, com.microsoft.schemas.office.visio.x2012.main.PageType page) {
        generatedSetterHelperImpl(page, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Page" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageType insertNewPage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Page" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PageType addNewPage() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PageType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PageType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Page" element
     */
    @Override
    public void removePage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
