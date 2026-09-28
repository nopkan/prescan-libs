/*
 * XML Type:  Text_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.TextType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Text_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class TextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.TextType {
    private static final long serialVersionUID = 1L;

    public TextTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "cp"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "pp"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "tp"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "fld"),
    };


    /**
     * Gets a List of "cp" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.CpType> getCpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCpArray,
                this::setCpArray,
                this::insertNewCp,
                this::removeCp,
                this::sizeOfCpArray
            );
        }
    }

    /**
     * Gets array of all "cp" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CpType[] getCpArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.CpType[0]);
    }

    /**
     * Gets ith "cp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CpType getCpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CpType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "cp" element
     */
    @Override
    public int sizeOfCpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "cp" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCpArray(com.microsoft.schemas.office.visio.x2012.main.CpType[] cpArray) {
        check_orphaned();
        arraySetterHelper(cpArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "cp" element
     */
    @Override
    public void setCpArray(int i, com.microsoft.schemas.office.visio.x2012.main.CpType cp) {
        generatedSetterHelperImpl(cp, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CpType insertNewCp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CpType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "cp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CpType addNewCp() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CpType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "cp" element
     */
    @Override
    public void removeCp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "pp" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.PpType> getPpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getPpArray,
                this::setPpArray,
                this::insertNewPp,
                this::removePp,
                this::sizeOfPpArray
            );
        }
    }

    /**
     * Gets array of all "pp" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PpType[] getPpArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.visio.x2012.main.PpType[0]);
    }

    /**
     * Gets ith "pp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PpType getPpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PpType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "pp" element
     */
    @Override
    public int sizeOfPpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "pp" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setPpArray(com.microsoft.schemas.office.visio.x2012.main.PpType[] ppArray) {
        check_orphaned();
        arraySetterHelper(ppArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "pp" element
     */
    @Override
    public void setPpArray(int i, com.microsoft.schemas.office.visio.x2012.main.PpType pp) {
        generatedSetterHelperImpl(pp, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PpType insertNewPp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PpType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "pp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.PpType addNewPp() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.PpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.PpType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "pp" element
     */
    @Override
    public void removePp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "tp" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.TpType> getTpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTpArray,
                this::setTpArray,
                this::insertNewTp,
                this::removeTp,
                this::sizeOfTpArray
            );
        }
    }

    /**
     * Gets array of all "tp" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TpType[] getTpArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.visio.x2012.main.TpType[0]);
    }

    /**
     * Gets ith "tp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TpType getTpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TpType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "tp" element
     */
    @Override
    public int sizeOfTpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "tp" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTpArray(com.microsoft.schemas.office.visio.x2012.main.TpType[] tpArray) {
        check_orphaned();
        arraySetterHelper(tpArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "tp" element
     */
    @Override
    public void setTpArray(int i, com.microsoft.schemas.office.visio.x2012.main.TpType tp) {
        generatedSetterHelperImpl(tp, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "tp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TpType insertNewTp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TpType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "tp" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TpType addNewTp() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TpType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TpType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "tp" element
     */
    @Override
    public void removeTp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "fld" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.FldType> getFldList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getFldArray,
                this::setFldArray,
                this::insertNewFld,
                this::removeFld,
                this::sizeOfFldArray
            );
        }
    }

    /**
     * Gets array of all "fld" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FldType[] getFldArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new com.microsoft.schemas.office.visio.x2012.main.FldType[0]);
    }

    /**
     * Gets ith "fld" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FldType getFldArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FldType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FldType)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "fld" element
     */
    @Override
    public int sizeOfFldArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "fld" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setFldArray(com.microsoft.schemas.office.visio.x2012.main.FldType[] fldArray) {
        check_orphaned();
        arraySetterHelper(fldArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "fld" element
     */
    @Override
    public void setFldArray(int i, com.microsoft.schemas.office.visio.x2012.main.FldType fld) {
        generatedSetterHelperImpl(fld, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fld" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FldType insertNewFld(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FldType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FldType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "fld" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.FldType addNewFld() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.FldType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.FldType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "fld" element
     */
    @Override
    public void removeFld(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }
}
