/*
 * XML Type:  Shapes_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.ShapesType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML Shapes_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public class ShapesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.visio.x2012.main.ShapesType {
    private static final long serialVersionUID = 1L;

    public ShapesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/visio/2012/main", "Shape"),
    };


    /**
     * Gets a List of "Shape" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType> getShapeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getShapeArray,
                this::setShapeArray,
                this::insertNewShape,
                this::removeShape,
                this::sizeOfShapeArray
            );
        }
    }

    /**
     * Gets array of all "Shape" elements
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType[] getShapeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType[0]);
    }

    /**
     * Gets ith "Shape" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType getShapeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Shape" element
     */
    @Override
    public int sizeOfShapeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "Shape" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setShapeArray(com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType[] shapeArray) {
        check_orphaned();
        arraySetterHelper(shapeArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "Shape" element
     */
    @Override
    public void setShapeArray(int i, com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType shape) {
        generatedSetterHelperImpl(shape, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Shape" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType insertNewShape(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Shape" element
     */
    @Override
    public com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType addNewShape() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType target = null;
            target = (com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Shape" element
     */
    @Override
    public void removeShape(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
