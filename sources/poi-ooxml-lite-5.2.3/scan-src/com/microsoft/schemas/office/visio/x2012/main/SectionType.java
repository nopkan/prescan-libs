/*
 * XML Type:  Section_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SectionType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Section_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface SectionType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.SectionType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "sectiontype30a6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Cell" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.CellType> getCellList();

    /**
     * Gets array of all "Cell" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.CellType[] getCellArray();

    /**
     * Gets ith "Cell" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellType getCellArray(int i);

    /**
     * Returns number of "Cell" element
     */
    int sizeOfCellArray();

    /**
     * Sets array of all "Cell" element
     */
    void setCellArray(com.microsoft.schemas.office.visio.x2012.main.CellType[] cellArray);

    /**
     * Sets ith "Cell" element
     */
    void setCellArray(int i, com.microsoft.schemas.office.visio.x2012.main.CellType cell);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cell" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellType insertNewCell(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Cell" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CellType addNewCell();

    /**
     * Removes the ith "Cell" element
     */
    void removeCell(int i);

    /**
     * Gets a List of "Trigger" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.TriggerType> getTriggerList();

    /**
     * Gets array of all "Trigger" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.TriggerType[] getTriggerArray();

    /**
     * Gets ith "Trigger" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TriggerType getTriggerArray(int i);

    /**
     * Returns number of "Trigger" element
     */
    int sizeOfTriggerArray();

    /**
     * Sets array of all "Trigger" element
     */
    void setTriggerArray(com.microsoft.schemas.office.visio.x2012.main.TriggerType[] triggerArray);

    /**
     * Sets ith "Trigger" element
     */
    void setTriggerArray(int i, com.microsoft.schemas.office.visio.x2012.main.TriggerType trigger);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Trigger" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TriggerType insertNewTrigger(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Trigger" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TriggerType addNewTrigger();

    /**
     * Removes the ith "Trigger" element
     */
    void removeTrigger(int i);

    /**
     * Gets a List of "Row" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.RowType> getRowList();

    /**
     * Gets array of all "Row" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.RowType[] getRowArray();

    /**
     * Gets ith "Row" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowType getRowArray(int i);

    /**
     * Returns number of "Row" element
     */
    int sizeOfRowArray();

    /**
     * Sets array of all "Row" element
     */
    void setRowArray(com.microsoft.schemas.office.visio.x2012.main.RowType[] rowArray);

    /**
     * Sets ith "Row" element
     */
    void setRowArray(int i, com.microsoft.schemas.office.visio.x2012.main.RowType row);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Row" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowType insertNewRow(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Row" element
     */
    com.microsoft.schemas.office.visio.x2012.main.RowType addNewRow();

    /**
     * Removes the ith "Row" element
     */
    void removeRow(int i);

    /**
     * Gets the "N" attribute
     */
    java.lang.String getN();

    /**
     * Gets (as xml) the "N" attribute
     */
    org.apache.xmlbeans.XmlString xgetN();

    /**
     * Sets the "N" attribute
     */
    void setN(java.lang.String n);

    /**
     * Sets (as xml) the "N" attribute
     */
    void xsetN(org.apache.xmlbeans.XmlString n);

    /**
     * Gets the "Del" attribute
     */
    boolean getDel();

    /**
     * Gets (as xml) the "Del" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDel();

    /**
     * True if has "Del" attribute
     */
    boolean isSetDel();

    /**
     * Sets the "Del" attribute
     */
    void setDel(boolean del);

    /**
     * Sets (as xml) the "Del" attribute
     */
    void xsetDel(org.apache.xmlbeans.XmlBoolean del);

    /**
     * Unsets the "Del" attribute
     */
    void unsetDel();

    /**
     * Gets the "IX" attribute
     */
    long getIX();

    /**
     * Gets (as xml) the "IX" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIX();

    /**
     * True if has "IX" attribute
     */
    boolean isSetIX();

    /**
     * Sets the "IX" attribute
     */
    void setIX(long ix);

    /**
     * Sets (as xml) the "IX" attribute
     */
    void xsetIX(org.apache.xmlbeans.XmlUnsignedInt ix);

    /**
     * Unsets the "IX" attribute
     */
    void unsetIX();
}
