/*
 * XML Type:  Sheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Sheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class SheetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.SheetType {
    private static final long serialVersionUID = 1L;

    public SheetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Cell"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Trigger"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Section"),
        new QName("", "LineStyle"),
        new QName("", "FillStyle"),
        new QName("", "TextStyle"),
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
     * Gets a List of "Section" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.SectionType> getSectionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSectionArray,
                this::setSectionArray,
                this::insertNewSection,
                this::removeSection,
                this::sizeOfSectionArray
            );
        }
    }

    /**
     * Gets array of all "Section" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionType[] getSectionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.visio.x2012.main.SectionType[0]);
    }

    /**
     * Gets ith "Section" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionType getSectionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionType)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Section" element
     */
    @Override
    public int sizeOfSectionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "Section" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSectionArray(com.microsoft.schemas.office.visio.x2012.main.SectionType[] sectionArray) {
        check_orphaned();
        arraySetterHelper(sectionArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "Section" element
     */
    @Override
    public void setSectionArray(int i, com.microsoft.schemas.office.visio.x2012.main.SectionType section) {
        generatedSetterHelperImpl(section, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Section" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionType insertNewSection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionType)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.SectionType addNewSection() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.SectionType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.SectionType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Section" element
     */
    @Override
    public void removeSection(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets the "LineStyle" attribute
     */
    @Override
    public long getLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "LineStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * True if has "LineStyle" attribute
     */
    @Override
    public boolean isSetLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
        }
    }

    /**
     * Sets the "LineStyle" attribute
     */
    @Override
    public void setLineStyle(long lineStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.setLongValue(lineStyle);
        }
    }

    /**
     * Sets (as xml) the "LineStyle" attribute
     */
    @Override
    public void xsetLineStyle(org.apache.xmlbeans.XmlUnsignedInt lineStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[3]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[3]);
            }
            target.set(lineStyle);
        }
    }

    /**
     * Unsets the "LineStyle" attribute
     */
    @Override
    public void unsetLineStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Gets the "FillStyle" attribute
     */
    @Override
    public long getFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "FillStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * True if has "FillStyle" attribute
     */
    @Override
    public boolean isSetFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
        }
    }

    /**
     * Sets the "FillStyle" attribute
     */
    @Override
    public void setFillStyle(long fillStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.setLongValue(fillStyle);
        }
    }

    /**
     * Sets (as xml) the "FillStyle" attribute
     */
    @Override
    public void xsetFillStyle(org.apache.xmlbeans.XmlUnsignedInt fillStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[4]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[4]);
            }
            target.set(fillStyle);
        }
    }

    /**
     * Unsets the "FillStyle" attribute
     */
    @Override
    public void unsetFillStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Gets the "TextStyle" attribute
     */
    @Override
    public long getTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "TextStyle" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * True if has "TextStyle" attribute
     */
    @Override
    public boolean isSetTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[5]) != null;
        }
    }

    /**
     * Sets the "TextStyle" attribute
     */
    @Override
    public void setTextStyle(long textStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.setLongValue(textStyle);
        }
    }

    /**
     * Sets (as xml) the "TextStyle" attribute
     */
    @Override
    public void xsetTextStyle(org.apache.xmlbeans.XmlUnsignedInt textStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[5]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[5]);
            }
            target.set(textStyle);
        }
    }

    /**
     * Unsets the "TextStyle" attribute
     */
    @Override
    public void unsetTextStyle() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[5]);
        }
    }
}
