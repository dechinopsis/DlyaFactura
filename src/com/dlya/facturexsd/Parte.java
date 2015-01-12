package com.dlya.facturexsd;
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Nodo opcional para expresar las partes o componentes que
 * integran la totalidad del concepto expresado en el comprobante
 * fiscal digital
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Parte implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Atributo requerido para precisar la cantidad de bienes o
     * servicios del tipo particular definido por la presente parte.
     */
    private java.math.BigDecimal _cantidad;

    /**
     * Atributo opcional para precisar la unidad de medida
     * aplicable para la cantidad expresada en la parte.
     */
    private java.lang.String _unidad;

    /**
     * Atributo opcional para expresar el número de serie del bien
     * o identificador del servicio amparado por la presente parte.
     */
    private java.lang.String _noIdentificacion;

    /**
     * Atributo requerido para precisar la descripción del bien o
     * servicio cubierto por la presente parte.
     */
    private java.lang.String _descripcion;

    /**
     * Atributo opcional para precisar el valor o precio unitario
     * del bien o servicio cubierto por la presente parte.
     */
    private java.math.BigDecimal _valorUnitario;

    /**
     * Atributo opcional para precisar el importe total de los
     * bienes o servicios de la presente parte. Debe ser
     * equivalente al resultado de multiplicar la cantidad por el
     * valor unitario expresado en la parte.
     */
    private java.math.BigDecimal _importe;

    /**
     * Nodo opcional para introducir la información aduanera
     * aplicable cuando se trate de partes o componentes importados
     * vendidos de primera mano.
     */
    private java.util.Vector<InformacionAduanera> _informacionAduaneraList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Parte() {
        super();
        this._informacionAduaneraList = new java.util.Vector<InformacionAduanera>();
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
     * Method enumerateInformacionAduanera.
     * 
     * @return an Enumeration over all InformacionAduanera elements
     */
    public java.util.Enumeration<? extends InformacionAduanera> enumerateInformacionAduanera(
    ) {
        return this._informacionAduaneraList.elements();
    }

    /**
     * Returns the value of field 'cantidad'. The field 'cantidad'
     * has the following description: Atributo requerido para
     * precisar la cantidad de bienes o servicios del tipo
     * particular definido por la presente parte.
     * 
     * @return the value of field 'Cantidad'.
     */
    public java.math.BigDecimal getCantidad(
    ) {
        return this._cantidad;
    }

    /**
     * Returns the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por la presente parte.
     * 
     * @return the value of field 'Descripcion'.
     */
    public java.lang.String getDescripcion(
    ) {
        return this._descripcion;
    }

    /**
     * Returns the value of field 'importe'. The field 'importe'
     * has the following description: Atributo opcional para
     * precisar el importe total de los bienes o servicios de la
     * presente parte. Debe ser equivalente al resultado de
     * multiplicar la cantidad por el valor unitario expresado en
     * la parte.
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
     * identificador del servicio amparado por la presente parte.
     * 
     * @return the value of field 'NoIdentificacion'.
     */
    public java.lang.String getNoIdentificacion(
    ) {
        return this._noIdentificacion;
    }

    /**
     * Returns the value of field 'unidad'. The field 'unidad' has
     * the following description: Atributo opcional para precisar
     * la unidad de medida aplicable para la cantidad expresada en
     * la parte.
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
     * opcional para precisar el valor o precio unitario del bien o
     * servicio cubierto por la presente parte.
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
     * Sets the value of field 'cantidad'. The field 'cantidad' has
     * the following description: Atributo requerido para precisar
     * la cantidad de bienes o servicios del tipo particular
     * definido por la presente parte.
     * 
     * @param cantidad the value of field 'cantidad'.
     */
    public void setCantidad(
            final java.math.BigDecimal cantidad) {
        this._cantidad = cantidad;
    }

    /**
     * Sets the value of field 'descripcion'. The field
     * 'descripcion' has the following description: Atributo
     * requerido para precisar la descripción del bien o servicio
     * cubierto por la presente parte.
     * 
     * @param descripcion the value of field 'descripcion'.
     */
    public void setDescripcion(
            final java.lang.String descripcion) {
        this._descripcion = descripcion;
    }

    /**
     * Sets the value of field 'importe'. The field 'importe' has
     * the following description: Atributo opcional para precisar
     * el importe total de los bienes o servicios de la presente
     * parte. Debe ser equivalente al resultado de multiplicar la
     * cantidad por el valor unitario expresado en la parte.
     * 
     * @param importe the value of field 'importe'.
     */
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
     * identificador del servicio amparado por la presente parte.
     * 
     * @param noIdentificacion the value of field 'noIdentificacion'
     */
    public void setNoIdentificacion(
            final java.lang.String noIdentificacion) {
        this._noIdentificacion = noIdentificacion;
    }

    /**
     * Sets the value of field 'unidad'. The field 'unidad' has the
     * following description: Atributo opcional para precisar la
     * unidad de medida aplicable para la cantidad expresada en la
     * parte.
     * 
     * @param unidad the value of field 'unidad'.
     */
    public void setUnidad(
            final java.lang.String unidad) {
        this._unidad = unidad;
    }

    /**
     * Sets the value of field 'valorUnitario'. The field
     * 'valorUnitario' has the following description: Atributo
     * opcional para precisar el valor o precio unitario del bien o
     * servicio cubierto por la presente parte.
     * 
     * @param valorUnitario the value of field 'valorUnitario'.
     */
    public void setValorUnitario(
            final java.math.BigDecimal valorUnitario) {
        this._valorUnitario = valorUnitario;
    }

}
