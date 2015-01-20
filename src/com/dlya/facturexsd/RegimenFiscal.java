package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo requerido para incorporar los regímenes en los que tributa
 * el contribuyente emisor. Puede contener más de un régimen.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class RegimenFiscal implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para incorporar el nombre del régimen en
     * el que tributa el contribuyente emisor.
     */
    private java.lang.String _regimen;


      //----------------/
     //- Constructors -/
    //----------------/

    public RegimenFiscal() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'regimen'. The field 'regimen'
     * has the following description: Atributo requerido para
     * incorporar el nombre del régimen en el que tributa el
     * contribuyente emisor.
     * 
     * @return the value of field 'Regimen'.
     */
    
    public java.lang.String getRegimen(
    ) {
        return this._regimen;
    }

    /**
     * Sets the value of field 'regimen'. The field 'regimen' has
     * the following description: Atributo requerido para
     * incorporar el nombre del régimen en el que tributa el
     * contribuyente emisor.
     * 
     * @param regimen the value of field 'regimen'.
     */
    @XmlAttribute(name="Regimen")
    public void setRegimen(
            final java.lang.String regimen) {
        this._regimen = regimen;
    }

}
