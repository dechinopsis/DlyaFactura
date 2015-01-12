/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.dlya.facturetype;

/**
 * Enumeration TrasladoImpuestoType.
 * 
 * @version $Revision$ $Date$
 */
public enum TrasladoImpuestoType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant IVA
     */
    IVA("IVA"),
    /**
     * Constant IEPS
     */
    IEPS("IEPS");

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
    private static final java.util.Map<java.lang.String, TrasladoImpuestoType> enumConstants = new java.util.HashMap<java.lang.String, TrasladoImpuestoType>();


    static {
        for (TrasladoImpuestoType c: TrasladoImpuestoType.values()) {
            TrasladoImpuestoType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private TrasladoImpuestoType(final java.lang.String value) {
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
    public static TrasladoImpuestoType fromValue(
            final java.lang.String value) {
        TrasladoImpuestoType c = TrasladoImpuestoType.enumConstants.get(value);
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
