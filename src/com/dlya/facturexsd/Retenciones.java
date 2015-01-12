package com.dlya.facturexsd;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo opcional para capturar los impuestos retenidos aplicables
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Retenciones implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Nodo para la información detallada de una retención de
     * impuesto específico
     */
    private java.util.Vector<Retencion> _retencionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Retenciones() {
        super();
        this._retencionList = new java.util.Vector<Retencion>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRetencion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRetencion(
            final Retencion vRetencion)
    throws java.lang.IndexOutOfBoundsException {
        this._retencionList.addElement(vRetencion);
    }

    /**
     * 
     * 
     * @param index
     * @param vRetencion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRetencion(
            final int index,
            final Retencion vRetencion)
    throws java.lang.IndexOutOfBoundsException {
        this._retencionList.add(index, vRetencion);
    }

    /**
     * Method enumerateRetencion.
     * 
     * @return an Enumeration over all Retencion elements
     */
    public java.util.Enumeration<? extends Retencion> enumerateRetencion(
    ) {
        return this._retencionList.elements();
    }

    /**
     * Method getRetencion.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Retencion at the given index
     */
    public Retencion getRetencion(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._retencionList.size()) {
            throw new IndexOutOfBoundsException("getRetencion: Index value '" + index + "' not in range [0.." + (this._retencionList.size() - 1) + "]");
        }

        return (Retencion) _retencionList.get(index);
    }

    /**
     * Method getRetencion.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Retencion[] getRetencion(
    ) {
        Retencion[] array = new Retencion[0];
        return (Retencion[]) this._retencionList.toArray(array);
    }

    /**
     * Method getRetencionCount.
     * 
     * @return the size of this collection
     */
    public int getRetencionCount(
    ) {
        return this._retencionList.size();
    }

    /**
     */
    public void removeAllRetencion(
    ) {
        this._retencionList.clear();
    }

    /**
     * Method removeRetencion.
     * 
     * @param vRetencion
     * @return true if the object was removed from the collection.
     */
    public boolean removeRetencion(
            final Retencion vRetencion) {
        boolean removed = _retencionList.remove(vRetencion);
        return removed;
    }

    /**
     * Method removeRetencionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Retencion removeRetencionAt(
            final int index) {
        java.lang.Object obj = this._retencionList.remove(index);
        return (Retencion) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRetencion
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRetencion(
            final int index,
            final Retencion vRetencion)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._retencionList.size()) {
            throw new IndexOutOfBoundsException("setRetencion: Index value '" + index + "' not in range [0.." + (this._retencionList.size() - 1) + "]");
        }

        this._retencionList.set(index, vRetencion);
    }

    /**
     * 
     * 
     * @param vRetencionArray
     */
    public void setRetencion(
            final Retencion[] vRetencionArray) {
        //-- copy array
        _retencionList.clear();

        for (int i = 0; i < vRetencionArray.length; i++) {
                this._retencionList.add(vRetencionArray[i]);
        }
    }

}
