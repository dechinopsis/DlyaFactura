package com.dlya.facturexsd;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Tipo definido para expresar información aduanera
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class T_InformacionAduanera implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para expresar el número del documento
     * aduanero que ampara la importación del bien.
     */
    private java.lang.String _numero;

    /**
     * Atributo requerido para expresar la fecha de expedición del
     * documento aduanero que ampara la importación del bien. Se
     * expresa en el formato aaaa-mm-dd
     */
    private org.exolab.castor.types.Date _fecha;

    /**
     * Atributo requerido para precisar la aduana por la que se
     * efectuó la importación del bien.
     */
    private java.lang.String _aduana;


      //----------------/
     //- Constructors -/
    //----------------/

    public T_InformacionAduanera() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'aduana'. The field 'aduana' has
     * the following description: Atributo requerido para precisar
     * la aduana por la que se efectuó la importación del bien.
     * 
     * @return the value of field 'Aduana'.
     */
    public java.lang.String getAduana(
    ) {
        return this._aduana;
    }

    /**
     * Returns the value of field 'fecha'. The field 'fecha' has
     * the following description: Atributo requerido para expresar
     * la fecha de expedición del documento aduanero que ampara la
     * importación del bien. Se expresa en el formato aaaa-mm-dd
     * 
     * @return the value of field 'Fecha'.
     */
    public org.exolab.castor.types.Date getFecha(
    ) {
        return this._fecha;
    }

    /**
     * Returns the value of field 'numero'. The field 'numero' has
     * the following description: Atributo requerido para expresar
     * el número del documento aduanero que ampara la importación
     * del bien.
     * 
     * @return the value of field 'Numero'.
     */
    public java.lang.String getNumero(
    ) {
        return this._numero;
    }

    /**
     * Sets the value of field 'aduana'. The field 'aduana' has the
     * following description: Atributo requerido para precisar la
     * aduana por la que se efectuó la importación del bien.
     * 
     * @param aduana the value of field 'aduana'.
     */
    public void setAduana(
            final java.lang.String aduana) {
        this._aduana = aduana;
    }

    /**
     * Sets the value of field 'fecha'. The field 'fecha' has the
     * following description: Atributo requerido para expresar la
     * fecha de expedición del documento aduanero que ampara la
     * importación del bien. Se expresa en el formato aaaa-mm-dd
     * 
     * @param fecha the value of field 'fecha'.
     */
    public void setFecha(
            final org.exolab.castor.types.Date fecha) {
        this._fecha = fecha;
    }

    /**
     * Sets the value of field 'numero'. The field 'numero' has the
     * following description: Atributo requerido para expresar el
     * número del documento aduanero que ampara la importación
     * del bien.
     * 
     * @param numero the value of field 'numero'.
     */
    public void setNumero(
            final java.lang.String numero) {
        this._numero = numero;
    }

}
