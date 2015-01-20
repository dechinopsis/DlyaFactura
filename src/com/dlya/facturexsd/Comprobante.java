package com.dlya.facturexsd;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dlya.facturetype.ComprobanteTipoDeComprobanteType;

;

/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

/**
 * Estándar para la expresión de comprobantes fiscales digitales.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
@XmlRootElement(name = "Comprobante")
@XmlType(propOrder = { "emisor", "receptor", "conceptos","conceptosAdicionales", "addenda",
	"certificado", "complemento", "impuestos", "sello" })
public class Comprobante implements java.io.Serializable {

    // --------------------------/
    // - Class/Member Variables -/
    // --------------------------/

    /**
     * Atributo requerido con valor prefijado a 2.0 que indica la versión del
     * estándar bajo el que se encuentra expresado el comprobante.
     */
    private java.lang.String _version = "2.0";

    /**
     * Atributo opcional para precisar la serie a la que corresponde el
     * comprobante. Este atributo acepta una cadena de caracteres alfabéticos
     * de 1 a 10 caracteres sin incluir caracteres acentuados.
     */
    private java.lang.String _serie;

    /**
     * Atributo requerido que acepta un valor numérico entero superior a 0 que
     * expresa el folio del comprobante.
     */
    private java.lang.String _folio;

    /**
     * Atributo requerido para la expresión de la fecha y hora de expedición
     * del comprobante fiscal. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de
     * acuerdo con la especificación ISO 8601.
     */
    private java.util.Date _fechaauxiliar;
    
    /**
     * Atributo requerido para la expresión de la fecha y hora de expedición
     * del comprobante fiscal. Se expresa en la forma aaaa-mm-ddThh:mm:ss, de
     * acuerdo con la especificación ISO 8601.
     */
    
    private java.lang.String _fecha;

    /**
     * Atributo requerido para contener el sello digital del comprobante fiscal,
     * al que hacen referencia las reglas de resolución miscelánea aplicable.
     * El sello deberá ser expresado cómo una cadena de texto en formato Base
     * 64.
     */
    private java.lang.String _sello;

    /**
     * Atributo requerido para precisar el número de aprobación emitido por el
     * SAT, para el rango de folios al que pertenece el folio particular que
     * ampara el comprobante fiscal digital.
     */
    // private long _noAprobacion;

    /**
     * keeps track of state for field: _noAprobacion
     */
    private boolean _has_noAprobacion;

    /**
     * Atributo requerido para precisar el año en que se solicito el folio que
     * se están utilizando para emitir el comprobante fiscal digital.
     */
    // private long _anoAprobacion;

    /**
     * keeps track of state for field: _anoAprobacion
     */
    private boolean _has_anoAprobacion;

    /**
     * Atributo requerido para precisar la forma de pago que aplica para este
     * comprobante fiscal digital. Se utiliza para expresar Pago en una sola
     * exhibición o número de parcialidad pagada contra el total de
     * parcialidades, Parcialidad 1 de X.
     */
    private java.lang.String _formaDePago;

    /**
     * Atributo requerido para expresar el número de serie del certificado de
     * sello digital que ampara al comprobante, de acuerdo al acuse
     * correspondiente a 20 posiciones otorgado por el sistema del SAT.
     */
    private java.lang.String _noCertificado;

    /**
     * Atributo opcional que sirve para expresar el certificado de sello digital
     * que ampara al comprobante como texto, en formato base 64.
     */
    private java.lang.String _certificado;

    /**
     * Atributo opcional para expresar las condiciones comerciales aplicables
     * para el pago del comprobante fiscal digital.
     */
    private java.lang.String _condicionesDePago;

    /**
     * Atributo requerido para representar la suma de los importes antes de
     * descuentos e impuestos.
     */
    private java.math.BigDecimal _subTotal;

    /**
     * Atributo opcional para representar el importe total de los descuentos
     * aplicables antes de impuestos.
     */
    private java.math.BigDecimal _descuento;

    /**
     * Atributo opcional para expresar el motivo del descuento aplicable.
     */
    private java.lang.String _motivoDescuento;

    private java.lang.String _tipoCambio;

    private java.lang.String _moneda;

    /**
     * Atributo requerido para representar la suma del subtotal, menos los
     * descuentos aplicables, más los impuestos trasladados, menos los
     * impuestos retenidos.
     */
    private java.math.BigDecimal _total;

    /**
     * Atributo opcional de texto libre para expresar el método de pago de los
     * bienes o servicios amparados por el comprobante. Se entiende como método
     * de pago leyendas tales como: cheque, tarjeta de crédito o debito,
     * depósito en cuenta, etc.
     */
    private java.lang.String _metodoDePago;

    // DAVID
    private java.lang.String _lugarExpedicion;
    private java.lang.String _numCtaPago;

    // DAVID TORRES 02/01/2014
    private java.lang.String correo;
    private java.lang.String CURP;
    private java.lang.String cveCliente;

    /**
     * Atributo requerido para expresar el efecto del comprobante fiscal para el
     * contribuyente emisor.
     */
    private ComprobanteTipoDeComprobanteType _tipoDeComprobante;

    /**
     * Nodo requerido para expresar la información del contribuyente emisor del
     * comprobante.
     */
    private Emisor _emisor;

    /**
     * Nodo requerido para precisar la información del contribuyente receptor
     * del comprobante.
     */

    private Receptor _receptor;

    /**
     * Nodo requerido para enlistar los conceptos cubiertos por el comprobante.
     */
    private Conceptos _conceptos;
    
    /**
     * Nodo requerido para enlistar los conceptosadicionales cubiertos por el comprobante.
     */
    private ConceptosAdicionales _conceptosadicionales;

    /**
     * Nodo requerido para capturar los impuestos aplicables.
     */
    private Impuestos _impuestos;

    /**
     * Nodo opcional donde se incluirán los nodos complementarios determinados
     * por el SAT, de acuerdo a las disposiciones particulares a un sector o
     * actividad especifica.
     */
    private Complemento _complemento;

    /**
     * Nodo opcional para recibir las extensiones al presente formato que sean
     * de utilidad al contribuyente. Para las reglas de uso del mismo, referirse
     * al formato de origen.
     */
    private Addenda _addenda;

    private String _xsi;
    private String _xsd;
    private String _xmlns;

    // ----------------/
    // - Constructors -/
    // ----------------/

    public Comprobante() {
	super();
	setVersion("2.0");
    }

    // -----------/
    // - Methods -/
    // -----------/

    /**
     */
    public void deleteAnoAprobacion() {
	this._has_anoAprobacion = false;
    }

    /**
     */
    public void deleteNoAprobacion() {
	this._has_noAprobacion = false;
    }

    /**
     * Returns the value of field 'addenda'. The field 'addenda' has the
     * following description: Nodo opcional para recibir las extensiones al
     * presente formato que sean de utilidad al contribuyente. Para las reglas
     * de uso del mismo, referirse al formato de origen.
     * 
     * @return the value of field 'Addenda'.
     */
    public Addenda getAddenda() {
	return this._addenda;
    }

    /**
     * Returns the value of field 'anoAprobacion'. The field 'anoAprobacion' has
     * the following description: Atributo requerido para precisar el año en
     * que se solicito el folio que se están utilizando para emitir el
     * comprobante fiscal digital.
     * 
     * @return the value of field 'AnoAprobacion'.
     */
    /*
     * public long getAnoAprobacion( ) { return this._anoAprobacion; }
     */
    /**
     * Returns the value of field 'certificado'. The field 'certificado' has the
     * following description: Atributo opcional que sirve para expresar el
     * certificado de sello digital que ampara al comprobante como texto, en
     * formato base 64.
     * 
     * @return the value of field 'Certificado'.
     */
    public java.lang.String getCertificado() {
	return this._certificado;
    }

    /**
     * Returns the value of field 'complemento'. The field 'complemento' has the
     * following description: Nodo opcional donde se incluirán los nodos
     * complementarios determinados por el SAT, de acuerdo a las disposiciones
     * particulares a un sector o actividad especifica.
     * 
     * @return the value of field 'Complemento'.
     */
    public Complemento getComplemento() {
	return this._complemento;
    }

    /**
     * Returns the value of field 'conceptos'. The field 'conceptos' has the
     * following description: Nodo requerido para enlistar los conceptos
     * cubiertos por el comprobante.
     * 
     * @return the value of field 'Conceptos'.
     */
    public Conceptos getConceptos() {
	return this._conceptos;
    }
    
    /**
     * Returns the value of field 'conceptosadicionales'. The field 'conceptosadicionales' has the
     * following description: Nodo requerido para enlistar los conceptos
     * cubiertos por el comprobante.
     * 
     * @return the value of field 'Conceptos'.
     */
    public ConceptosAdicionales getConceptosAdicionales() {
	return this._conceptosadicionales;
    }

    /**
     * Returns the value of field 'condicionesDePago'. The field
     * 'condicionesDePago' has the following description: Atributo opcional para
     * expresar las condiciones comerciales aplicables para el pago del
     * comprobante fiscal digital.
     * 
     * @return the value of field 'CondicionesDePago'.
     */
    public java.lang.String getCondicionesDePago() {
	return this._condicionesDePago;
    }

    /**
     * Returns the value of field 'descuento'. The field 'descuento' has the
     * following description: Atributo opcional para representar el importe
     * total de los descuentos aplicables antes de impuestos.
     * 
     * @return the value of field 'Descuento'.
     */
    public java.math.BigDecimal getDescuento() {
	return this._descuento;
    }

    /**
     * Returns the value of field 'emisor'. The field 'emisor' has the following
     * description: Nodo requerido para expresar la información del
     * contribuyente emisor del comprobante.
     * 
     * @return the value of field 'Emisor'.
     */
    public Emisor getEmisor() {
	return this._emisor;
    }

    /**
     * Returns the value of field 'fecha'. The field 'fecha' has the following
     * description: Atributo requerido para la expresión de la fecha y hora de
     * expedición del comprobante fiscal. Se expresa en la forma
     * aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
     * 
     * @return the value of field 'Fecha'.
     */
    public java.lang.String getFecha() {
	return this._fecha;
    }

    /**
     * Returns the value of field 'folio'. The field 'folio' has the following
     * description: Atributo requerido que acepta un valor numérico entero
     * superior a 0 que expresa el folio del comprobante.
     * 
     * @return the value of field 'Folio'.
     */
    public java.lang.String getFolio() {
	return this._folio;
    }

    /**
     * Returns the value of field 'formaDePago'. The field 'formaDePago' has the
     * following description: Atributo requerido para precisar la forma de pago
     * que aplica para este comprobante fiscal digital. Se utiliza para expresar
     * Pago en una sola exhibición o número de parcialidad pagada contra el
     * total de parcialidades, Parcialidad 1 de X.
     * 
     * @return the value of field 'FormaDePago'.
     */
    public java.lang.String getFormaDePago() {
	return this._formaDePago;
    }

    /**
     * Returns the value of field 'impuestos'. The field 'impuestos' has the
     * following description: Nodo requerido para capturar los impuestos
     * aplicables.
     * 
     * @return the value of field 'Impuestos'.
     */
    public Impuestos getImpuestos() {
	return this._impuestos;
    }

    /**
     * Returns the value of field 'metodoDePago'. The field 'metodoDePago' has
     * the following description: Atributo opcional de texto libre para expresar
     * el método de pago de los bienes o servicios amparados por el
     * comprobante. Se entiende como método de pago leyendas tales como:
     * cheque, tarjeta de crédito o debito, depósito en cuenta, etc.
     * 
     * @return the value of field 'MetodoDePago'.
     */
    public java.lang.String getMetodoDePago() {
	return this._metodoDePago;
    }

    /**
     * Returns the value of field 'motivoDescuento'. The field 'motivoDescuento'
     * has the following description: Atributo opcional para expresar el motivo
     * del descuento aplicable.
     * 
     * @return the value of field 'MotivoDescuento'.
     */
    public java.lang.String getMotivoDescuento() {
	return this._motivoDescuento;
    }

    /**
     * Returns the value of field 'noAprobacion'. The field 'noAprobacion' has
     * the following description: Atributo requerido para precisar el número de
     * aprobación emitido por el SAT, para el rango de folios al que pertenece
     * el folio particular que ampara el comprobante fiscal digital.
     * 
     * @return the value of field 'NoAprobacion'.
     */
    /*
     * public long getNoAprobacion( ) { return this._noAprobacion; }
     */

    /**
     * Returns the value of field 'noCertificado'. The field 'noCertificado' has
     * the following description: Atributo requerido para expresar el número de
     * serie del certificado de sello digital que ampara al comprobante, de
     * acuerdo al acuse correspondiente a 20 posiciones otorgado por el sistema
     * del SAT.
     * 
     * @return the value of field 'NoCertificado'.
     */
    public java.lang.String getNoCertificado() {
	return this._noCertificado;
    }

    /**
     * Returns the value of field 'receptor'. The field 'receptor' has the
     * following description: Nodo requerido para precisar la información del
     * contribuyente receptor del comprobante.
     * 
     * @return the value of field 'Receptor'.
     */
    public Receptor getReceptor() {
	return this._receptor;
    }

    /**
     * Returns the value of field 'sello'. The field 'sello' has the following
     * description: Atributo requerido para contener el sello digital del
     * comprobante fiscal, al que hacen referencia las reglas de resolución
     * miscelánea aplicable. El sello deberá ser expresado cómo una cadena de
     * texto en formato Base 64.
     * 
     * @return the value of field 'Sello'.
     */
    public java.lang.String getSello() {
	return this._sello;
    }

    /**
     * Returns the value of field 'serie'. The field 'serie' has the following
     * description: Atributo opcional para precisar la serie a la que
     * corresponde el comprobante. Este atributo acepta una cadena de caracteres
     * alfabéticos de 1 a 10 caracteres sin incluir caracteres acentuados.
     * 
     * @return the value of field 'Serie'.
     */
    public java.lang.String getSerie() {
	return this._serie;
    }

    /**
     * Returns the value of field 'subTotal'. The field 'subTotal' has the
     * following description: Atributo requerido para representar la suma de los
     * importes antes de descuentos e impuestos.
     * 
     * @return the value of field 'SubTotal'.
     */
    public java.math.BigDecimal getSubTotal() {
	return this._subTotal;
    }

    /**
     * Returns the value of field 'tipoDeComprobante'. The field
     * 'tipoDeComprobante' has the following description: Atributo requerido
     * para expresar el efecto del comprobante fiscal para el contribuyente
     * emisor.
     * 
     * @return the value of field 'TipoDeComprobante'.
     */
    public ComprobanteTipoDeComprobanteType getTipoDeComprobante() {
	return this._tipoDeComprobante;
    }

    /**
     * Returns the value of field 'total'. The field 'total' has the following
     * description: Atributo requerido para representar la suma del subtotal,
     * menos los descuentos aplicables, más los impuestos trasladados, menos
     * los impuestos retenidos.
     * 
     * @return the value of field 'Total'.
     */
    public java.math.BigDecimal getTotal() {
	return this._total;
    }

    /**
     * Returns the value of field 'version'. The field 'version' has the
     * following description: Atributo requerido con valor prefijado a 2.0 que
     * indica la versión del estándar bajo el que se encuentra expresado el
     * comprobante.
     * 
     * @return the value of field 'Version'.
     */
    public java.lang.String getVersion() {
	return this._version;
    }

    /**
     * Method hasAnoAprobacion.
     * 
     * @return true if at least one AnoAprobacion has been added
     */
    public boolean hasAnoAprobacion() {
	return this._has_anoAprobacion;
    }

    /**
     * Method hasNoAprobacion.
     * 
     * @return true if at least one NoAprobacion has been added
     */
    public boolean hasNoAprobacion() {
	return this._has_noAprobacion;
    }

    /**
     * Sets the value of field 'addenda'. The field 'addenda' has the following
     * description: Nodo opcional para recibir las extensiones al presente
     * formato que sean de utilidad al contribuyente. Para las reglas de uso del
     * mismo, referirse al formato de origen.
     * 
     * @param addenda
     *            the value of field 'addenda'.
     */
    public void setAddenda(final Addenda addenda) {
	this._addenda = addenda;
    }

    /**
     * Sets the value of field 'anoAprobacion'. The field 'anoAprobacion' has
     * the following description: Atributo requerido para precisar el año en
     * que se solicito el folio que se están utilizando para emitir el
     * comprobante fiscal digital.
     * 
     * @param anoAprobacion
     *            the value of field 'anoAprobacion'.
     */
    /**
     * Sets the value of field 'certificado'. The field 'certificado' has the
     * following description: Atributo opcional que sirve para expresar el
     * certificado de sello digital que ampara al comprobante como texto, en
     * formato base 64.
     * 
     * @param certificado
     *            the value of field 'certificado'.
     */
    public void setCertificado(final java.lang.String certificado) {
	this._certificado = certificado;
    }

    /**
     * Sets the value of field 'complemento'. The field 'complemento' has the
     * following description: Nodo opcional donde se incluirán los nodos
     * complementarios determinados por el SAT, de acuerdo a las disposiciones
     * particulares a un sector o actividad especifica.
     * 
     * @param complemento
     *            the value of field 'complemento'.
     */
    public void setComplemento(final Complemento complemento) {
	this._complemento = complemento;
    }

    /**
     * Sets the value of field 'condicionesDePago'. The field
     * 'condicionesDePago' has the following description: Atributo opcional para
     * expresar las condiciones comerciales aplicables para el pago del
     * comprobante fiscal digital.
     * 
     * @param condicionesDePago
     *            the value of field 'condicionesDePago'.
     */
    @XmlAttribute
    public void setCondicionesDePago(final java.lang.String condicionesDePago) {
	this._condicionesDePago = condicionesDePago;
    }

    /**
     * Sets the value of field 'descuento'. The field 'descuento' has the
     * following description: Atributo opcional para representar el importe
     * total de los descuentos aplicables antes de impuestos.
     * 
     * @param descuento
     *            the value of field 'descuento'.
     */
    @XmlAttribute
    public void setDescuento(final java.math.BigDecimal descuento) {
	this._descuento = descuento;
    }

    /**
     * Sets the value of field 'emisor'. The field 'emisor' has the following
     * description: Nodo requerido para expresar la información del
     * contribuyente emisor del comprobante.
     * 
     * @param emisor
     *            the value of field 'emisor'.
     */

    @XmlElement(name = "Emisor")
    public void setEmisor(final Emisor emisor) {
	this._emisor = emisor;
    }

    /**
     * Sets the value of field 'fecha'. The field 'fecha' has the following
     * description: Atributo requerido para la expresión de la fecha y hora de
     * expedición del comprobante fiscal. Se expresa en la forma
     * aaaa-mm-ddThh:mm:ss, de acuerdo con la especificación ISO 8601.
     * 
     * @param fecha
     *            the value of field 'fecha'.
     */
    @XmlAttribute
    public void setFecha(String nn) {
    	SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    	String fecha = formateador.format(_fechaauxiliar);

    	this._fecha = fecha;
    }

    /**
     * Sets the value of field 'folio'. The field 'folio' has the following
     * description: Atributo requerido que acepta un valor numérico entero
     * superior a 0 que expresa el folio del comprobante.
     * 
     * @param folio
     *            the value of field 'folio'.
     */
    @XmlAttribute
    public void setFolio(final java.lang.String folio) {
	this._folio = folio;
    }

    /**
     * Sets the value of field 'formaDePago'. The field 'formaDePago' has the
     * following description: Atributo requerido para precisar la forma de pago
     * que aplica para este comprobante fiscal digital. Se utiliza para expresar
     * Pago en una sola exhibición o número de parcialidad pagada contra el
     * total de parcialidades, Parcialidad 1 de X.
     * 
     * @param formaDePago
     *            the value of field 'formaDePago'.
     */
    @XmlAttribute
    public void setFormaDePago(final java.lang.String formaDePago) {
	this._formaDePago = formaDePago;
    }

    /**
     * Sets the value of field 'impuestos'. The field 'impuestos' has the
     * following description: Nodo requerido para capturar los impuestos
     * aplicables.
     * 
     * @param impuestos
     *            the value of field 'impuestos'.
     */
    @XmlElement(name = "Impuestos")
    public void setImpuestos(final Impuestos impuestos) {
	this._impuestos = impuestos;
    }

    /**
     * Sets the value of field 'metodoDePago'. The field 'metodoDePago' has the
     * following description: Atributo opcional de texto libre para expresar el
     * método de pago de los bienes o servicios amparados por el comprobante.
     * Se entiende como método de pago leyendas tales como: cheque, tarjeta de
     * crédito o debito, depósito en cuenta, etc.
     * 
     * @param metodoDePago
     *            the value of field 'metodoDePago'.
     */
    @XmlAttribute
    public void setMetodoDePago(final java.lang.String metodoDePago) {
	this._metodoDePago = metodoDePago;
    }

    /**
     * Sets the value of field 'motivoDescuento'. The field 'motivoDescuento'
     * has the following description: Atributo opcional para expresar el motivo
     * del descuento aplicable.
     * 
     * @param motivoDescuento
     *            the value of field 'motivoDescuento'.
     */
    @XmlAttribute
    public void setMotivoDescuento(final java.lang.String motivoDescuento) {
	this._motivoDescuento = motivoDescuento;
    }

    /**
     * Sets the value of field 'noAprobacion'. The field 'noAprobacion' has the
     * following description: Atributo requerido para precisar el número de
     * aprobación emitido por el SAT, para el rango de folios al que pertenece
     * el folio particular que ampara el comprobante fiscal digital.
     * 
     * @param noAprobacion
     *            the value of field 'noAprobacion'.
     */
    /*
     * public void setNoAprobacion( final long noAprobacion) {
     * this._noAprobacion = noAprobacion; this._has_noAprobacion = true; }
     */

    /**
     * Sets the value of field 'noCertificado'. The field 'noCertificado' has
     * the following description: Atributo requerido para expresar el número de
     * serie del certificado de sello digital que ampara al comprobante, de
     * acuerdo al acuse correspondiente a 20 posiciones otorgado por el sistema
     * del SAT.
     * 
     * @param noCertificado
     *            the value of field 'noCertificado'.
     */
    @XmlAttribute
    public void setNoCertificado(final java.lang.String noCertificado) {
	this._noCertificado = noCertificado;
    }

    /**
     * Sets the value of field 'receptor'. The field 'receptor' has the
     * following description: Nodo requerido para precisar la información del
     * contribuyente receptor del comprobante.
     * 
     * @param receptor
     *            the value of field 'receptor'.
     */
    @XmlElement(name = "Receptor")
    public void setReceptor(final Receptor receptor) {
	this._receptor = receptor;
    }

    /**
     * Sets the value of field 'conceptos'. The field 'conceptos' has the
     * following description: Nodo requerido para enlistar los conceptos
     * cubiertos por el comprobante.
     * 
     * @param conceptos
     *            the value of field 'conceptos'.
     */
    @XmlElement(name = "Conceptos")
    public void setConceptos(final Conceptos conceptos) {
	this._conceptos = conceptos;
    }
    
    /**
     * Sets the value of field 'conceptos'. The field 'conceptos' has the
     * following description: Nodo requerido para enlistar los conceptos
     * cubiertos por el comprobante.
     * 
     * @param conceptos
     *            the value of field 'conceptos'.
     */
    @XmlElement(name = "ConceptosAdicionales")
    public void setConceptosAdicionales(final ConceptosAdicionales conceptosadicionales) {
	this._conceptosadicionales = conceptosadicionales;
    }

    /**
     * Sets the value of field 'sello'. The field 'sello' has the following
     * description: Atributo requerido para contener el sello digital del
     * comprobante fiscal, al que hacen referencia las reglas de resolución
     * miscelánea aplicable. El sello deberá ser expresado cómo una cadena de
     * texto en formato Base 64.
     * 
     * @param sello
     *            the value of field 'sello'.
     */
    public void setSello(final java.lang.String sello) {
	this._sello = sello;
    }

    /**
     * Sets the value of field 'serie'. The field 'serie' has the following
     * description: Atributo opcional para precisar la serie a la que
     * corresponde el comprobante. Este atributo acepta una cadena de caracteres
     * alfabéticos de 1 a 10 caracteres sin incluir caracteres acentuados.
     * 
     * @param serie
     *            the value of field 'serie'.
     */
    @XmlAttribute
    public void setSerie(final java.lang.String serie) {
	this._serie = serie;
    }

    /**
     * Sets the value of field 'subTotal'. The field 'subTotal' has the
     * following description: Atributo requerido para representar la suma de los
     * importes antes de descuentos e impuestos.
     * 
     * @param subTotal
     *            the value of field 'subTotal'.
     */
    @XmlAttribute
    public void setSubTotal(final java.math.BigDecimal subTotal) {
	this._subTotal = subTotal;
    }

    /**
     * Sets the value of field 'tipoDeComprobante'. The field
     * 'tipoDeComprobante' has the following description: Atributo requerido
     * para expresar el efecto del comprobante fiscal para el contribuyente
     * emisor.
     * 
     * @param tipoDeComprobante
     *            the value of field 'tipoDeComprobante'.
     */
    @XmlAttribute
    public void setTipoDeComprobante(
	    final ComprobanteTipoDeComprobanteType tipoDeComprobante) {
	this._tipoDeComprobante = tipoDeComprobante;
    }

    /**
     * Sets the value of field 'total'. The field 'total' has the following
     * description: Atributo requerido para representar la suma del subtotal,
     * menos los descuentos aplicables, más los impuestos trasladados, menos
     * los impuestos retenidos.
     * 
     * @param total
     *            the value of field 'total'.
     */
    @XmlAttribute
    public void setTotal(final java.math.BigDecimal total) {
	this._total = total;
    }

    /**
     * Sets the value of field 'version'. The field 'version' has the following
     * description: Atributo requerido con valor prefijado a 2.0 que indica la
     * versión del estándar bajo el que se encuentra expresado el comprobante.
     * 
     * @param version
     *            the value of field 'version'.
     */
    @XmlAttribute
    public void setVersion(final java.lang.String version) {
	this._version = version;
    }

    // -------------------

    public java.lang.String getTipoCambio() {
	return _tipoCambio;
    }

    @XmlAttribute(name = "TipoCambio")
    public void setTipoCambio(java.lang.String _tipoCambio) {
	this._tipoCambio = _tipoCambio;
    }

    public java.lang.String getMoneda() {
	return _moneda;
    }

    @XmlAttribute(name = "Moneda")
    public void setMoneda(java.lang.String _moneda) {
	this._moneda = _moneda;
    }

    public java.lang.String getLugarExpedicion() {
	return _lugarExpedicion;
    }

    @XmlAttribute(name = "LugarExpedicion")
    public void setLugarExpedicion(java.lang.String _lugarExpedicion) {
	this._lugarExpedicion = _lugarExpedicion;
    }

    public java.lang.String getNumCtaPago() {
	return _numCtaPago;
    }

    @XmlAttribute(name = "NumCtaPago")
    public void setNumCtaPago(java.lang.String _numCtaPago) {
	this._numCtaPago = _numCtaPago;
    }

    public String get_xsi() {
	return _xsi;
    }

    @XmlAttribute(name = "xmlns:xsi")
    public void set_xsi(String _xsi) {
	this._xsi = _xsi;
    }

    public String get_xsd() {
	return _xsd;
    }

    @XmlAttribute(name = "xmlns:xsd")
    public void set_xsd(String _xsd) {
	this._xsd = _xsd;
    }

    public String get_xmlns() {
	return _xmlns;
    }

    @XmlAttribute(name = "xmlns")
    public void set_xmlns(String _xmlns) {
	this._xmlns = _xmlns;
    }

    public java.lang.String getCorreo() {
	return correo;
    }

    // --DAVID TORRES 02/01/2014
    @XmlAttribute(name = "correo")
    public void setCorreo(java.lang.String correo) {
	this.correo = correo;
    }

    public java.lang.String getCURP() {
	return CURP;
    }

    @XmlAttribute(name = "CURP")
    public void setCURP(java.lang.String cURP) {
	CURP = cURP;
    }

    public java.lang.String getCveCliente() {
        return cveCliente;
    }

    @XmlAttribute(name = "cve_cliente")
    public void setCveCliente(java.lang.String cveCliente) {
        this.cveCliente = cveCliente;
    }
    
	public void setfechaauxiliar(java.util.Date fechaauxiliar) {
		this._fechaauxiliar = fechaauxiliar;
	}
}
