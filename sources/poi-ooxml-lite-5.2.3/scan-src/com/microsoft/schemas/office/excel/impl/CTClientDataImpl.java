/*
 * XML Type:  CT_ClientData
 * Namespace: urn:schemas-microsoft-com:office:excel
 * Java type: com.microsoft.schemas.office.excel.CTClientData
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.excel.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CT_ClientData(@urn:schemas-microsoft-com:office:excel).
 *
 * This is a complex type.
 */
public class CTClientDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.office.excel.CTClientData {
    private static final long serialVersionUID = 1L;

    public CTClientDataImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:office:excel", "MoveWithCells"),
        new QName("urn:schemas-microsoft-com:office:excel", "SizeWithCells"),
        new QName("urn:schemas-microsoft-com:office:excel", "Anchor"),
        new QName("urn:schemas-microsoft-com:office:excel", "Locked"),
        new QName("urn:schemas-microsoft-com:office:excel", "DefaultSize"),
        new QName("urn:schemas-microsoft-com:office:excel", "PrintObject"),
        new QName("urn:schemas-microsoft-com:office:excel", "Disabled"),
        new QName("urn:schemas-microsoft-com:office:excel", "AutoFill"),
        new QName("urn:schemas-microsoft-com:office:excel", "AutoLine"),
        new QName("urn:schemas-microsoft-com:office:excel", "AutoPict"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaMacro"),
        new QName("urn:schemas-microsoft-com:office:excel", "TextHAlign"),
        new QName("urn:schemas-microsoft-com:office:excel", "TextVAlign"),
        new QName("urn:schemas-microsoft-com:office:excel", "LockText"),
        new QName("urn:schemas-microsoft-com:office:excel", "JustLastX"),
        new QName("urn:schemas-microsoft-com:office:excel", "SecretEdit"),
        new QName("urn:schemas-microsoft-com:office:excel", "Default"),
        new QName("urn:schemas-microsoft-com:office:excel", "Help"),
        new QName("urn:schemas-microsoft-com:office:excel", "Cancel"),
        new QName("urn:schemas-microsoft-com:office:excel", "Dismiss"),
        new QName("urn:schemas-microsoft-com:office:excel", "Accel"),
        new QName("urn:schemas-microsoft-com:office:excel", "Accel2"),
        new QName("urn:schemas-microsoft-com:office:excel", "Row"),
        new QName("urn:schemas-microsoft-com:office:excel", "Column"),
        new QName("urn:schemas-microsoft-com:office:excel", "Visible"),
        new QName("urn:schemas-microsoft-com:office:excel", "RowHidden"),
        new QName("urn:schemas-microsoft-com:office:excel", "ColHidden"),
        new QName("urn:schemas-microsoft-com:office:excel", "VTEdit"),
        new QName("urn:schemas-microsoft-com:office:excel", "MultiLine"),
        new QName("urn:schemas-microsoft-com:office:excel", "VScroll"),
        new QName("urn:schemas-microsoft-com:office:excel", "ValidIds"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaRange"),
        new QName("urn:schemas-microsoft-com:office:excel", "WidthMin"),
        new QName("urn:schemas-microsoft-com:office:excel", "Sel"),
        new QName("urn:schemas-microsoft-com:office:excel", "NoThreeD2"),
        new QName("urn:schemas-microsoft-com:office:excel", "SelType"),
        new QName("urn:schemas-microsoft-com:office:excel", "MultiSel"),
        new QName("urn:schemas-microsoft-com:office:excel", "LCT"),
        new QName("urn:schemas-microsoft-com:office:excel", "ListItem"),
        new QName("urn:schemas-microsoft-com:office:excel", "DropStyle"),
        new QName("urn:schemas-microsoft-com:office:excel", "Colored"),
        new QName("urn:schemas-microsoft-com:office:excel", "DropLines"),
        new QName("urn:schemas-microsoft-com:office:excel", "Checked"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaLink"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaPict"),
        new QName("urn:schemas-microsoft-com:office:excel", "NoThreeD"),
        new QName("urn:schemas-microsoft-com:office:excel", "FirstButton"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaGroup"),
        new QName("urn:schemas-microsoft-com:office:excel", "Val"),
        new QName("urn:schemas-microsoft-com:office:excel", "Min"),
        new QName("urn:schemas-microsoft-com:office:excel", "Max"),
        new QName("urn:schemas-microsoft-com:office:excel", "Inc"),
        new QName("urn:schemas-microsoft-com:office:excel", "Page"),
        new QName("urn:schemas-microsoft-com:office:excel", "Horiz"),
        new QName("urn:schemas-microsoft-com:office:excel", "Dx"),
        new QName("urn:schemas-microsoft-com:office:excel", "MapOCX"),
        new QName("urn:schemas-microsoft-com:office:excel", "CF"),
        new QName("urn:schemas-microsoft-com:office:excel", "Camera"),
        new QName("urn:schemas-microsoft-com:office:excel", "RecalcAlways"),
        new QName("urn:schemas-microsoft-com:office:excel", "AutoScale"),
        new QName("urn:schemas-microsoft-com:office:excel", "DDE"),
        new QName("urn:schemas-microsoft-com:office:excel", "UIObj"),
        new QName("urn:schemas-microsoft-com:office:excel", "ScriptText"),
        new QName("urn:schemas-microsoft-com:office:excel", "ScriptExtended"),
        new QName("urn:schemas-microsoft-com:office:excel", "ScriptLanguage"),
        new QName("urn:schemas-microsoft-com:office:excel", "ScriptLocation"),
        new QName("urn:schemas-microsoft-com:office:excel", "FmlaTxbx"),
        new QName("", "ObjectType"),
    };


    /**
     * Gets a List of "MoveWithCells" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getMoveWithCellsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMoveWithCellsArray,
                this::setMoveWithCellsArray,
                this::insertMoveWithCells,
                this::removeMoveWithCells,
                this::sizeOfMoveWithCellsArray
            );
        }
    }

    /**
     * Gets array of all "MoveWithCells" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getMoveWithCellsArray() {
        return getEnumArray(PROPERTY_QNAME[0], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "MoveWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getMoveWithCellsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "MoveWithCells" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetMoveWithCellsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMoveWithCellsArray,
                this::xsetMoveWithCellsArray,
                this::insertNewMoveWithCells,
                this::removeMoveWithCells,
                this::sizeOfMoveWithCellsArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MoveWithCells" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetMoveWithCellsArray() {
        return xgetArray(PROPERTY_QNAME[0], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "MoveWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetMoveWithCellsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MoveWithCells" element
     */
    @Override
    public int sizeOfMoveWithCellsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "MoveWithCells" element
     */
    @Override
    public void setMoveWithCellsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] moveWithCellsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(moveWithCellsArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "MoveWithCells" element
     */
    @Override
    public void setMoveWithCellsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum moveWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(moveWithCells);
        }
    }

    /**
     * Sets (as xml) array of all "MoveWithCells" element
     */
    @Override
    public void xsetMoveWithCellsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]moveWithCellsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(moveWithCellsArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "MoveWithCells" element
     */
    @Override
    public void xsetMoveWithCellsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank moveWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveWithCells);
        }
    }

    /**
     * Inserts the value as the ith "MoveWithCells" element
     */
    @Override
    public void insertMoveWithCells(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum moveWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setEnumValue(moveWithCells);
        }
    }

    /**
     * Appends the value as the last "MoveWithCells" element
     */
    @Override
    public void addMoveWithCells(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum moveWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setEnumValue(moveWithCells);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MoveWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewMoveWithCells(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MoveWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewMoveWithCells() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "MoveWithCells" element
     */
    @Override
    public void removeMoveWithCells(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "SizeWithCells" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getSizeWithCellsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSizeWithCellsArray,
                this::setSizeWithCellsArray,
                this::insertSizeWithCells,
                this::removeSizeWithCells,
                this::sizeOfSizeWithCellsArray
            );
        }
    }

    /**
     * Gets array of all "SizeWithCells" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getSizeWithCellsArray() {
        return getEnumArray(PROPERTY_QNAME[1], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "SizeWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getSizeWithCellsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "SizeWithCells" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetSizeWithCellsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSizeWithCellsArray,
                this::xsetSizeWithCellsArray,
                this::insertNewSizeWithCells,
                this::removeSizeWithCells,
                this::sizeOfSizeWithCellsArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SizeWithCells" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetSizeWithCellsArray() {
        return xgetArray(PROPERTY_QNAME[1], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "SizeWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetSizeWithCellsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SizeWithCells" element
     */
    @Override
    public int sizeOfSizeWithCellsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "SizeWithCells" element
     */
    @Override
    public void setSizeWithCellsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] sizeWithCellsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sizeWithCellsArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "SizeWithCells" element
     */
    @Override
    public void setSizeWithCellsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum sizeWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(sizeWithCells);
        }
    }

    /**
     * Sets (as xml) array of all "SizeWithCells" element
     */
    @Override
    public void xsetSizeWithCellsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]sizeWithCellsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(sizeWithCellsArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "SizeWithCells" element
     */
    @Override
    public void xsetSizeWithCellsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank sizeWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(sizeWithCells);
        }
    }

    /**
     * Inserts the value as the ith "SizeWithCells" element
     */
    @Override
    public void insertSizeWithCells(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum sizeWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setEnumValue(sizeWithCells);
        }
    }

    /**
     * Appends the value as the last "SizeWithCells" element
     */
    @Override
    public void addSizeWithCells(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum sizeWithCells) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setEnumValue(sizeWithCells);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SizeWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewSizeWithCells(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SizeWithCells" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewSizeWithCells() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "SizeWithCells" element
     */
    @Override
    public void removeSizeWithCells(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "Anchor" elements
     */
    @Override
    public java.util.List<java.lang.String> getAnchorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAnchorArray,
                this::setAnchorArray,
                this::insertAnchor,
                this::removeAnchor,
                this::sizeOfAnchorArray
            );
        }
    }

    /**
     * Gets array of all "Anchor" elements
     */
    @Override
    public java.lang.String[] getAnchorArray() {
        return getObjectArray(PROPERTY_QNAME[2], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Anchor" element
     */
    @Override
    public java.lang.String getAnchorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Anchor" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAnchorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAnchorArray,
                this::xsetAnchorArray,
                this::insertNewAnchor,
                this::removeAnchor,
                this::sizeOfAnchorArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Anchor" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetAnchorArray() {
        return xgetArray(PROPERTY_QNAME[2], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "Anchor" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetAnchorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Anchor" element
     */
    @Override
    public int sizeOfAnchorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "Anchor" element
     */
    @Override
    public void setAnchorArray(java.lang.String[] anchorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(anchorArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "Anchor" element
     */
    @Override
    public void setAnchorArray(int i, java.lang.String anchor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(anchor);
        }
    }

    /**
     * Sets (as xml) array of all "Anchor" element
     */
    @Override
    public void xsetAnchorArray(org.apache.xmlbeans.XmlString[]anchorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(anchorArray, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "Anchor" element
     */
    @Override
    public void xsetAnchorArray(int i, org.apache.xmlbeans.XmlString anchor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(anchor);
        }
    }

    /**
     * Inserts the value as the ith "Anchor" element
     */
    @Override
    public void insertAnchor(int i, java.lang.String anchor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setStringValue(anchor);
        }
    }

    /**
     * Appends the value as the last "Anchor" element
     */
    @Override
    public void addAnchor(java.lang.String anchor) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setStringValue(anchor);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Anchor" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewAnchor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Anchor" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewAnchor() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "Anchor" element
     */
    @Override
    public void removeAnchor(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "Locked" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getLockedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLockedArray,
                this::setLockedArray,
                this::insertLocked,
                this::removeLocked,
                this::sizeOfLockedArray
            );
        }
    }

    /**
     * Gets array of all "Locked" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getLockedArray() {
        return getEnumArray(PROPERTY_QNAME[3], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Locked" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getLockedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Locked" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetLockedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLockedArray,
                this::xsetLockedArray,
                this::insertNewLocked,
                this::removeLocked,
                this::sizeOfLockedArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Locked" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetLockedArray() {
        return xgetArray(PROPERTY_QNAME[3], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Locked" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetLockedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Locked" element
     */
    @Override
    public int sizeOfLockedArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "Locked" element
     */
    @Override
    public void setLockedArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] lockedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lockedArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "Locked" element
     */
    @Override
    public void setLockedArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum locked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(locked);
        }
    }

    /**
     * Sets (as xml) array of all "Locked" element
     */
    @Override
    public void xsetLockedArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]lockedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lockedArray, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "Locked" element
     */
    @Override
    public void xsetLockedArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank locked) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(locked);
        }
    }

    /**
     * Inserts the value as the ith "Locked" element
     */
    @Override
    public void insertLocked(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum locked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setEnumValue(locked);
        }
    }

    /**
     * Appends the value as the last "Locked" element
     */
    @Override
    public void addLocked(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum locked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setEnumValue(locked);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Locked" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewLocked(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Locked" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewLocked() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "Locked" element
     */
    @Override
    public void removeLocked(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "DefaultSize" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getDefaultSizeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDefaultSizeArray,
                this::setDefaultSizeArray,
                this::insertDefaultSize,
                this::removeDefaultSize,
                this::sizeOfDefaultSizeArray
            );
        }
    }

    /**
     * Gets array of all "DefaultSize" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getDefaultSizeArray() {
        return getEnumArray(PROPERTY_QNAME[4], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "DefaultSize" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getDefaultSizeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "DefaultSize" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetDefaultSizeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDefaultSizeArray,
                this::xsetDefaultSizeArray,
                this::insertNewDefaultSize,
                this::removeDefaultSize,
                this::sizeOfDefaultSizeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DefaultSize" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetDefaultSizeArray() {
        return xgetArray(PROPERTY_QNAME[4], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "DefaultSize" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetDefaultSizeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DefaultSize" element
     */
    @Override
    public int sizeOfDefaultSizeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "DefaultSize" element
     */
    @Override
    public void setDefaultSizeArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] defaultSizeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(defaultSizeArray, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "DefaultSize" element
     */
    @Override
    public void setDefaultSizeArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum defaultSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(defaultSize);
        }
    }

    /**
     * Sets (as xml) array of all "DefaultSize" element
     */
    @Override
    public void xsetDefaultSizeArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]defaultSizeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(defaultSizeArray, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets (as xml) ith "DefaultSize" element
     */
    @Override
    public void xsetDefaultSizeArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank defaultSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(defaultSize);
        }
    }

    /**
     * Inserts the value as the ith "DefaultSize" element
     */
    @Override
    public void insertDefaultSize(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum defaultSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            target.setEnumValue(defaultSize);
        }
    }

    /**
     * Appends the value as the last "DefaultSize" element
     */
    @Override
    public void addDefaultSize(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum defaultSize) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            target.setEnumValue(defaultSize);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DefaultSize" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewDefaultSize(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DefaultSize" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewDefaultSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "DefaultSize" element
     */
    @Override
    public void removeDefaultSize(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "PrintObject" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getPrintObjectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getPrintObjectArray,
                this::setPrintObjectArray,
                this::insertPrintObject,
                this::removePrintObject,
                this::sizeOfPrintObjectArray
            );
        }
    }

    /**
     * Gets array of all "PrintObject" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getPrintObjectArray() {
        return getEnumArray(PROPERTY_QNAME[5], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "PrintObject" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getPrintObjectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "PrintObject" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetPrintObjectList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetPrintObjectArray,
                this::xsetPrintObjectArray,
                this::insertNewPrintObject,
                this::removePrintObject,
                this::sizeOfPrintObjectArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "PrintObject" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetPrintObjectArray() {
        return xgetArray(PROPERTY_QNAME[5], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "PrintObject" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetPrintObjectArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "PrintObject" element
     */
    @Override
    public int sizeOfPrintObjectArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "PrintObject" element
     */
    @Override
    public void setPrintObjectArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] printObjectArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(printObjectArray, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "PrintObject" element
     */
    @Override
    public void setPrintObjectArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum printObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(printObject);
        }
    }

    /**
     * Sets (as xml) array of all "PrintObject" element
     */
    @Override
    public void xsetPrintObjectArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]printObjectArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(printObjectArray, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets (as xml) ith "PrintObject" element
     */
    @Override
    public void xsetPrintObjectArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank printObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(printObject);
        }
    }

    /**
     * Inserts the value as the ith "PrintObject" element
     */
    @Override
    public void insertPrintObject(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum printObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            target.setEnumValue(printObject);
        }
    }

    /**
     * Appends the value as the last "PrintObject" element
     */
    @Override
    public void addPrintObject(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum printObject) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            target.setEnumValue(printObject);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrintObject" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewPrintObject(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "PrintObject" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewPrintObject() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "PrintObject" element
     */
    @Override
    public void removePrintObject(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "Disabled" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getDisabledList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDisabledArray,
                this::setDisabledArray,
                this::insertDisabled,
                this::removeDisabled,
                this::sizeOfDisabledArray
            );
        }
    }

    /**
     * Gets array of all "Disabled" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getDisabledArray() {
        return getEnumArray(PROPERTY_QNAME[6], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Disabled" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getDisabledArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Disabled" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetDisabledList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDisabledArray,
                this::xsetDisabledArray,
                this::insertNewDisabled,
                this::removeDisabled,
                this::sizeOfDisabledArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Disabled" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetDisabledArray() {
        return xgetArray(PROPERTY_QNAME[6], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Disabled" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetDisabledArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Disabled" element
     */
    @Override
    public int sizeOfDisabledArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "Disabled" element
     */
    @Override
    public void setDisabledArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] disabledArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(disabledArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "Disabled" element
     */
    @Override
    public void setDisabledArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum disabled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(disabled);
        }
    }

    /**
     * Sets (as xml) array of all "Disabled" element
     */
    @Override
    public void xsetDisabledArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]disabledArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(disabledArray, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "Disabled" element
     */
    @Override
    public void xsetDisabledArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank disabled) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(disabled);
        }
    }

    /**
     * Inserts the value as the ith "Disabled" element
     */
    @Override
    public void insertDisabled(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum disabled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setEnumValue(disabled);
        }
    }

    /**
     * Appends the value as the last "Disabled" element
     */
    @Override
    public void addDisabled(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum disabled) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setEnumValue(disabled);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Disabled" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewDisabled(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Disabled" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewDisabled() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "Disabled" element
     */
    @Override
    public void removeDisabled(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "AutoFill" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getAutoFillList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAutoFillArray,
                this::setAutoFillArray,
                this::insertAutoFill,
                this::removeAutoFill,
                this::sizeOfAutoFillArray
            );
        }
    }

    /**
     * Gets array of all "AutoFill" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getAutoFillArray() {
        return getEnumArray(PROPERTY_QNAME[7], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "AutoFill" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getAutoFillArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "AutoFill" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetAutoFillList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAutoFillArray,
                this::xsetAutoFillArray,
                this::insertNewAutoFill,
                this::removeAutoFill,
                this::sizeOfAutoFillArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "AutoFill" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetAutoFillArray() {
        return xgetArray(PROPERTY_QNAME[7], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "AutoFill" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetAutoFillArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AutoFill" element
     */
    @Override
    public int sizeOfAutoFillArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "AutoFill" element
     */
    @Override
    public void setAutoFillArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] autoFillArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoFillArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "AutoFill" element
     */
    @Override
    public void setAutoFillArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoFill) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(autoFill);
        }
    }

    /**
     * Sets (as xml) array of all "AutoFill" element
     */
    @Override
    public void xsetAutoFillArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]autoFillArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoFillArray, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets (as xml) ith "AutoFill" element
     */
    @Override
    public void xsetAutoFillArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank autoFill) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(autoFill);
        }
    }

    /**
     * Inserts the value as the ith "AutoFill" element
     */
    @Override
    public void insertAutoFill(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoFill) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            target.setEnumValue(autoFill);
        }
    }

    /**
     * Appends the value as the last "AutoFill" element
     */
    @Override
    public void addAutoFill(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoFill) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            target.setEnumValue(autoFill);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoFill" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewAutoFill(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoFill" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewAutoFill() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "AutoFill" element
     */
    @Override
    public void removeAutoFill(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "AutoLine" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getAutoLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAutoLineArray,
                this::setAutoLineArray,
                this::insertAutoLine,
                this::removeAutoLine,
                this::sizeOfAutoLineArray
            );
        }
    }

    /**
     * Gets array of all "AutoLine" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getAutoLineArray() {
        return getEnumArray(PROPERTY_QNAME[8], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "AutoLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getAutoLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "AutoLine" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetAutoLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAutoLineArray,
                this::xsetAutoLineArray,
                this::insertNewAutoLine,
                this::removeAutoLine,
                this::sizeOfAutoLineArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "AutoLine" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetAutoLineArray() {
        return xgetArray(PROPERTY_QNAME[8], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "AutoLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetAutoLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AutoLine" element
     */
    @Override
    public int sizeOfAutoLineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "AutoLine" element
     */
    @Override
    public void setAutoLineArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] autoLineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoLineArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "AutoLine" element
     */
    @Override
    public void setAutoLineArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(autoLine);
        }
    }

    /**
     * Sets (as xml) array of all "AutoLine" element
     */
    @Override
    public void xsetAutoLineArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]autoLineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoLineArray, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets (as xml) ith "AutoLine" element
     */
    @Override
    public void xsetAutoLineArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank autoLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(autoLine);
        }
    }

    /**
     * Inserts the value as the ith "AutoLine" element
     */
    @Override
    public void insertAutoLine(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            target.setEnumValue(autoLine);
        }
    }

    /**
     * Appends the value as the last "AutoLine" element
     */
    @Override
    public void addAutoLine(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            target.setEnumValue(autoLine);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewAutoLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewAutoLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "AutoLine" element
     */
    @Override
    public void removeAutoLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "AutoPict" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getAutoPictList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAutoPictArray,
                this::setAutoPictArray,
                this::insertAutoPict,
                this::removeAutoPict,
                this::sizeOfAutoPictArray
            );
        }
    }

    /**
     * Gets array of all "AutoPict" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getAutoPictArray() {
        return getEnumArray(PROPERTY_QNAME[9], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "AutoPict" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getAutoPictArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "AutoPict" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetAutoPictList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAutoPictArray,
                this::xsetAutoPictArray,
                this::insertNewAutoPict,
                this::removeAutoPict,
                this::sizeOfAutoPictArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "AutoPict" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetAutoPictArray() {
        return xgetArray(PROPERTY_QNAME[9], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "AutoPict" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetAutoPictArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AutoPict" element
     */
    @Override
    public int sizeOfAutoPictArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "AutoPict" element
     */
    @Override
    public void setAutoPictArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] autoPictArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoPictArray, PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets ith "AutoPict" element
     */
    @Override
    public void setAutoPictArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(autoPict);
        }
    }

    /**
     * Sets (as xml) array of all "AutoPict" element
     */
    @Override
    public void xsetAutoPictArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]autoPictArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoPictArray, PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets (as xml) ith "AutoPict" element
     */
    @Override
    public void xsetAutoPictArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank autoPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(autoPict);
        }
    }

    /**
     * Inserts the value as the ith "AutoPict" element
     */
    @Override
    public void insertAutoPict(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            target.setEnumValue(autoPict);
        }
    }

    /**
     * Appends the value as the last "AutoPict" element
     */
    @Override
    public void addAutoPict(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            target.setEnumValue(autoPict);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoPict" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewAutoPict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoPict" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewAutoPict() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "AutoPict" element
     */
    @Override
    public void removeAutoPict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "FmlaMacro" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaMacroList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaMacroArray,
                this::setFmlaMacroArray,
                this::insertFmlaMacro,
                this::removeFmlaMacro,
                this::sizeOfFmlaMacroArray
            );
        }
    }

    /**
     * Gets array of all "FmlaMacro" elements
     */
    @Override
    public java.lang.String[] getFmlaMacroArray() {
        return getObjectArray(PROPERTY_QNAME[10], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaMacro" element
     */
    @Override
    public java.lang.String getFmlaMacroArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaMacro" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaMacroList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaMacroArray,
                this::xsetFmlaMacroArray,
                this::insertNewFmlaMacro,
                this::removeFmlaMacro,
                this::sizeOfFmlaMacroArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaMacro" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaMacroArray() {
        return xgetArray(PROPERTY_QNAME[10], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaMacro" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaMacroArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaMacro" element
     */
    @Override
    public int sizeOfFmlaMacroArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "FmlaMacro" element
     */
    @Override
    public void setFmlaMacroArray(java.lang.String[] fmlaMacroArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaMacroArray, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets ith "FmlaMacro" element
     */
    @Override
    public void setFmlaMacroArray(int i, java.lang.String fmlaMacro) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaMacro);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaMacro" element
     */
    @Override
    public void xsetFmlaMacroArray(org.apache.xmlbeans.XmlString[]fmlaMacroArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaMacroArray, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaMacro" element
     */
    @Override
    public void xsetFmlaMacroArray(int i, org.apache.xmlbeans.XmlString fmlaMacro) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaMacro);
        }
    }

    /**
     * Inserts the value as the ith "FmlaMacro" element
     */
    @Override
    public void insertFmlaMacro(int i, java.lang.String fmlaMacro) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            target.setStringValue(fmlaMacro);
        }
    }

    /**
     * Appends the value as the last "FmlaMacro" element
     */
    @Override
    public void addFmlaMacro(java.lang.String fmlaMacro) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            target.setStringValue(fmlaMacro);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaMacro" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaMacro(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaMacro" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaMacro() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaMacro" element
     */
    @Override
    public void removeFmlaMacro(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "TextHAlign" elements
     */
    @Override
    public java.util.List<java.lang.String> getTextHAlignList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTextHAlignArray,
                this::setTextHAlignArray,
                this::insertTextHAlign,
                this::removeTextHAlign,
                this::sizeOfTextHAlignArray
            );
        }
    }

    /**
     * Gets array of all "TextHAlign" elements
     */
    @Override
    public java.lang.String[] getTextHAlignArray() {
        return getObjectArray(PROPERTY_QNAME[11], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "TextHAlign" element
     */
    @Override
    public java.lang.String getTextHAlignArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "TextHAlign" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTextHAlignList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTextHAlignArray,
                this::xsetTextHAlignArray,
                this::insertNewTextHAlign,
                this::removeTextHAlign,
                this::sizeOfTextHAlignArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "TextHAlign" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetTextHAlignArray() {
        return xgetArray(PROPERTY_QNAME[11], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "TextHAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTextHAlignArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TextHAlign" element
     */
    @Override
    public int sizeOfTextHAlignArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "TextHAlign" element
     */
    @Override
    public void setTextHAlignArray(java.lang.String[] textHAlignArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(textHAlignArray, PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets ith "TextHAlign" element
     */
    @Override
    public void setTextHAlignArray(int i, java.lang.String textHAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(textHAlign);
        }
    }

    /**
     * Sets (as xml) array of all "TextHAlign" element
     */
    @Override
    public void xsetTextHAlignArray(org.apache.xmlbeans.XmlString[]textHAlignArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(textHAlignArray, PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets (as xml) ith "TextHAlign" element
     */
    @Override
    public void xsetTextHAlignArray(int i, org.apache.xmlbeans.XmlString textHAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(textHAlign);
        }
    }

    /**
     * Inserts the value as the ith "TextHAlign" element
     */
    @Override
    public void insertTextHAlign(int i, java.lang.String textHAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            target.setStringValue(textHAlign);
        }
    }

    /**
     * Appends the value as the last "TextHAlign" element
     */
    @Override
    public void addTextHAlign(java.lang.String textHAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            target.setStringValue(textHAlign);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TextHAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewTextHAlign(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TextHAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewTextHAlign() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "TextHAlign" element
     */
    @Override
    public void removeTextHAlign(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "TextVAlign" elements
     */
    @Override
    public java.util.List<java.lang.String> getTextVAlignList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getTextVAlignArray,
                this::setTextVAlignArray,
                this::insertTextVAlign,
                this::removeTextVAlign,
                this::sizeOfTextVAlignArray
            );
        }
    }

    /**
     * Gets array of all "TextVAlign" elements
     */
    @Override
    public java.lang.String[] getTextVAlignArray() {
        return getObjectArray(PROPERTY_QNAME[12], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "TextVAlign" element
     */
    @Override
    public java.lang.String getTextVAlignArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "TextVAlign" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetTextVAlignList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetTextVAlignArray,
                this::xsetTextVAlignArray,
                this::insertNewTextVAlign,
                this::removeTextVAlign,
                this::sizeOfTextVAlignArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "TextVAlign" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetTextVAlignArray() {
        return xgetArray(PROPERTY_QNAME[12], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "TextVAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetTextVAlignArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "TextVAlign" element
     */
    @Override
    public int sizeOfTextVAlignArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "TextVAlign" element
     */
    @Override
    public void setTextVAlignArray(java.lang.String[] textVAlignArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(textVAlignArray, PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets ith "TextVAlign" element
     */
    @Override
    public void setTextVAlignArray(int i, java.lang.String textVAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(textVAlign);
        }
    }

    /**
     * Sets (as xml) array of all "TextVAlign" element
     */
    @Override
    public void xsetTextVAlignArray(org.apache.xmlbeans.XmlString[]textVAlignArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(textVAlignArray, PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets (as xml) ith "TextVAlign" element
     */
    @Override
    public void xsetTextVAlignArray(int i, org.apache.xmlbeans.XmlString textVAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(textVAlign);
        }
    }

    /**
     * Inserts the value as the ith "TextVAlign" element
     */
    @Override
    public void insertTextVAlign(int i, java.lang.String textVAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            target.setStringValue(textVAlign);
        }
    }

    /**
     * Appends the value as the last "TextVAlign" element
     */
    @Override
    public void addTextVAlign(java.lang.String textVAlign) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[12]);
            target.setStringValue(textVAlign);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "TextVAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewTextVAlign(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "TextVAlign" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewTextVAlign() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "TextVAlign" element
     */
    @Override
    public void removeTextVAlign(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "LockText" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getLockTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLockTextArray,
                this::setLockTextArray,
                this::insertLockText,
                this::removeLockText,
                this::sizeOfLockTextArray
            );
        }
    }

    /**
     * Gets array of all "LockText" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getLockTextArray() {
        return getEnumArray(PROPERTY_QNAME[13], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "LockText" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getLockTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "LockText" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetLockTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLockTextArray,
                this::xsetLockTextArray,
                this::insertNewLockText,
                this::removeLockText,
                this::sizeOfLockTextArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "LockText" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetLockTextArray() {
        return xgetArray(PROPERTY_QNAME[13], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "LockText" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetLockTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LockText" element
     */
    @Override
    public int sizeOfLockTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "LockText" element
     */
    @Override
    public void setLockTextArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] lockTextArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lockTextArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets ith "LockText" element
     */
    @Override
    public void setLockTextArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum lockText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(lockText);
        }
    }

    /**
     * Sets (as xml) array of all "LockText" element
     */
    @Override
    public void xsetLockTextArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]lockTextArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lockTextArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets (as xml) ith "LockText" element
     */
    @Override
    public void xsetLockTextArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank lockText) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(lockText);
        }
    }

    /**
     * Inserts the value as the ith "LockText" element
     */
    @Override
    public void insertLockText(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum lockText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            target.setEnumValue(lockText);
        }
    }

    /**
     * Appends the value as the last "LockText" element
     */
    @Override
    public void addLockText(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum lockText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[13]);
            target.setEnumValue(lockText);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LockText" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewLockText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LockText" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewLockText() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "LockText" element
     */
    @Override
    public void removeLockText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "JustLastX" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getJustLastXList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getJustLastXArray,
                this::setJustLastXArray,
                this::insertJustLastX,
                this::removeJustLastX,
                this::sizeOfJustLastXArray
            );
        }
    }

    /**
     * Gets array of all "JustLastX" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getJustLastXArray() {
        return getEnumArray(PROPERTY_QNAME[14], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "JustLastX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getJustLastXArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "JustLastX" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetJustLastXList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetJustLastXArray,
                this::xsetJustLastXArray,
                this::insertNewJustLastX,
                this::removeJustLastX,
                this::sizeOfJustLastXArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "JustLastX" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetJustLastXArray() {
        return xgetArray(PROPERTY_QNAME[14], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "JustLastX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetJustLastXArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "JustLastX" element
     */
    @Override
    public int sizeOfJustLastXArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "JustLastX" element
     */
    @Override
    public void setJustLastXArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] justLastXArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(justLastXArray, PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets ith "JustLastX" element
     */
    @Override
    public void setJustLastXArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum justLastX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(justLastX);
        }
    }

    /**
     * Sets (as xml) array of all "JustLastX" element
     */
    @Override
    public void xsetJustLastXArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]justLastXArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(justLastXArray, PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets (as xml) ith "JustLastX" element
     */
    @Override
    public void xsetJustLastXArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank justLastX) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(justLastX);
        }
    }

    /**
     * Inserts the value as the ith "JustLastX" element
     */
    @Override
    public void insertJustLastX(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum justLastX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            target.setEnumValue(justLastX);
        }
    }

    /**
     * Appends the value as the last "JustLastX" element
     */
    @Override
    public void addJustLastX(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum justLastX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[14]);
            target.setEnumValue(justLastX);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "JustLastX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewJustLastX(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "JustLastX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewJustLastX() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "JustLastX" element
     */
    @Override
    public void removeJustLastX(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "SecretEdit" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getSecretEditList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSecretEditArray,
                this::setSecretEditArray,
                this::insertSecretEdit,
                this::removeSecretEdit,
                this::sizeOfSecretEditArray
            );
        }
    }

    /**
     * Gets array of all "SecretEdit" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getSecretEditArray() {
        return getEnumArray(PROPERTY_QNAME[15], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "SecretEdit" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getSecretEditArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "SecretEdit" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetSecretEditList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSecretEditArray,
                this::xsetSecretEditArray,
                this::insertNewSecretEdit,
                this::removeSecretEdit,
                this::sizeOfSecretEditArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SecretEdit" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetSecretEditArray() {
        return xgetArray(PROPERTY_QNAME[15], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "SecretEdit" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetSecretEditArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SecretEdit" element
     */
    @Override
    public int sizeOfSecretEditArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "SecretEdit" element
     */
    @Override
    public void setSecretEditArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] secretEditArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(secretEditArray, PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets ith "SecretEdit" element
     */
    @Override
    public void setSecretEditArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum secretEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(secretEdit);
        }
    }

    /**
     * Sets (as xml) array of all "SecretEdit" element
     */
    @Override
    public void xsetSecretEditArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]secretEditArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(secretEditArray, PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets (as xml) ith "SecretEdit" element
     */
    @Override
    public void xsetSecretEditArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank secretEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(secretEdit);
        }
    }

    /**
     * Inserts the value as the ith "SecretEdit" element
     */
    @Override
    public void insertSecretEdit(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum secretEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            target.setEnumValue(secretEdit);
        }
    }

    /**
     * Appends the value as the last "SecretEdit" element
     */
    @Override
    public void addSecretEdit(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum secretEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[15]);
            target.setEnumValue(secretEdit);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SecretEdit" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewSecretEdit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SecretEdit" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewSecretEdit() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "SecretEdit" element
     */
    @Override
    public void removeSecretEdit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "Default" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getDefaultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDefaultArray,
                this::setDefaultArray,
                this::insertDefault,
                this::removeDefault,
                this::sizeOfDefaultArray
            );
        }
    }

    /**
     * Gets array of all "Default" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getDefaultArray() {
        return getEnumArray(PROPERTY_QNAME[16], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Default" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getDefaultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Default" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetDefaultList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDefaultArray,
                this::xsetDefaultArray,
                this::insertNewDefault,
                this::removeDefault,
                this::sizeOfDefaultArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Default" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetDefaultArray() {
        return xgetArray(PROPERTY_QNAME[16], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Default" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetDefaultArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Default" element
     */
    @Override
    public int sizeOfDefaultArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets array of all "Default" element
     */
    @Override
    public void setDefaultArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] xdefaultArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(xdefaultArray, PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets ith "Default" element
     */
    @Override
    public void setDefaultArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(xdefault);
        }
    }

    /**
     * Sets (as xml) array of all "Default" element
     */
    @Override
    public void xsetDefaultArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]xdefaultArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(xdefaultArray, PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets (as xml) ith "Default" element
     */
    @Override
    public void xsetDefaultArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(xdefault);
        }
    }

    /**
     * Inserts the value as the ith "Default" element
     */
    @Override
    public void insertDefault(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            target.setEnumValue(xdefault);
        }
    }

    /**
     * Appends the value as the last "Default" element
     */
    @Override
    public void addDefault(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum xdefault) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[16]);
            target.setEnumValue(xdefault);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Default" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewDefault(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Default" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewDefault() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "Default" element
     */
    @Override
    public void removeDefault(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "Help" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getHelpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getHelpArray,
                this::setHelpArray,
                this::insertHelp,
                this::removeHelp,
                this::sizeOfHelpArray
            );
        }
    }

    /**
     * Gets array of all "Help" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getHelpArray() {
        return getEnumArray(PROPERTY_QNAME[17], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Help" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getHelpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Help" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetHelpList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetHelpArray,
                this::xsetHelpArray,
                this::insertNewHelp,
                this::removeHelp,
                this::sizeOfHelpArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Help" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetHelpArray() {
        return xgetArray(PROPERTY_QNAME[17], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Help" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetHelpArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Help" element
     */
    @Override
    public int sizeOfHelpArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "Help" element
     */
    @Override
    public void setHelpArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] helpArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(helpArray, PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets ith "Help" element
     */
    @Override
    public void setHelpArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum help) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(help);
        }
    }

    /**
     * Sets (as xml) array of all "Help" element
     */
    @Override
    public void xsetHelpArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]helpArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(helpArray, PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets (as xml) ith "Help" element
     */
    @Override
    public void xsetHelpArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank help) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(help);
        }
    }

    /**
     * Inserts the value as the ith "Help" element
     */
    @Override
    public void insertHelp(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum help) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            target.setEnumValue(help);
        }
    }

    /**
     * Appends the value as the last "Help" element
     */
    @Override
    public void addHelp(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum help) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[17]);
            target.setEnumValue(help);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Help" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewHelp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Help" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewHelp() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "Help" element
     */
    @Override
    public void removeHelp(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "Cancel" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getCancelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCancelArray,
                this::setCancelArray,
                this::insertCancel,
                this::removeCancel,
                this::sizeOfCancelArray
            );
        }
    }

    /**
     * Gets array of all "Cancel" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getCancelArray() {
        return getEnumArray(PROPERTY_QNAME[18], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Cancel" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getCancelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Cancel" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetCancelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCancelArray,
                this::xsetCancelArray,
                this::insertNewCancel,
                this::removeCancel,
                this::sizeOfCancelArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Cancel" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetCancelArray() {
        return xgetArray(PROPERTY_QNAME[18], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Cancel" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetCancelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Cancel" element
     */
    @Override
    public int sizeOfCancelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "Cancel" element
     */
    @Override
    public void setCancelArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] cancelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cancelArray, PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets ith "Cancel" element
     */
    @Override
    public void setCancelArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum cancel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(cancel);
        }
    }

    /**
     * Sets (as xml) array of all "Cancel" element
     */
    @Override
    public void xsetCancelArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]cancelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cancelArray, PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets (as xml) ith "Cancel" element
     */
    @Override
    public void xsetCancelArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank cancel) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(cancel);
        }
    }

    /**
     * Inserts the value as the ith "Cancel" element
     */
    @Override
    public void insertCancel(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum cancel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            target.setEnumValue(cancel);
        }
    }

    /**
     * Appends the value as the last "Cancel" element
     */
    @Override
    public void addCancel(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum cancel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[18]);
            target.setEnumValue(cancel);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Cancel" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewCancel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Cancel" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewCancel() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "Cancel" element
     */
    @Override
    public void removeCancel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "Dismiss" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getDismissList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDismissArray,
                this::setDismissArray,
                this::insertDismiss,
                this::removeDismiss,
                this::sizeOfDismissArray
            );
        }
    }

    /**
     * Gets array of all "Dismiss" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getDismissArray() {
        return getEnumArray(PROPERTY_QNAME[19], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Dismiss" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getDismissArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Dismiss" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetDismissList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDismissArray,
                this::xsetDismissArray,
                this::insertNewDismiss,
                this::removeDismiss,
                this::sizeOfDismissArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Dismiss" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetDismissArray() {
        return xgetArray(PROPERTY_QNAME[19], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Dismiss" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetDismissArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Dismiss" element
     */
    @Override
    public int sizeOfDismissArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets array of all "Dismiss" element
     */
    @Override
    public void setDismissArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] dismissArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dismissArray, PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets ith "Dismiss" element
     */
    @Override
    public void setDismissArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dismiss) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(dismiss);
        }
    }

    /**
     * Sets (as xml) array of all "Dismiss" element
     */
    @Override
    public void xsetDismissArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]dismissArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dismissArray, PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets (as xml) ith "Dismiss" element
     */
    @Override
    public void xsetDismissArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank dismiss) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dismiss);
        }
    }

    /**
     * Inserts the value as the ith "Dismiss" element
     */
    @Override
    public void insertDismiss(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dismiss) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            target.setEnumValue(dismiss);
        }
    }

    /**
     * Appends the value as the last "Dismiss" element
     */
    @Override
    public void addDismiss(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dismiss) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[19]);
            target.setEnumValue(dismiss);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dismiss" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewDismiss(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dismiss" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewDismiss() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "Dismiss" element
     */
    @Override
    public void removeDismiss(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets a List of "Accel" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getAccelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAccelArray,
                this::setAccelArray,
                this::insertAccel,
                this::removeAccel,
                this::sizeOfAccelArray
            );
        }
    }

    /**
     * Gets array of all "Accel" elements
     */
    @Override
    public java.math.BigInteger[] getAccelArray() {
        return getObjectArray(PROPERTY_QNAME[20], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Accel" element
     */
    @Override
    public java.math.BigInteger getAccelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Accel" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetAccelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAccelArray,
                this::xsetAccelArray,
                this::insertNewAccel,
                this::removeAccel,
                this::sizeOfAccelArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Accel" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetAccelArray() {
        return xgetArray(PROPERTY_QNAME[20], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Accel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetAccelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Accel" element
     */
    @Override
    public int sizeOfAccelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets array of all "Accel" element
     */
    @Override
    public void setAccelArray(java.math.BigInteger[] accelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(accelArray, PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets ith "Accel" element
     */
    @Override
    public void setAccelArray(int i, java.math.BigInteger accel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(accel);
        }
    }

    /**
     * Sets (as xml) array of all "Accel" element
     */
    @Override
    public void xsetAccelArray(org.apache.xmlbeans.XmlInteger[]accelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(accelArray, PROPERTY_QNAME[20]);
        }
    }

    /**
     * Sets (as xml) ith "Accel" element
     */
    @Override
    public void xsetAccelArray(int i, org.apache.xmlbeans.XmlInteger accel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[20], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(accel);
        }
    }

    /**
     * Inserts the value as the ith "Accel" element
     */
    @Override
    public void insertAccel(int i, java.math.BigInteger accel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            target.setBigIntegerValue(accel);
        }
    }

    /**
     * Appends the value as the last "Accel" element
     */
    @Override
    public void addAccel(java.math.BigInteger accel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[20]);
            target.setBigIntegerValue(accel);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Accel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewAccel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[20], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Accel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewAccel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Removes the ith "Accel" element
     */
    @Override
    public void removeAccel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[20], i);
        }
    }

    /**
     * Gets a List of "Accel2" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getAccel2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAccel2Array,
                this::setAccel2Array,
                this::insertAccel2,
                this::removeAccel2,
                this::sizeOfAccel2Array
            );
        }
    }

    /**
     * Gets array of all "Accel2" elements
     */
    @Override
    public java.math.BigInteger[] getAccel2Array() {
        return getObjectArray(PROPERTY_QNAME[21], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Accel2" element
     */
    @Override
    public java.math.BigInteger getAccel2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Accel2" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetAccel2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAccel2Array,
                this::xsetAccel2Array,
                this::insertNewAccel2,
                this::removeAccel2,
                this::sizeOfAccel2Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "Accel2" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetAccel2Array() {
        return xgetArray(PROPERTY_QNAME[21], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Accel2" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetAccel2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Accel2" element
     */
    @Override
    public int sizeOfAccel2Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets array of all "Accel2" element
     */
    @Override
    public void setAccel2Array(java.math.BigInteger[] accel2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(accel2Array, PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets ith "Accel2" element
     */
    @Override
    public void setAccel2Array(int i, java.math.BigInteger accel2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(accel2);
        }
    }

    /**
     * Sets (as xml) array of all "Accel2" element
     */
    @Override
    public void xsetAccel2Array(org.apache.xmlbeans.XmlInteger[]accel2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(accel2Array, PROPERTY_QNAME[21]);
        }
    }

    /**
     * Sets (as xml) ith "Accel2" element
     */
    @Override
    public void xsetAccel2Array(int i, org.apache.xmlbeans.XmlInteger accel2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[21], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(accel2);
        }
    }

    /**
     * Inserts the value as the ith "Accel2" element
     */
    @Override
    public void insertAccel2(int i, java.math.BigInteger accel2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[21], i);
            target.setBigIntegerValue(accel2);
        }
    }

    /**
     * Appends the value as the last "Accel2" element
     */
    @Override
    public void addAccel2(java.math.BigInteger accel2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[21]);
            target.setBigIntegerValue(accel2);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Accel2" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewAccel2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[21], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Accel2" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewAccel2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Removes the ith "Accel2" element
     */
    @Override
    public void removeAccel2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[21], i);
        }
    }

    /**
     * Gets a List of "Row" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getRowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getRowArray,
                this::setRowArray,
                this::insertRow,
                this::removeRow,
                this::sizeOfRowArray
            );
        }
    }

    /**
     * Gets array of all "Row" elements
     */
    @Override
    public java.math.BigInteger[] getRowArray() {
        return getObjectArray(PROPERTY_QNAME[22], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Row" element
     */
    @Override
    public java.math.BigInteger getRowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Row" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetRowList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetRowArray,
                this::xsetRowArray,
                this::insertNewRow,
                this::removeRow,
                this::sizeOfRowArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Row" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetRowArray() {
        return xgetArray(PROPERTY_QNAME[22], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Row" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetRowArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Row" element
     */
    @Override
    public int sizeOfRowArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets array of all "Row" element
     */
    @Override
    public void setRowArray(java.math.BigInteger[] rowArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(rowArray, PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets ith "Row" element
     */
    @Override
    public void setRowArray(int i, java.math.BigInteger row) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(row);
        }
    }

    /**
     * Sets (as xml) array of all "Row" element
     */
    @Override
    public void xsetRowArray(org.apache.xmlbeans.XmlInteger[]rowArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(rowArray, PROPERTY_QNAME[22]);
        }
    }

    /**
     * Sets (as xml) ith "Row" element
     */
    @Override
    public void xsetRowArray(int i, org.apache.xmlbeans.XmlInteger row) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[22], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(row);
        }
    }

    /**
     * Inserts the value as the ith "Row" element
     */
    @Override
    public void insertRow(int i, java.math.BigInteger row) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[22], i);
            target.setBigIntegerValue(row);
        }
    }

    /**
     * Appends the value as the last "Row" element
     */
    @Override
    public void addRow(java.math.BigInteger row) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[22]);
            target.setBigIntegerValue(row);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Row" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewRow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[22], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Row" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewRow() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[22]);
            return target;
        }
    }

    /**
     * Removes the ith "Row" element
     */
    @Override
    public void removeRow(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[22], i);
        }
    }

    /**
     * Gets a List of "Column" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getColumnList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getColumnArray,
                this::setColumnArray,
                this::insertColumn,
                this::removeColumn,
                this::sizeOfColumnArray
            );
        }
    }

    /**
     * Gets array of all "Column" elements
     */
    @Override
    public java.math.BigInteger[] getColumnArray() {
        return getObjectArray(PROPERTY_QNAME[23], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Column" element
     */
    @Override
    public java.math.BigInteger getColumnArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Column" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetColumnList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetColumnArray,
                this::xsetColumnArray,
                this::insertNewColumn,
                this::removeColumn,
                this::sizeOfColumnArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Column" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetColumnArray() {
        return xgetArray(PROPERTY_QNAME[23], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Column" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetColumnArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Column" element
     */
    @Override
    public int sizeOfColumnArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets array of all "Column" element
     */
    @Override
    public void setColumnArray(java.math.BigInteger[] columnArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(columnArray, PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets ith "Column" element
     */
    @Override
    public void setColumnArray(int i, java.math.BigInteger column) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(column);
        }
    }

    /**
     * Sets (as xml) array of all "Column" element
     */
    @Override
    public void xsetColumnArray(org.apache.xmlbeans.XmlInteger[]columnArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(columnArray, PROPERTY_QNAME[23]);
        }
    }

    /**
     * Sets (as xml) ith "Column" element
     */
    @Override
    public void xsetColumnArray(int i, org.apache.xmlbeans.XmlInteger column) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[23], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(column);
        }
    }

    /**
     * Inserts the value as the ith "Column" element
     */
    @Override
    public void insertColumn(int i, java.math.BigInteger column) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[23], i);
            target.setBigIntegerValue(column);
        }
    }

    /**
     * Appends the value as the last "Column" element
     */
    @Override
    public void addColumn(java.math.BigInteger column) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[23]);
            target.setBigIntegerValue(column);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Column" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewColumn(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[23], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Column" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewColumn() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[23]);
            return target;
        }
    }

    /**
     * Removes the ith "Column" element
     */
    @Override
    public void removeColumn(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[23], i);
        }
    }

    /**
     * Gets a List of "Visible" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getVisibleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getVisibleArray,
                this::setVisibleArray,
                this::insertVisible,
                this::removeVisible,
                this::sizeOfVisibleArray
            );
        }
    }

    /**
     * Gets array of all "Visible" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getVisibleArray() {
        return getEnumArray(PROPERTY_QNAME[24], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Visible" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getVisibleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Visible" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetVisibleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetVisibleArray,
                this::xsetVisibleArray,
                this::insertNewVisible,
                this::removeVisible,
                this::sizeOfVisibleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Visible" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetVisibleArray() {
        return xgetArray(PROPERTY_QNAME[24], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Visible" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetVisibleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Visible" element
     */
    @Override
    public int sizeOfVisibleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets array of all "Visible" element
     */
    @Override
    public void setVisibleArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] visibleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(visibleArray, PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets ith "Visible" element
     */
    @Override
    public void setVisibleArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum visible) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(visible);
        }
    }

    /**
     * Sets (as xml) array of all "Visible" element
     */
    @Override
    public void xsetVisibleArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]visibleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(visibleArray, PROPERTY_QNAME[24]);
        }
    }

    /**
     * Sets (as xml) ith "Visible" element
     */
    @Override
    public void xsetVisibleArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank visible) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[24], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(visible);
        }
    }

    /**
     * Inserts the value as the ith "Visible" element
     */
    @Override
    public void insertVisible(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum visible) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[24], i);
            target.setEnumValue(visible);
        }
    }

    /**
     * Appends the value as the last "Visible" element
     */
    @Override
    public void addVisible(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum visible) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[24]);
            target.setEnumValue(visible);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Visible" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewVisible(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[24], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Visible" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewVisible() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[24]);
            return target;
        }
    }

    /**
     * Removes the ith "Visible" element
     */
    @Override
    public void removeVisible(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[24], i);
        }
    }

    /**
     * Gets a List of "RowHidden" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getRowHiddenList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getRowHiddenArray,
                this::setRowHiddenArray,
                this::insertRowHidden,
                this::removeRowHidden,
                this::sizeOfRowHiddenArray
            );
        }
    }

    /**
     * Gets array of all "RowHidden" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getRowHiddenArray() {
        return getEnumArray(PROPERTY_QNAME[25], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "RowHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getRowHiddenArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "RowHidden" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetRowHiddenList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetRowHiddenArray,
                this::xsetRowHiddenArray,
                this::insertNewRowHidden,
                this::removeRowHidden,
                this::sizeOfRowHiddenArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "RowHidden" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetRowHiddenArray() {
        return xgetArray(PROPERTY_QNAME[25], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "RowHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetRowHiddenArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RowHidden" element
     */
    @Override
    public int sizeOfRowHiddenArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets array of all "RowHidden" element
     */
    @Override
    public void setRowHiddenArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] rowHiddenArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(rowHiddenArray, PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets ith "RowHidden" element
     */
    @Override
    public void setRowHiddenArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum rowHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(rowHidden);
        }
    }

    /**
     * Sets (as xml) array of all "RowHidden" element
     */
    @Override
    public void xsetRowHiddenArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]rowHiddenArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(rowHiddenArray, PROPERTY_QNAME[25]);
        }
    }

    /**
     * Sets (as xml) ith "RowHidden" element
     */
    @Override
    public void xsetRowHiddenArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank rowHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[25], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(rowHidden);
        }
    }

    /**
     * Inserts the value as the ith "RowHidden" element
     */
    @Override
    public void insertRowHidden(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum rowHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[25], i);
            target.setEnumValue(rowHidden);
        }
    }

    /**
     * Appends the value as the last "RowHidden" element
     */
    @Override
    public void addRowHidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum rowHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[25]);
            target.setEnumValue(rowHidden);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RowHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewRowHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[25], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RowHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewRowHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[25]);
            return target;
        }
    }

    /**
     * Removes the ith "RowHidden" element
     */
    @Override
    public void removeRowHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[25], i);
        }
    }

    /**
     * Gets a List of "ColHidden" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getColHiddenList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getColHiddenArray,
                this::setColHiddenArray,
                this::insertColHidden,
                this::removeColHidden,
                this::sizeOfColHiddenArray
            );
        }
    }

    /**
     * Gets array of all "ColHidden" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getColHiddenArray() {
        return getEnumArray(PROPERTY_QNAME[26], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "ColHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getColHiddenArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "ColHidden" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetColHiddenList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetColHiddenArray,
                this::xsetColHiddenArray,
                this::insertNewColHidden,
                this::removeColHidden,
                this::sizeOfColHiddenArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ColHidden" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetColHiddenArray() {
        return xgetArray(PROPERTY_QNAME[26], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "ColHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetColHiddenArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ColHidden" element
     */
    @Override
    public int sizeOfColHiddenArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[26]);
        }
    }

    /**
     * Sets array of all "ColHidden" element
     */
    @Override
    public void setColHiddenArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] colHiddenArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(colHiddenArray, PROPERTY_QNAME[26]);
        }
    }

    /**
     * Sets ith "ColHidden" element
     */
    @Override
    public void setColHiddenArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(colHidden);
        }
    }

    /**
     * Sets (as xml) array of all "ColHidden" element
     */
    @Override
    public void xsetColHiddenArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]colHiddenArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(colHiddenArray, PROPERTY_QNAME[26]);
        }
    }

    /**
     * Sets (as xml) ith "ColHidden" element
     */
    @Override
    public void xsetColHiddenArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank colHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[26], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(colHidden);
        }
    }

    /**
     * Inserts the value as the ith "ColHidden" element
     */
    @Override
    public void insertColHidden(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[26], i);
            target.setEnumValue(colHidden);
        }
    }

    /**
     * Appends the value as the last "ColHidden" element
     */
    @Override
    public void addColHidden(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colHidden) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[26]);
            target.setEnumValue(colHidden);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ColHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewColHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[26], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ColHidden" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewColHidden() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[26]);
            return target;
        }
    }

    /**
     * Removes the ith "ColHidden" element
     */
    @Override
    public void removeColHidden(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[26], i);
        }
    }

    /**
     * Gets a List of "VTEdit" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getVTEditList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getVTEditArray,
                this::setVTEditArray,
                this::insertVTEdit,
                this::removeVTEdit,
                this::sizeOfVTEditArray
            );
        }
    }

    /**
     * Gets array of all "VTEdit" elements
     */
    @Override
    public java.math.BigInteger[] getVTEditArray() {
        return getObjectArray(PROPERTY_QNAME[27], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "VTEdit" element
     */
    @Override
    public java.math.BigInteger getVTEditArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "VTEdit" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetVTEditList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetVTEditArray,
                this::xsetVTEditArray,
                this::insertNewVTEdit,
                this::removeVTEdit,
                this::sizeOfVTEditArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "VTEdit" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetVTEditArray() {
        return xgetArray(PROPERTY_QNAME[27], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "VTEdit" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetVTEditArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VTEdit" element
     */
    @Override
    public int sizeOfVTEditArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets array of all "VTEdit" element
     */
    @Override
    public void setVTEditArray(java.math.BigInteger[] vtEditArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(vtEditArray, PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets ith "VTEdit" element
     */
    @Override
    public void setVTEditArray(int i, java.math.BigInteger vtEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(vtEdit);
        }
    }

    /**
     * Sets (as xml) array of all "VTEdit" element
     */
    @Override
    public void xsetVTEditArray(org.apache.xmlbeans.XmlInteger[]vtEditArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(vtEditArray, PROPERTY_QNAME[27]);
        }
    }

    /**
     * Sets (as xml) ith "VTEdit" element
     */
    @Override
    public void xsetVTEditArray(int i, org.apache.xmlbeans.XmlInteger vtEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[27], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(vtEdit);
        }
    }

    /**
     * Inserts the value as the ith "VTEdit" element
     */
    @Override
    public void insertVTEdit(int i, java.math.BigInteger vtEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[27], i);
            target.setBigIntegerValue(vtEdit);
        }
    }

    /**
     * Appends the value as the last "VTEdit" element
     */
    @Override
    public void addVTEdit(java.math.BigInteger vtEdit) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[27]);
            target.setBigIntegerValue(vtEdit);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VTEdit" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewVTEdit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[27], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VTEdit" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewVTEdit() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[27]);
            return target;
        }
    }

    /**
     * Removes the ith "VTEdit" element
     */
    @Override
    public void removeVTEdit(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[27], i);
        }
    }

    /**
     * Gets a List of "MultiLine" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getMultiLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMultiLineArray,
                this::setMultiLineArray,
                this::insertMultiLine,
                this::removeMultiLine,
                this::sizeOfMultiLineArray
            );
        }
    }

    /**
     * Gets array of all "MultiLine" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getMultiLineArray() {
        return getEnumArray(PROPERTY_QNAME[28], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "MultiLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getMultiLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "MultiLine" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetMultiLineList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMultiLineArray,
                this::xsetMultiLineArray,
                this::insertNewMultiLine,
                this::removeMultiLine,
                this::sizeOfMultiLineArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MultiLine" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetMultiLineArray() {
        return xgetArray(PROPERTY_QNAME[28], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "MultiLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetMultiLineArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MultiLine" element
     */
    @Override
    public int sizeOfMultiLineArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[28]);
        }
    }

    /**
     * Sets array of all "MultiLine" element
     */
    @Override
    public void setMultiLineArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] multiLineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(multiLineArray, PROPERTY_QNAME[28]);
        }
    }

    /**
     * Sets ith "MultiLine" element
     */
    @Override
    public void setMultiLineArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum multiLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(multiLine);
        }
    }

    /**
     * Sets (as xml) array of all "MultiLine" element
     */
    @Override
    public void xsetMultiLineArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]multiLineArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(multiLineArray, PROPERTY_QNAME[28]);
        }
    }

    /**
     * Sets (as xml) ith "MultiLine" element
     */
    @Override
    public void xsetMultiLineArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank multiLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[28], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(multiLine);
        }
    }

    /**
     * Inserts the value as the ith "MultiLine" element
     */
    @Override
    public void insertMultiLine(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum multiLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[28], i);
            target.setEnumValue(multiLine);
        }
    }

    /**
     * Appends the value as the last "MultiLine" element
     */
    @Override
    public void addMultiLine(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum multiLine) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[28]);
            target.setEnumValue(multiLine);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MultiLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewMultiLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[28], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MultiLine" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewMultiLine() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[28]);
            return target;
        }
    }

    /**
     * Removes the ith "MultiLine" element
     */
    @Override
    public void removeMultiLine(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[28], i);
        }
    }

    /**
     * Gets a List of "VScroll" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getVScrollList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getVScrollArray,
                this::setVScrollArray,
                this::insertVScroll,
                this::removeVScroll,
                this::sizeOfVScrollArray
            );
        }
    }

    /**
     * Gets array of all "VScroll" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getVScrollArray() {
        return getEnumArray(PROPERTY_QNAME[29], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "VScroll" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getVScrollArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "VScroll" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetVScrollList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetVScrollArray,
                this::xsetVScrollArray,
                this::insertNewVScroll,
                this::removeVScroll,
                this::sizeOfVScrollArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "VScroll" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetVScrollArray() {
        return xgetArray(PROPERTY_QNAME[29], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "VScroll" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetVScrollArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "VScroll" element
     */
    @Override
    public int sizeOfVScrollArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets array of all "VScroll" element
     */
    @Override
    public void setVScrollArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] vScrollArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(vScrollArray, PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets ith "VScroll" element
     */
    @Override
    public void setVScrollArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum vScroll) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(vScroll);
        }
    }

    /**
     * Sets (as xml) array of all "VScroll" element
     */
    @Override
    public void xsetVScrollArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]vScrollArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(vScrollArray, PROPERTY_QNAME[29]);
        }
    }

    /**
     * Sets (as xml) ith "VScroll" element
     */
    @Override
    public void xsetVScrollArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank vScroll) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[29], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(vScroll);
        }
    }

    /**
     * Inserts the value as the ith "VScroll" element
     */
    @Override
    public void insertVScroll(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum vScroll) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[29], i);
            target.setEnumValue(vScroll);
        }
    }

    /**
     * Appends the value as the last "VScroll" element
     */
    @Override
    public void addVScroll(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum vScroll) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[29]);
            target.setEnumValue(vScroll);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "VScroll" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewVScroll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[29], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "VScroll" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewVScroll() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[29]);
            return target;
        }
    }

    /**
     * Removes the ith "VScroll" element
     */
    @Override
    public void removeVScroll(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[29], i);
        }
    }

    /**
     * Gets a List of "ValidIds" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getValidIdsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getValidIdsArray,
                this::setValidIdsArray,
                this::insertValidIds,
                this::removeValidIds,
                this::sizeOfValidIdsArray
            );
        }
    }

    /**
     * Gets array of all "ValidIds" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getValidIdsArray() {
        return getEnumArray(PROPERTY_QNAME[30], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "ValidIds" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getValidIdsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "ValidIds" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetValidIdsList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetValidIdsArray,
                this::xsetValidIdsArray,
                this::insertNewValidIds,
                this::removeValidIds,
                this::sizeOfValidIdsArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ValidIds" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetValidIdsArray() {
        return xgetArray(PROPERTY_QNAME[30], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "ValidIds" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetValidIdsArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValidIds" element
     */
    @Override
    public int sizeOfValidIdsArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets array of all "ValidIds" element
     */
    @Override
    public void setValidIdsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] validIdsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(validIdsArray, PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets ith "ValidIds" element
     */
    @Override
    public void setValidIdsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum validIds) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(validIds);
        }
    }

    /**
     * Sets (as xml) array of all "ValidIds" element
     */
    @Override
    public void xsetValidIdsArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]validIdsArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(validIdsArray, PROPERTY_QNAME[30]);
        }
    }

    /**
     * Sets (as xml) ith "ValidIds" element
     */
    @Override
    public void xsetValidIdsArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank validIds) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[30], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(validIds);
        }
    }

    /**
     * Inserts the value as the ith "ValidIds" element
     */
    @Override
    public void insertValidIds(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum validIds) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[30], i);
            target.setEnumValue(validIds);
        }
    }

    /**
     * Appends the value as the last "ValidIds" element
     */
    @Override
    public void addValidIds(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum validIds) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[30]);
            target.setEnumValue(validIds);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValidIds" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewValidIds(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[30], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValidIds" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewValidIds() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[30]);
            return target;
        }
    }

    /**
     * Removes the ith "ValidIds" element
     */
    @Override
    public void removeValidIds(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[30], i);
        }
    }

    /**
     * Gets a List of "FmlaRange" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaRangeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaRangeArray,
                this::setFmlaRangeArray,
                this::insertFmlaRange,
                this::removeFmlaRange,
                this::sizeOfFmlaRangeArray
            );
        }
    }

    /**
     * Gets array of all "FmlaRange" elements
     */
    @Override
    public java.lang.String[] getFmlaRangeArray() {
        return getObjectArray(PROPERTY_QNAME[31], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaRange" element
     */
    @Override
    public java.lang.String getFmlaRangeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaRange" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaRangeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaRangeArray,
                this::xsetFmlaRangeArray,
                this::insertNewFmlaRange,
                this::removeFmlaRange,
                this::sizeOfFmlaRangeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaRange" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaRangeArray() {
        return xgetArray(PROPERTY_QNAME[31], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaRange" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaRangeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaRange" element
     */
    @Override
    public int sizeOfFmlaRangeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[31]);
        }
    }

    /**
     * Sets array of all "FmlaRange" element
     */
    @Override
    public void setFmlaRangeArray(java.lang.String[] fmlaRangeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaRangeArray, PROPERTY_QNAME[31]);
        }
    }

    /**
     * Sets ith "FmlaRange" element
     */
    @Override
    public void setFmlaRangeArray(int i, java.lang.String fmlaRange) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaRange);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaRange" element
     */
    @Override
    public void xsetFmlaRangeArray(org.apache.xmlbeans.XmlString[]fmlaRangeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaRangeArray, PROPERTY_QNAME[31]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaRange" element
     */
    @Override
    public void xsetFmlaRangeArray(int i, org.apache.xmlbeans.XmlString fmlaRange) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[31], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaRange);
        }
    }

    /**
     * Inserts the value as the ith "FmlaRange" element
     */
    @Override
    public void insertFmlaRange(int i, java.lang.String fmlaRange) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[31], i);
            target.setStringValue(fmlaRange);
        }
    }

    /**
     * Appends the value as the last "FmlaRange" element
     */
    @Override
    public void addFmlaRange(java.lang.String fmlaRange) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[31]);
            target.setStringValue(fmlaRange);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaRange" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaRange(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[31], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaRange" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaRange() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[31]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaRange" element
     */
    @Override
    public void removeFmlaRange(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[31], i);
        }
    }

    /**
     * Gets a List of "WidthMin" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getWidthMinList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getWidthMinArray,
                this::setWidthMinArray,
                this::insertWidthMin,
                this::removeWidthMin,
                this::sizeOfWidthMinArray
            );
        }
    }

    /**
     * Gets array of all "WidthMin" elements
     */
    @Override
    public java.math.BigInteger[] getWidthMinArray() {
        return getObjectArray(PROPERTY_QNAME[32], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "WidthMin" element
     */
    @Override
    public java.math.BigInteger getWidthMinArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "WidthMin" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetWidthMinList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetWidthMinArray,
                this::xsetWidthMinArray,
                this::insertNewWidthMin,
                this::removeWidthMin,
                this::sizeOfWidthMinArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "WidthMin" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetWidthMinArray() {
        return xgetArray(PROPERTY_QNAME[32], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "WidthMin" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetWidthMinArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "WidthMin" element
     */
    @Override
    public int sizeOfWidthMinArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[32]);
        }
    }

    /**
     * Sets array of all "WidthMin" element
     */
    @Override
    public void setWidthMinArray(java.math.BigInteger[] widthMinArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(widthMinArray, PROPERTY_QNAME[32]);
        }
    }

    /**
     * Sets ith "WidthMin" element
     */
    @Override
    public void setWidthMinArray(int i, java.math.BigInteger widthMin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(widthMin);
        }
    }

    /**
     * Sets (as xml) array of all "WidthMin" element
     */
    @Override
    public void xsetWidthMinArray(org.apache.xmlbeans.XmlInteger[]widthMinArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(widthMinArray, PROPERTY_QNAME[32]);
        }
    }

    /**
     * Sets (as xml) ith "WidthMin" element
     */
    @Override
    public void xsetWidthMinArray(int i, org.apache.xmlbeans.XmlInteger widthMin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[32], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(widthMin);
        }
    }

    /**
     * Inserts the value as the ith "WidthMin" element
     */
    @Override
    public void insertWidthMin(int i, java.math.BigInteger widthMin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[32], i);
            target.setBigIntegerValue(widthMin);
        }
    }

    /**
     * Appends the value as the last "WidthMin" element
     */
    @Override
    public void addWidthMin(java.math.BigInteger widthMin) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[32]);
            target.setBigIntegerValue(widthMin);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "WidthMin" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewWidthMin(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[32], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "WidthMin" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewWidthMin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[32]);
            return target;
        }
    }

    /**
     * Removes the ith "WidthMin" element
     */
    @Override
    public void removeWidthMin(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[32], i);
        }
    }

    /**
     * Gets a List of "Sel" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getSelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSelArray,
                this::setSelArray,
                this::insertSel,
                this::removeSel,
                this::sizeOfSelArray
            );
        }
    }

    /**
     * Gets array of all "Sel" elements
     */
    @Override
    public java.math.BigInteger[] getSelArray() {
        return getObjectArray(PROPERTY_QNAME[33], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Sel" element
     */
    @Override
    public java.math.BigInteger getSelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Sel" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetSelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSelArray,
                this::xsetSelArray,
                this::insertNewSel,
                this::removeSel,
                this::sizeOfSelArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Sel" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetSelArray() {
        return xgetArray(PROPERTY_QNAME[33], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Sel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetSelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Sel" element
     */
    @Override
    public int sizeOfSelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[33]);
        }
    }

    /**
     * Sets array of all "Sel" element
     */
    @Override
    public void setSelArray(java.math.BigInteger[] selArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(selArray, PROPERTY_QNAME[33]);
        }
    }

    /**
     * Sets ith "Sel" element
     */
    @Override
    public void setSelArray(int i, java.math.BigInteger sel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(sel);
        }
    }

    /**
     * Sets (as xml) array of all "Sel" element
     */
    @Override
    public void xsetSelArray(org.apache.xmlbeans.XmlInteger[]selArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(selArray, PROPERTY_QNAME[33]);
        }
    }

    /**
     * Sets (as xml) ith "Sel" element
     */
    @Override
    public void xsetSelArray(int i, org.apache.xmlbeans.XmlInteger sel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[33], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(sel);
        }
    }

    /**
     * Inserts the value as the ith "Sel" element
     */
    @Override
    public void insertSel(int i, java.math.BigInteger sel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[33], i);
            target.setBigIntegerValue(sel);
        }
    }

    /**
     * Appends the value as the last "Sel" element
     */
    @Override
    public void addSel(java.math.BigInteger sel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[33]);
            target.setBigIntegerValue(sel);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Sel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewSel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[33], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Sel" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewSel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[33]);
            return target;
        }
    }

    /**
     * Removes the ith "Sel" element
     */
    @Override
    public void removeSel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[33], i);
        }
    }

    /**
     * Gets a List of "NoThreeD2" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getNoThreeD2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getNoThreeD2Array,
                this::setNoThreeD2Array,
                this::insertNoThreeD2,
                this::removeNoThreeD2,
                this::sizeOfNoThreeD2Array
            );
        }
    }

    /**
     * Gets array of all "NoThreeD2" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getNoThreeD2Array() {
        return getEnumArray(PROPERTY_QNAME[34], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "NoThreeD2" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getNoThreeD2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "NoThreeD2" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetNoThreeD2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetNoThreeD2Array,
                this::xsetNoThreeD2Array,
                this::insertNewNoThreeD2,
                this::removeNoThreeD2,
                this::sizeOfNoThreeD2Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "NoThreeD2" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetNoThreeD2Array() {
        return xgetArray(PROPERTY_QNAME[34], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "NoThreeD2" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetNoThreeD2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NoThreeD2" element
     */
    @Override
    public int sizeOfNoThreeD2Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[34]);
        }
    }

    /**
     * Sets array of all "NoThreeD2" element
     */
    @Override
    public void setNoThreeD2Array(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] noThreeD2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(noThreeD2Array, PROPERTY_QNAME[34]);
        }
    }

    /**
     * Sets ith "NoThreeD2" element
     */
    @Override
    public void setNoThreeD2Array(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(noThreeD2);
        }
    }

    /**
     * Sets (as xml) array of all "NoThreeD2" element
     */
    @Override
    public void xsetNoThreeD2Array(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]noThreeD2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(noThreeD2Array, PROPERTY_QNAME[34]);
        }
    }

    /**
     * Sets (as xml) ith "NoThreeD2" element
     */
    @Override
    public void xsetNoThreeD2Array(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank noThreeD2) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[34], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(noThreeD2);
        }
    }

    /**
     * Inserts the value as the ith "NoThreeD2" element
     */
    @Override
    public void insertNoThreeD2(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[34], i);
            target.setEnumValue(noThreeD2);
        }
    }

    /**
     * Appends the value as the last "NoThreeD2" element
     */
    @Override
    public void addNoThreeD2(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[34]);
            target.setEnumValue(noThreeD2);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NoThreeD2" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewNoThreeD2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[34], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NoThreeD2" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewNoThreeD2() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[34]);
            return target;
        }
    }

    /**
     * Removes the ith "NoThreeD2" element
     */
    @Override
    public void removeNoThreeD2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[34], i);
        }
    }

    /**
     * Gets a List of "SelType" elements
     */
    @Override
    public java.util.List<java.lang.String> getSelTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getSelTypeArray,
                this::setSelTypeArray,
                this::insertSelType,
                this::removeSelType,
                this::sizeOfSelTypeArray
            );
        }
    }

    /**
     * Gets array of all "SelType" elements
     */
    @Override
    public java.lang.String[] getSelTypeArray() {
        return getObjectArray(PROPERTY_QNAME[35], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "SelType" element
     */
    @Override
    public java.lang.String getSelTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[35], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "SelType" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetSelTypeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetSelTypeArray,
                this::xsetSelTypeArray,
                this::insertNewSelType,
                this::removeSelType,
                this::sizeOfSelTypeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "SelType" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetSelTypeArray() {
        return xgetArray(PROPERTY_QNAME[35], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "SelType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetSelTypeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[35], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "SelType" element
     */
    @Override
    public int sizeOfSelTypeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[35]);
        }
    }

    /**
     * Sets array of all "SelType" element
     */
    @Override
    public void setSelTypeArray(java.lang.String[] selTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(selTypeArray, PROPERTY_QNAME[35]);
        }
    }

    /**
     * Sets ith "SelType" element
     */
    @Override
    public void setSelTypeArray(int i, java.lang.String selType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[35], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(selType);
        }
    }

    /**
     * Sets (as xml) array of all "SelType" element
     */
    @Override
    public void xsetSelTypeArray(org.apache.xmlbeans.XmlString[]selTypeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(selTypeArray, PROPERTY_QNAME[35]);
        }
    }

    /**
     * Sets (as xml) ith "SelType" element
     */
    @Override
    public void xsetSelTypeArray(int i, org.apache.xmlbeans.XmlString selType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[35], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(selType);
        }
    }

    /**
     * Inserts the value as the ith "SelType" element
     */
    @Override
    public void insertSelType(int i, java.lang.String selType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[35], i);
            target.setStringValue(selType);
        }
    }

    /**
     * Appends the value as the last "SelType" element
     */
    @Override
    public void addSelType(java.lang.String selType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[35]);
            target.setStringValue(selType);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewSelType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[35], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "SelType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewSelType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[35]);
            return target;
        }
    }

    /**
     * Removes the ith "SelType" element
     */
    @Override
    public void removeSelType(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[35], i);
        }
    }

    /**
     * Gets a List of "MultiSel" elements
     */
    @Override
    public java.util.List<java.lang.String> getMultiSelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMultiSelArray,
                this::setMultiSelArray,
                this::insertMultiSel,
                this::removeMultiSel,
                this::sizeOfMultiSelArray
            );
        }
    }

    /**
     * Gets array of all "MultiSel" elements
     */
    @Override
    public java.lang.String[] getMultiSelArray() {
        return getObjectArray(PROPERTY_QNAME[36], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "MultiSel" element
     */
    @Override
    public java.lang.String getMultiSelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[36], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "MultiSel" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetMultiSelList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMultiSelArray,
                this::xsetMultiSelArray,
                this::insertNewMultiSel,
                this::removeMultiSel,
                this::sizeOfMultiSelArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MultiSel" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetMultiSelArray() {
        return xgetArray(PROPERTY_QNAME[36], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "MultiSel" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetMultiSelArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[36], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MultiSel" element
     */
    @Override
    public int sizeOfMultiSelArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[36]);
        }
    }

    /**
     * Sets array of all "MultiSel" element
     */
    @Override
    public void setMultiSelArray(java.lang.String[] multiSelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(multiSelArray, PROPERTY_QNAME[36]);
        }
    }

    /**
     * Sets ith "MultiSel" element
     */
    @Override
    public void setMultiSelArray(int i, java.lang.String multiSel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[36], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(multiSel);
        }
    }

    /**
     * Sets (as xml) array of all "MultiSel" element
     */
    @Override
    public void xsetMultiSelArray(org.apache.xmlbeans.XmlString[]multiSelArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(multiSelArray, PROPERTY_QNAME[36]);
        }
    }

    /**
     * Sets (as xml) ith "MultiSel" element
     */
    @Override
    public void xsetMultiSelArray(int i, org.apache.xmlbeans.XmlString multiSel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[36], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(multiSel);
        }
    }

    /**
     * Inserts the value as the ith "MultiSel" element
     */
    @Override
    public void insertMultiSel(int i, java.lang.String multiSel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[36], i);
            target.setStringValue(multiSel);
        }
    }

    /**
     * Appends the value as the last "MultiSel" element
     */
    @Override
    public void addMultiSel(java.lang.String multiSel) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[36]);
            target.setStringValue(multiSel);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MultiSel" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewMultiSel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[36], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MultiSel" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewMultiSel() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[36]);
            return target;
        }
    }

    /**
     * Removes the ith "MultiSel" element
     */
    @Override
    public void removeMultiSel(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[36], i);
        }
    }

    /**
     * Gets a List of "LCT" elements
     */
    @Override
    public java.util.List<java.lang.String> getLCTList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLCTArray,
                this::setLCTArray,
                this::insertLCT,
                this::removeLCT,
                this::sizeOfLCTArray
            );
        }
    }

    /**
     * Gets array of all "LCT" elements
     */
    @Override
    public java.lang.String[] getLCTArray() {
        return getObjectArray(PROPERTY_QNAME[37], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "LCT" element
     */
    @Override
    public java.lang.String getLCTArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[37], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "LCT" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLCTList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLCTArray,
                this::xsetLCTArray,
                this::insertNewLCT,
                this::removeLCT,
                this::sizeOfLCTArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "LCT" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetLCTArray() {
        return xgetArray(PROPERTY_QNAME[37], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "LCT" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLCTArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[37], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "LCT" element
     */
    @Override
    public int sizeOfLCTArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[37]);
        }
    }

    /**
     * Sets array of all "LCT" element
     */
    @Override
    public void setLCTArray(java.lang.String[] lctArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lctArray, PROPERTY_QNAME[37]);
        }
    }

    /**
     * Sets ith "LCT" element
     */
    @Override
    public void setLCTArray(int i, java.lang.String lct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[37], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lct);
        }
    }

    /**
     * Sets (as xml) array of all "LCT" element
     */
    @Override
    public void xsetLCTArray(org.apache.xmlbeans.XmlString[]lctArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lctArray, PROPERTY_QNAME[37]);
        }
    }

    /**
     * Sets (as xml) ith "LCT" element
     */
    @Override
    public void xsetLCTArray(int i, org.apache.xmlbeans.XmlString lct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[37], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(lct);
        }
    }

    /**
     * Inserts the value as the ith "LCT" element
     */
    @Override
    public void insertLCT(int i, java.lang.String lct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[37], i);
            target.setStringValue(lct);
        }
    }

    /**
     * Appends the value as the last "LCT" element
     */
    @Override
    public void addLCT(java.lang.String lct) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[37]);
            target.setStringValue(lct);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "LCT" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewLCT(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[37], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "LCT" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewLCT() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[37]);
            return target;
        }
    }

    /**
     * Removes the ith "LCT" element
     */
    @Override
    public void removeLCT(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[37], i);
        }
    }

    /**
     * Gets a List of "ListItem" elements
     */
    @Override
    public java.util.List<java.lang.String> getListItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getListItemArray,
                this::setListItemArray,
                this::insertListItem,
                this::removeListItem,
                this::sizeOfListItemArray
            );
        }
    }

    /**
     * Gets array of all "ListItem" elements
     */
    @Override
    public java.lang.String[] getListItemArray() {
        return getObjectArray(PROPERTY_QNAME[38], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ListItem" element
     */
    @Override
    public java.lang.String getListItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[38], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "ListItem" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetListItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetListItemArray,
                this::xsetListItemArray,
                this::insertNewListItem,
                this::removeListItem,
                this::sizeOfListItemArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ListItem" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetListItemArray() {
        return xgetArray(PROPERTY_QNAME[38], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "ListItem" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetListItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[38], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ListItem" element
     */
    @Override
    public int sizeOfListItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[38]);
        }
    }

    /**
     * Sets array of all "ListItem" element
     */
    @Override
    public void setListItemArray(java.lang.String[] listItemArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(listItemArray, PROPERTY_QNAME[38]);
        }
    }

    /**
     * Sets ith "ListItem" element
     */
    @Override
    public void setListItemArray(int i, java.lang.String listItem) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[38], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(listItem);
        }
    }

    /**
     * Sets (as xml) array of all "ListItem" element
     */
    @Override
    public void xsetListItemArray(org.apache.xmlbeans.XmlString[]listItemArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(listItemArray, PROPERTY_QNAME[38]);
        }
    }

    /**
     * Sets (as xml) ith "ListItem" element
     */
    @Override
    public void xsetListItemArray(int i, org.apache.xmlbeans.XmlString listItem) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[38], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(listItem);
        }
    }

    /**
     * Inserts the value as the ith "ListItem" element
     */
    @Override
    public void insertListItem(int i, java.lang.String listItem) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[38], i);
            target.setStringValue(listItem);
        }
    }

    /**
     * Appends the value as the last "ListItem" element
     */
    @Override
    public void addListItem(java.lang.String listItem) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[38]);
            target.setStringValue(listItem);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ListItem" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewListItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[38], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ListItem" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewListItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[38]);
            return target;
        }
    }

    /**
     * Removes the ith "ListItem" element
     */
    @Override
    public void removeListItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[38], i);
        }
    }

    /**
     * Gets a List of "DropStyle" elements
     */
    @Override
    public java.util.List<java.lang.String> getDropStyleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDropStyleArray,
                this::setDropStyleArray,
                this::insertDropStyle,
                this::removeDropStyle,
                this::sizeOfDropStyleArray
            );
        }
    }

    /**
     * Gets array of all "DropStyle" elements
     */
    @Override
    public java.lang.String[] getDropStyleArray() {
        return getObjectArray(PROPERTY_QNAME[39], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "DropStyle" element
     */
    @Override
    public java.lang.String getDropStyleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[39], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "DropStyle" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetDropStyleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDropStyleArray,
                this::xsetDropStyleArray,
                this::insertNewDropStyle,
                this::removeDropStyle,
                this::sizeOfDropStyleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DropStyle" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetDropStyleArray() {
        return xgetArray(PROPERTY_QNAME[39], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "DropStyle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetDropStyleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[39], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DropStyle" element
     */
    @Override
    public int sizeOfDropStyleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[39]);
        }
    }

    /**
     * Sets array of all "DropStyle" element
     */
    @Override
    public void setDropStyleArray(java.lang.String[] dropStyleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dropStyleArray, PROPERTY_QNAME[39]);
        }
    }

    /**
     * Sets ith "DropStyle" element
     */
    @Override
    public void setDropStyleArray(int i, java.lang.String dropStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[39], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dropStyle);
        }
    }

    /**
     * Sets (as xml) array of all "DropStyle" element
     */
    @Override
    public void xsetDropStyleArray(org.apache.xmlbeans.XmlString[]dropStyleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dropStyleArray, PROPERTY_QNAME[39]);
        }
    }

    /**
     * Sets (as xml) ith "DropStyle" element
     */
    @Override
    public void xsetDropStyleArray(int i, org.apache.xmlbeans.XmlString dropStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[39], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dropStyle);
        }
    }

    /**
     * Inserts the value as the ith "DropStyle" element
     */
    @Override
    public void insertDropStyle(int i, java.lang.String dropStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[39], i);
            target.setStringValue(dropStyle);
        }
    }

    /**
     * Appends the value as the last "DropStyle" element
     */
    @Override
    public void addDropStyle(java.lang.String dropStyle) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[39]);
            target.setStringValue(dropStyle);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DropStyle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewDropStyle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[39], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DropStyle" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewDropStyle() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[39]);
            return target;
        }
    }

    /**
     * Removes the ith "DropStyle" element
     */
    @Override
    public void removeDropStyle(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[39], i);
        }
    }

    /**
     * Gets a List of "Colored" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getColoredList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getColoredArray,
                this::setColoredArray,
                this::insertColored,
                this::removeColored,
                this::sizeOfColoredArray
            );
        }
    }

    /**
     * Gets array of all "Colored" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getColoredArray() {
        return getEnumArray(PROPERTY_QNAME[40], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Colored" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getColoredArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[40], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Colored" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetColoredList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetColoredArray,
                this::xsetColoredArray,
                this::insertNewColored,
                this::removeColored,
                this::sizeOfColoredArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Colored" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetColoredArray() {
        return xgetArray(PROPERTY_QNAME[40], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Colored" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetColoredArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[40], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Colored" element
     */
    @Override
    public int sizeOfColoredArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[40]);
        }
    }

    /**
     * Sets array of all "Colored" element
     */
    @Override
    public void setColoredArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] coloredArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(coloredArray, PROPERTY_QNAME[40]);
        }
    }

    /**
     * Sets ith "Colored" element
     */
    @Override
    public void setColoredArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colored) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[40], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(colored);
        }
    }

    /**
     * Sets (as xml) array of all "Colored" element
     */
    @Override
    public void xsetColoredArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]coloredArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(coloredArray, PROPERTY_QNAME[40]);
        }
    }

    /**
     * Sets (as xml) ith "Colored" element
     */
    @Override
    public void xsetColoredArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank colored) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[40], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(colored);
        }
    }

    /**
     * Inserts the value as the ith "Colored" element
     */
    @Override
    public void insertColored(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colored) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[40], i);
            target.setEnumValue(colored);
        }
    }

    /**
     * Appends the value as the last "Colored" element
     */
    @Override
    public void addColored(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum colored) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[40]);
            target.setEnumValue(colored);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Colored" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewColored(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[40], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Colored" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewColored() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[40]);
            return target;
        }
    }

    /**
     * Removes the ith "Colored" element
     */
    @Override
    public void removeColored(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[40], i);
        }
    }

    /**
     * Gets a List of "DropLines" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getDropLinesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDropLinesArray,
                this::setDropLinesArray,
                this::insertDropLines,
                this::removeDropLines,
                this::sizeOfDropLinesArray
            );
        }
    }

    /**
     * Gets array of all "DropLines" elements
     */
    @Override
    public java.math.BigInteger[] getDropLinesArray() {
        return getObjectArray(PROPERTY_QNAME[41], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "DropLines" element
     */
    @Override
    public java.math.BigInteger getDropLinesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[41], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "DropLines" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetDropLinesList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDropLinesArray,
                this::xsetDropLinesArray,
                this::insertNewDropLines,
                this::removeDropLines,
                this::sizeOfDropLinesArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DropLines" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetDropLinesArray() {
        return xgetArray(PROPERTY_QNAME[41], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "DropLines" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetDropLinesArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[41], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DropLines" element
     */
    @Override
    public int sizeOfDropLinesArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[41]);
        }
    }

    /**
     * Sets array of all "DropLines" element
     */
    @Override
    public void setDropLinesArray(java.math.BigInteger[] dropLinesArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dropLinesArray, PROPERTY_QNAME[41]);
        }
    }

    /**
     * Sets ith "DropLines" element
     */
    @Override
    public void setDropLinesArray(int i, java.math.BigInteger dropLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[41], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(dropLines);
        }
    }

    /**
     * Sets (as xml) array of all "DropLines" element
     */
    @Override
    public void xsetDropLinesArray(org.apache.xmlbeans.XmlInteger[]dropLinesArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dropLinesArray, PROPERTY_QNAME[41]);
        }
    }

    /**
     * Sets (as xml) ith "DropLines" element
     */
    @Override
    public void xsetDropLinesArray(int i, org.apache.xmlbeans.XmlInteger dropLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[41], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dropLines);
        }
    }

    /**
     * Inserts the value as the ith "DropLines" element
     */
    @Override
    public void insertDropLines(int i, java.math.BigInteger dropLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[41], i);
            target.setBigIntegerValue(dropLines);
        }
    }

    /**
     * Appends the value as the last "DropLines" element
     */
    @Override
    public void addDropLines(java.math.BigInteger dropLines) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[41]);
            target.setBigIntegerValue(dropLines);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DropLines" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewDropLines(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[41], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DropLines" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewDropLines() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[41]);
            return target;
        }
    }

    /**
     * Removes the ith "DropLines" element
     */
    @Override
    public void removeDropLines(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[41], i);
        }
    }

    /**
     * Gets a List of "Checked" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getCheckedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCheckedArray,
                this::setCheckedArray,
                this::insertChecked,
                this::removeChecked,
                this::sizeOfCheckedArray
            );
        }
    }

    /**
     * Gets array of all "Checked" elements
     */
    @Override
    public java.math.BigInteger[] getCheckedArray() {
        return getObjectArray(PROPERTY_QNAME[42], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Checked" element
     */
    @Override
    public java.math.BigInteger getCheckedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[42], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Checked" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetCheckedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCheckedArray,
                this::xsetCheckedArray,
                this::insertNewChecked,
                this::removeChecked,
                this::sizeOfCheckedArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Checked" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetCheckedArray() {
        return xgetArray(PROPERTY_QNAME[42], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Checked" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetCheckedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[42], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Checked" element
     */
    @Override
    public int sizeOfCheckedArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[42]);
        }
    }

    /**
     * Sets array of all "Checked" element
     */
    @Override
    public void setCheckedArray(java.math.BigInteger[] checkedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(checkedArray, PROPERTY_QNAME[42]);
        }
    }

    /**
     * Sets ith "Checked" element
     */
    @Override
    public void setCheckedArray(int i, java.math.BigInteger checked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[42], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(checked);
        }
    }

    /**
     * Sets (as xml) array of all "Checked" element
     */
    @Override
    public void xsetCheckedArray(org.apache.xmlbeans.XmlInteger[]checkedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(checkedArray, PROPERTY_QNAME[42]);
        }
    }

    /**
     * Sets (as xml) ith "Checked" element
     */
    @Override
    public void xsetCheckedArray(int i, org.apache.xmlbeans.XmlInteger checked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[42], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(checked);
        }
    }

    /**
     * Inserts the value as the ith "Checked" element
     */
    @Override
    public void insertChecked(int i, java.math.BigInteger checked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[42], i);
            target.setBigIntegerValue(checked);
        }
    }

    /**
     * Appends the value as the last "Checked" element
     */
    @Override
    public void addChecked(java.math.BigInteger checked) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[42]);
            target.setBigIntegerValue(checked);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Checked" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewChecked(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[42], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Checked" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewChecked() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[42]);
            return target;
        }
    }

    /**
     * Removes the ith "Checked" element
     */
    @Override
    public void removeChecked(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[42], i);
        }
    }

    /**
     * Gets a List of "FmlaLink" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaLinkList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaLinkArray,
                this::setFmlaLinkArray,
                this::insertFmlaLink,
                this::removeFmlaLink,
                this::sizeOfFmlaLinkArray
            );
        }
    }

    /**
     * Gets array of all "FmlaLink" elements
     */
    @Override
    public java.lang.String[] getFmlaLinkArray() {
        return getObjectArray(PROPERTY_QNAME[43], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaLink" element
     */
    @Override
    public java.lang.String getFmlaLinkArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[43], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaLink" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaLinkList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaLinkArray,
                this::xsetFmlaLinkArray,
                this::insertNewFmlaLink,
                this::removeFmlaLink,
                this::sizeOfFmlaLinkArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaLink" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaLinkArray() {
        return xgetArray(PROPERTY_QNAME[43], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaLink" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaLinkArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[43], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaLink" element
     */
    @Override
    public int sizeOfFmlaLinkArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[43]);
        }
    }

    /**
     * Sets array of all "FmlaLink" element
     */
    @Override
    public void setFmlaLinkArray(java.lang.String[] fmlaLinkArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaLinkArray, PROPERTY_QNAME[43]);
        }
    }

    /**
     * Sets ith "FmlaLink" element
     */
    @Override
    public void setFmlaLinkArray(int i, java.lang.String fmlaLink) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[43], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaLink);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaLink" element
     */
    @Override
    public void xsetFmlaLinkArray(org.apache.xmlbeans.XmlString[]fmlaLinkArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaLinkArray, PROPERTY_QNAME[43]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaLink" element
     */
    @Override
    public void xsetFmlaLinkArray(int i, org.apache.xmlbeans.XmlString fmlaLink) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[43], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaLink);
        }
    }

    /**
     * Inserts the value as the ith "FmlaLink" element
     */
    @Override
    public void insertFmlaLink(int i, java.lang.String fmlaLink) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[43], i);
            target.setStringValue(fmlaLink);
        }
    }

    /**
     * Appends the value as the last "FmlaLink" element
     */
    @Override
    public void addFmlaLink(java.lang.String fmlaLink) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[43]);
            target.setStringValue(fmlaLink);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaLink" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaLink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[43], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaLink" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaLink() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[43]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaLink" element
     */
    @Override
    public void removeFmlaLink(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[43], i);
        }
    }

    /**
     * Gets a List of "FmlaPict" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaPictList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaPictArray,
                this::setFmlaPictArray,
                this::insertFmlaPict,
                this::removeFmlaPict,
                this::sizeOfFmlaPictArray
            );
        }
    }

    /**
     * Gets array of all "FmlaPict" elements
     */
    @Override
    public java.lang.String[] getFmlaPictArray() {
        return getObjectArray(PROPERTY_QNAME[44], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaPict" element
     */
    @Override
    public java.lang.String getFmlaPictArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[44], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaPict" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaPictList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaPictArray,
                this::xsetFmlaPictArray,
                this::insertNewFmlaPict,
                this::removeFmlaPict,
                this::sizeOfFmlaPictArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaPict" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaPictArray() {
        return xgetArray(PROPERTY_QNAME[44], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaPict" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaPictArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[44], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaPict" element
     */
    @Override
    public int sizeOfFmlaPictArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[44]);
        }
    }

    /**
     * Sets array of all "FmlaPict" element
     */
    @Override
    public void setFmlaPictArray(java.lang.String[] fmlaPictArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaPictArray, PROPERTY_QNAME[44]);
        }
    }

    /**
     * Sets ith "FmlaPict" element
     */
    @Override
    public void setFmlaPictArray(int i, java.lang.String fmlaPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[44], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaPict);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaPict" element
     */
    @Override
    public void xsetFmlaPictArray(org.apache.xmlbeans.XmlString[]fmlaPictArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaPictArray, PROPERTY_QNAME[44]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaPict" element
     */
    @Override
    public void xsetFmlaPictArray(int i, org.apache.xmlbeans.XmlString fmlaPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[44], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaPict);
        }
    }

    /**
     * Inserts the value as the ith "FmlaPict" element
     */
    @Override
    public void insertFmlaPict(int i, java.lang.String fmlaPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[44], i);
            target.setStringValue(fmlaPict);
        }
    }

    /**
     * Appends the value as the last "FmlaPict" element
     */
    @Override
    public void addFmlaPict(java.lang.String fmlaPict) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[44]);
            target.setStringValue(fmlaPict);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaPict" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaPict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[44], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaPict" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaPict() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[44]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaPict" element
     */
    @Override
    public void removeFmlaPict(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[44], i);
        }
    }

    /**
     * Gets a List of "NoThreeD" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getNoThreeDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getNoThreeDArray,
                this::setNoThreeDArray,
                this::insertNoThreeD,
                this::removeNoThreeD,
                this::sizeOfNoThreeDArray
            );
        }
    }

    /**
     * Gets array of all "NoThreeD" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getNoThreeDArray() {
        return getEnumArray(PROPERTY_QNAME[45], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "NoThreeD" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getNoThreeDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[45], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "NoThreeD" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetNoThreeDList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetNoThreeDArray,
                this::xsetNoThreeDArray,
                this::insertNewNoThreeD,
                this::removeNoThreeD,
                this::sizeOfNoThreeDArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "NoThreeD" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetNoThreeDArray() {
        return xgetArray(PROPERTY_QNAME[45], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "NoThreeD" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetNoThreeDArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[45], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NoThreeD" element
     */
    @Override
    public int sizeOfNoThreeDArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[45]);
        }
    }

    /**
     * Sets array of all "NoThreeD" element
     */
    @Override
    public void setNoThreeDArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] noThreeDArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(noThreeDArray, PROPERTY_QNAME[45]);
        }
    }

    /**
     * Sets ith "NoThreeD" element
     */
    @Override
    public void setNoThreeDArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[45], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(noThreeD);
        }
    }

    /**
     * Sets (as xml) array of all "NoThreeD" element
     */
    @Override
    public void xsetNoThreeDArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]noThreeDArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(noThreeDArray, PROPERTY_QNAME[45]);
        }
    }

    /**
     * Sets (as xml) ith "NoThreeD" element
     */
    @Override
    public void xsetNoThreeDArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank noThreeD) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[45], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(noThreeD);
        }
    }

    /**
     * Inserts the value as the ith "NoThreeD" element
     */
    @Override
    public void insertNoThreeD(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[45], i);
            target.setEnumValue(noThreeD);
        }
    }

    /**
     * Appends the value as the last "NoThreeD" element
     */
    @Override
    public void addNoThreeD(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum noThreeD) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[45]);
            target.setEnumValue(noThreeD);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NoThreeD" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewNoThreeD(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[45], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NoThreeD" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewNoThreeD() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[45]);
            return target;
        }
    }

    /**
     * Removes the ith "NoThreeD" element
     */
    @Override
    public void removeNoThreeD(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[45], i);
        }
    }

    /**
     * Gets a List of "FirstButton" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getFirstButtonList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFirstButtonArray,
                this::setFirstButtonArray,
                this::insertFirstButton,
                this::removeFirstButton,
                this::sizeOfFirstButtonArray
            );
        }
    }

    /**
     * Gets array of all "FirstButton" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getFirstButtonArray() {
        return getEnumArray(PROPERTY_QNAME[46], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "FirstButton" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getFirstButtonArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[46], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "FirstButton" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetFirstButtonList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFirstButtonArray,
                this::xsetFirstButtonArray,
                this::insertNewFirstButton,
                this::removeFirstButton,
                this::sizeOfFirstButtonArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FirstButton" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetFirstButtonArray() {
        return xgetArray(PROPERTY_QNAME[46], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "FirstButton" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetFirstButtonArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[46], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FirstButton" element
     */
    @Override
    public int sizeOfFirstButtonArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[46]);
        }
    }

    /**
     * Sets array of all "FirstButton" element
     */
    @Override
    public void setFirstButtonArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] firstButtonArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(firstButtonArray, PROPERTY_QNAME[46]);
        }
    }

    /**
     * Sets ith "FirstButton" element
     */
    @Override
    public void setFirstButtonArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum firstButton) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[46], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(firstButton);
        }
    }

    /**
     * Sets (as xml) array of all "FirstButton" element
     */
    @Override
    public void xsetFirstButtonArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]firstButtonArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(firstButtonArray, PROPERTY_QNAME[46]);
        }
    }

    /**
     * Sets (as xml) ith "FirstButton" element
     */
    @Override
    public void xsetFirstButtonArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank firstButton) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[46], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(firstButton);
        }
    }

    /**
     * Inserts the value as the ith "FirstButton" element
     */
    @Override
    public void insertFirstButton(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum firstButton) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[46], i);
            target.setEnumValue(firstButton);
        }
    }

    /**
     * Appends the value as the last "FirstButton" element
     */
    @Override
    public void addFirstButton(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum firstButton) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[46]);
            target.setEnumValue(firstButton);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FirstButton" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewFirstButton(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[46], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FirstButton" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewFirstButton() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[46]);
            return target;
        }
    }

    /**
     * Removes the ith "FirstButton" element
     */
    @Override
    public void removeFirstButton(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[46], i);
        }
    }

    /**
     * Gets a List of "FmlaGroup" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaGroupArray,
                this::setFmlaGroupArray,
                this::insertFmlaGroup,
                this::removeFmlaGroup,
                this::sizeOfFmlaGroupArray
            );
        }
    }

    /**
     * Gets array of all "FmlaGroup" elements
     */
    @Override
    public java.lang.String[] getFmlaGroupArray() {
        return getObjectArray(PROPERTY_QNAME[47], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaGroup" element
     */
    @Override
    public java.lang.String getFmlaGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[47], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaGroup" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaGroupList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaGroupArray,
                this::xsetFmlaGroupArray,
                this::insertNewFmlaGroup,
                this::removeFmlaGroup,
                this::sizeOfFmlaGroupArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaGroup" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaGroupArray() {
        return xgetArray(PROPERTY_QNAME[47], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaGroup" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaGroupArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[47], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaGroup" element
     */
    @Override
    public int sizeOfFmlaGroupArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[47]);
        }
    }

    /**
     * Sets array of all "FmlaGroup" element
     */
    @Override
    public void setFmlaGroupArray(java.lang.String[] fmlaGroupArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaGroupArray, PROPERTY_QNAME[47]);
        }
    }

    /**
     * Sets ith "FmlaGroup" element
     */
    @Override
    public void setFmlaGroupArray(int i, java.lang.String fmlaGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[47], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaGroup);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaGroup" element
     */
    @Override
    public void xsetFmlaGroupArray(org.apache.xmlbeans.XmlString[]fmlaGroupArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaGroupArray, PROPERTY_QNAME[47]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaGroup" element
     */
    @Override
    public void xsetFmlaGroupArray(int i, org.apache.xmlbeans.XmlString fmlaGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[47], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaGroup);
        }
    }

    /**
     * Inserts the value as the ith "FmlaGroup" element
     */
    @Override
    public void insertFmlaGroup(int i, java.lang.String fmlaGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[47], i);
            target.setStringValue(fmlaGroup);
        }
    }

    /**
     * Appends the value as the last "FmlaGroup" element
     */
    @Override
    public void addFmlaGroup(java.lang.String fmlaGroup) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[47]);
            target.setStringValue(fmlaGroup);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaGroup" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[47], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaGroup" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaGroup() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[47]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaGroup" element
     */
    @Override
    public void removeFmlaGroup(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[47], i);
        }
    }

    /**
     * Gets a List of "Val" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getValList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getValArray,
                this::setValArray,
                this::insertVal,
                this::removeVal,
                this::sizeOfValArray
            );
        }
    }

    /**
     * Gets array of all "Val" elements
     */
    @Override
    public java.math.BigInteger[] getValArray() {
        return getObjectArray(PROPERTY_QNAME[48], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Val" element
     */
    @Override
    public java.math.BigInteger getValArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[48], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Val" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetValList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetValArray,
                this::xsetValArray,
                this::insertNewVal,
                this::removeVal,
                this::sizeOfValArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Val" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetValArray() {
        return xgetArray(PROPERTY_QNAME[48], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Val" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetValArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[48], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Val" element
     */
    @Override
    public int sizeOfValArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[48]);
        }
    }

    /**
     * Sets array of all "Val" element
     */
    @Override
    public void setValArray(java.math.BigInteger[] valArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(valArray, PROPERTY_QNAME[48]);
        }
    }

    /**
     * Sets ith "Val" element
     */
    @Override
    public void setValArray(int i, java.math.BigInteger val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[48], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(val);
        }
    }

    /**
     * Sets (as xml) array of all "Val" element
     */
    @Override
    public void xsetValArray(org.apache.xmlbeans.XmlInteger[]valArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(valArray, PROPERTY_QNAME[48]);
        }
    }

    /**
     * Sets (as xml) ith "Val" element
     */
    @Override
    public void xsetValArray(int i, org.apache.xmlbeans.XmlInteger val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[48], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(val);
        }
    }

    /**
     * Inserts the value as the ith "Val" element
     */
    @Override
    public void insertVal(int i, java.math.BigInteger val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[48], i);
            target.setBigIntegerValue(val);
        }
    }

    /**
     * Appends the value as the last "Val" element
     */
    @Override
    public void addVal(java.math.BigInteger val) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[48]);
            target.setBigIntegerValue(val);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Val" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewVal(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[48], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Val" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewVal() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[48]);
            return target;
        }
    }

    /**
     * Removes the ith "Val" element
     */
    @Override
    public void removeVal(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[48], i);
        }
    }

    /**
     * Gets a List of "Min" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getMinList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMinArray,
                this::setMinArray,
                this::insertMin,
                this::removeMin,
                this::sizeOfMinArray
            );
        }
    }

    /**
     * Gets array of all "Min" elements
     */
    @Override
    public java.math.BigInteger[] getMinArray() {
        return getObjectArray(PROPERTY_QNAME[49], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Min" element
     */
    @Override
    public java.math.BigInteger getMinArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[49], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Min" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetMinList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMinArray,
                this::xsetMinArray,
                this::insertNewMin,
                this::removeMin,
                this::sizeOfMinArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Min" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetMinArray() {
        return xgetArray(PROPERTY_QNAME[49], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Min" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetMinArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[49], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Min" element
     */
    @Override
    public int sizeOfMinArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[49]);
        }
    }

    /**
     * Sets array of all "Min" element
     */
    @Override
    public void setMinArray(java.math.BigInteger[] minArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(minArray, PROPERTY_QNAME[49]);
        }
    }

    /**
     * Sets ith "Min" element
     */
    @Override
    public void setMinArray(int i, java.math.BigInteger min) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[49], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(min);
        }
    }

    /**
     * Sets (as xml) array of all "Min" element
     */
    @Override
    public void xsetMinArray(org.apache.xmlbeans.XmlInteger[]minArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(minArray, PROPERTY_QNAME[49]);
        }
    }

    /**
     * Sets (as xml) ith "Min" element
     */
    @Override
    public void xsetMinArray(int i, org.apache.xmlbeans.XmlInteger min) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[49], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(min);
        }
    }

    /**
     * Inserts the value as the ith "Min" element
     */
    @Override
    public void insertMin(int i, java.math.BigInteger min) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[49], i);
            target.setBigIntegerValue(min);
        }
    }

    /**
     * Appends the value as the last "Min" element
     */
    @Override
    public void addMin(java.math.BigInteger min) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[49]);
            target.setBigIntegerValue(min);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Min" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewMin(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[49], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Min" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewMin() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[49]);
            return target;
        }
    }

    /**
     * Removes the ith "Min" element
     */
    @Override
    public void removeMin(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[49], i);
        }
    }

    /**
     * Gets a List of "Max" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getMaxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMaxArray,
                this::setMaxArray,
                this::insertMax,
                this::removeMax,
                this::sizeOfMaxArray
            );
        }
    }

    /**
     * Gets array of all "Max" elements
     */
    @Override
    public java.math.BigInteger[] getMaxArray() {
        return getObjectArray(PROPERTY_QNAME[50], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Max" element
     */
    @Override
    public java.math.BigInteger getMaxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[50], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Max" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetMaxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMaxArray,
                this::xsetMaxArray,
                this::insertNewMax,
                this::removeMax,
                this::sizeOfMaxArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Max" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetMaxArray() {
        return xgetArray(PROPERTY_QNAME[50], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Max" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetMaxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[50], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Max" element
     */
    @Override
    public int sizeOfMaxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[50]);
        }
    }

    /**
     * Sets array of all "Max" element
     */
    @Override
    public void setMaxArray(java.math.BigInteger[] maxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(maxArray, PROPERTY_QNAME[50]);
        }
    }

    /**
     * Sets ith "Max" element
     */
    @Override
    public void setMaxArray(int i, java.math.BigInteger max) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[50], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(max);
        }
    }

    /**
     * Sets (as xml) array of all "Max" element
     */
    @Override
    public void xsetMaxArray(org.apache.xmlbeans.XmlInteger[]maxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(maxArray, PROPERTY_QNAME[50]);
        }
    }

    /**
     * Sets (as xml) ith "Max" element
     */
    @Override
    public void xsetMaxArray(int i, org.apache.xmlbeans.XmlInteger max) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[50], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(max);
        }
    }

    /**
     * Inserts the value as the ith "Max" element
     */
    @Override
    public void insertMax(int i, java.math.BigInteger max) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[50], i);
            target.setBigIntegerValue(max);
        }
    }

    /**
     * Appends the value as the last "Max" element
     */
    @Override
    public void addMax(java.math.BigInteger max) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[50]);
            target.setBigIntegerValue(max);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Max" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewMax(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[50], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Max" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewMax() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[50]);
            return target;
        }
    }

    /**
     * Removes the ith "Max" element
     */
    @Override
    public void removeMax(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[50], i);
        }
    }

    /**
     * Gets a List of "Inc" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getIncList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getIncArray,
                this::setIncArray,
                this::insertInc,
                this::removeInc,
                this::sizeOfIncArray
            );
        }
    }

    /**
     * Gets array of all "Inc" elements
     */
    @Override
    public java.math.BigInteger[] getIncArray() {
        return getObjectArray(PROPERTY_QNAME[51], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Inc" element
     */
    @Override
    public java.math.BigInteger getIncArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[51], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Inc" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetIncList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetIncArray,
                this::xsetIncArray,
                this::insertNewInc,
                this::removeInc,
                this::sizeOfIncArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Inc" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetIncArray() {
        return xgetArray(PROPERTY_QNAME[51], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Inc" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetIncArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[51], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Inc" element
     */
    @Override
    public int sizeOfIncArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[51]);
        }
    }

    /**
     * Sets array of all "Inc" element
     */
    @Override
    public void setIncArray(java.math.BigInteger[] incArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(incArray, PROPERTY_QNAME[51]);
        }
    }

    /**
     * Sets ith "Inc" element
     */
    @Override
    public void setIncArray(int i, java.math.BigInteger inc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[51], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(inc);
        }
    }

    /**
     * Sets (as xml) array of all "Inc" element
     */
    @Override
    public void xsetIncArray(org.apache.xmlbeans.XmlInteger[]incArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(incArray, PROPERTY_QNAME[51]);
        }
    }

    /**
     * Sets (as xml) ith "Inc" element
     */
    @Override
    public void xsetIncArray(int i, org.apache.xmlbeans.XmlInteger inc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[51], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(inc);
        }
    }

    /**
     * Inserts the value as the ith "Inc" element
     */
    @Override
    public void insertInc(int i, java.math.BigInteger inc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[51], i);
            target.setBigIntegerValue(inc);
        }
    }

    /**
     * Appends the value as the last "Inc" element
     */
    @Override
    public void addInc(java.math.BigInteger inc) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[51]);
            target.setBigIntegerValue(inc);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Inc" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewInc(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[51], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Inc" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewInc() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[51]);
            return target;
        }
    }

    /**
     * Removes the ith "Inc" element
     */
    @Override
    public void removeInc(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[51], i);
        }
    }

    /**
     * Gets a List of "Page" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getPageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getPageArray,
                this::setPageArray,
                this::insertPage,
                this::removePage,
                this::sizeOfPageArray
            );
        }
    }

    /**
     * Gets array of all "Page" elements
     */
    @Override
    public java.math.BigInteger[] getPageArray() {
        return getObjectArray(PROPERTY_QNAME[52], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Page" element
     */
    @Override
    public java.math.BigInteger getPageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[52], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Page" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetPageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetPageArray,
                this::xsetPageArray,
                this::insertNewPage,
                this::removePage,
                this::sizeOfPageArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Page" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetPageArray() {
        return xgetArray(PROPERTY_QNAME[52], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Page" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetPageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[52], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Page" element
     */
    @Override
    public int sizeOfPageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[52]);
        }
    }

    /**
     * Sets array of all "Page" element
     */
    @Override
    public void setPageArray(java.math.BigInteger[] pageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(pageArray, PROPERTY_QNAME[52]);
        }
    }

    /**
     * Sets ith "Page" element
     */
    @Override
    public void setPageArray(int i, java.math.BigInteger page) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[52], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(page);
        }
    }

    /**
     * Sets (as xml) array of all "Page" element
     */
    @Override
    public void xsetPageArray(org.apache.xmlbeans.XmlInteger[]pageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(pageArray, PROPERTY_QNAME[52]);
        }
    }

    /**
     * Sets (as xml) ith "Page" element
     */
    @Override
    public void xsetPageArray(int i, org.apache.xmlbeans.XmlInteger page) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[52], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(page);
        }
    }

    /**
     * Inserts the value as the ith "Page" element
     */
    @Override
    public void insertPage(int i, java.math.BigInteger page) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[52], i);
            target.setBigIntegerValue(page);
        }
    }

    /**
     * Appends the value as the last "Page" element
     */
    @Override
    public void addPage(java.math.BigInteger page) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[52]);
            target.setBigIntegerValue(page);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Page" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewPage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[52], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Page" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewPage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[52]);
            return target;
        }
    }

    /**
     * Removes the ith "Page" element
     */
    @Override
    public void removePage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[52], i);
        }
    }

    /**
     * Gets a List of "Horiz" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getHorizList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getHorizArray,
                this::setHorizArray,
                this::insertHoriz,
                this::removeHoriz,
                this::sizeOfHorizArray
            );
        }
    }

    /**
     * Gets array of all "Horiz" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getHorizArray() {
        return getEnumArray(PROPERTY_QNAME[53], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Horiz" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getHorizArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[53], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Horiz" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetHorizList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetHorizArray,
                this::xsetHorizArray,
                this::insertNewHoriz,
                this::removeHoriz,
                this::sizeOfHorizArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Horiz" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetHorizArray() {
        return xgetArray(PROPERTY_QNAME[53], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Horiz" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetHorizArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[53], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Horiz" element
     */
    @Override
    public int sizeOfHorizArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[53]);
        }
    }

    /**
     * Sets array of all "Horiz" element
     */
    @Override
    public void setHorizArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] horizArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(horizArray, PROPERTY_QNAME[53]);
        }
    }

    /**
     * Sets ith "Horiz" element
     */
    @Override
    public void setHorizArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum horiz) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[53], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(horiz);
        }
    }

    /**
     * Sets (as xml) array of all "Horiz" element
     */
    @Override
    public void xsetHorizArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]horizArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(horizArray, PROPERTY_QNAME[53]);
        }
    }

    /**
     * Sets (as xml) ith "Horiz" element
     */
    @Override
    public void xsetHorizArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank horiz) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[53], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(horiz);
        }
    }

    /**
     * Inserts the value as the ith "Horiz" element
     */
    @Override
    public void insertHoriz(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum horiz) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[53], i);
            target.setEnumValue(horiz);
        }
    }

    /**
     * Appends the value as the last "Horiz" element
     */
    @Override
    public void addHoriz(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum horiz) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[53]);
            target.setEnumValue(horiz);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Horiz" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewHoriz(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[53], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Horiz" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewHoriz() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[53]);
            return target;
        }
    }

    /**
     * Removes the ith "Horiz" element
     */
    @Override
    public void removeHoriz(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[53], i);
        }
    }

    /**
     * Gets a List of "Dx" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getDxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDxArray,
                this::setDxArray,
                this::insertDx,
                this::removeDx,
                this::sizeOfDxArray
            );
        }
    }

    /**
     * Gets array of all "Dx" elements
     */
    @Override
    public java.math.BigInteger[] getDxArray() {
        return getObjectArray(PROPERTY_QNAME[54], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "Dx" element
     */
    @Override
    public java.math.BigInteger getDxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[54], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "Dx" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetDxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDxArray,
                this::xsetDxArray,
                this::insertNewDx,
                this::removeDx,
                this::sizeOfDxArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Dx" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInteger[] xgetDxArray() {
        return xgetArray(PROPERTY_QNAME[54], org.apache.xmlbeans.XmlInteger[]::new);
    }

    /**
     * Gets (as xml) ith "Dx" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger xgetDxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[54], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Dx" element
     */
    @Override
    public int sizeOfDxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[54]);
        }
    }

    /**
     * Sets array of all "Dx" element
     */
    @Override
    public void setDxArray(java.math.BigInteger[] dxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dxArray, PROPERTY_QNAME[54]);
        }
    }

    /**
     * Sets ith "Dx" element
     */
    @Override
    public void setDxArray(int i, java.math.BigInteger dx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[54], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(dx);
        }
    }

    /**
     * Sets (as xml) array of all "Dx" element
     */
    @Override
    public void xsetDxArray(org.apache.xmlbeans.XmlInteger[]dxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dxArray, PROPERTY_QNAME[54]);
        }
    }

    /**
     * Sets (as xml) ith "Dx" element
     */
    @Override
    public void xsetDxArray(int i, org.apache.xmlbeans.XmlInteger dx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PROPERTY_QNAME[54], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dx);
        }
    }

    /**
     * Inserts the value as the ith "Dx" element
     */
    @Override
    public void insertDx(int i, java.math.BigInteger dx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[54], i);
            target.setBigIntegerValue(dx);
        }
    }

    /**
     * Appends the value as the last "Dx" element
     */
    @Override
    public void addDx(java.math.BigInteger dx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[54]);
            target.setBigIntegerValue(dx);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dx" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger insertNewDx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(PROPERTY_QNAME[54], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Dx" element
     */
    @Override
    public org.apache.xmlbeans.XmlInteger addNewDx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PROPERTY_QNAME[54]);
            return target;
        }
    }

    /**
     * Removes the ith "Dx" element
     */
    @Override
    public void removeDx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[54], i);
        }
    }

    /**
     * Gets a List of "MapOCX" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getMapOCXList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getMapOCXArray,
                this::setMapOCXArray,
                this::insertMapOCX,
                this::removeMapOCX,
                this::sizeOfMapOCXArray
            );
        }
    }

    /**
     * Gets array of all "MapOCX" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getMapOCXArray() {
        return getEnumArray(PROPERTY_QNAME[55], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "MapOCX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getMapOCXArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[55], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "MapOCX" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetMapOCXList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetMapOCXArray,
                this::xsetMapOCXArray,
                this::insertNewMapOCX,
                this::removeMapOCX,
                this::sizeOfMapOCXArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "MapOCX" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetMapOCXArray() {
        return xgetArray(PROPERTY_QNAME[55], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "MapOCX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetMapOCXArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[55], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "MapOCX" element
     */
    @Override
    public int sizeOfMapOCXArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[55]);
        }
    }

    /**
     * Sets array of all "MapOCX" element
     */
    @Override
    public void setMapOCXArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] mapOCXArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(mapOCXArray, PROPERTY_QNAME[55]);
        }
    }

    /**
     * Sets ith "MapOCX" element
     */
    @Override
    public void setMapOCXArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum mapOCX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[55], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(mapOCX);
        }
    }

    /**
     * Sets (as xml) array of all "MapOCX" element
     */
    @Override
    public void xsetMapOCXArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]mapOCXArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(mapOCXArray, PROPERTY_QNAME[55]);
        }
    }

    /**
     * Sets (as xml) ith "MapOCX" element
     */
    @Override
    public void xsetMapOCXArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank mapOCX) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[55], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapOCX);
        }
    }

    /**
     * Inserts the value as the ith "MapOCX" element
     */
    @Override
    public void insertMapOCX(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum mapOCX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[55], i);
            target.setEnumValue(mapOCX);
        }
    }

    /**
     * Appends the value as the last "MapOCX" element
     */
    @Override
    public void addMapOCX(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum mapOCX) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[55]);
            target.setEnumValue(mapOCX);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MapOCX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewMapOCX(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[55], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "MapOCX" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewMapOCX() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[55]);
            return target;
        }
    }

    /**
     * Removes the ith "MapOCX" element
     */
    @Override
    public void removeMapOCX(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[55], i);
        }
    }

    /**
     * Gets a List of "CF" elements
     */
    @Override
    public java.util.List<java.lang.String> getCFList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCFArray,
                this::setCFArray,
                this::insertCF,
                this::removeCF,
                this::sizeOfCFArray
            );
        }
    }

    /**
     * Gets array of all "CF" elements
     */
    @Override
    public java.lang.String[] getCFArray() {
        return getObjectArray(PROPERTY_QNAME[56], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "CF" element
     */
    @Override
    public java.lang.String getCFArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[56], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "CF" elements
     */
    @Override
    public java.util.List<com.microsoft.schemas.office.excel.STCF> xgetCFList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCFArray,
                this::xsetCFArray,
                this::insertNewCF,
                this::removeCF,
                this::sizeOfCFArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "CF" elements
     */
    @Override
    public com.microsoft.schemas.office.excel.STCF[] xgetCFArray() {
        return xgetArray(PROPERTY_QNAME[56], com.microsoft.schemas.office.excel.STCF[]::new);
    }

    /**
     * Gets (as xml) ith "CF" element
     */
    @Override
    public com.microsoft.schemas.office.excel.STCF xgetCFArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STCF target = null;
            target = (com.microsoft.schemas.office.excel.STCF)get_store().find_element_user(PROPERTY_QNAME[56], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CF" element
     */
    @Override
    public int sizeOfCFArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[56]);
        }
    }

    /**
     * Sets array of all "CF" element
     */
    @Override
    public void setCFArray(java.lang.String[] cfArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cfArray, PROPERTY_QNAME[56]);
        }
    }

    /**
     * Sets ith "CF" element
     */
    @Override
    public void setCFArray(int i, java.lang.String cf) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[56], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(cf);
        }
    }

    /**
     * Sets (as xml) array of all "CF" element
     */
    @Override
    public void xsetCFArray(com.microsoft.schemas.office.excel.STCF[]cfArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cfArray, PROPERTY_QNAME[56]);
        }
    }

    /**
     * Sets (as xml) ith "CF" element
     */
    @Override
    public void xsetCFArray(int i, com.microsoft.schemas.office.excel.STCF cf) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STCF target = null;
            target = (com.microsoft.schemas.office.excel.STCF)get_store().find_element_user(PROPERTY_QNAME[56], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(cf);
        }
    }

    /**
     * Inserts the value as the ith "CF" element
     */
    @Override
    public void insertCF(int i, java.lang.String cf) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[56], i);
            target.setStringValue(cf);
        }
    }

    /**
     * Appends the value as the last "CF" element
     */
    @Override
    public void addCF(java.lang.String cf) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[56]);
            target.setStringValue(cf);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CF" element
     */
    @Override
    public com.microsoft.schemas.office.excel.STCF insertNewCF(int i) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STCF target = null;
            target = (com.microsoft.schemas.office.excel.STCF)get_store().insert_element_user(PROPERTY_QNAME[56], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CF" element
     */
    @Override
    public com.microsoft.schemas.office.excel.STCF addNewCF() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STCF target = null;
            target = (com.microsoft.schemas.office.excel.STCF)get_store().add_element_user(PROPERTY_QNAME[56]);
            return target;
        }
    }

    /**
     * Removes the ith "CF" element
     */
    @Override
    public void removeCF(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[56], i);
        }
    }

    /**
     * Gets a List of "Camera" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getCameraList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCameraArray,
                this::setCameraArray,
                this::insertCamera,
                this::removeCamera,
                this::sizeOfCameraArray
            );
        }
    }

    /**
     * Gets array of all "Camera" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getCameraArray() {
        return getEnumArray(PROPERTY_QNAME[57], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "Camera" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getCameraArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[57], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "Camera" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetCameraList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCameraArray,
                this::xsetCameraArray,
                this::insertNewCamera,
                this::removeCamera,
                this::sizeOfCameraArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Camera" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetCameraArray() {
        return xgetArray(PROPERTY_QNAME[57], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "Camera" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetCameraArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[57], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Camera" element
     */
    @Override
    public int sizeOfCameraArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[57]);
        }
    }

    /**
     * Sets array of all "Camera" element
     */
    @Override
    public void setCameraArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] cameraArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cameraArray, PROPERTY_QNAME[57]);
        }
    }

    /**
     * Sets ith "Camera" element
     */
    @Override
    public void setCameraArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum camera) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[57], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(camera);
        }
    }

    /**
     * Sets (as xml) array of all "Camera" element
     */
    @Override
    public void xsetCameraArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]cameraArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cameraArray, PROPERTY_QNAME[57]);
        }
    }

    /**
     * Sets (as xml) ith "Camera" element
     */
    @Override
    public void xsetCameraArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank camera) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[57], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(camera);
        }
    }

    /**
     * Inserts the value as the ith "Camera" element
     */
    @Override
    public void insertCamera(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum camera) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[57], i);
            target.setEnumValue(camera);
        }
    }

    /**
     * Appends the value as the last "Camera" element
     */
    @Override
    public void addCamera(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum camera) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[57]);
            target.setEnumValue(camera);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Camera" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewCamera(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[57], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Camera" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewCamera() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[57]);
            return target;
        }
    }

    /**
     * Removes the ith "Camera" element
     */
    @Override
    public void removeCamera(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[57], i);
        }
    }

    /**
     * Gets a List of "RecalcAlways" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getRecalcAlwaysList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getRecalcAlwaysArray,
                this::setRecalcAlwaysArray,
                this::insertRecalcAlways,
                this::removeRecalcAlways,
                this::sizeOfRecalcAlwaysArray
            );
        }
    }

    /**
     * Gets array of all "RecalcAlways" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getRecalcAlwaysArray() {
        return getEnumArray(PROPERTY_QNAME[58], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "RecalcAlways" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getRecalcAlwaysArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[58], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "RecalcAlways" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetRecalcAlwaysList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetRecalcAlwaysArray,
                this::xsetRecalcAlwaysArray,
                this::insertNewRecalcAlways,
                this::removeRecalcAlways,
                this::sizeOfRecalcAlwaysArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "RecalcAlways" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetRecalcAlwaysArray() {
        return xgetArray(PROPERTY_QNAME[58], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "RecalcAlways" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetRecalcAlwaysArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[58], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RecalcAlways" element
     */
    @Override
    public int sizeOfRecalcAlwaysArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[58]);
        }
    }

    /**
     * Sets array of all "RecalcAlways" element
     */
    @Override
    public void setRecalcAlwaysArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] recalcAlwaysArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(recalcAlwaysArray, PROPERTY_QNAME[58]);
        }
    }

    /**
     * Sets ith "RecalcAlways" element
     */
    @Override
    public void setRecalcAlwaysArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum recalcAlways) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[58], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(recalcAlways);
        }
    }

    /**
     * Sets (as xml) array of all "RecalcAlways" element
     */
    @Override
    public void xsetRecalcAlwaysArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]recalcAlwaysArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(recalcAlwaysArray, PROPERTY_QNAME[58]);
        }
    }

    /**
     * Sets (as xml) ith "RecalcAlways" element
     */
    @Override
    public void xsetRecalcAlwaysArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank recalcAlways) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[58], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(recalcAlways);
        }
    }

    /**
     * Inserts the value as the ith "RecalcAlways" element
     */
    @Override
    public void insertRecalcAlways(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum recalcAlways) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[58], i);
            target.setEnumValue(recalcAlways);
        }
    }

    /**
     * Appends the value as the last "RecalcAlways" element
     */
    @Override
    public void addRecalcAlways(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum recalcAlways) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[58]);
            target.setEnumValue(recalcAlways);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RecalcAlways" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewRecalcAlways(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[58], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RecalcAlways" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewRecalcAlways() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[58]);
            return target;
        }
    }

    /**
     * Removes the ith "RecalcAlways" element
     */
    @Override
    public void removeRecalcAlways(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[58], i);
        }
    }

    /**
     * Gets a List of "AutoScale" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getAutoScaleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getAutoScaleArray,
                this::setAutoScaleArray,
                this::insertAutoScale,
                this::removeAutoScale,
                this::sizeOfAutoScaleArray
            );
        }
    }

    /**
     * Gets array of all "AutoScale" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getAutoScaleArray() {
        return getEnumArray(PROPERTY_QNAME[59], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "AutoScale" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getAutoScaleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[59], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "AutoScale" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetAutoScaleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetAutoScaleArray,
                this::xsetAutoScaleArray,
                this::insertNewAutoScale,
                this::removeAutoScale,
                this::sizeOfAutoScaleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "AutoScale" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetAutoScaleArray() {
        return xgetArray(PROPERTY_QNAME[59], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "AutoScale" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetAutoScaleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[59], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "AutoScale" element
     */
    @Override
    public int sizeOfAutoScaleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[59]);
        }
    }

    /**
     * Sets array of all "AutoScale" element
     */
    @Override
    public void setAutoScaleArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] autoScaleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoScaleArray, PROPERTY_QNAME[59]);
        }
    }

    /**
     * Sets ith "AutoScale" element
     */
    @Override
    public void setAutoScaleArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoScale) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[59], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(autoScale);
        }
    }

    /**
     * Sets (as xml) array of all "AutoScale" element
     */
    @Override
    public void xsetAutoScaleArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]autoScaleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(autoScaleArray, PROPERTY_QNAME[59]);
        }
    }

    /**
     * Sets (as xml) ith "AutoScale" element
     */
    @Override
    public void xsetAutoScaleArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank autoScale) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[59], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(autoScale);
        }
    }

    /**
     * Inserts the value as the ith "AutoScale" element
     */
    @Override
    public void insertAutoScale(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoScale) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[59], i);
            target.setEnumValue(autoScale);
        }
    }

    /**
     * Appends the value as the last "AutoScale" element
     */
    @Override
    public void addAutoScale(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum autoScale) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[59]);
            target.setEnumValue(autoScale);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "AutoScale" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewAutoScale(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[59], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "AutoScale" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewAutoScale() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[59]);
            return target;
        }
    }

    /**
     * Removes the ith "AutoScale" element
     */
    @Override
    public void removeAutoScale(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[59], i);
        }
    }

    /**
     * Gets a List of "DDE" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getDDEList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDDEArray,
                this::setDDEArray,
                this::insertDDE,
                this::removeDDE,
                this::sizeOfDDEArray
            );
        }
    }

    /**
     * Gets array of all "DDE" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getDDEArray() {
        return getEnumArray(PROPERTY_QNAME[60], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "DDE" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getDDEArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[60], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "DDE" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetDDEList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDDEArray,
                this::xsetDDEArray,
                this::insertNewDDE,
                this::removeDDE,
                this::sizeOfDDEArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "DDE" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetDDEArray() {
        return xgetArray(PROPERTY_QNAME[60], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "DDE" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetDDEArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[60], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "DDE" element
     */
    @Override
    public int sizeOfDDEArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[60]);
        }
    }

    /**
     * Sets array of all "DDE" element
     */
    @Override
    public void setDDEArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] ddeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ddeArray, PROPERTY_QNAME[60]);
        }
    }

    /**
     * Sets ith "DDE" element
     */
    @Override
    public void setDDEArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dde) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[60], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(dde);
        }
    }

    /**
     * Sets (as xml) array of all "DDE" element
     */
    @Override
    public void xsetDDEArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]ddeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ddeArray, PROPERTY_QNAME[60]);
        }
    }

    /**
     * Sets (as xml) ith "DDE" element
     */
    @Override
    public void xsetDDEArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank dde) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[60], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(dde);
        }
    }

    /**
     * Inserts the value as the ith "DDE" element
     */
    @Override
    public void insertDDE(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dde) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[60], i);
            target.setEnumValue(dde);
        }
    }

    /**
     * Appends the value as the last "DDE" element
     */
    @Override
    public void addDDE(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum dde) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[60]);
            target.setEnumValue(dde);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "DDE" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewDDE(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[60], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "DDE" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewDDE() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[60]);
            return target;
        }
    }

    /**
     * Removes the ith "DDE" element
     */
    @Override
    public void removeDDE(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[60], i);
        }
    }

    /**
     * Gets a List of "UIObj" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum> getUIObjList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUIObjArray,
                this::setUIObjArray,
                this::insertUIObj,
                this::removeUIObj,
                this::sizeOfUIObjArray
            );
        }
    }

    /**
     * Gets array of all "UIObj" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] getUIObjArray() {
        return getEnumArray(PROPERTY_QNAME[61], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[]::new);
    }

    /**
     * Gets ith "UIObj" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum getUIObjArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[61], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) a List of "UIObj" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank> xgetUIObjList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUIObjArray,
                this::xsetUIObjArray,
                this::insertNewUIObj,
                this::removeUIObj,
                this::sizeOfUIObjArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "UIObj" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[] xgetUIObjArray() {
        return xgetArray(PROPERTY_QNAME[61], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]::new);
    }

    /**
     * Gets (as xml) ith "UIObj" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank xgetUIObjArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[61], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UIObj" element
     */
    @Override
    public int sizeOfUIObjArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[61]);
        }
    }

    /**
     * Sets array of all "UIObj" element
     */
    @Override
    public void setUIObjArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum[] uiObjArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(uiObjArray, PROPERTY_QNAME[61]);
        }
    }

    /**
     * Sets ith "UIObj" element
     */
    @Override
    public void setUIObjArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum uiObj) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[61], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(uiObj);
        }
    }

    /**
     * Sets (as xml) array of all "UIObj" element
     */
    @Override
    public void xsetUIObjArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank[]uiObjArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(uiObjArray, PROPERTY_QNAME[61]);
        }
    }

    /**
     * Sets (as xml) ith "UIObj" element
     */
    @Override
    public void xsetUIObjArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank uiObj) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().find_element_user(PROPERTY_QNAME[61], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(uiObj);
        }
    }

    /**
     * Inserts the value as the ith "UIObj" element
     */
    @Override
    public void insertUIObj(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum uiObj) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[61], i);
            target.setEnumValue(uiObj);
        }
    }

    /**
     * Appends the value as the last "UIObj" element
     */
    @Override
    public void addUIObj(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank.Enum uiObj) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[61]);
            target.setEnumValue(uiObj);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UIObj" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank insertNewUIObj(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().insert_element_user(PROPERTY_QNAME[61], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UIObj" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank addNewUIObj() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STTrueFalseBlank)get_store().add_element_user(PROPERTY_QNAME[61]);
            return target;
        }
    }

    /**
     * Removes the ith "UIObj" element
     */
    @Override
    public void removeUIObj(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[61], i);
        }
    }

    /**
     * Gets a List of "ScriptText" elements
     */
    @Override
    public java.util.List<java.lang.String> getScriptTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getScriptTextArray,
                this::setScriptTextArray,
                this::insertScriptText,
                this::removeScriptText,
                this::sizeOfScriptTextArray
            );
        }
    }

    /**
     * Gets array of all "ScriptText" elements
     */
    @Override
    public java.lang.String[] getScriptTextArray() {
        return getObjectArray(PROPERTY_QNAME[62], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ScriptText" element
     */
    @Override
    public java.lang.String getScriptTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[62], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "ScriptText" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetScriptTextList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetScriptTextArray,
                this::xsetScriptTextArray,
                this::insertNewScriptText,
                this::removeScriptText,
                this::sizeOfScriptTextArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ScriptText" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetScriptTextArray() {
        return xgetArray(PROPERTY_QNAME[62], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "ScriptText" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetScriptTextArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[62], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ScriptText" element
     */
    @Override
    public int sizeOfScriptTextArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[62]);
        }
    }

    /**
     * Sets array of all "ScriptText" element
     */
    @Override
    public void setScriptTextArray(java.lang.String[] scriptTextArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptTextArray, PROPERTY_QNAME[62]);
        }
    }

    /**
     * Sets ith "ScriptText" element
     */
    @Override
    public void setScriptTextArray(int i, java.lang.String scriptText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[62], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(scriptText);
        }
    }

    /**
     * Sets (as xml) array of all "ScriptText" element
     */
    @Override
    public void xsetScriptTextArray(org.apache.xmlbeans.XmlString[]scriptTextArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptTextArray, PROPERTY_QNAME[62]);
        }
    }

    /**
     * Sets (as xml) ith "ScriptText" element
     */
    @Override
    public void xsetScriptTextArray(int i, org.apache.xmlbeans.XmlString scriptText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[62], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(scriptText);
        }
    }

    /**
     * Inserts the value as the ith "ScriptText" element
     */
    @Override
    public void insertScriptText(int i, java.lang.String scriptText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[62], i);
            target.setStringValue(scriptText);
        }
    }

    /**
     * Appends the value as the last "ScriptText" element
     */
    @Override
    public void addScriptText(java.lang.String scriptText) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[62]);
            target.setStringValue(scriptText);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScriptText" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewScriptText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[62], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ScriptText" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewScriptText() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[62]);
            return target;
        }
    }

    /**
     * Removes the ith "ScriptText" element
     */
    @Override
    public void removeScriptText(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[62], i);
        }
    }

    /**
     * Gets a List of "ScriptExtended" elements
     */
    @Override
    public java.util.List<java.lang.String> getScriptExtendedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getScriptExtendedArray,
                this::setScriptExtendedArray,
                this::insertScriptExtended,
                this::removeScriptExtended,
                this::sizeOfScriptExtendedArray
            );
        }
    }

    /**
     * Gets array of all "ScriptExtended" elements
     */
    @Override
    public java.lang.String[] getScriptExtendedArray() {
        return getObjectArray(PROPERTY_QNAME[63], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ScriptExtended" element
     */
    @Override
    public java.lang.String getScriptExtendedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[63], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "ScriptExtended" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetScriptExtendedList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetScriptExtendedArray,
                this::xsetScriptExtendedArray,
                this::insertNewScriptExtended,
                this::removeScriptExtended,
                this::sizeOfScriptExtendedArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ScriptExtended" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetScriptExtendedArray() {
        return xgetArray(PROPERTY_QNAME[63], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "ScriptExtended" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetScriptExtendedArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[63], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ScriptExtended" element
     */
    @Override
    public int sizeOfScriptExtendedArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[63]);
        }
    }

    /**
     * Sets array of all "ScriptExtended" element
     */
    @Override
    public void setScriptExtendedArray(java.lang.String[] scriptExtendedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptExtendedArray, PROPERTY_QNAME[63]);
        }
    }

    /**
     * Sets ith "ScriptExtended" element
     */
    @Override
    public void setScriptExtendedArray(int i, java.lang.String scriptExtended) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[63], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(scriptExtended);
        }
    }

    /**
     * Sets (as xml) array of all "ScriptExtended" element
     */
    @Override
    public void xsetScriptExtendedArray(org.apache.xmlbeans.XmlString[]scriptExtendedArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptExtendedArray, PROPERTY_QNAME[63]);
        }
    }

    /**
     * Sets (as xml) ith "ScriptExtended" element
     */
    @Override
    public void xsetScriptExtendedArray(int i, org.apache.xmlbeans.XmlString scriptExtended) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[63], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(scriptExtended);
        }
    }

    /**
     * Inserts the value as the ith "ScriptExtended" element
     */
    @Override
    public void insertScriptExtended(int i, java.lang.String scriptExtended) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[63], i);
            target.setStringValue(scriptExtended);
        }
    }

    /**
     * Appends the value as the last "ScriptExtended" element
     */
    @Override
    public void addScriptExtended(java.lang.String scriptExtended) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[63]);
            target.setStringValue(scriptExtended);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScriptExtended" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewScriptExtended(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[63], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ScriptExtended" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewScriptExtended() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[63]);
            return target;
        }
    }

    /**
     * Removes the ith "ScriptExtended" element
     */
    @Override
    public void removeScriptExtended(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[63], i);
        }
    }

    /**
     * Gets a List of "ScriptLanguage" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getScriptLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getScriptLanguageArray,
                this::setScriptLanguageArray,
                this::insertScriptLanguage,
                this::removeScriptLanguage,
                this::sizeOfScriptLanguageArray
            );
        }
    }

    /**
     * Gets array of all "ScriptLanguage" elements
     */
    @Override
    public java.math.BigInteger[] getScriptLanguageArray() {
        return getObjectArray(PROPERTY_QNAME[64], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "ScriptLanguage" element
     */
    @Override
    public java.math.BigInteger getScriptLanguageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[64], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "ScriptLanguage" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlNonNegativeInteger> xgetScriptLanguageList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetScriptLanguageArray,
                this::xsetScriptLanguageArray,
                this::insertNewScriptLanguage,
                this::removeScriptLanguage,
                this::sizeOfScriptLanguageArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ScriptLanguage" elements
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger[] xgetScriptLanguageArray() {
        return xgetArray(PROPERTY_QNAME[64], org.apache.xmlbeans.XmlNonNegativeInteger[]::new);
    }

    /**
     * Gets (as xml) ith "ScriptLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetScriptLanguageArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PROPERTY_QNAME[64], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ScriptLanguage" element
     */
    @Override
    public int sizeOfScriptLanguageArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[64]);
        }
    }

    /**
     * Sets array of all "ScriptLanguage" element
     */
    @Override
    public void setScriptLanguageArray(java.math.BigInteger[] scriptLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptLanguageArray, PROPERTY_QNAME[64]);
        }
    }

    /**
     * Sets ith "ScriptLanguage" element
     */
    @Override
    public void setScriptLanguageArray(int i, java.math.BigInteger scriptLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[64], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(scriptLanguage);
        }
    }

    /**
     * Sets (as xml) array of all "ScriptLanguage" element
     */
    @Override
    public void xsetScriptLanguageArray(org.apache.xmlbeans.XmlNonNegativeInteger[]scriptLanguageArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptLanguageArray, PROPERTY_QNAME[64]);
        }
    }

    /**
     * Sets (as xml) ith "ScriptLanguage" element
     */
    @Override
    public void xsetScriptLanguageArray(int i, org.apache.xmlbeans.XmlNonNegativeInteger scriptLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PROPERTY_QNAME[64], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(scriptLanguage);
        }
    }

    /**
     * Inserts the value as the ith "ScriptLanguage" element
     */
    @Override
    public void insertScriptLanguage(int i, java.math.BigInteger scriptLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[64], i);
            target.setBigIntegerValue(scriptLanguage);
        }
    }

    /**
     * Appends the value as the last "ScriptLanguage" element
     */
    @Override
    public void addScriptLanguage(java.math.BigInteger scriptLanguage) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[64]);
            target.setBigIntegerValue(scriptLanguage);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScriptLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger insertNewScriptLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().insert_element_user(PROPERTY_QNAME[64], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ScriptLanguage" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger addNewScriptLanguage() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(PROPERTY_QNAME[64]);
            return target;
        }
    }

    /**
     * Removes the ith "ScriptLanguage" element
     */
    @Override
    public void removeScriptLanguage(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[64], i);
        }
    }

    /**
     * Gets a List of "ScriptLocation" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getScriptLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getScriptLocationArray,
                this::setScriptLocationArray,
                this::insertScriptLocation,
                this::removeScriptLocation,
                this::sizeOfScriptLocationArray
            );
        }
    }

    /**
     * Gets array of all "ScriptLocation" elements
     */
    @Override
    public java.math.BigInteger[] getScriptLocationArray() {
        return getObjectArray(PROPERTY_QNAME[65], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "ScriptLocation" element
     */
    @Override
    public java.math.BigInteger getScriptLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[65], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "ScriptLocation" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlNonNegativeInteger> xgetScriptLocationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetScriptLocationArray,
                this::xsetScriptLocationArray,
                this::insertNewScriptLocation,
                this::removeScriptLocation,
                this::sizeOfScriptLocationArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ScriptLocation" elements
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger[] xgetScriptLocationArray() {
        return xgetArray(PROPERTY_QNAME[65], org.apache.xmlbeans.XmlNonNegativeInteger[]::new);
    }

    /**
     * Gets (as xml) ith "ScriptLocation" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetScriptLocationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PROPERTY_QNAME[65], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ScriptLocation" element
     */
    @Override
    public int sizeOfScriptLocationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[65]);
        }
    }

    /**
     * Sets array of all "ScriptLocation" element
     */
    @Override
    public void setScriptLocationArray(java.math.BigInteger[] scriptLocationArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptLocationArray, PROPERTY_QNAME[65]);
        }
    }

    /**
     * Sets ith "ScriptLocation" element
     */
    @Override
    public void setScriptLocationArray(int i, java.math.BigInteger scriptLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[65], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(scriptLocation);
        }
    }

    /**
     * Sets (as xml) array of all "ScriptLocation" element
     */
    @Override
    public void xsetScriptLocationArray(org.apache.xmlbeans.XmlNonNegativeInteger[]scriptLocationArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(scriptLocationArray, PROPERTY_QNAME[65]);
        }
    }

    /**
     * Sets (as xml) ith "ScriptLocation" element
     */
    @Override
    public void xsetScriptLocationArray(int i, org.apache.xmlbeans.XmlNonNegativeInteger scriptLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PROPERTY_QNAME[65], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(scriptLocation);
        }
    }

    /**
     * Inserts the value as the ith "ScriptLocation" element
     */
    @Override
    public void insertScriptLocation(int i, java.math.BigInteger scriptLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[65], i);
            target.setBigIntegerValue(scriptLocation);
        }
    }

    /**
     * Appends the value as the last "ScriptLocation" element
     */
    @Override
    public void addScriptLocation(java.math.BigInteger scriptLocation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[65]);
            target.setBigIntegerValue(scriptLocation);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScriptLocation" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger insertNewScriptLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().insert_element_user(PROPERTY_QNAME[65], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ScriptLocation" element
     */
    @Override
    public org.apache.xmlbeans.XmlNonNegativeInteger addNewScriptLocation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(PROPERTY_QNAME[65]);
            return target;
        }
    }

    /**
     * Removes the ith "ScriptLocation" element
     */
    @Override
    public void removeScriptLocation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[65], i);
        }
    }

    /**
     * Gets a List of "FmlaTxbx" elements
     */
    @Override
    public java.util.List<java.lang.String> getFmlaTxbxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFmlaTxbxArray,
                this::setFmlaTxbxArray,
                this::insertFmlaTxbx,
                this::removeFmlaTxbx,
                this::sizeOfFmlaTxbxArray
            );
        }
    }

    /**
     * Gets array of all "FmlaTxbx" elements
     */
    @Override
    public java.lang.String[] getFmlaTxbxArray() {
        return getObjectArray(PROPERTY_QNAME[66], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "FmlaTxbx" element
     */
    @Override
    public java.lang.String getFmlaTxbxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[66], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "FmlaTxbx" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetFmlaTxbxList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFmlaTxbxArray,
                this::xsetFmlaTxbxArray,
                this::insertNewFmlaTxbx,
                this::removeFmlaTxbx,
                this::sizeOfFmlaTxbxArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "FmlaTxbx" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetFmlaTxbxArray() {
        return xgetArray(PROPERTY_QNAME[66], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "FmlaTxbx" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetFmlaTxbxArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[66], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "FmlaTxbx" element
     */
    @Override
    public int sizeOfFmlaTxbxArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[66]);
        }
    }

    /**
     * Sets array of all "FmlaTxbx" element
     */
    @Override
    public void setFmlaTxbxArray(java.lang.String[] fmlaTxbxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaTxbxArray, PROPERTY_QNAME[66]);
        }
    }

    /**
     * Sets ith "FmlaTxbx" element
     */
    @Override
    public void setFmlaTxbxArray(int i, java.lang.String fmlaTxbx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[66], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fmlaTxbx);
        }
    }

    /**
     * Sets (as xml) array of all "FmlaTxbx" element
     */
    @Override
    public void xsetFmlaTxbxArray(org.apache.xmlbeans.XmlString[]fmlaTxbxArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(fmlaTxbxArray, PROPERTY_QNAME[66]);
        }
    }

    /**
     * Sets (as xml) ith "FmlaTxbx" element
     */
    @Override
    public void xsetFmlaTxbxArray(int i, org.apache.xmlbeans.XmlString fmlaTxbx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[66], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(fmlaTxbx);
        }
    }

    /**
     * Inserts the value as the ith "FmlaTxbx" element
     */
    @Override
    public void insertFmlaTxbx(int i, java.lang.String fmlaTxbx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[66], i);
            target.setStringValue(fmlaTxbx);
        }
    }

    /**
     * Appends the value as the last "FmlaTxbx" element
     */
    @Override
    public void addFmlaTxbx(java.lang.String fmlaTxbx) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[66]);
            target.setStringValue(fmlaTxbx);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "FmlaTxbx" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewFmlaTxbx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[66], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "FmlaTxbx" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewFmlaTxbx() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[66]);
            return target;
        }
    }

    /**
     * Removes the ith "FmlaTxbx" element
     */
    @Override
    public void removeFmlaTxbx(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[66], i);
        }
    }

    /**
     * Gets the "ObjectType" attribute
     */
    @Override
    public com.microsoft.schemas.office.excel.STObjectType.Enum getObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            return (target == null) ? null : (com.microsoft.schemas.office.excel.STObjectType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "ObjectType" attribute
     */
    @Override
    public com.microsoft.schemas.office.excel.STObjectType xgetObjectType() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STObjectType target = null;
            target = (com.microsoft.schemas.office.excel.STObjectType)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            return target;
        }
    }

    /**
     * Sets the "ObjectType" attribute
     */
    @Override
    public void setObjectType(com.microsoft.schemas.office.excel.STObjectType.Enum objectType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[67]);
            }
            target.setEnumValue(objectType);
        }
    }

    /**
     * Sets (as xml) the "ObjectType" attribute
     */
    @Override
    public void xsetObjectType(com.microsoft.schemas.office.excel.STObjectType objectType) {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.office.excel.STObjectType target = null;
            target = (com.microsoft.schemas.office.excel.STObjectType)get_store().find_attribute_user(PROPERTY_QNAME[67]);
            if (target == null) {
                target = (com.microsoft.schemas.office.excel.STObjectType)get_store().add_attribute_user(PROPERTY_QNAME[67]);
            }
            target.set(objectType);
        }
    }
}
