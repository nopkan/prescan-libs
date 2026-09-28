/*
 * XML Type:  Masters_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MastersType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Masters_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class MastersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.MastersType {
    private static final long serialVersionUID = 1L;

    public MastersTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Master"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "MasterShortcut"),
    };


    /**
     * Gets a List of "Master" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.MasterType> getMasterList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMasterArray,
                this::setMasterArray,
                this::insertNewMaster,
                this::removeMaster,
                this::sizeOfMasterArray
            );
        }
    }

    /**
     * Gets array of all "Master" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterType[] getMasterArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.MasterType[0]);
    }

    /**
     * Gets ith "Master" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterType getMasterArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Master" element
     */
    @Override
    public int sizeOfMasterArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Master" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMasterArray(com.microsoft.schemas.office.visio.x2012.main.MasterType[] masterArray) {
        check_orphaned();
        arraySetterHelper(masterArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Master" element
     */
    @Override
    public void setMasterArray(int i, com.microsoft.schemas.office.visio.x2012.main.MasterType master) {
        generatedSetterHelperImpl(master, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Master" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterType insertNewMaster(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Master" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterType addNewMaster() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Master" element
     */
    @Override
    public void removeMaster(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "MasterShortcut" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType> getMasterShortcutList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getMasterShortcutArray,
                this::setMasterShortcutArray,
                this::insertNewMasterShortcut,
                this::removeMasterShortcut,
                this::sizeOfMasterShortcutArray
            );
        }
    }

    /**
     * Gets array of all "MasterShortcut" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType[] getMasterShortcutArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType[0]);
    }

    /**
     * Gets ith "MasterShortcut" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType getMasterShortcutArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MasterShortcut" element
     */
    @Override
    public int sizeOfMasterShortcutArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "MasterShortcut" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setMasterShortcutArray(com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType[] masterShortcutArray) {
        check_orphaned();
        arraySetterHelper(masterShortcutArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "MasterShortcut" element
     */
    @Override
    public void setMasterShortcutArray(int i, com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType masterShortcut) {
        generatedSetterHelperImpl(masterShortcut, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MasterShortcut" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType insertNewMasterShortcut(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MasterShortcut" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType addNewMasterShortcut() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "MasterShortcut" element
     */
    @Override
    public void removeMasterShortcut(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
