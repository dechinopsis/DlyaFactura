package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlElement;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo requerido para enlistar los conceptos cubiertos por el
 * comprobante.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Conceptos implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Nodo para introducir la información detallada de un bien o
     * servicio amparado en el comprobante.
     */
	
	private java.util.Vector<Concepto> _conceptoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Conceptos() {
        super();
        this._conceptoList = new java.util.Vector<Concepto>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vConcepto
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    
    public void addConcepto(
            final Concepto vConcepto)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptoList.addElement(vConcepto);
    }

    /**
     * 
     * 
     * @param index
     * @param vConcepto
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addConcepto(
            final int index,
            final Concepto vConcepto)
    throws java.lang.IndexOutOfBoundsException {
        this._conceptoList.add(index, vConcepto);
    }

    /**
     * Method enumerateConcepto.
     * 
     * @return an Enumeration over all Concepto elements
     */
    public java.util.Enumeration<? extends Concepto> enumerateConcepto(
    ) {
        return this._conceptoList.elements();
    }

    /**
     * Method getConcepto.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Concepto at the given index
     */
    public Concepto getConcepto(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptoList.size()) {
            throw new IndexOutOfBoundsException("getConcepto: Index value '" + index + "' not in range [0.." + (this._conceptoList.size() - 1) + "]");
        }

        return (Concepto) _conceptoList.get(index);
    }

    /**
     * Method getConcepto.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Concepto[] getConcepto(
    ) {
        Concepto[] array = new Concepto[0];
        return (Concepto[]) this._conceptoList.toArray(array);
    }

    /**
     * Method getConceptoCount.
     * 
     * @return the size of this collection
     */
    public int getConceptoCount(
    ) {
        return this._conceptoList.size();
    }

    /**
     */
    public void removeAllConcepto(
    ) {
        this._conceptoList.clear();
    }

    /**
     * Method removeConcepto.
     * 
     * @param vConcepto
     * @return true if the object was removed from the collection.
     */
    public boolean removeConcepto(
            final Concepto vConcepto) {
        boolean removed = _conceptoList.remove(vConcepto);
        return removed;
    }

    /**
     * Method removeConceptoAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Concepto removeConceptoAt(
            final int index) {
        java.lang.Object obj = this._conceptoList.remove(index);
        return (Concepto) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vConcepto
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    //@XmlElement(namespace="http://www.sat.gob.mx/cfd/3" ,name="Concepto")
    public void setConcepto(
            final int index,
            final Concepto vConcepto)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._conceptoList.size()) {
            throw new IndexOutOfBoundsException("setConcepto: Index value '" + index + "' not in range [0.." + (this._conceptoList.size() - 1) + "]");
        }

        this._conceptoList.set(index, vConcepto);
    }

    /**
     * 
     * 
     * @param vConceptoArray
     */
    @XmlElement(name="Concepto")
    public void setConcepto(
            final Concepto[] vConceptoArray) {
        //-- copy array
        _conceptoList.clear();

        for (int i = 0; i < vConceptoArray.length; i++) {
                this._conceptoList.add(vConceptoArray[i]);
        }
    }

}
