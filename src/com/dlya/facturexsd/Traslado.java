package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.dlya.facturetype.TrasladoImpuestoType;

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo para la información detallada de un traslado de impuesto
 * específico
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Traslado implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para señalar el tipo de impuesto
     * trasladado
     */
    private TrasladoImpuestoType _impuesto;

    /**
     * Atributo requerido para señalar la tasa del impuesto que se
     * traslada por cada concepto amparado en el comprobante
     */
    private java.math.BigDecimal _tasa;

    /**
     * Atributo requerido para señalar el importe del impuesto
     * trasladado
     */
    private java.math.BigDecimal _importe;


      //----------------/
     //- Constructors -/
    //----------------/

    public Traslado() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'importe'. The field 'importe'
     * has the following description: Atributo requerido para
     * señalar el importe del impuesto trasladado
     * 
     * @return the value of field 'Importe'.
     */
    public java.math.BigDecimal getImporte(
    ) {
        return this._importe;
    }

    /**
     * Returns the value of field 'impuesto'. The field 'impuesto'
     * has the following description: Atributo requerido para
     * señalar el tipo de impuesto trasladado
     * 
     * @return the value of field 'Impuesto'.
     */
    public TrasladoImpuestoType getImpuesto(
    ) {
        return this._impuesto;
    }

    /**
     * Returns the value of field 'tasa'. The field 'tasa' has the
     * following description: Atributo requerido para señalar la
     * tasa del impuesto que se traslada por cada concepto amparado
     * en el comprobante
     * 
     * @return the value of field 'Tasa'.
     */
    public java.math.BigDecimal getTasa(
    ) {
        return this._tasa;
    }

    /**
     * Sets the value of field 'importe'. The field 'importe' has
     * the following description: Atributo requerido para señalar
     * el importe del impuesto trasladado
     * 
     * @param importe the value of field 'importe'.
     */
    @XmlAttribute(name = "importe")
    public void setImporte(
            final java.math.BigDecimal importe) {
        this._importe = importe;
    }

    /**
     * Sets the value of field 'impuesto'. The field 'impuesto' has
     * the following description: Atributo requerido para señalar
     * el tipo de impuesto trasladado
     * 
     * @param impuesto the value of field 'impuesto'.
     */
    @XmlAttribute(name = "impuesto")
    public void setImpuesto(
            final TrasladoImpuestoType impuesto) {
        this._impuesto = impuesto;
    }

    /**
     * Sets the value of field 'tasa'. The field 'tasa' has the
     * following description: Atributo requerido para señalar la
     * tasa del impuesto que se traslada por cada concepto amparado
     * en el comprobante
     * 
     * @param tasa the value of field 'tasa'.
     */
    @XmlAttribute(name = "tasa")
    public void setTasa(
            final java.math.BigDecimal tasa) {
        this._tasa = tasa;
    }

}
