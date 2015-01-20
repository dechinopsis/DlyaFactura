package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Tipo definido para expresar domicilios o direcciones
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class T_Ubicacion implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Este atributo opcional sirve para precisar la avenida,
     * calle, camino o carretera donde se da la ubicación.
     */
    private java.lang.String _calle;

    /**
     * Este atributo opcional sirve para expresar el número
     * particular en donde se da la ubicación sobre una calle dada.
     */
    private java.lang.String _noExterior;

    /**
     * Este atributo opcional sirve para expresar información
     * adicional para especificar la ubicación cuando calle y
     * número exterior (noExterior) no resulten suficientes para
     * determinar la ubicación de forma precisa.
     */
    private java.lang.String _noInterior;

    /**
     * Este atributo opcional sirve para precisar la colonia en
     * donde se da la ubicación cuando se desea ser más
     * específico en casos de ubicaciones urbanas.
     */
    private java.lang.String _colonia;

    /**
     * Atributo opcional que sirve para precisar la ciudad o
     * población donde se da la ubicación.
     */
    private java.lang.String _localidad;

    /**
     * Atributo opcional para expresar una referencia de ubicación
     * adicional.
     */
    private java.lang.String _referencia;

    /**
     * Atributo opcional que sirve para precisar el municipio o
     * delegación (en el caso del Distrito Federal) en donde se da
     * la ubicación.
     */
    private java.lang.String _municipio;

    /**
     * Atributo opcional que sirve para precisar el estado o
     * entidad federativa donde se da la ubicación.
     */
    private java.lang.String _estado;

    /**
     * Atributo requerido que sirve para precisar el país donde se
     * da la ubicación.
     */
    private java.lang.String _pais;

    /**
     * Atributo opcional que sirve para asentar el código postal
     * en donde se da la ubicación.
     */
    private java.lang.String _codigoPostal;


      //----------------/
     //- Constructors -/
    //----------------/

    public T_Ubicacion() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'calle'. The field 'calle' has
     * the following description: Este atributo opcional sirve para
     * precisar la avenida, calle, camino o carretera donde se da
     * la ubicación.
     * 
     * @return the value of field 'Calle'.
     */
    public java.lang.String getCalle(
    ) {
        return this._calle;
    }

    /**
     * Returns the value of field 'codigoPostal'. The field
     * 'codigoPostal' has the following description: Atributo
     * opcional que sirve para asentar el código postal en donde
     * se da la ubicación.
     * 
     * @return the value of field 'CodigoPostal'.
     */
    public java.lang.String getCodigoPostal(
    ) {
        return this._codigoPostal;
    }

    /**
     * Returns the value of field 'colonia'. The field 'colonia'
     * has the following description: Este atributo opcional sirve
     * para precisar la colonia en donde se da la ubicación cuando
     * se desea ser más específico en casos de ubicaciones
     * urbanas.
     * 
     * @return the value of field 'Colonia'.
     */
    public java.lang.String getColonia(
    ) {
        return this._colonia;
    }

    /**
     * Returns the value of field 'estado'. The field 'estado' has
     * the following description: Atributo opcional que sirve para
     * precisar el estado o entidad federativa donde se da la
     * ubicación.
     * 
     * @return the value of field 'Estado'.
     */
    public java.lang.String getEstado(
    ) {
        return this._estado;
    }

    /**
     * Returns the value of field 'localidad'. The field
     * 'localidad' has the following description: Atributo opcional
     * que sirve para precisar la ciudad o población donde se da
     * la ubicación.
     * 
     * @return the value of field 'Localidad'.
     */
    public java.lang.String getLocalidad(
    ) {
        return this._localidad;
    }

    /**
     * Returns the value of field 'municipio'. The field
     * 'municipio' has the following description: Atributo opcional
     * que sirve para precisar el municipio o delegación (en el
     * caso del Distrito Federal) en donde se da la ubicación.
     * 
     * @return the value of field 'Municipio'.
     */
    public java.lang.String getMunicipio(
    ) {
        return this._municipio;
    }

    /**
     * Returns the value of field 'noExterior'. The field
     * 'noExterior' has the following description: Este atributo
     * opcional sirve para expresar el número particular en donde
     * se da la ubicación sobre una calle dada.
     * 
     * @return the value of field 'NoExterior'.
     */
    public java.lang.String getNoExterior(
    ) {
        return this._noExterior;
    }

    /**
     * Returns the value of field 'noInterior'. The field
     * 'noInterior' has the following description: Este atributo
     * opcional sirve para expresar información adicional para
     * especificar la ubicación cuando calle y número exterior
     * (noExterior) no resulten suficientes para determinar la
     * ubicación de forma precisa.
     * 
     * @return the value of field 'NoInterior'.
     */
    public java.lang.String getNoInterior(
    ) {
        return this._noInterior;
    }

    /**
     * Returns the value of field 'pais'. The field 'pais' has the
     * following description: Atributo requerido que sirve para
     * precisar el país donde se da la ubicación.
     * 
     * @return the value of field 'Pais'.
     */
    public java.lang.String getPais(
    ) {
        return this._pais;
    }

    /**
     * Returns the value of field 'referencia'. The field
     * 'referencia' has the following description: Atributo
     * opcional para expresar una referencia de ubicación
     * adicional.
     * 
     * @return the value of field 'Referencia'.
     */
    public java.lang.String getReferencia(
    ) {
        return this._referencia;
    }

    /**
     * Sets the value of field 'calle'. The field 'calle' has the
     * following description: Este atributo opcional sirve para
     * precisar la avenida, calle, camino o carretera donde se da
     * la ubicación.
     * 
     * @param calle the value of field 'calle'.
     */
    @XmlAttribute
    public void setCalle(
            final java.lang.String calle) {
        this._calle = calle;
    }

    /**
     * Sets the value of field 'codigoPostal'. The field
     * 'codigoPostal' has the following description: Atributo
     * opcional que sirve para asentar el código postal en donde
     * se da la ubicación.
     * 
     * @param codigoPostal the value of field 'codigoPostal'.
     */
    
    @XmlAttribute
    public void setCodigoPostal(
            final java.lang.String codigoPostal) {
        this._codigoPostal = codigoPostal;
    }

    /**
     * Sets the value of field 'colonia'. The field 'colonia' has
     * the following description: Este atributo opcional sirve para
     * precisar la colonia en donde se da la ubicación cuando se
     * desea ser más específico en casos de ubicaciones urbanas.
     * 
     * @param colonia the value of field 'colonia'.
     */
    @XmlAttribute
    public void setColonia(
            final java.lang.String colonia) {
        this._colonia = colonia;
    }

    /**
     * Sets the value of field 'estado'. The field 'estado' has the
     * following description: Atributo opcional que sirve para
     * precisar el estado o entidad federativa donde se da la
     * ubicación.
     * 
     * @param estado the value of field 'estado'.
     */
    @XmlAttribute
    public void setEstado(
            final java.lang.String estado) {
        this._estado = estado;
    }

    /**
     * Sets the value of field 'localidad'. The field 'localidad'
     * has the following description: Atributo opcional que sirve
     * para precisar la ciudad o población donde se da la
     * ubicación.
     * 
     * @param localidad the value of field 'localidad'.
     */
    @XmlAttribute
    public void setLocalidad(
            final java.lang.String localidad) {
        this._localidad = localidad;
    }

    /**
     * Sets the value of field 'municipio'. The field 'municipio'
     * has the following description: Atributo opcional que sirve
     * para precisar el municipio o delegación (en el caso del
     * Distrito Federal) en donde se da la ubicación.
     * 
     * @param municipio the value of field 'municipio'.
     */
    @XmlAttribute
    public void setMunicipio(
            final java.lang.String municipio) {
        this._municipio = municipio;
    }

    /**
     * Sets the value of field 'noExterior'. The field 'noExterior'
     * has the following description: Este atributo opcional sirve
     * para expresar el número particular en donde se da la
     * ubicación sobre una calle dada.
     * 
     * @param noExterior the value of field 'noExterior'.
     */
    @XmlAttribute
    public void setNoExterior(
            final java.lang.String noExterior) {
        this._noExterior = noExterior;
    }

    /**
     * Sets the value of field 'noInterior'. The field 'noInterior'
     * has the following description: Este atributo opcional sirve
     * para expresar información adicional para especificar la
     * ubicación cuando calle y número exterior (noExterior) no
     * resulten suficientes para determinar la ubicación de forma
     * precisa.
     * 
     * @param noInterior the value of field 'noInterior'.
     */
    @XmlAttribute
    public void setNoInterior(
            final java.lang.String noInterior) {
        this._noInterior = noInterior;
    }

    /**
     * Sets the value of field 'pais'. The field 'pais' has the
     * following description: Atributo requerido que sirve para
     * precisar el país donde se da la ubicación.
     * 
     * @param pais the value of field 'pais'.
     */
    @XmlAttribute
    public void setPais(
            final java.lang.String pais) {
        this._pais = pais;
    }

    /**
     * Sets the value of field 'referencia'. The field 'referencia'
     * has the following description: Atributo opcional para
     * expresar una referencia de ubicación adicional.
     * 
     * @param referencia the value of field 'referencia'.
     */
    @XmlAttribute
    public void setReferencia(
            final java.lang.String referencia) {
        this._referencia = referencia;
    }

}
