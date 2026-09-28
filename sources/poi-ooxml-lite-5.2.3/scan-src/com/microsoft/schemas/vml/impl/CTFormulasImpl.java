/*
 * XML Type:  CT_Formulas
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.CTFormulas
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_Formulas(@urn:schemas-microsoft-com:vml).
 *
 * This is a complex type.
 */
public class CTFormulasImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.CTFormulas {
    private static final long serialVersionUID = 1L;

    public CTFormulasImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "f"),
    };


    /**
     * Gets a List of "f" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.vml.CTF> getFList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFArray,
                this::setFArray,
                this::insertNewF,
                this::removeF,
                this::sizeOfFArray
            );
        }
    }

    /**
     * Gets array of all "f" elements
     */
    @Override
    public com.microsoft.schemas.vml.CTF[] getFArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.vml.CTF[0]);
    }

    /**
     * Gets ith "f" element
     */
    @Override
    public com.microsoft.schemas.vml.CTF getFArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTF target = null;
            target = (com.microsoft.schemas.vml.CTF)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "f" element
     */
    @Override
    public int sizeOfFArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "f" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFArray(com.microsoft.schemas.vml.CTF[] fArray) {
        check_orphaned();
        arraySetterHelper(fArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "f" element
     */
    @Override
    public void setFArray(int i, com.microsoft.schemas.vml.CTF f) {
        generatedSetterHelperImpl(f, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "f" element
     */
    @Override
    public com.microsoft.schemas.vml.CTF insertNewF(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTF target = null;
            target = (com.microsoft.schemas.vml.CTF)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "f" element
     */
    @Override
    public com.microsoft.schemas.vml.CTF addNewF() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTF target = null;
            target = (com.microsoft.schemas.vml.CTF)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "f" element
     */
    @Override
    public void removeF(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
