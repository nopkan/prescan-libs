/*
 * XML Type:  ST_FillType
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.STFillType
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ST_FillType(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of com.microsoft.schemas.vml.STFillType.
 */
public interface STFillType extends org.apache.xmlbeans.XmlString {
    SimpleTypeFactory<com.microsoft.schemas.vml.STFillType> Factory = new SimpleTypeFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "stfilltype382btype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    org.apache.xmlbeans.StringEnumAbstractBase getEnumValue();
    void setEnumValue(org.apache.xmlbeans.StringEnumAbstractBase e);

    Enum SOLID = Enum.forString("solid");
    Enum GRADIENT = Enum.forString("gradient");
    Enum GRADIENT_RADIAL = Enum.forString("gradientRadial");
    Enum TILE = Enum.forString("tile");
    Enum PATTERN = Enum.forString("pattern");
    Enum FRAME = Enum.forString("frame");

    int INT_SOLID = Enum.INT_SOLID;
    int INT_GRADIENT = Enum.INT_GRADIENT;
    int INT_GRADIENT_RADIAL = Enum.INT_GRADIENT_RADIAL;
    int INT_TILE = Enum.INT_TILE;
    int INT_PATTERN = Enum.INT_PATTERN;
    int INT_FRAME = Enum.INT_FRAME;

    /**
     * Enumeration value class for com.microsoft.schemas.vml.STFillType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SOLID
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s) {
            return (Enum)table.forString(s);
        }

        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i) {
            return (Enum)table.forInt(i);
        }

        private Enum(java.lang.String s, int i) {
            super(s, i);
        }

        static final int INT_SOLID = 1;
        static final int INT_GRADIENT = 2;
        static final int INT_GRADIENT_RADIAL = 3;
        static final int INT_TILE = 4;
        static final int INT_PATTERN = 5;
        static final int INT_FRAME = 6;

        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table(new Enum[] {
            new Enum("solid", INT_SOLID),
            new Enum("gradient", INT_GRADIENT),
            new Enum("gradientRadial", INT_GRADIENT_RADIAL),
            new Enum("tile", INT_TILE),
            new Enum("pattern", INT_PATTERN),
            new Enum("frame", INT_FRAME),
        });
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() {
            return forInt(intValue());
        }
    }
}
