/*
 * XML Type:  CT_Handles
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTHandles
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Handles(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTHandlesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTHandles {
    private static final long serialVersionUID = 1L;

    public CTHandlesImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "h"),
    };


    /**
     * Gets a List of "h" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTH> getHList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getHArray,
                this::setHArray,
                this::insertNewH,
                this::removeH,
                this::sizeOfHArray
            );
        }
    }

    /**
     * Gets array of all "h" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTH[] getHArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.vml.CTH[0]);
    }

    /**
     * Gets ith "h" element
     */
    @Override
    public com.microsoft.schemas.vml.CTH getHArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTH target = null;
            target = (com.microsoft.schemas.vml.CTH)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "h" element
     */
    @Override
    public int sizeOfHArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "h" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setHArray(com.microsoft.schemas.vml.CTH[] hArray) {
        check_orphaned();
        arraySetterHelper(hArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "h" element
     */
    @Override
    public void setHArray(int i, com.microsoft.schemas.vml.CTH h) {
        generatedSetterHelperImpl(h, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "h" element
     */
    @Override
    public com.microsoft.schemas.vml.CTH insertNewH(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTH target = null;
            target = (com.microsoft.schemas.vml.CTH)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "h" element
     */
    @Override
    public com.microsoft.schemas.vml.CTH addNewH() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTH target = null;
            target = (com.microsoft.schemas.vml.CTH)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "h" element
     */
    @Override
    public void removeH(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
