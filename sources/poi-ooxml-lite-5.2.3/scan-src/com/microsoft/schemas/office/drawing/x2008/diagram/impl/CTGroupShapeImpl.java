/*
 * XML Type:  CT_GroupShape
 * Namespace: http://schemas.microsoft.com/office/drawing/2008/diagram
 * Java type: com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.drawing.x2008.diagram.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_GroupShape(@http://schemas.microsoft.com/office/drawing/2008/diagram).
 *
 * This is a complex type.
 */
public class CTGroupShapeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape {
    private static final long serialVersionUID = 1L;

    public CTGroupShapeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "nvGrpSpPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "grpSpPr"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "sp"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "grpSp"),
        new QName("http://schemas.microsoft.com/office/drawing/2008/diagram", "extLst"),
    };


    /**
     * Gets the "nvGrpSpPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual getNvGrpSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "nvGrpSpPr" element
     */
    @Override
    public void setNvGrpSpPr(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual nvGrpSpPr) {
        generatedSetterHelperImpl(nvGrpSpPr, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "nvGrpSpPr" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual addNewNvGrpSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShapeNonVisual)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets the "grpSpPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties getGrpSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "grpSpPr" element
     */
    @Override
    public void setGrpSpPr(org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties grpSpPr) {
        generatedSetterHelperImpl(grpSpPr, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "grpSpPr" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties addNewGrpSpPr() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Gets a List of "sp" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2008.diagram.CTShape> getSpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getSpArray,
                this::setSpArray,
                this::insertNewSp,
                this::removeSp,
                this::sizeOfSpArray
            );
        }
    }

    /**
     * Gets array of all "sp" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShape[] getSpArray() {
        return getXmlObjectArray(PROPERTY_QNAME[2], new com.microsoft.schemas.office.drawing.x2008.diagram.CTShape[0]);
    }

    /**
     * Gets ith "sp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShape getSpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTShape)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sp" element
     */
    @Override
    public int sizeOfSpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "sp" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setSpArray(com.microsoft.schemas.office.drawing.x2008.diagram.CTShape[] spArray) {
        check_orphaned();
        arraySetterHelper(spArray, PROPERTY_QNAME[2]);
    }

    /**
     * Sets ith "sp" element
     */
    @Override
    public void setSpArray(int i, com.microsoft.schemas.office.drawing.x2008.diagram.CTShape sp) {
        generatedSetterHelperImpl(sp, PROPERTY_QNAME[2], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShape insertNewSp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTShape)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTShape addNewSp() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTShape)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "sp" element
     */
    @Override
    public void removeSp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "grpSp" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape> getGrpSpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getGrpSpArray,
                this::setGrpSpArray,
                this::insertNewGrpSp,
                this::removeGrpSp,
                this::sizeOfGrpSpArray
            );
        }
    }

    /**
     * Gets array of all "grpSp" elements
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape[] getGrpSpArray() {
        return getXmlObjectArray(PROPERTY_QNAME[3], new com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape[0]);
    }

    /**
     * Gets ith "grpSp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape getGrpSpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "grpSp" element
     */
    @Override
    public int sizeOfGrpSpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "grpSp" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setGrpSpArray(com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape[] grpSpArray) {
        check_orphaned();
        arraySetterHelper(grpSpArray, PROPERTY_QNAME[3]);
    }

    /**
     * Sets ith "grpSp" element
     */
    @Override
    public void setGrpSpArray(int i, com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape grpSp) {
        generatedSetterHelperImpl(grpSp, PROPERTY_QNAME[3], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "grpSp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape insertNewGrpSp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "grpSp" element
     */
    @Override
    public com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape addNewGrpSp() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape target = null;
            target = (com.microsoft.schemas.office.drawing.x2008.diagram.CTGroupShape)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "grpSp" element
     */
    @Override
    public void removeGrpSp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets the "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList getExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "extLst" element
     */
    @Override
    public boolean isSetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "extLst" element
     */
    @Override
    public void setExtLst(org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList extLst) {
        generatedSetterHelperImpl(extLst, PROPERTY_QNAME[4], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "extLst" element
     */
    @Override
    public org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList addNewExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList target = null;
            target = (org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Unsets the "extLst" element
     */
    @Override
    public void unsetExtLst() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
}
