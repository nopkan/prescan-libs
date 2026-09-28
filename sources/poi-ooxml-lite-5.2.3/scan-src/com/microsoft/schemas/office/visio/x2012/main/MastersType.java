/*
 * XML Type:  Masters_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.MastersType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Masters_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface MastersType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.MastersType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "masterstypeaebatype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "Master" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.MasterType> getMasterList();

    /**
     * Gets array of all "Master" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterType[] getMasterArray();

    /**
     * Gets ith "Master" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterType getMasterArray(int i);

    /**
     * Returns number of "Master" element
     */
    int sizeOfMasterArray();

    /**
     * Sets array of all "Master" element
     */
    void setMasterArray(com.microsoft.schemas.office.visio.x2012.main.MasterType[] masterArray);

    /**
     * Sets ith "Master" element
     */
    void setMasterArray(int i, com.microsoft.schemas.office.visio.x2012.main.MasterType master);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Master" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterType insertNewMaster(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "Master" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterType addNewMaster();

    /**
     * Removes the ith "Master" element
     */
    void removeMaster(int i);

    /**
     * Gets a List of "MasterShortcut" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType> getMasterShortcutList();

    /**
     * Gets array of all "MasterShortcut" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType[] getMasterShortcutArray();

    /**
     * Gets ith "MasterShortcut" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType getMasterShortcutArray(int i);

    /**
     * Returns number of "MasterShortcut" element
     */
    int sizeOfMasterShortcutArray();

    /**
     * Sets array of all "MasterShortcut" element
     */
    void setMasterShortcutArray(com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType[] masterShortcutArray);

    /**
     * Sets ith "MasterShortcut" element
     */
    void setMasterShortcutArray(int i, com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType masterShortcut);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "MasterShortcut" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType insertNewMasterShortcut(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "MasterShortcut" element
     */
    com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType addNewMasterShortcut();

    /**
     * Removes the ith "MasterShortcut" element
     */
    void removeMasterShortcut(int i);
}
