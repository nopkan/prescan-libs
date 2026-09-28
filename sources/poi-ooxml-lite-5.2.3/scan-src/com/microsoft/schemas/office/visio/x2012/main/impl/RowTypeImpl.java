/*
 * XML Type:  Row_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.RowType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Row_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class RowTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.RowType {
    private static final long serialVersionUID = 1L;

    public RowTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Cell"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Trigger"),
        new QName("", "N"),
        new QName("", "LocalName"),
        new QName("", "IX"),
        new QName("", "T"),
        new QName("", "Del"),
    };


    /**
     * Gets a List of "Cell" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.CellType> getCellList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCellArray,
                this::setCellArray,
                this::insertNewCell,
                this::removeCell,
                this::sizeOfCellArray
            );
        }
    }

    /**
     * Gets array of all "Cell" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellType[] getCellArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.CellType[0]);
    }

    /**
     * Gets ith "Cell" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellType getCellArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Cell" element
     */
    @Override
    public int sizeOfCellArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Cell" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setCellArray(com.microsoft.schemas.office.visio.x2012.main.CellType[] cellArray) {
        check_orphaned();
        arraySetterHelper(cellArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Cell" element
     */
    @Override
    public void setCellArray(int i, com.microsoft.schemas.office.visio.x2012.main.CellType cell) {
        generatedSetterHelperImpl(cell, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cell" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellType insertNewCell(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Cell" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.CellType addNewCell() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.CellType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.CellType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Cell" element
     */
    @Override
    public void removeCell(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "Trigger" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.TriggerType> getTriggerList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getTriggerArray,
                this::setTriggerArray,
                this::insertNewTrigger,
                this::removeTrigger,
                this::sizeOfTriggerArray
            );
        }
    }

    /**
     * Gets array of all "Trigger" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TriggerType[] getTriggerArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new com.microsoft.schemas.office.visio.x2012.main.TriggerType[0]);
    }

    /**
     * Gets ith "Trigger" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TriggerType getTriggerArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TriggerType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TriggerType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Trigger" element
     */
    @Override
    public int sizeOfTriggerArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "Trigger" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setTriggerArray(com.microsoft.schemas.office.visio.x2012.main.TriggerType[] triggerArray) {
        check_orphaned();
        arraySetterHelper(triggerArray, PROPERTY_QNAME[1]);
    }

    /**
     * Sets ith "Trigger" element
     */
    @Override
    public void setTriggerArray(int i, com.microsoft.schemas.office.visio.x2012.main.TriggerType trigger) {
        generatedSetterHelperImpl(trigger, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Trigger" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TriggerType insertNewTrigger(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TriggerType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TriggerType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Trigger" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TriggerType addNewTrigger() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TriggerType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TriggerType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Trigger" element
     */
    @Override
    public void removeTrigger(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "N" attribute
     */
    @Override
    public java.lang.String getN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "N" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetN() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "N" attribute
     */
    @Override
    public boolean isSetN() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "N" attribute
     */
    @Override
    public void setN(java.lang.String n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(n);
        }
    }

    /**
     * Sets (as xml) the "N" attribute
     */
    @Override
    public void xsetN(org.apache.xmlbeans.XmlString n) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(n);
        }
    }

    /**
     * Unsets the "N" attribute
     */
    @Override
    public void unsetN() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Gets the "LocalName" attribute
     */
    @Override
    public java.lang.String getLocalName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "LocalName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLocalName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "LocalName" attribute
     */
    @Override
    public boolean isSetLocalName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "LocalName" attribute
     */
    @Override
    public void setLocalName(java.lang.String localName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(localName);
        }
    }

    /**
     * Sets (as xml) the "LocalName" attribute
     */
    @Override
    public void xsetLocalName(org.apache.xmlbeans.XmlString localName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(localName);
        }
    }

    /**
     * Unsets the "LocalName" attribute
     */
    @Override
    public void unsetLocalName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "IX" attribute
     */
    @Override
    public long getIX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "IX" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetIX() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "IX" attribute
     */
    @Override
    public boolean isSetIX() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "IX" attribute
     */
    @Override
    public void setIX(long ix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setLongValue(ix);
        }
    }

    /**
     * Sets (as xml) the "IX" attribute
     */
    @Override
    public void xsetIX(org.apache.xmlbeans.XmlUnsignedInt ix) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(ix);
        }
    }

    /**
     * Unsets the "IX" attribute
     */
    @Override
    public void unsetIX() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "T" attribute
     */
    @Override
    public java.lang.String getT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "T" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "T" attribute
     */
    @Override
    public boolean isSetT() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "T" attribute
     */
    @Override
    public void setT(java.lang.String t) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setStringValue(t);
        }
    }

    /**
     * Sets (as xml) the "T" attribute
     */
    @Override
    public void xsetT(org.apache.xmlbeans.XmlString t) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(t);
        }
    }

    /**
     * Unsets the "T" attribute
     */
    @Override
    public void unsetT() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Gets the "Del" attribute
     */
    @Override
    public boolean getDel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "Del" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetDel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * True if has "Del" attribute
     */
    @Override
    public boolean isSetDel() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[6]) != null;
        }
    }

    /**
     * Sets the "Del" attribute
     */
    @Override
    public void setDel(boolean del) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setBooleanValue(del);
        }
    }

    /**
     * Sets (as xml) the "Del" attribute
     */
    @Override
    public void xsetDel(org.apache.xmlbeans.XmlBoolean del) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(del);
        }
    }

    /**
     * Unsets the "Del" attribute
     */
    @Override
    public void unsetDel() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[6]);
        }
    }
}
