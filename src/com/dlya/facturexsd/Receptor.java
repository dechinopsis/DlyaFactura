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
 * Nodo requerido para precisar la información del contribuyente
 * receptor del comprobante.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Receptor implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para precisar la Clave del Registro
     * Federal de Contribuyentes correspondiente al contribuyente
     * receptor del comprobante.
     */
    private java.lang.String _rfc;

    /**
     * Atributo opcional para precisar el nombre o razón social
     * del contribuyente receptor.
     */
    private java.lang.String _nombre;

    /**
     * Nodo opcional para la definición de la ubicación donde se
     * da el domicilio del receptor del comprobante fiscal.
     */
    private Domicilio _domicilio;


      //----------------/
     //- Constructors -/
    //----------------/

    public Receptor() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'domicilio'. The field
     * 'domicilio' has the following description: Nodo opcional
     * para la definición de la ubicación donde se da el
     * domicilio del receptor del comprobante fiscal.
     * 
     * @return the value of field 'Domicilio'.
     */
    public Domicilio getDomicilio(
    ) {
        return this._domicilio;
    }

    /**
     * Returns the value of field 'nombre'. The field 'nombre' has
     * the following description: Atributo opcional para precisar
     * el nombre o razón social del contribuyente receptor.
     * 
     * @return the value of field 'Nombre'.
     */
    public java.lang.String getNombre(
    ) {
        return this._nombre;
    }

    /**
     * Returns the value of field 'rfc'. The field 'rfc' has the
     * following description: Atributo requerido para precisar la
     * Clave del Registro Federal de Contribuyentes correspondiente
     * al contribuyente receptor del comprobante.
     * 
     * @return the value of field 'Rfc'.
     */
    public java.lang.String getRfc(
    ) {
        return this._rfc;
    }

    /**
     * Sets the value of field 'domicilio'. The field 'domicilio'
     * has the following description: Nodo opcional para la
     * definición de la ubicación donde se da el domicilio del
     * receptor del comprobante fiscal.
     * 
     * @param domicilio the value of field 'domicilio'.
     */
    @XmlElement(name="Domicilio")
    public void setDomicilio(
            final Domicilio domicilio) {
        this._domicilio = domicilio;
    }

    /**
     * Sets the value of field 'nombre'. The field 'nombre' has the
     * following description: Atributo opcional para precisar el
     * nombre o razón social del contribuyente receptor.
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
     * following description: Atributo requerido para precisar la
     * Clave del Registro Federal de Contribuyentes correspondiente
     * al contribuyente receptor del comprobante.
     * 
     * @param rfc the value of field 'rfc'.
     */
    @XmlAttribute
    public void setRfc(
            final java.lang.String rfc) {
        this._rfc = rfc;
    }

}
