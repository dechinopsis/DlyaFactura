package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlElement;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Class EmisorSequence.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class EmisorSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Nodo requerido para incorporar los regímenes en los que
     * tributa el contribuyente emisor. Puede contener más de un
     * régimen.
     */
    private java.util.Vector<RegimenFiscal> _regimenFiscalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public EmisorSequence() {
        super();
        this._regimenFiscalList = new java.util.Vector<RegimenFiscal>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vRegimenFiscal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRegimenFiscal(
            final RegimenFiscal vRegimenFiscal)
    throws java.lang.IndexOutOfBoundsException {
        this._regimenFiscalList.addElement(vRegimenFiscal);
    }

    /**
     * 
     * 
     * @param index
     * @param vRegimenFiscal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addRegimenFiscal(
            final int index,
            final RegimenFiscal vRegimenFiscal)
    throws java.lang.IndexOutOfBoundsException {
        this._regimenFiscalList.add(index, vRegimenFiscal);
    }

    /**
     * Method enumerateRegimenFiscal.
     * 
     * @return an Enumeration over all RegimenFiscal elements
     */
    public java.util.Enumeration<? extends RegimenFiscal> enumerateRegimenFiscal(
    ) {
        return this._regimenFiscalList.elements();
    }

    /**
     * Method getRegimenFiscal.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the RegimenFiscal at the given index
     */
    public RegimenFiscal getRegimenFiscal(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._regimenFiscalList.size()) {
            throw new IndexOutOfBoundsException("getRegimenFiscal: Index value '" + index + "' not in range [0.." + (this._regimenFiscalList.size() - 1) + "]");
        }

        return (RegimenFiscal) _regimenFiscalList.get(index);
    }

    /**
     * Method getRegimenFiscal.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public RegimenFiscal[] getRegimenFiscal(
    ) {
        RegimenFiscal[] array = new RegimenFiscal[0];
        return (RegimenFiscal[]) this._regimenFiscalList.toArray(array);
    }

    /**
     * Method getRegimenFiscalCount.
     * 
     * @return the size of this collection
     */
    public int getRegimenFiscalCount(
    ) {
        return this._regimenFiscalList.size();
    }

    /**
     */
    public void removeAllRegimenFiscal(
    ) {
        this._regimenFiscalList.clear();
    }

    /**
     * Method removeRegimenFiscal.
     * 
     * @param vRegimenFiscal
     * @return true if the object was removed from the collection.
     */
    public boolean removeRegimenFiscal(
            final RegimenFiscal vRegimenFiscal) {
        boolean removed = _regimenFiscalList.remove(vRegimenFiscal);
        return removed;
    }

    /**
     * Method removeRegimenFiscalAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public RegimenFiscal removeRegimenFiscalAt(
            final int index) {
        java.lang.Object obj = this._regimenFiscalList.remove(index);
        return (RegimenFiscal) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vRegimenFiscal
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setRegimenFiscal(
            final int index,
            final RegimenFiscal vRegimenFiscal)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._regimenFiscalList.size()) {
            throw new IndexOutOfBoundsException("setRegimenFiscal: Index value '" + index + "' not in range [0.." + (this._regimenFiscalList.size() - 1) + "]");
        }

        this._regimenFiscalList.set(index, vRegimenFiscal);
    }

    /**
     * 
     * 
     * @param vRegimenFiscalArray
     */
    
    @XmlElement(namespace="http://www.sat.gob.mx/cfd/3" ,name="Regimen")
    public void setRegimenFiscal(
            final RegimenFiscal[] vRegimenFiscalArray) {
        //-- copy array
        _regimenFiscalList.clear();

        for (int i = 0; i < vRegimenFiscalArray.length; i++) {
                this._regimenFiscalList.add(vRegimenFiscalArray[i]);
        }
    }

}
