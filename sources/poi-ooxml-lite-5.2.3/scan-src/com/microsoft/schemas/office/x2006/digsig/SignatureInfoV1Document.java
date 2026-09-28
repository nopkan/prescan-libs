/*
 * An XML document type.
 * Localname: SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig) element.
 *
 * This is a complex type.
 */
public interface SignatureInfoV1Document extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.x2006.digsig.SignatureInfoV1Document> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "signatureinfov14a6bdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SignatureInfoV1" element
     */
    com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 getSignatureInfoV1();

    /**
     * Sets the "SignatureInfoV1" element
     */
    void setSignatureInfoV1(com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 signatureInfoV1);

    /**
     * Appends and returns a new empty "SignatureInfoV1" element
     */
    com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1 addNewSignatureInfoV1();
}
