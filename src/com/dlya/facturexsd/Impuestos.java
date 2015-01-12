package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */
import javax.xml.bind.annotation.XmlElement;

/**
 * Nodo requerido para capturar los impuestos aplicables.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Impuestos implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo opcional para expresar el total de los impuestos
     * retenidos que se desprenden de los conceptos expresados en
     * el comprobante fiscal digital.
     */
    private java.math.BigDecimal _totalImpuestosRetenidos;

    /**
     * Atributo opcional para expresar el total de los impuestos
     * trasladados que se desprenden de los conceptos expresados en
     * el comprobante fiscal digital.
     */
    private java.math.BigDecimal _totalImpuestosTrasladados;

    /**
     * Nodo opcional para capturar los impuestos retenidos aplicable
     */
    private Retenciones _retenciones;

    /**
     * Nodo opcional para asentar o referir los impuestos
     * trasladados aplicables
     */
    private Traslados _traslados;


      //----------------/
     //- Constructors -/
    //----------------/

    public Impuestos() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'retenciones'. The field
     * 'retenciones' has the following description: Nodo opcional
     * para capturar los impuestos retenidos aplicables
     * 
     * @return the value of field 'Retenciones'.
     */
    public Retenciones getRetenciones(
    ) {
        return this._retenciones;
    }

    /**
     * Returns the value of field 'totalImpuestosRetenidos'. The
     * field 'totalImpuestosRetenidos' has the following
     * description: Atributo opcional para expresar el total de los
     * impuestos retenidos que se desprenden de los conceptos
     * expresados en el comprobante fiscal digital.
     * 
     * @return the value of field 'TotalImpuestosRetenidos'.
     */
    public java.math.BigDecimal getTotalImpuestosRetenidos(
    ) {
        return this._totalImpuestosRetenidos;
    }

    /**
     * Returns the value of field 'totalImpuestosTrasladados'. The
     * field 'totalImpuestosTrasladados' has the following
     * description: Atributo opcional para expresar el total de los
     * impuestos trasladados que se desprenden de los conceptos
     * expresados en el comprobante fiscal digital.
     * 
     * @return the value of field 'TotalImpuestosTrasladados'.
     */
    public java.math.BigDecimal getTotalImpuestosTrasladados(
    ) {
        return this._totalImpuestosTrasladados;
    }

    /**
     * Returns the value of field 'traslados'. The field
     * 'traslados' has the following description: Nodo opcional
     * para asentar o referir los impuestos trasladados aplicables
     * 
     * @return the value of field 'Traslados'.
     */
    public Traslados getTraslados(
    ) {
        return this._traslados;
    }

    /**
     * Sets the value of field 'retenciones'. The field
     * 'retenciones' has the following description: Nodo opcional
     * para capturar los impuestos retenidos aplicables
     * 
     * @param retenciones the value of field 'retenciones'.
     */
    public void setRetenciones(
            final Retenciones retenciones) {
        this._retenciones = retenciones;
    }

    /**
     * Sets the value of field 'totalImpuestosRetenidos'. The field
     * 'totalImpuestosRetenidos' has the following description:
     * Atributo opcional para expresar el total de los impuestos
     * retenidos que se desprenden de los conceptos expresados en
     * el comprobante fiscal digital.
     * 
     * @param totalImpuestosRetenidos the value of field
     * 'totalImpuestosRetenidos'.
     */
    public void setTotalImpuestosRetenidos(
            final java.math.BigDecimal totalImpuestosRetenidos) {
        this._totalImpuestosRetenidos = totalImpuestosRetenidos;
    }

    /**
     * Sets the value of field 'totalImpuestosTrasladados'. The
     * field 'totalImpuestosTrasladados' has the following
     * description: Atributo opcional para expresar el total de los
     * impuestos trasladados que se desprenden de los conceptos
     * expresados en el comprobante fiscal digital.
     * 
     * @param totalImpuestosTrasladados the value of field
     * 'totalImpuestosTrasladados'.
     */
    @XmlAttribute(name = "totalImpuestosTrasladados")
    public void setTotalImpuestosTrasladados(
            final java.math.BigDecimal totalImpuestosTrasladados) {
        this._totalImpuestosTrasladados = totalImpuestosTrasladados;
    }

    /**
     * Sets the value of field 'traslados'. The field 'traslados'
     * has the following description: Nodo opcional para asentar o
     * referir los impuestos trasladados aplicables
     * 
     * @param traslados the value of field 'traslados'.
     */
    @XmlElement(name = "Traslados")
    public void setTraslados(
            final Traslados traslados) {
        this._traslados = traslados;
    }

}
