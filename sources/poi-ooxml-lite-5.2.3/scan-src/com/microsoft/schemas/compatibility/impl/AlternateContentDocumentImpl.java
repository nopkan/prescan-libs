/*
 * An XML document type.
 * Localname: AlternateContent
 * Namespace: http://schemas.openxmlformats.org/markup-compatibility/2006
 * Java type: com.microsoft.schemas.compatibility.AlternateContentDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.compatibility.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AlternateContent(@http://schemas.openxmlformats.org/markup-compatibility/2006) element.
 *
 * This is a complex type.
 */
public class AlternateContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.AlternateContentDocument {
    private static final long serialVersionUID = 1L;

    public AlternateContentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "AlternateContent"),
    };


    /**
     * Gets the "AlternateContent" element
     */
    @Override
    public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent getAlternateContent() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent target = null;
            target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AlternateContent" element
     */
    @Override
    public void setAlternateContent(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent alternateContent) {
        generatedSetterHelperImpl(alternateContent, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AlternateContent" element
     */
    @Override
    public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent addNewAlternateContent() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent target = null;
            target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
    /**
     * An XML AlternateContent(@http://schemas.openxmlformats.org/markup-compatibility/2006).
     *
     * This is a complex type.
     */
    public static class AlternateContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent {
        private static final long serialVersionUID = 1L;

        public AlternateContentImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
        }

        private static final QName[] PROPERTY_QNAME = {
            new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "Choice"),
            new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "Fallback"),
            new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "Ignorable"),
            new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "MustUnderstand"),
            new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "ProcessContent"),
        };


        /**
         * Gets a List of "Choice" elements
         */
        @Override
        public java.util.List<com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice> getChoiceList() {
            synchronized (monitor()) {
                check_orphaned();
                return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                    this::getChoiceArray,
                    this::setChoiceArray,
                    this::insertNewChoice,
                    this::removeChoice,
                    this::sizeOfChoiceArray
                );
            }
        }

        /**
         * Gets array of all "Choice" elements
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice[] getChoiceArray() {
            return getXmlObjectArray(PROPERTY_QNAME[0], new com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice[0]);
        }

        /**
         * Gets ith "Choice" element
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice getChoiceArray(int i) {
            synchronized (monitor()) {
                check_orphaned();
                com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice target = null;
                target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice)get_store().find_element_user(PROPERTY_QNAME[0], i);
                if (target == null) {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "Choice" element
         */
        @Override
        public int sizeOfChoiceArray() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[0]);
            }
        }

        /**
         * Sets array of all "Choice" element  WARNING: This method is not atomicaly synchronized.
         */
        @Override
        public void setChoiceArray(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice[] choiceArray) {
            check_orphaned();
            arraySetterHelper(choiceArray, PROPERTY_QNAME[0]);
        }

        /**
         * Sets ith "Choice" element
         */
        @Override
        public void setChoiceArray(int i, com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice choice) {
            generatedSetterHelperImpl(choice, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "Choice" element
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice insertNewChoice(int i) {
            synchronized (monitor()) {
                check_orphaned();
                com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice target = null;
                target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice)get_store().insert_element_user(PROPERTY_QNAME[0], i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "Choice" element
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice addNewChoice() {
            synchronized (monitor()) {
                check_orphaned();
                com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice target = null;
                target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice)get_store().add_element_user(PROPERTY_QNAME[0]);
                return target;
            }
        }

        /**
         * Removes the ith "Choice" element
         */
        @Override
        public void removeChoice(int i) {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[0], i);
            }
        }

        /**
         * Gets the "Fallback" element
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback getFallback() {
            synchronized (monitor()) {
                check_orphaned();
                com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback target = null;
                target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback)get_store().find_element_user(PROPERTY_QNAME[1], 0);
                return (target == null) ? null : target;
            }
        }

        /**
         * True if has "Fallback" element
         */
        @Override
        public boolean isSetFallback() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
            }
        }

        /**
         * Sets the "Fallback" element
         */
        @Override
        public void setFallback(com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback fallback) {
            generatedSetterHelperImpl(fallback, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "Fallback" element
         */
        @Override
        public com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback addNewFallback() {
            synchronized (monitor()) {
                check_orphaned();
                com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback target = null;
                target = (com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback)get_store().add_element_user(PROPERTY_QNAME[1]);
                return target;
            }
        }

        /**
         * Unsets the "Fallback" element
         */
        @Override
        public void unsetFallback() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_element(PROPERTY_QNAME[1], 0);
            }
        }

        /**
         * Gets the "Ignorable" attribute
         */
        @Override
        public java.lang.String getIgnorable() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "Ignorable" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetIgnorable() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                return target;
            }
        }

        /**
         * True if has "Ignorable" attribute
         */
        @Override
        public boolean isSetIgnorable() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
            }
        }

        /**
         * Sets the "Ignorable" attribute
         */
        @Override
        public void setIgnorable(java.lang.String ignorable) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.setStringValue(ignorable);
            }
        }

        /**
         * Sets (as xml) the "Ignorable" attribute
         */
        @Override
        public void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                }
                target.set(ignorable);
            }
        }

        /**
         * Unsets the "Ignorable" attribute
         */
        @Override
        public void unsetIgnorable() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[2]);
            }
        }

        /**
         * Gets the "MustUnderstand" attribute
         */
        @Override
        public java.lang.String getMustUnderstand() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "MustUnderstand" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetMustUnderstand() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                return target;
            }
        }

        /**
         * True if has "MustUnderstand" attribute
         */
        @Override
        public boolean isSetMustUnderstand() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
            }
        }

        /**
         * Sets the "MustUnderstand" attribute
         */
        @Override
        public void setMustUnderstand(java.lang.String mustUnderstand) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
                }
                target.setStringValue(mustUnderstand);
            }
        }

        /**
         * Sets (as xml) the "MustUnderstand" attribute
         */
        @Override
        public void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
                }
                target.set(mustUnderstand);
            }
        }

        /**
         * Unsets the "MustUnderstand" attribute
         */
        @Override
        public void unsetMustUnderstand() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[3]);
            }
        }

        /**
         * Gets the "ProcessContent" attribute
         */
        @Override
        public java.lang.String getProcessContent() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
                return (target == null) ? null : target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "ProcessContent" attribute
         */
        @Override
        public org.apache.xmlbeans.XmlString xgetProcessContent() {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
                return target;
            }
        }

        /**
         * True if has "ProcessContent" attribute
         */
        @Override
        public boolean isSetProcessContent() {
            synchronized (monitor()) {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY_QNAME[4]) != null;
            }
        }

        /**
         * Sets the "ProcessContent" attribute
         */
        @Override
        public void setProcessContent(java.lang.String processContent) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[4]);
                if (target == null) {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[4]);
                }
                target.setStringValue(processContent);
            }
        }

        /**
         * Sets (as xml) the "ProcessContent" attribute
         */
        @Override
        public void xsetProcessContent(org.apache.xmlbeans.XmlString processContent) {
            synchronized (monitor()) {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[4]);
                if (target == null) {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[4]);
                }
                target.set(processContent);
            }
        }

        /**
         * Unsets the "ProcessContent" attribute
         */
        @Override
        public void unsetProcessContent() {
            synchronized (monitor()) {
                check_orphaned();
                get_store().remove_attribute(PROPERTY_QNAME[4]);
            }
        }
        /**
         * An XML Choice(@http://schemas.openxmlformats.org/markup-compatibility/2006).
         *
         * This is a complex type.
         */
        public static class ChoiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Choice {
            private static final long serialVersionUID = 1L;

            public ChoiceImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType);
            }

            private static final QName[] PROPERTY_QNAME = {
                new QName("", "Requires"),
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "Ignorable"),
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "MustUnderstand"),
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "ProcessContent"),
            };


            /**
             * Gets the "Requires" attribute
             */
            @Override
            public java.lang.String getRequires() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "Requires" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetRequires() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return target;
                }
            }

            /**
             * Sets the "Requires" attribute
             */
            @Override
            public void setRequires(java.lang.String requires) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.setStringValue(requires);
                }
            }

            /**
             * Sets (as xml) the "Requires" attribute
             */
            @Override
            public void xsetRequires(org.apache.xmlbeans.XmlString requires) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.set(requires);
                }
            }

            /**
             * Gets the "Ignorable" attribute
             */
            @Override
            public java.lang.String getIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "Ignorable" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    return target;
                }
            }

            /**
             * True if has "Ignorable" attribute
             */
            @Override
            public boolean isSetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
                }
            }

            /**
             * Sets the "Ignorable" attribute
             */
            @Override
            public void setIgnorable(java.lang.String ignorable) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                    }
                    target.setStringValue(ignorable);
                }
            }

            /**
             * Sets (as xml) the "Ignorable" attribute
             */
            @Override
            public void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                    }
                    target.set(ignorable);
                }
            }

            /**
             * Unsets the "Ignorable" attribute
             */
            @Override
            public void unsetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[1]);
                }
            }

            /**
             * Gets the "MustUnderstand" attribute
             */
            @Override
            public java.lang.String getMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "MustUnderstand" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    return target;
                }
            }

            /**
             * True if has "MustUnderstand" attribute
             */
            @Override
            public boolean isSetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
                }
            }

            /**
             * Sets the "MustUnderstand" attribute
             */
            @Override
            public void setMustUnderstand(java.lang.String mustUnderstand) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                    }
                    target.setStringValue(mustUnderstand);
                }
            }

            /**
             * Sets (as xml) the "MustUnderstand" attribute
             */
            @Override
            public void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                    }
                    target.set(mustUnderstand);
                }
            }

            /**
             * Unsets the "MustUnderstand" attribute
             */
            @Override
            public void unsetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[2]);
                }
            }

            /**
             * Gets the "ProcessContent" attribute
             */
            @Override
            public java.lang.String getProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "ProcessContent" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                    return target;
                }
            }

            /**
             * True if has "ProcessContent" attribute
             */
            @Override
            public boolean isSetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[3]) != null;
                }
            }

            /**
             * Sets the "ProcessContent" attribute
             */
            @Override
            public void setProcessContent(java.lang.String processContent) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[3]);
                    }
                    target.setStringValue(processContent);
                }
            }

            /**
             * Sets (as xml) the "ProcessContent" attribute
             */
            @Override
            public void xsetProcessContent(org.apache.xmlbeans.XmlString processContent) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[3]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[3]);
                    }
                    target.set(processContent);
                }
            }

            /**
             * Unsets the "ProcessContent" attribute
             */
            @Override
            public void unsetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[3]);
                }
            }
        }
        /**
         * An XML Fallback(@http://schemas.openxmlformats.org/markup-compatibility/2006).
         *
         * This is a complex type.
         */
        public static class FallbackImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.compatibility.AlternateContentDocument.AlternateContent.Fallback {
            private static final long serialVersionUID = 1L;

            public FallbackImpl(org.apache.xmlbeans.SchemaType sType) {
                super(sType);
            }

            private static final QName[] PROPERTY_QNAME = {
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "Ignorable"),
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "MustUnderstand"),
                new QName("http://schemas.openxmlformats.org/markup-compatibility/2006", "ProcessContent"),
            };


            /**
             * Gets the "Ignorable" attribute
             */
            @Override
            public java.lang.String getIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "Ignorable" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    return target;
                }
            }

            /**
             * True if has "Ignorable" attribute
             */
            @Override
            public boolean isSetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
                }
            }

            /**
             * Sets the "Ignorable" attribute
             */
            @Override
            public void setIgnorable(java.lang.String ignorable) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.setStringValue(ignorable);
                }
            }

            /**
             * Sets (as xml) the "Ignorable" attribute
             */
            @Override
            public void xsetIgnorable(org.apache.xmlbeans.XmlString ignorable) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[0]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[0]);
                    }
                    target.set(ignorable);
                }
            }

            /**
             * Unsets the "Ignorable" attribute
             */
            @Override
            public void unsetIgnorable() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[0]);
                }
            }

            /**
             * Gets the "MustUnderstand" attribute
             */
            @Override
            public java.lang.String getMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "MustUnderstand" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    return target;
                }
            }

            /**
             * True if has "MustUnderstand" attribute
             */
            @Override
            public boolean isSetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
                }
            }

            /**
             * Sets the "MustUnderstand" attribute
             */
            @Override
            public void setMustUnderstand(java.lang.String mustUnderstand) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                    }
                    target.setStringValue(mustUnderstand);
                }
            }

            /**
             * Sets (as xml) the "MustUnderstand" attribute
             */
            @Override
            public void xsetMustUnderstand(org.apache.xmlbeans.XmlString mustUnderstand) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[1]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[1]);
                    }
                    target.set(mustUnderstand);
                }
            }

            /**
             * Unsets the "MustUnderstand" attribute
             */
            @Override
            public void unsetMustUnderstand() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[1]);
                }
            }

            /**
             * Gets the "ProcessContent" attribute
             */
            @Override
            public java.lang.String getProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    return (target == null) ? null : target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "ProcessContent" attribute
             */
            @Override
            public org.apache.xmlbeans.XmlString xgetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    return target;
                }
            }

            /**
             * True if has "ProcessContent" attribute
             */
            @Override
            public boolean isSetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
                }
            }

            /**
             * Sets the "ProcessContent" attribute
             */
            @Override
            public void setProcessContent(java.lang.String processContent) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                    }
                    target.setStringValue(processContent);
                }
            }

            /**
             * Sets (as xml) the "ProcessContent" attribute
             */
            @Override
            public void xsetProcessContent(org.apache.xmlbeans.XmlString processContent) {
                synchronized (monitor()) {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
                    if (target == null) {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
                    }
                    target.set(processContent);
                }
            }

            /**
             * Unsets the "ProcessContent" attribute
             */
            @Override
            public void unsetProcessContent() {
                synchronized (monitor()) {
                    check_orphaned();
                    get_store().remove_attribute(PROPERTY_QNAME[2]);
                }
            }
        }
    }
}
