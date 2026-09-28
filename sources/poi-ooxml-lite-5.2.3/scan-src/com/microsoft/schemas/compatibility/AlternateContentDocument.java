/*
 * An XML document type.
 * Localname: AlternateContent
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.AlternateContentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one AlternateContent(@http://schemas.openxmlformats.org/markup-compatibility/2006) element.
 *
 * This is a complex type.
 */
public interface AlternateContentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.compatibility.AlternateContentDocument> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "alternatecontentdd64doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "AlternateContent" element
     */
    com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent getAlternateContent();

    /**
     * Sets the "AlternateContent" element
     */
    void setAlternateContent(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent alternateContent);

    /**
     * Appends and returns a new empty "AlternateContent" element
     */
    com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent addNewAlternateContent();

    /**
     * An XML AlternateContent(@http://schemas.openxmlformats.org/markup-compatibility/2006).
     *
     * This is a complex type.
     */
    public interface AlternateContent extends org.apache.xmlbeans.XmlObject {
        ElementFactory<com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent> Factory = new ElementFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "alternatecontenta8a9elemtype");
        org.apache.xmlbeans.SchemaType type = Factory.getType();


        /**
         * Gets a List of "Choice" elements
         */
        java.util.List<com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice> getChoiceList();

        /**
         * Gets array of all "Choice" elements
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice[] getChoiceArray();

        /**
         * Gets ith "Choice" element
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice getChoiceArray(int i);

        /**
         * Returns number of "Choice" element
         */
        int sizeOfChoiceArray();

        /**
         * Sets array of all "Choice" element
         */
        void setChoiceArray(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice[] choiceArray);

        /**
         * Sets ith "Choice" element
         */
        void setChoiceArray(int i, com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice choice);

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Choice" element
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice insertNewChoice(int i);

        /**
         * Appends and returns a new empty value (as xml) as the last "Choice" element
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice addNewChoice();

        /**
         * Removes the ith "Choice" element
         */
        void removeChoice(int i);

        /**
         * Gets the "Fallback" element
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback getFallback();

        /**
         * True if has "Fallback" element
         */
        boolean isSetFallback();

        /**
         * Sets the "Fallback" element
         */
        void setFallback(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback fallback);

        /**
         * Appends and returns a new empty "Fallback" element
         */
        com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback addNewFallback();

        /**
         * Unsets the "Fallback" element
         */
        void unsetFallback();

        /**
         * Gets the "Ignorable" attribute
         */
        java.lang.String getIgnorable();

        /**
         * Gets (as xml) the "Ignorable" attribute
         */
        org.apache.xmlbeans.XmlString xgetIgnorable();

        /**
         * True if has "Ignorable" attribute
         */
        boolean isSetIgnorable();

        /**
         * Sets the "Ignorable" attribute
         */
        void setIgnorable(java.lang.String ignorable);

        /**
         * Sets (as xml) the "Ignorable" attribute
         */
        void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable);

        /**
         * Unsets the "Ignorable" attribute
         */
        void unsetIgnorable();

        /**
         * Gets the "MustUnderstand" attribute
         */
        java.lang.String getMustUnderstand();

        /**
         * Gets (as xml) the "MustUnderstand" attribute
         */
        org.apache.xmlbeans.XmlString xgetMustUnderstand();

        /**
         * True if has "MustUnderstand" attribute
         */
        boolean isSetMustUnderstand();

        /**
         * Sets the "MustUnderstand" attribute
         */
        void setMustUnderstand(java.lang.String mustUnderstand);

        /**
         * Sets (as xml) the "MustUnderstand" attribute
         */
        void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand);

        /**
         * Unsets the "MustUnderstand" attribute
         */
        void unsetMustUnderstand();

        /**
         * Gets the "ProcessContent" attribute
         */
        java.lang.String getProcessContent();

        /**
         * Gets (as xml) the "ProcessContent" attribute
         */
        org.apache.xmlbeans.XmlString xgetProcessContent();

        /**
         * True if has "ProcessContent" attribute
         */
        boolean isSetProcessContent();

        /**
         * Sets the "ProcessContent" attribute
         */
        void setProcessContent(java.lang.String processContent);

        /**
         * Sets (as xml) the "ProcessContent" attribute
         */
        void xsetProcessContent(org.apache.xmlbeans.XmlString processContent);

        /**
         * Unsets the "ProcessContent" attribute
         */
        void unsetProcessContent();

        /**
         * An XML Choice(@http://schemas.openxmlformats.org/markup-compatibility/2006).
         *
         * This is a complex type.
         */
        public interface Choice extends org.apache.xmlbeans.XmlObject {
            ElementFactory<com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice> Factory = new ElementFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "choice69c6elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * Gets the "Requires" attribute
             */
            java.lang.String getRequires();

            /**
             * Gets (as xml) the "Requires" attribute
             */
            org.apache.xmlbeans.XmlString xgetRequires();

            /**
             * Sets the "Requires" attribute
             */
            void setRequires(java.lang.String requires);

            /**
             * Sets (as xml) the "Requires" attribute
             */
            void xsetRequires(org.apache.xmlbeans.XmlString requires);

            /**
             * Gets the "Ignorable" attribute
             */
            java.lang.String getIgnorable();

            /**
             * Gets (as xml) the "Ignorable" attribute
             */
            org.apache.xmlbeans.XmlString xgetIgnorable();

            /**
             * True if has "Ignorable" attribute
             */
            boolean isSetIgnorable();

            /**
             * Sets the "Ignorable" attribute
             */
            void setIgnorable(java.lang.String ignorable);

            /**
             * Sets (as xml) the "Ignorable" attribute
             */
            void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable);

            /**
             * Unsets the "Ignorable" attribute
             */
            void unsetIgnorable();

            /**
             * Gets the "MustUnderstand" attribute
             */
            java.lang.String getMustUnderstand();

            /**
             * Gets (as xml) the "MustUnderstand" attribute
             */
            org.apache.xmlbeans.XmlString xgetMustUnderstand();

            /**
             * True if has "MustUnderstand" attribute
             */
            boolean isSetMustUnderstand();

            /**
             * Sets the "MustUnderstand" attribute
             */
            void setMustUnderstand(java.lang.String mustUnderstand);

            /**
             * Sets (as xml) the "MustUnderstand" attribute
             */
            void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand);

            /**
             * Unsets the "MustUnderstand" attribute
             */
            void unsetMustUnderstand();

            /**
             * Gets the "ProcessContent" attribute
             */
            java.lang.String getProcessContent();

            /**
             * Gets (as xml) the "ProcessContent" attribute
             */
            org.apache.xmlbeans.XmlString xgetProcessContent();

            /**
             * True if has "ProcessContent" attribute
             */
            boolean isSetProcessContent();

            /**
             * Sets the "ProcessContent" attribute
             */
            void setProcessContent(java.lang.String processContent);

            /**
             * Sets (as xml) the "ProcessContent" attribute
             */
            void xsetProcessContent(org.apache.xmlbeans.XmlString processContent);

            /**
             * Unsets the "ProcessContent" attribute
             */
            void unsetProcessContent();
        }

        /**
         * An XML Fallback(@http://schemas.openxmlformats.org/markup-compatibility/2006).
         *
         * This is a complex type.
         */
        public interface Fallback extends org.apache.xmlbeans.XmlObject {
            ElementFactory<com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback> Factory = new ElementFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "fallback4cc7elemtype");
            org.apache.xmlbeans.SchemaType type = Factory.getType();


            /**
             * Gets the "Ignorable" attribute
             */
            java.lang.String getIgnorable();

            /**
             * Gets (as xml) the "Ignorable" attribute
             */
            org.apache.xmlbeans.XmlString xgetIgnorable();

            /**
             * True if has "Ignorable" attribute
             */
            boolean isSetIgnorable();

            /**
             * Sets the "Ignorable" attribute
             */
            void setIgnorable(java.lang.String ignorable);

            /**
             * Sets (as xml) the "Ignorable" attribute
             */
            void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable);

            /**
             * Unsets the "Ignorable" attribute
             */
            void unsetIgnorable();

            /**
             * Gets the "MustUnderstand" attribute
             */
            java.lang.String getMustUnderstand();

            /**
             * Gets (as xml) the "MustUnderstand" attribute
             */
            org.apache.xmlbeans.XmlString xgetMustUnderstand();

            /**
             * True if has "MustUnderstand" attribute
             */
            boolean isSetMustUnderstand();

            /**
             * Sets the "MustUnderstand" attribute
             */
            void setMustUnderstand(java.lang.String mustUnderstand);

            /**
             * Sets (as xml) the "MustUnderstand" attribute
             */
            void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand);

            /**
             * Unsets the "MustUnderstand" attribute
             */
            void unsetMustUnderstand();

            /**
             * Gets the "ProcessContent" attribute
             */
            java.lang.String getProcessContent();

            /**
             * Gets (as xml) the "ProcessContent" attribute
             */
            org.apache.xmlbeans.XmlString xgetProcessContent();

            /**
             * True if has "ProcessContent" attribute
             */
            boolean isSetProcessContent();

            /**
             * Sets the "ProcessContent" attribute
             */
            void setProcessContent(java.lang.String processContent);

            /**
             * Sets (as xml) the "ProcessContent" attribute
             */
            void xsetProcessContent(org.apache.xmlbeans.XmlString processContent);

            /**
             * Unsets the "ProcessContent" attribute
             */
            void unsetProcessContent();
        }
    }
}
