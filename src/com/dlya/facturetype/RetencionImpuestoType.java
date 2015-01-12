/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.dlya.facturetype;

/**
 * Enumeration RetencionImpuestoType.
 * 
 * @version $Revision$ $Date$
 */
public enum RetencionImpuestoType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant ISR
     */
    ISR("ISR"),
    /**
     * Constant IVA
     */
    IVA("IVA");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, RetencionImpuestoType> enumConstants = new java.util.HashMap<java.lang.String, RetencionImpuestoType>();


    static {
        for (RetencionImpuestoType c: RetencionImpuestoType.values()) {
            RetencionImpuestoType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private RetencionImpuestoType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static RetencionImpuestoType fromValue(
            final java.lang.String value) {
        RetencionImpuestoType c = RetencionImpuestoType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
