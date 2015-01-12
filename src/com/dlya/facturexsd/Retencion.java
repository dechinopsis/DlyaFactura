package com.dlya.facturexsd;

import com.dlya.facturetype.RetencionImpuestoType;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo para la información detallada de una retención de
 * impuesto específico
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Retencion implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para señalar el tipo de impuesto retenido
     */
    private RetencionImpuestoType _impuesto;

    /**
     * Atributo requerido para señalar el importe o monto del
     * impuesto retenido
     */
    private java.math.BigDecimal _importe;


      //----------------/
     //- Constructors -/
    //----------------/

    public Retencion() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'importe'. The field 'importe'
     * has the following description: Atributo requerido para
     * señalar el importe o monto del impuesto retenido
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
     * señalar el tipo de impuesto retenido
     * 
     * @return the value of field 'Impuesto'.
     */
    public RetencionImpuestoType getImpuesto(
    ) {
        return this._impuesto;
    }

    /**
     * Sets the value of field 'importe'. The field 'importe' has
     * the following description: Atributo requerido para señalar
     * el importe o monto del impuesto retenido
     * 
     * @param importe the value of field 'importe'.
     */
    public void setImporte(
            final java.math.BigDecimal importe) {
        this._importe = importe;
    }

    /**
     * Sets the value of field 'impuesto'. The field 'impuesto' has
     * the following description: Atributo requerido para señalar
     * el tipo de impuesto retenido
     * 
     * @param impuesto the value of field 'impuesto'.
     */
    public void setImpuesto(
            final RetencionImpuestoType impuesto) {
        this._impuesto = impuesto;
    }

}
