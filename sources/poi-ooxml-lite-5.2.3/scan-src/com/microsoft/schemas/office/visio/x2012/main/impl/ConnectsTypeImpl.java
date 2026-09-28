/*
 * XML Type:  Connects_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ConnectsType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Connects_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ConnectsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ConnectsType {
    private static final long serialVersionUID = 1L;

    public ConnectsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Connect"),
    };


    /**
     * Gets a List of "Connect" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.ConnectType> getConnectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConnectArray,
                this::setConnectArray,
                this::insertNewConnect,
                this::removeConnect,
                this::sizeOfConnectArray
            );
        }
    }

    /**
     * Gets array of all "Connect" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectType[] getConnectArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.ConnectType[0]);
    }

    /**
     * Gets ith "Connect" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectType getConnectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ConnectType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ConnectType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Connect" element
     */
    @Override
    public int sizeOfConnectArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Connect" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setConnectArray(com.microsoft.schemas.office.visio.x2012.main.ConnectType[] connectArray) {
        check_orphaned();
        arraySetterHelper(connectArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Connect" element
     */
    @Override
    public void setConnectArray(int i, com.microsoft.schemas.office.visio.x2012.main.ConnectType connect) {
        generatedSetterHelperImpl(connect, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Connect" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectType insertNewConnect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ConnectType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ConnectType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Connect" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ConnectType addNewConnect() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ConnectType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ConnectType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Connect" element
     */
    @Override
    public void removeConnect(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
