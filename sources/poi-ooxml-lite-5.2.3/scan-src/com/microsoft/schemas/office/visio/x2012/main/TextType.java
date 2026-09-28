/*
 * XML Type:  Text_Type
 * Namespace: http://schemas.microsoft.com/office/visio/2012/main
 * Java type: com.microsoft.schemas.office.visio.x2012.main.TextType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.visio.x2012.main;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML Text_Type(@http://schemas.microsoft.com/office/visio/2012/main).
 *
 * This is a complex type.
 */
public interface TextType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.visio.x2012.main.TextType> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "texttyped2ectype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "cp" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.CpType> getCpList();

    /**
     * Gets array of all "cp" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.CpType[] getCpArray();

    /**
     * Gets ith "cp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CpType getCpArray(int i);

    /**
     * Returns number of "cp" element
     */
    int sizeOfCpArray();

    /**
     * Sets array of all "cp" element
     */
    void setCpArray(com.microsoft.schemas.office.visio.x2012.main.CpType[] cpArray);

    /**
     * Sets ith "cp" element
     */
    void setCpArray(int i, com.microsoft.schemas.office.visio.x2012.main.CpType cp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CpType insertNewCp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "cp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.CpType addNewCp();

    /**
     * Removes the ith "cp" element
     */
    void removeCp(int i);

    /**
     * Gets a List of "pp" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.PpType> getPpList();

    /**
     * Gets array of all "pp" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.PpType[] getPpArray();

    /**
     * Gets ith "pp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PpType getPpArray(int i);

    /**
     * Returns number of "pp" element
     */
    int sizeOfPpArray();

    /**
     * Sets array of all "pp" element
     */
    void setPpArray(com.microsoft.schemas.office.visio.x2012.main.PpType[] ppArray);

    /**
     * Sets ith "pp" element
     */
    void setPpArray(int i, com.microsoft.schemas.office.visio.x2012.main.PpType pp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PpType insertNewPp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.PpType addNewPp();

    /**
     * Removes the ith "pp" element
     */
    void removePp(int i);

    /**
     * Gets a List of "tp" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.TpType> getTpList();

    /**
     * Gets array of all "tp" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.TpType[] getTpArray();

    /**
     * Gets ith "tp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TpType getTpArray(int i);

    /**
     * Returns number of "tp" element
     */
    int sizeOfTpArray();

    /**
     * Sets array of all "tp" element
     */
    void setTpArray(com.microsoft.schemas.office.visio.x2012.main.TpType[] tpArray);

    /**
     * Sets ith "tp" element
     */
    void setTpArray(int i, com.microsoft.schemas.office.visio.x2012.main.TpType tp);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "tp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TpType insertNewTp(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "tp" element
     */
    com.microsoft.schemas.office.visio.x2012.main.TpType addNewTp();

    /**
     * Removes the ith "tp" element
     */
    void removeTp(int i);

    /**
     * Gets a List of "fld" elements
     */
    java.util.List<com.microsoft.schemas.office.visio.x2012.main.FldType> getFldList();

    /**
     * Gets array of all "fld" elements
     */
    com.microsoft.schemas.office.visio.x2012.main.FldType[] getFldArray();

    /**
     * Gets ith "fld" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FldType getFldArray(int i);

    /**
     * Returns number of "fld" element
     */
    int sizeOfFldArray();

    /**
     * Sets array of all "fld" element
     */
    void setFldArray(com.microsoft.schemas.office.visio.x2012.main.FldType[] fldArray);

    /**
     * Sets ith "fld" element
     */
    void setFldArray(int i, com.microsoft.schemas.office.visio.x2012.main.FldType fld);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "fld" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FldType insertNewFld(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "fld" element
     */
    com.microsoft.schemas.office.visio.x2012.main.FldType addNewFld();

    /**
     * Removes the ith "fld" element
     */
    void removeFld(int i);
}
