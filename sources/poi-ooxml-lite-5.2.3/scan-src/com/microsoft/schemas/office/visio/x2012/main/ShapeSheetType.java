/*
 * XML Type:  ShapeSheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ShapeSheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface ShapeSheetType extends com.microsoft.schemas.office.visio.x2012.main.SheetType {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "shapesheettype59bbtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Text" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TextType getText();

    /**
     * True if has "Text" element
     */
    boolean isSetText();

    /**
     * Sets the "Text" element
     */
    void setText(com.microsoft.schemas.office.visio.x2012.main.TextType text);

    /**
     * Appends and returns a new empty "Text" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TextType addNewText();

    /**
     * Unsets the "Text" element
     */
    void unsetText();

    /**
     * Gets the "Data1" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType getData1();

    /**
     * True if has "Data1" element
     */
    boolean isSetData1();

    /**
     * Sets the "Data1" element
     */
    void setData1(com.microsoft.schemas.office.visio.x2012.main.DataType data1);

    /**
     * Appends and returns a new empty "Data1" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType addNewData1();

    /**
     * Unsets the "Data1" element
     */
    void unsetData1();

    /**
     * Gets the "Data2" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType getData2();

    /**
     * True if has "Data2" element
     */
    boolean isSetData2();

    /**
     * Sets the "Data2" element
     */
    void setData2(com.microsoft.schemas.office.visio.x2012.main.DataType data2);

    /**
     * Appends and returns a new empty "Data2" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType addNewData2();

    /**
     * Unsets the "Data2" element
     */
    void unsetData2();

    /**
     * Gets the "Data3" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType getData3();

    /**
     * True if has "Data3" element
     */
    boolean isSetData3();

    /**
     * Sets the "Data3" element
     */
    void setData3(com.microsoft.schemas.office.visio.x2012.main.DataType data3);

    /**
     * Appends and returns a new empty "Data3" element
     */
    com.microsoft.schemas.office.visio.x2012.main.DataType addNewData3();

    /**
     * Unsets the "Data3" element
     */
    void unsetData3();

    /**
     * Gets the "ForeignData" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ForeignDataType getForeignData();

    /**
     * True if has "ForeignData" element
     */
    boolean isSetForeignData();

    /**
     * Sets the "ForeignData" element
     */
    void setForeignData(com.microsoft.schemas.office.visio.x2012.main.ForeignDataType foreignData);

    /**
     * Appends and returns a new empty "ForeignData" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ForeignDataType addNewForeignData();

    /**
     * Unsets the "ForeignData" element
     */
    void unsetForeignData();

    /**
     * Gets the "Shapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapesType getShapes();

    /**
     * True if has "Shapes" element
     */
    boolean isSetShapes();

    /**
     * Sets the "Shapes" element
     */
    void setShapes(com.microsoft.schemas.office.visio.x2012.main.ShapesType shapes);

    /**
     * Appends and returns a new empty "Shapes" element
     */
    com.microsoft.schemas.office.visio.x2012.main.ShapesType addNewShapes();

    /**
     * Unsets the "Shapes" element
     */
    void unsetShapes();

    /**
     * Gets the "ID" attribute
     */
    long getID();

    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetID();

    /**
     * Sets the "ID" attribute
     */
    void setID(long id);

    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlUnsignedInt id);

    /**
     * Gets the "OriginalID" attribute
     */
    long getOriginalID();

    /**
     * Gets (as xml) the "OriginalID" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetOriginalID();

    /**
     * True if has "OriginalID" attribute
     */
    boolean isSetOriginalID();

    /**
     * Sets the "OriginalID" attribute
     */
    void setOriginalID(long originalID);

    /**
     * Sets (as xml) the "OriginalID" attribute
     */
    void xsetOriginalID(org.apache.xmlbeans.XmlUnsignedInt originalID);

    /**
     * Unsets the "OriginalID" attribute
     */
    void unsetOriginalID();

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
     * Gets the "MasterShape" attribute
     */
    long getMasterShape();

    /**
     * Gets (as xml) the "MasterShape" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMasterShape();

    /**
     * True if has "MasterShape" attribute
     */
    boolean isSetMasterShape();

    /**
     * Sets the "MasterShape" attribute
     */
    void setMasterShape(long masterShape);

    /**
     * Sets (as xml) the "MasterShape" attribute
     */
    void xsetMasterShape(org.apache.xmlbeans.XmlUnsignedInt masterShape);

    /**
     * Unsets the "MasterShape" attribute
     */
    void unsetMasterShape();

    /**
     * Gets the "UniqueID" attribute
     */
    java.lang.String getUniqueID();

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    org.apache.xmlbeans.XmlString xgetUniqueID();

    /**
     * True if has "UniqueID" attribute
     */
    boolean isSetUniqueID();

    /**
     * Sets the "UniqueID" attribute
     */
    void setUniqueID(java.lang.String uniqueID);

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID);

    /**
     * Unsets the "UniqueID" attribute
     */
    void unsetUniqueID();

    /**
     * Gets the "Name" attribute
     */
    java.lang.String getName();

    /**
     * Gets (as xml) the "Name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();

    /**
     * True if has "Name" attribute
     */
    boolean isSetName();

    /**
     * Sets the "Name" attribute
     */
    void setName(java.lang.String name);

    /**
     * Sets (as xml) the "Name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);

    /**
     * Unsets the "Name" attribute
     */
    void unsetName();

    /**
     * Gets the "NameU" attribute
     */
    java.lang.String getNameU();

    /**
     * Gets (as xml) the "NameU" attribute
     */
    org.apache.xmlbeans.XmlString xgetNameU();

    /**
     * True if has "NameU" attribute
     */
    boolean isSetNameU();

    /**
     * Sets the "NameU" attribute
     */
    void setNameU(java.lang.String nameU);

    /**
     * Sets (as xml) the "NameU" attribute
     */
    void xsetNameU(org.apache.xmlbeans.XmlString nameU);

    /**
     * Unsets the "NameU" attribute
     */
    void unsetNameU();

    /**
     * Gets the "IsCustomName" attribute
     */
    boolean getIsCustomName();

    /**
     * Gets (as xml) the "IsCustomName" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomName();

    /**
     * True if has "IsCustomName" attribute
     */
    boolean isSetIsCustomName();

    /**
     * Sets the "IsCustomName" attribute
     */
    void setIsCustomName(boolean isCustomName);

    /**
     * Sets (as xml) the "IsCustomName" attribute
     */
    void xsetIsCustomName(org.apache.xmlbeans.XmlBoolean isCustomName);

    /**
     * Unsets the "IsCustomName" attribute
     */
    void unsetIsCustomName();

    /**
     * Gets the "IsCustomNameU" attribute
     */
    boolean getIsCustomNameU();

    /**
     * Gets (as xml) the "IsCustomNameU" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCustomNameU();

    /**
     * True if has "IsCustomNameU" attribute
     */
    boolean isSetIsCustomNameU();

    /**
     * Sets the "IsCustomNameU" attribute
     */
    void setIsCustomNameU(boolean isCustomNameU);

    /**
     * Sets (as xml) the "IsCustomNameU" attribute
     */
    void xsetIsCustomNameU(org.apache.xmlbeans.XmlBoolean isCustomNameU);

    /**
     * Unsets the "IsCustomNameU" attribute
     */
    void unsetIsCustomNameU();

    /**
     * Gets the "Master" attribute
     */
    long getMaster();

    /**
     * Gets (as xml) the "Master" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetMaster();

    /**
     * True if has "Master" attribute
     */
    boolean isSetMaster();

    /**
     * Sets the "Master" attribute
     */
    void setMaster(long master);

    /**
     * Sets (as xml) the "Master" attribute
     */
    void xsetMaster(org.apache.xmlbeans.XmlUnsignedInt master);

    /**
     * Unsets the "Master" attribute
     */
    void unsetMaster();

    /**
     * Gets the "Type" attribute
     */
    java.lang.String getType();

    /**
     * Gets (as xml) the "Type" attribute
     */
    org.apache.xmlbeans.XmlToken xgetType();

    /**
     * True if has "Type" attribute
     */
    boolean isSetType();

    /**
     * Sets the "Type" attribute
     */
    void setType(java.lang.String type);

    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlToken type);

    /**
     * Unsets the "Type" attribute
     */
    void unsetType();
}
