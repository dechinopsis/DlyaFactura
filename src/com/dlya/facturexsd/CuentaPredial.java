package com.dlya.facturexsd;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo opcional para asentar el número de cuenta predial con el
 * que fue registrado el inmueble, en el sistema catastral de la
 * entidad federativa de que trate.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CuentaPredial implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para precisar el número de la cuenta
     * predial del inmueble cubierto por el presente concepto en
     * caso de recibos de arrendamiento.
     */
    private java.lang.String _numero;


      //----------------/
     //- Constructors -/
    //----------------/

    public CuentaPredial() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'numero'. The field 'numero' has
     * the following description: Atributo requerido para precisar
     * el número de la cuenta predial del inmueble cubierto por el
     * presente concepto en caso de recibos de arrendamiento.
     * 
     * @return the value of field 'Numero'.
     */
    public java.lang.String getNumero(
    ) {
        return this._numero;
    }

    /**
     * Sets the value of field 'numero'. The field 'numero' has the
     * following description: Atributo requerido para precisar el
     * número de la cuenta predial del inmueble cubierto por el
     * presente concepto en caso de recibos de arrendamiento.
     * 
     * @param numero the value of field 'numero'.
     */
    public void setNumero(
            final java.lang.String numero) {
        this._numero = numero;
    }

}
