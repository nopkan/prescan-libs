/*
 * XML Type:  Sheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.SheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Sheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface SheetType extends org.apache.xmlbeans.XmlObject {
    AbstractDocumentFactory<com.microsoft.schemas.office.visio.x2012.main.SheetType> Factory = new AbstractDocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "sheettype25actype");
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
     * Gets a List of "Section" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.SectionType> getSectionList();

    /**
     * Gets array of all "Section" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionType[] getSectionArray();

    /**
     * Gets ith "Section" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionType getSectionArray(int i);

    /**
     * Returns number of "Section" element
     */
    int sizeOfSectionArray();

    /**
     * Sets array of all "Section" element
     */
    void setSectionArray(com.microsoft.schemas.office.visio.x2012.main.SectionType[] sectionArray);

    /**
     * Sets ith "Section" element
     */
    void setSectionArray(int i, com.microsoft.schemas.office.visio.x2012.main.SectionType section);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Section" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionType insertNewSection(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Section" element
     */
    com.microsoft.schemas.office.visio.x2012.main.SectionType addNewSection();

    /**
     * Removes the ith "Section" element
     */
    void removeSection(int i);

    /**
     * Gets the "LineStyle" attribute
     */
    long getLineStyle();

    /**
     * Gets (as xml) the "LineStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetLineStyle();

    /**
     * True if has "LineStyle" attribute
     */
    boolean isSetLineStyle();

    /**
     * Sets the "LineStyle" attribute
     */
    void setLineStyle(long lineStyle);

    /**
     * Sets (as xml) the "LineStyle" attribute
     */
    void xsetLineStyle(org.apache.xmlbeans.XmlUnsignedInt lineStyle);

    /**
     * Unsets the "LineStyle" attribute
     */
    void unsetLineStyle();

    /**
     * Gets the "FillStyle" attribute
     */
    long getFillStyle();

    /**
     * Gets (as xml) the "FillStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetFillStyle();

    /**
     * True if has "FillStyle" attribute
     */
    boolean isSetFillStyle();

    /**
     * Sets the "FillStyle" attribute
     */
    void setFillStyle(long fillStyle);

    /**
     * Sets (as xml) the "FillStyle" attribute
     */
    void xsetFillStyle(org.apache.xmlbeans.XmlUnsignedInt fillStyle);

    /**
     * Unsets the "FillStyle" attribute
     */
    void unsetFillStyle();

    /**
     * Gets the "TextStyle" attribute
     */
    long getTextStyle();

    /**
     * Gets (as xml) the "TextStyle" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetTextStyle();

    /**
     * True if has "TextStyle" attribute
     */
    boolean isSetTextStyle();

    /**
     * Sets the "TextStyle" attribute
     */
    void setTextStyle(long textStyle);

    /**
     * Sets (as xml) the "TextStyle" attribute
     */
    void xsetTextStyle(org.apache.xmlbeans.XmlUnsignedInt textStyle);

    /**
     * Unsets the "TextStyle" attribute
     */
    void unsetTextStyle();
}
