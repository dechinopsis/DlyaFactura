package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo para introducir la información detallada de un bien o
 * servicio amparado en el comprobante.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")

public class Concepto implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para precisar la cantidad de bienes o
     * servicios del tipo particular definido por el presente
     * concepto.
     */
	
    private java.math.BigDecimal _cantidad;

    /**
     * Atributo opcional para precisar la unidad de medida
     * aplicable para la cantidad expresada en el concepto.
     */
	
    private java.lang.String _unidad;

    /**
     * Atributo opcional para expresar el número de serie del bien
     * o identificador del servicio amparado por el presente
     * concepto.
     */
	
    private java.lang.String _noIdentificacion;

    /**
     * Atributo requerido para precisar la descripción del bien o
     * servicio cubierto por el presente concepto.
     */
	
    private java.lang.String _descripcion;

    /**
     * Atributo requerido para precisar el valor o precio unitario
     * del bien o servicio cubierto por el presente concepto.
     */
	
    private java.math.BigDecimal _valorUnitario;

    /**
     * Atributo requerido para precisar el importe total de los
     * bienes o servicios del presente concepto. Debe ser
     * equivalente al resultado de multiplicar la cantidad por el
     * valor unitario expresado en el concepto.
     */
	
    private java.math.BigDecimal _importe;

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Nodo opcional para introducir la información aduanera
     * aplicable cuando se trate de ventas de primera mano de
     * mercancías importadas.
     */
    private java.util.Vector<InformacionAduanera> _informacionAduaneraList;

    /**
     * Nodo opcional para asentar el número de cuenta predial con
     * el que fue registrado el inmueble, en el sistema catastral
     * de la entidad federativa de que trate.
     */
    private CuentaPredial _cuentaPredial;

    /**
     * Nodo opcional donde se incluirán los nodos complementarios
     * de extensión al concepto, definidos por el SAT, de acuerdo
     * a disposiciones particulares a un sector o actividad
     * especifica.
     */
    private ComplementoConcepto _complementoConcepto;

    /**
     * Nodo opcional para expresar las partes o componentes que
     * integran la totalidad del concepto expresado en el
     * comprobante fiscal digital
     */
    private java.util.Vector<Parte> _parteList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Concepto() {
        super();
        this._informacionAduaneraList = new java.util.Vector<InformacionAduanera>();
        this._parteList = new java.util.Vector<Parte>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vInformacionAduanera
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInformacionAduanera(
            final InformacionAduanera vInformacionAduanera)
    throws java.lang.IndexOutOfBoundsException {
        this._informacionAduaneraList.addElement(vInformacionAduanera);
    }

    /**
     * 
     * 
     * @param index
     * @param vInformacionAduanera
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addInformacionAduanera(
            final int index,
            final InformacionAduanera vInformacionAduanera)
    throws java.lang.IndexOutOfBoundsException {
        this._informacionAduaneraList.add(index, vInformacionAduanera);
    }

    /**
     * 
     * 
     * @param vParte
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParte(
            final Parte vParte)
    throws java.lang.IndexOutOfBoundsException {
        this._parteList.addElement(vParte);
    }

    /**
     * 
     * 
     * @param index
     * @param vParte
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addParte(
            final int index,
            final Parte vParte)
    throws java.lang.IndexOutOfBoundsException {
        this._parteList.add(index, vParte);
    }

    /**
     * Method enumerateInformacionAduanera.
     * 
     * @return an Enumeration over all InformacionAduanera elements
     */
    public java.util.Enumeration<? extends InformacionAduanera> enumerateInformacionAduanera(
    ) {
        return this._informacionAduaneraList.elements();
    }

    /**
     * Method enumerateParte.
     * 
     * @return an Enumeration over all Parte elements
     */
    public java.util.Enumeration<? extends Parte> enumerateParte(
    ) {
        return this._parteList.elements();
    }

    /**
     * Returns the value of field 'cantidad'. The field 'cantidad'
     * has the following description: Atributo requerido para
     * precisar la cantidad de bienes o servicios del tipo
     * particular definido por el presente concepto.
     * 
     * @return the value of field 'Cantidad'.
     */
    public java.math.BigDecimal getCantidad(
    ) {
        return this._cantidad;
    }

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'complementoConcepto'. The field
     * 'complementoConcepto' has the following description: Nodo
     * opcional donde se incluirán los nodos complementarios de
     * extensión al concepto, definidos por el SAT, de acuerdo a
     * disposiciones particulares a un sector o actividad
     * especifica.
     * 
     * @return the value of field 'ComplementoConcepto'.
     */
    public ComplementoConcepto getComplementoConcepto(
    ) {
        return this._complementoConcepto;
    }

    /**
     * Returns the value of field 'cuentaPredial'. The field
     * 'cuentaPredial' has the following description: Nodo opcional
     * para asentar el número de cuenta predial con el que fue
     * registrado el inmueble, en el sistema catastral de la
     * entidad federativa de que trate.
     * 
     * @return the value of field 'CuentaPredial'.
     */
    public CuentaPredial getCuentaPredial(
    ) {
        return this._cuentaPredial;
    }

    /**
     * Returns the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por el presente concepto.
     * 
     * @return the value of field 'Descripcion'.
     */
    public java.lang.String getDescripcion(
    ) {
        return this._descripcion;
    }

    /**
     * Returns the value of field 'importe'. The field 'importe'
     * has the following description: Atributo requerido para
     * precisar el importe total de los bienes o servicios del
     * presente concepto. Debe ser equivalente al resultado de
     * multiplicar la cantidad por el valor unitario expresado en
     * el concepto.
     * 
     * @return the value of field 'Importe'.
     */
    public java.math.BigDecimal getImporte(
    ) {
        return this._importe;
    }

    /**
     * Method getInformacionAduanera.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the InformacionAduanera at the given
     * index
     */
    public InformacionAduanera getInformacionAduanera(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._informacionAduaneraList.size()) {
            throw new IndexOutOfBoundsException("getInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
        }

        return (InformacionAduanera) _informacionAduaneraList.get(index);
    }

    /**
     * Method getInformacionAduanera.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public InformacionAduanera[] getInformacionAduanera(
    ) {
        InformacionAduanera[] array = new InformacionAduanera[0];
        return (InformacionAduanera[]) this._informacionAduaneraList.toArray(array);
    }

    /**
     * Method getInformacionAduaneraCount.
     * 
     * @return the size of this collection
     */
    public int getInformacionAduaneraCount(
    ) {
        return this._informacionAduaneraList.size();
    }

    /**
     * Returns the value of field 'noIdentificacion'. The field
     * 'noIdentificacion' has the following description: Atributo
     * opcional para expresar el número de serie del bien o
     * identificador del servicio amparado por el presente
     * concepto.
     * 
     * @return the value of field 'NoIdentificacion'.
     */
    public java.lang.String getNoIdentificacion(
    ) {
        return this._noIdentificacion;
    }

    /**
     * Method getParte.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the Parte at the given index
     */
    public Parte getParte(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parteList.size()) {
            throw new IndexOutOfBoundsException("getParte: Index value '" + index + "' not in range [0.." + (this._parteList.size() - 1) + "]");
        }

        return (Parte) _parteList.get(index);
    }

    /**
     * Method getParte.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public Parte[] getParte(
    ) {
        Parte[] array = new Parte[0];
        return (Parte[]) this._parteList.toArray(array);
    }

    /**
     * Method getParteCount.
     * 
     * @return the size of this collection
     */
    public int getParteCount(
    ) {
        return this._parteList.size();
    }

    /**
     * Returns the value of field 'unidad'. The field 'unidad' has
     * the following description: Atributo opcional para precisar
     * la unidad de medida aplicable para la cantidad expresada en
     * el concepto.
     * 
     * @return the value of field 'Unidad'.
     */
    public java.lang.String getUnidad(
    ) {
        return this._unidad;
    }

    /**
     * Returns the value of field 'valorUnitario'. The field
     * 'valorUnitario' has the following description: Atributo
     * requerido para precisar el valor o precio unitario del bien
     * o servicio cubierto por el presente concepto.
     * 
     * @return the value of field 'ValorUnitario'.
     */
    public java.math.BigDecimal getValorUnitario(
    ) {
        return this._valorUnitario;
    }

    /**
     */
    public void removeAllInformacionAduanera(
    ) {
        this._informacionAduaneraList.clear();
    }

    /**
     */
    public void removeAllParte(
    ) {
        this._parteList.clear();
    }

    /**
     * Method removeInformacionAduanera.
     * 
     * @param vInformacionAduanera
     * @return true if the object was removed from the collection.
     */
    public boolean removeInformacionAduanera(
            final InformacionAduanera vInformacionAduanera) {
        boolean removed = _informacionAduaneraList.remove(vInformacionAduanera);
        return removed;
    }

    /**
     * Method removeInformacionAduaneraAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public InformacionAduanera removeInformacionAduaneraAt(
            final int index) {
        java.lang.Object obj = this._informacionAduaneraList.remove(index);
        return (InformacionAduanera) obj;
    }

    /**
     * Method removeParte.
     * 
     * @param vParte
     * @return true if the object was removed from the collection.
     */
    public boolean removeParte(
            final Parte vParte) {
        boolean removed = _parteList.remove(vParte);
        return removed;
    }

    /**
     * Method removeParteAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public Parte removeParteAt(
            final int index) {
        java.lang.Object obj = this._parteList.remove(index);
        return (Parte) obj;
    }

    /**
     * Sets the value of field 'cantidad'. The field 'cantidad' has
     * the following description: Atributo requerido para precisar
     * la cantidad de bienes o servicios del tipo particular
     * definido por el presente concepto.
     * 
     * @param cantidad the value of field 'cantidad'.
     */
    @XmlAttribute
    public void setCantidad(
            final java.math.BigDecimal cantidad) {
        this._cantidad = cantidad;
    }

    /**
     * Sets the value of field 'complementoConcepto'. The field
     * 'complementoConcepto' has the following description: Nodo
     * opcional donde se incluirán los nodos complementarios de
     * extensión al concepto, definidos por el SAT, de acuerdo a
     * disposiciones particulares a un sector o actividad
     * especifica.
     * 
     * @param complementoConcepto the value of field
     * 'complementoConcepto'.
     */
    public void setComplementoConcepto(
            final ComplementoConcepto complementoConcepto) {
        this._complementoConcepto = complementoConcepto;
        this._choiceValue = complementoConcepto;
    }

    /**
     * Sets the value of field 'cuentaPredial'. The field
     * 'cuentaPredial' has the following description: Nodo opcional
     * para asentar el número de cuenta predial con el que fue
     * registrado el inmueble, en el sistema catastral de la
     * entidad federativa de que trate.
     * 
     * @param cuentaPredial the value of field 'cuentaPredial'.
     */
    public void setCuentaPredial(
            final CuentaPredial cuentaPredial) {
        this._cuentaPredial = cuentaPredial;
        this._choiceValue = cuentaPredial;
    }

    /**
     * Sets the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por el presente concepto.
     * 
     * @param descripcion the value of field 'descripcion'.
     */
    @XmlAttribute
    public void setDescripcion(
            final java.lang.String descripcion) {
        this._descripcion = descripcion;
    }

    /**
     * Sets the value of field 'importe'. The field 'importe' has
     * the following description: Atributo requerido para precisar
     * el importe total de los bienes o servicios del presente
     * concepto. Debe ser equivalente al resultado de multiplicar
     * la cantidad por el valor unitario expresado en el concepto.
     * 
     * @param importe the value of field 'importe'.
     */
    @XmlAttribute
    public void setImporte(
            final java.math.BigDecimal importe) {
        this._importe = importe;
    }

    /**
     * 
     * 
     * @param index
     * @param vInformacionAduanera
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setInformacionAduanera(
            final int index,
            final InformacionAduanera vInformacionAduanera)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._informacionAduaneraList.size()) {
            throw new IndexOutOfBoundsException("setInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
        }

        this._informacionAduaneraList.set(index, vInformacionAduanera);
    }

    /**
     * 
     * 
     * @param vInformacionAduaneraArray
     */
    public void setInformacionAduanera(
            final InformacionAduanera[] vInformacionAduaneraArray) {
        //-- copy array
        _informacionAduaneraList.clear();

        for (int i = 0; i < vInformacionAduaneraArray.length; i++) {
                this._informacionAduaneraList.add(vInformacionAduaneraArray[i]);
        }
    }

    /**
     * Sets the value of field 'noIdentificacion'. The field
     * 'noIdentificacion' has the following description: Atributo
     * opcional para expresar el número de serie del bien o
     * identificador del servicio amparado por el presente
     * concepto.
     * 
     * @param noIdentificacion the value of field 'noIdentificacion'
     */
    @XmlAttribute
    public void setNoIdentificacion(
            final java.lang.String noIdentificacion) {
        this._noIdentificacion = noIdentificacion;
    }

    /**
     * 
     * 
     * @param index
     * @param vParte
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setParte(
            final int index,
            final Parte vParte)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._parteList.size()) {
            throw new IndexOutOfBoundsException("setParte: Index value '" + index + "' not in range [0.." + (this._parteList.size() - 1) + "]");
        }

        this._parteList.set(index, vParte);
    }

    /**
     * 
     * 
     * @param vParteArray
     */
    public void setParte(
            final Parte[] vParteArray) {
        //-- copy array
        _parteList.clear();

        for (int i = 0; i < vParteArray.length; i++) {
                this._parteList.add(vParteArray[i]);
        }
    }

    /**
     * Sets the value of field 'unidad'. The field 'unidad' has the
     * following description: Atributo opcional para precisar la
     * unidad de medida aplicable para la cantidad expresada en el
     * concepto.
     * 
     * @param unidad the value of field 'unidad'.
     */
    @XmlAttribute
    public void setUnidad(
            final java.lang.String unidad) {
        this._unidad = unidad;
    }

    /**
     * Sets the value of field 'valorUnitario'. The field
     * 'valorUnitario' has the following description: Atributo
     * requerido para precisar el valor o precio unitario del bien
     * o servicio cubierto por el presente concepto.
     * 
     * @param valorUnitario the value of field 'valorUnitario'.
     */
    @XmlAttribute
    public void setValorUnitario(
            final java.math.BigDecimal valorUnitario) {
        this._valorUnitario = valorUnitario;
    }

}
