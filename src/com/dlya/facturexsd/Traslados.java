package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlElement;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo opcional para asentar o referir los impuestos trasladados
 * aplicables
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Traslados implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Nodo para la información detallada de un traslado de
     * impuesto específico
     */
    private java.util.Vector<Traslado> _trasladoList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Traslados() {
        super();
        this._trasladoList = new java.util.Vector<Traslado>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTraslado
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTraslado(
            final Traslado vTraslado)
    throws java.lang.IndexOutOfBoundsException {
        this._trasladoList.addElement(vTraslado);
    }

    /**
     * 
     * 
     * @param index
     * @param vTraslado
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    
    public void addTraslado(
            final int index,
            final Traslado vTraslado)
    throws java.lang.IndexOutOfBoundsException {
        this._trasladoList.add(index, vTraslado);
    }

    /**
     * Method enumerateTraslado.
     * 
     * @return an Enumeration over all Traslado elements
     */
    public java.util.Enumeration<? extends Traslado> enumerateTraslado(
    ) {
        return this._trasladoList.elements();
    }

    /**
     * Method getTraslado.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Traslado at the given index
     */
    public Traslado getTraslado(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trasladoList.size()) {
            throw new IndexOutOfBoundsException("getTraslado: Index value '" + index + "' not in range [0.." + (this._trasladoList.size() - 1) + "]");
        }

        return (Traslado) _trasladoList.get(index);
    }

    /**
     * Method getTraslado.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Traslado[] getTraslado(
    ) {
        Traslado[] array = new Traslado[0];
        return (Traslado[]) this._trasladoList.toArray(array);
    }

    /**
     * Method getTrasladoCount.
     * 
     * @return the size of this collection
     */
    public int getTrasladoCount(
    ) {
        return this._trasladoList.size();
    }

    /**
     */
    public void removeAllTraslado(
    ) {
        this._trasladoList.clear();
    }

    /**
     * Method removeTraslado.
     * 
     * @param vTraslado
     * @return true if the object was removed from the collection.
     */
    public boolean removeTraslado(
            final Traslado vTraslado) {
        boolean removed = _trasladoList.remove(vTraslado);
        return removed;
    }

    /**
     * Method removeTrasladoAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Traslado removeTrasladoAt(
            final int index) {
        java.lang.Object obj = this._trasladoList.remove(index);
        return (Traslado) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTraslado
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTraslado(
            final int index,
            final Traslado vTraslado)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._trasladoList.size()) {
            throw new IndexOutOfBoundsException("setTraslado: Index value '" + index + "' not in range [0.." + (this._trasladoList.size() - 1) + "]");
        }

        this._trasladoList.set(index, vTraslado);
    }

    /**
     * 
     * 
     * @param vTrasladoArray
     */
    @XmlElement(name = "Traslado")
    public void setTraslado(
            final Traslado[] vTrasladoArray) {
        //-- copy array
        _trasladoList.clear();

        for (int i = 0; i < vTrasladoArray.length; i++) {
                this._trasladoList.add(vTrasladoArray[i]);
        }
    }

}
