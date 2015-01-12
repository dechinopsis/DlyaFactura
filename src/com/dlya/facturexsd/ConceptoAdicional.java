package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */
import javax.xml.bind.annotation.XmlType;

/**
 * Nodo para introducir la información detallada de un bien o
 * servicio amparado en el comprobante.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")

public class ConceptoAdicional implements java.io.Serializable {

	  //--------------------------/
    //- Class/Member Variables -/
   //--------------------------/
	
	/**
     * Atributo requerido para precisar la descripción del bien o
     * servicio cubierto por el presente concepto.
     */
	
    private java.lang.String _descripcion;

        /**
     * Atributo requerido para precisar el importe total de los
     * bienes o servicios del presente concepto. Debe ser
     * equivalente al resultado de multiplicar la cantidad por el
     * valor unitario expresado en el concepto.
     */
	
    private java.math.BigDecimal _importe;
    
    /**
     * Returns the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por el presente concepto.
     * 
     * @return the value of field 'Descripcion'.
     */
    public java.lang.String getDescripcion() {
    	return this._descripcion;
    }
    
    /**
     * Returns the value of field 'importe'. The field 'importe'
     * has the following description: Atributo requerido para
     * precisar el importe total de los bienes o servicios del
     * presente concepto. Debe ser equivalente al resultado de
     * multiplicar la cantidad por el valor unitario expresado en
     * el concepto.
     * 
     * @return the value of field 'Importe'.
     */
    public java.math.BigDecimal getImporte() {
        return this._importe;
    }
    
    /**
     * Sets the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por el presente concepto.
     * 
     * @param descripcion the value of field 'descripcion'.
     */
    @XmlAttribute
    public void setDescripcion(final java.lang.String descripcion) {
        this._descripcion = descripcion;
    }
    
    /**
     * Sets the value of field 'importe'. The field 'importe' has
     * the following description: Atributo requerido para precisar
     * el importe total de los bienes o servicios del presente
     * concepto. Debe ser equivalente al resultado de multiplicar
     * la cantidad por el valor unitario expresado en el concepto.
     * 
     * @param importe the value of field 'importe'.
     */
    @XmlAttribute
    public void setImporte(final java.math.BigDecimal importe) {
        this._importe = importe;
    }
   
    
}
