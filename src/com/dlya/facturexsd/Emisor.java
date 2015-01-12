package com.dlya.facturexsd;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo requerido para expresar la información del contribuyente
 * emisor del comprobante.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")


public class Emisor implements java.io.Serializable {

	 
      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para la Clave del Registro Federal de
     * Contribuyentes correspondiente al contribuyente emisor del
     * comprobante sin guiones o espacios.
     */
	
    private java.lang.String _rfc;

    /**
     * Atributo requerido para el nombre o razón social del
     * contribuyente emisor del comprobante.
     */

    private java.lang.String _nombre;

    /**
     * Nodo requerido para precisar la información de ubicación
     * del domicilio fiscal del contribuyente emisor
     */
    
    private DomicilioFiscal _domicilioFiscal;
        

    /**
     * Nodo opcional para precisar la información de ubicación
     * del domicilio en donde es emitido el comprobante fiscal en
     * caso de que sea distinto del domicilio fiscal del
     * contribuyente emisor.
     */
    private ExpedidoEn _expedidoEn;
    /**
     * Field _emisorSequence.
     */
    
    
    //private EmisorSequence _emisorSequence;
    private RegimenFiscal _regimen;
    
    

      //----------------/
     //- Constructors -/
    //----------------/

    public Emisor() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/
    
    /**
     * Returns the value of field 'emisorSequence'.
     * 
     * @return the value of field 'EmisorSequence'.
     */
    /*
    public EmisorSequence getEmisorSequence(
    ) {
        return this._emisorSequence;
    }
     */
    

    /**
     * Returns the value of field 'domicilioFiscal'. The field
     * 'domicilioFiscal' has the following description: Nodo
     * requerido para precisar la información de ubicación del
     * domicilio fiscal del contribuyente emisor
     * 
     * @return the value of field 'DomicilioFiscal'.
     */
    public DomicilioFiscal getDomicilioFiscal(
    ) {
        return this._domicilioFiscal;
    }

    /**
     * Returns the value of field 'expedidoEn'. The field
     * 'expedidoEn' has the following description: Nodo opcional
     * para precisar la información de ubicación del domicilio en
     * donde es emitido el comprobante fiscal en caso de que sea
     * distinto del domicilio fiscal del contribuyente emisor.
     * 
     * @return the value of field 'ExpedidoEn'.
     */
    public ExpedidoEn getExpedidoEn(
    ) {
        return this._expedidoEn;
    }

    /**
     * Returns the value of field 'nombre'. The field 'nombre' has
     * the following description: Atributo requerido para el nombre
     * o razón social del contribuyente emisor del comprobante.
     * 
     * @return the value of field 'Nombre'.
     */
    public java.lang.String getNombre(
    ) {
        return this._nombre;
    }

    /**
     * Returns the value of field 'rfc'. The field 'rfc' has the
     * following description: Atributo requerido para la Clave del
     * Registro Federal de Contribuyentes correspondiente al
     * contribuyente emisor del comprobante sin guiones o espacios.
     * 
     * @return the value of field 'Rfc'.
     */
    public java.lang.String getRfc(
    ) {
        return this._rfc;
    }

    
    /**
     * Sets the value of field 'emisorSequence'.
     * 
     * @param emisorSequence the value of field 'emisorSequence'.
     */
    
    /*
    @XmlElement(namespace="http://www.sat.gob.mx/cfd/3" ,name="RegimenFiscal")
    public void setEmisorSequence(
            final EmisorSequence emisorSequence) {
        this._emisorSequence = emisorSequence;
    }
    */
    
    

    
    /**
     * Sets the value of field 'domicilioFiscal'. The field
     * 'domicilioFiscal' has the following description: Nodo
     * requerido para precisar la información de ubicación del
     * domicilio fiscal del contribuyente emisor
     * 
     * @param domicilioFiscal the value of field 'domicilioFiscal'.
     */

    @XmlElement(name="DomicilioFiscal")
    public void setDomicilioFiscal(
            final DomicilioFiscal domicilioFiscal) {
        this._domicilioFiscal = domicilioFiscal;
    }

    public RegimenFiscal getRegimen() {
		return _regimen;
	}

    @XmlElement(name="RegimenFiscal")
	public void setRegimen(RegimenFiscal _regimen) {
		this._regimen = _regimen;	
	}


	/**
     * Sets the value of field 'expedidoEn'. The field 'expedidoEn'
     * has the following description: Nodo opcional para precisar
     * la información de ubicación del domicilio en donde es
     * emitido el comprobante fiscal en caso de que sea distinto
     * del domicilio fiscal del contribuyente emisor.
     * 
     * @param expedidoEn the value of field 'expedidoEn'.
     */
    
    @XmlElement(name="ExpedidoEn")
    public void setExpedidoEn(
            final ExpedidoEn expedidoEn) {
        this._expedidoEn = expedidoEn;
    }

    /**
     * Sets the value of field 'nombre'. The field 'nombre' has the
     * following description: Atributo requerido para el nombre o
     * razón social del contribuyente emisor del comprobante.
     * 
     * @param nombre the value of field 'nombre'.
     */
    @XmlAttribute
    public void setNombre(
            final java.lang.String nombre) {
        this._nombre = nombre;
    }

    /**
     * Sets the value of field 'rfc'. The field 'rfc' has the
     * following description: Atributo requerido para la Clave del
     * Registro Federal de Contribuyentes correspondiente al
     * contribuyente emisor del comprobante sin guiones o espacios.
     * 
     * @param rfc the value of field 'rfc'.
     */
    @XmlAttribute
    public void setRfc(
            final java.lang.String rfc) {
        this._rfc = rfc;
    }

}
