/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.dlya.facturetype;

/**
 * Enumeration ComprobanteTipoDeComprobanteType.
 * 
 * @version $Revision$ $Date$
 */
public enum ComprobanteTipoDeComprobanteType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant INGRESO
     */
	ingreso("ingreso"),
    /**
     * Constant EGRESO
     */
	egreso("egreso"),
    /**
     * Constant TRASLADO
     */
	traslado("traslado");

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
    private static final java.util.Map<java.lang.String, ComprobanteTipoDeComprobanteType> enumConstants = new java.util.HashMap<java.lang.String, ComprobanteTipoDeComprobanteType>();


    static {
        for (ComprobanteTipoDeComprobanteType c: ComprobanteTipoDeComprobanteType.values()) {
            ComprobanteTipoDeComprobanteType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ComprobanteTipoDeComprobanteType(final java.lang.String value) {
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
    public static ComprobanteTipoDeComprobanteType fromValue(
            final java.lang.String value) {
        ComprobanteTipoDeComprobanteType c = ComprobanteTipoDeComprobanteType.enumConstants.get(value);
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
        return this.value.toLowerCase();
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
