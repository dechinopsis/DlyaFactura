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
public class ConceptosAdicionales implements java.io.Serializable {


    //--------------------------/
   //- Class/Member Variables -/
  //--------------------------/

  /**
   * Nodo para introducir la información detallada de un bien o
   * servicio amparado en el comprobante.
   */
	
	private java.util.Vector<ConceptoAdicional> _conceptoAdicionalList;
	
	  //----------------/
    //- Constructors -/
   //----------------/

   public ConceptosAdicionales() {
       super();
       this._conceptoAdicionalList = new java.util.Vector<ConceptoAdicional>();
   }
   
   //-----------/
   //- Methods -/
  //-----------/

  /**
   * 
   * 
   * @param vConceptoAdicional
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  
  public void addConceptoAdicional(
          final ConceptoAdicional vConceptoAdicional)
  throws java.lang.IndexOutOfBoundsException {
      this._conceptoAdicionalList.addElement(vConceptoAdicional);
  }

  /**
   * 
   * 
   * @param index
   * @param vConceptoAdicional
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  public void addConceptoAdicional(
          final int index,
          final ConceptoAdicional vConceptoAdicional)
  throws java.lang.IndexOutOfBoundsException {
      this._conceptoAdicionalList.add(index, vConceptoAdicional);
  }
  
  /**
   * Method enumerateConceptoAdicional.
   * 
   * @return an Enumeration over all ConceptoAdicional elements
   */
  public java.util.Enumeration<? extends ConceptoAdicional> enumerateConceptoAdicional(
  ) {
      return this._conceptoAdicionalList.elements();
  }

  /**
   * Method getConceptoAdicional.
   * 
   * @param index
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   * @return the value of the ConceptoAdicional at the given index
   */
  public ConceptoAdicional getConceptoAdicional(
          final int index)
  throws java.lang.IndexOutOfBoundsException {
      // check bounds for index
      if (index < 0 || index >= this._conceptoAdicionalList.size()) {
          throw new IndexOutOfBoundsException("getConceptoAdicional: Index value '" + index + "' not in range [0.." + (this._conceptoAdicionalList.size() - 1) + "]");
      }

      return (ConceptoAdicional) _conceptoAdicionalList.get(index);
  }
  
  /**
   * Method getConceptoAdicional.Returns the contents of the collection in
   * an Array.  <p>Note:  Just in case the collection contents
   * are changing in another thread, we pass a 0-length Array of
   * the correct type into the API call.  This way we <i>know</i>
   * that the Array returned is of exactly the correct length.
   * 
   * @return this collection as an Array
   */
  public ConceptoAdicional[] getConceptoAdicional(
  ) {
      ConceptoAdicional[] array = new ConceptoAdicional[0];
      return (ConceptoAdicional[]) this._conceptoAdicionalList.toArray(array);
  }

  /**
   * Method getConceptoAdicionalCount.
   * 
   * @return the size of this collection
   */
  public int getConceptoAdicionalCount(
  ) {
      return this._conceptoAdicionalList.size();
  }

  /**
   */
  public void removeAllConceptoAdicional(
  ) {
      this._conceptoAdicionalList.clear();
  }
  
  /**
   * Method removeConceptoAdicional.
   * 
   * @param vConceptoAdicional
   * @return true if the object was removed from the collection.
   */
  public boolean removeConceptoAdicional(
          final ConceptoAdicional vConceptoAdicional) {
      boolean removed = _conceptoAdicionalList.remove(vConceptoAdicional);
      return removed;
  }

  /**
   * Method removeConceptoAdicionalAt.
   * 
   * @param index
   * @return the element removed from the collection
   */
  public ConceptoAdicional removeConceptoAdicionalAt(
          final int index) {
      java.lang.Object obj = this._conceptoAdicionalList.remove(index);
      return (ConceptoAdicional) obj;
  }

  /**
   * 
   * 
   * @param index
   * @param vConceptoAdicional
   * @throws java.lang.IndexOutOfBoundsException if the index
   * given is outside the bounds of the collection
   */
  //@XmlElement(namespace="http://www.sat.gob.mx/cfd/3" ,name="ConceptoAdicional")
  public void setConceptoAdicional(
          final int index,
          final ConceptoAdicional vConceptoAdicional)
  throws java.lang.IndexOutOfBoundsException {
      // check bounds for index
      if (index < 0 || index >= this._conceptoAdicionalList.size()) {
          throw new IndexOutOfBoundsException("setConceptoAdicional: Index value '" + index + "' not in range [0.." + (this._conceptoAdicionalList.size() - 1) + "]");
      }

      this._conceptoAdicionalList.set(index, vConceptoAdicional);
  }

  /**
   * 
   * 
   * @param vConceptoAdicionalArray
   */
  @XmlElement(name="ConceptoAdicional")
  public void setConceptoAdicional(
          final ConceptoAdicional[] vConceptoAdicionalArray) {
      //-- copy array
	  _conceptoAdicionalList.clear();

      for (int i = 0; i < vConceptoAdicionalArray.length; i++) {
              this._conceptoAdicionalList.add(vConceptoAdicionalArray[i]);
      }
  }
}
