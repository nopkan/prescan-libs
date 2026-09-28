/*
 * XML Type:  ShapeSheet_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ShapeSheet_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ShapeSheetTypeImpl extends com.microsoft.schemas.office.visio.x2012.main.impl.SheetTypeImpl implements com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType {
    private static final long serialVersionUID = 1L;

    public ShapeSheetTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Text"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data1"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data2"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Data3"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "ForeignData"),
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shapes"),
        new QName("", "ID"),
        new QName("", "OriginalID"),
        new QName("", "Del"),
        new QName("", "MasterShape"),
        new QName("", "UniqueID"),
        new QName("", "Name"),
        new QName("", "NameU"),
        new QName("", "IsCustomName"),
        new QName("", "IsCustomNameU"),
        new QName("", "Master"),
        new QName("", "Type"),
    };


    /**
     * Gets the "Text" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TextType getText() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TextType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TextType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Text" element
     */
    @Override
    public boolean isSetText() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Text" element
     */
    @Override
    public void setText(com.microsoft.schemas.office.visio.x2012.main.TextType text) {
        generatedSetterHelperImpl(text, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Text" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.TextType addNewText() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.TextType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.TextType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Text" element
     */
    @Override
    public void unsetText() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "Data1" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType getData1() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Data1" element
     */
    @Override
    public boolean isSetData1() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "Data1" element
     */
    @Override
    public void setData1(com.microsoft.schemas.office.visio.x2012.main.DataType data1) {
        generatedSetterHelperImpl(data1, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Data1" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType addNewData1() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "Data1" element
     */
    @Override
    public void unsetData1() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "Data2" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType getData2() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Data2" element
     */
    @Override
    public boolean isSetData2() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "Data2" element
     */
    @Override
    public void setData2(com.microsoft.schemas.office.visio.x2012.main.DataType data2) {
        generatedSetterHelperImpl(data2, PROPERTY_QNAME[2], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Data2" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType addNewData2() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Unsets the "Data2" element
     */
    @Override
    public void unsetData2() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "Data3" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType getData3() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Data3" element
     */
    @Override
    public boolean isSetData3() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "Data3" element
     */
    @Override
    public void setData3(com.microsoft.schemas.office.visio.x2012.main.DataType data3) {
        generatedSetterHelperImpl(data3, PROPERTY_QNAME[3], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Data3" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.DataType addNewData3() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.DataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.DataType)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Unsets the "Data3" element
     */
    @Override
    public void unsetData3() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "ForeignData" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ForeignDataType getForeignData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ForeignDataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ForeignDataType)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ForeignData" element
     */
    @Override
    public boolean isSetForeignData() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "ForeignData" element
     */
    @Override
    public void setForeignData(com.microsoft.schemas.office.visio.x2012.main.ForeignDataType foreignData) {
        generatedSetterHelperImpl(foreignData, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ForeignData" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ForeignDataType addNewForeignData() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ForeignDataType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ForeignDataType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "ForeignData" element
     */
    @Override
    public void unsetForeignData() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }

    /**
     * Gets the "Shapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapesType getShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapesType)get_store().find_element_user(PROPERTY_QNAME[5], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Shapes" element
     */
    @Override
    public boolean isSetShapes() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]) != 0;
        }
    }

    /**
     * Sets the "Shapes" element
     */
    @Override
    public void setShapes(com.microsoft.schemas.office.visio.x2012.main.ShapesType shapes) {
        generatedSetterHelperImpl(shapes, PROPERTY_QNAME[5], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Shapes" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapesType addNewShapes() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapesType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapesType)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Unsets the "Shapes" element
     */
    @Override
    public void unsetShapes() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], 0);
        }
    }

    /**
     * Gets the "ID" attribute
     */
    @Override
    public long getID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "ID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Sets the "ID" attribute
     */
    @Override
    public void setID(long id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.setLongValue(id);
        }
    }

    /**
     * Sets (as xml) the "ID" attribute
     */
    @Override
    public void xsetID(org.apache.xmlbeans.XmlUnsignedInt id) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[6]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[6]);
            }
            target.set(id);
        }
    }

    /**
     * Gets the "OriginalID" attribute
     */
    @Override
    public long getOriginalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "OriginalID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetOriginalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * True if has "OriginalID" attribute
     */
    @Override
    public boolean isSetOriginalID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[7]) != null;
        }
    }

    /**
     * Sets the "OriginalID" attribute
     */
    @Override
    public void setOriginalID(long originalID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.setLongValue(originalID);
        }
    }

    /**
     * Sets (as xml) the "OriginalID" attribute
     */
    @Override
    public void xsetOriginalID(org.apache.xmlbeans.XmlUnsignedInt originalID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[7]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[7]);
            }
            target.set(originalID);
        }
    }

    /**
     * Unsets the "OriginalID" attribute
     */
    @Override
    public void unsetOriginalID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[7]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
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
            return get_store().find_attribute_user(PROPERTY_QNAME[8]) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[8]);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[8]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[8]);
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
            get_store().remove_attribute(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Gets the "MasterShape" attribute
     */
    @Override
    public long getMasterShape() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "MasterShape" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetMasterShape() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * True if has "MasterShape" attribute
     */
    @Override
    public boolean isSetMasterShape() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[9]) != null;
        }
    }

    /**
     * Sets the "MasterShape" attribute
     */
    @Override
    public void setMasterShape(long masterShape) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.setLongValue(masterShape);
        }
    }

    /**
     * Sets (as xml) the "MasterShape" attribute
     */
    @Override
    public void xsetMasterShape(org.apache.xmlbeans.XmlUnsignedInt masterShape) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[9]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[9]);
            }
            target.set(masterShape);
        }
    }

    /**
     * Unsets the "MasterShape" attribute
     */
    @Override
    public void unsetMasterShape() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Gets the "UniqueID" attribute
     */
    @Override
    public java.lang.String getUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "UniqueID" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * True if has "UniqueID" attribute
     */
    @Override
    public boolean isSetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[10]) != null;
        }
    }

    /**
     * Sets the "UniqueID" attribute
     */
    @Override
    public void setUniqueID(java.lang.String uniqueID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.setStringValue(uniqueID);
        }
    }

    /**
     * Sets (as xml) the "UniqueID" attribute
     */
    @Override
    public void xsetUniqueID(org.apache.xmlbeans.XmlString uniqueID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[10]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[10]);
            }
            target.set(uniqueID);
        }
    }

    /**
     * Unsets the "UniqueID" attribute
     */
    @Override
    public void unsetUniqueID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Gets the "Name" attribute
     */
    @Override
    public java.lang.String getName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Name" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * True if has "Name" attribute
     */
    @Override
    public boolean isSetName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[11]) != null;
        }
    }

    /**
     * Sets the "Name" attribute
     */
    @Override
    public void setName(java.lang.String name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.setStringValue(name);
        }
    }

    /**
     * Sets (as xml) the "Name" attribute
     */
    @Override
    public void xsetName(org.apache.xmlbeans.XmlString name) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[11]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[11]);
            }
            target.set(name);
        }
    }

    /**
     * Unsets the "Name" attribute
     */
    @Override
    public void unsetName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Gets the "NameU" attribute
     */
    @Override
    public java.lang.String getNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "NameU" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * True if has "NameU" attribute
     */
    @Override
    public boolean isSetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[12]) != null;
        }
    }

    /**
     * Sets the "NameU" attribute
     */
    @Override
    public void setNameU(java.lang.String nameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.setStringValue(nameU);
        }
    }

    /**
     * Sets (as xml) the "NameU" attribute
     */
    @Override
    public void xsetNameU(org.apache.xmlbeans.XmlString nameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[12]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[12]);
            }
            target.set(nameU);
        }
    }

    /**
     * Unsets the "NameU" attribute
     */
    @Override
    public void unsetNameU() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Gets the "IsCustomName" attribute
     */
    @Override
    public boolean getIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "IsCustomName" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * True if has "IsCustomName" attribute
     */
    @Override
    public boolean isSetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[13]) != null;
        }
    }

    /**
     * Sets the "IsCustomName" attribute
     */
    @Override
    public void setIsCustomName(boolean isCustomName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.setBooleanValue(isCustomName);
        }
    }

    /**
     * Sets (as xml) the "IsCustomName" attribute
     */
    @Override
    public void xsetIsCustomName(org.apache.xmlbeans.XmlBoolean isCustomName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[13]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[13]);
            }
            target.set(isCustomName);
        }
    }

    /**
     * Unsets the "IsCustomName" attribute
     */
    @Override
    public void unsetIsCustomName() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Gets the "IsCustomNameU" attribute
     */
    @Override
    public boolean getIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "IsCustomNameU" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * True if has "IsCustomNameU" attribute
     */
    @Override
    public boolean isSetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[14]) != null;
        }
    }

    /**
     * Sets the "IsCustomNameU" attribute
     */
    @Override
    public void setIsCustomNameU(boolean isCustomNameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.setBooleanValue(isCustomNameU);
        }
    }

    /**
     * Sets (as xml) the "IsCustomNameU" attribute
     */
    @Override
    public void xsetIsCustomNameU(org.apache.xmlbeans.XmlBoolean isCustomNameU) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[14]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[14]);
            }
            target.set(isCustomNameU);
        }
    }

    /**
     * Unsets the "IsCustomNameU" attribute
     */
    @Override
    public void unsetIsCustomNameU() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Gets the "Master" attribute
     */
    @Override
    public long getMaster() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "Master" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetMaster() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * True if has "Master" attribute
     */
    @Override
    public boolean isSetMaster() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[15]) != null;
        }
    }

    /**
     * Sets the "Master" attribute
     */
    @Override
    public void setMaster(long master) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.setLongValue(master);
        }
    }

    /**
     * Sets (as xml) the "Master" attribute
     */
    @Override
    public void xsetMaster(org.apache.xmlbeans.XmlUnsignedInt master) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[15]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[15]);
            }
            target.set(master);
        }
    }

    /**
     * Unsets the "Master" attribute
     */
    @Override
    public void unsetMaster() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Gets the "Type" attribute
     */
    @Override
    public java.lang.String getType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Type" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlToken xgetType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * True if has "Type" attribute
     */
    @Override
    public boolean isSetType() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[16]) != null;
        }
    }

    /**
     * Sets the "Type" attribute
     */
    @Override
    public void setType(java.lang.String type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.setStringValue(type);
        }
    }

    /**
     * Sets (as xml) the "Type" attribute
     */
    @Override
    public void xsetType(org.apache.xmlbeans.XmlToken type) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlToken target = null;
            target = (org.apache.xmlbeans.XmlToken)get_store().find_attribute_user(PROPERTY_QNAME[16]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlToken)get_store().add_attribute_user(PROPERTY_QNAME[16]);
            }
            target.set(type);
        }
    }

    /**
     * Unsets the "Type" attribute
     */
    @Override
    public void unsetType() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[16]);
        }
    }
}
