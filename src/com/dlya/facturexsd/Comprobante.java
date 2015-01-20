/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import com.dlya.facturetype.ComprobanteTipoDeComprobanteType;
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlRootElement(name="Comprobante")
/*     */ @XmlType(propOrder={"emisor", "receptor", "conceptos", "conceptosAdicionales", "addenda", "certificado", "complemento", "impuestos", "sello"})
/*     */ public class Comprobante
/*     */   implements Serializable
/*     */ {
/*  42 */   private String _version = "2.0";
/*     */   private String _serie;
/*     */   private String _folio;
/*     */   private Date _fechaauxiliar;
/*     */   private String _fecha;
/*     */   private String _sello;
/*     */   private boolean _has_noAprobacion;
/*     */   private boolean _has_anoAprobacion;
/*     */   private String _formaDePago;
/*     */   private String _noCertificado;
/*     */   private String _certificado;
/*     */   private String _condicionesDePago;
/*     */   private BigDecimal _subTotal;
/*     */   private BigDecimal _descuento;
/*     */   private String _motivoDescuento;
/*     */   private String _tipoCambio;
/*     */   private String _moneda;
/*     */   private BigDecimal _total;
/*     */   private String _metodoDePago;
/*     */   private String _lugarExpedicion;
/*     */   private String _numCtaPago;
/*     */   private String correo;
/*     */   private String CURP;
/*     */   private String cveCliente;
/*     */   private ComprobanteTipoDeComprobanteType _tipoDeComprobante;
/*     */   private Emisor _emisor;
/*     */   private Receptor _receptor;
/*     */   private Conceptos _conceptos;
/*     */   private ConceptosAdicionales _conceptosadicionales;
/*     */   private Impuestos _impuestos;
/*     */   private Complemento _complemento;
/*     */   private Addenda _addenda;
/*     */   private String _xsi;
/*     */   private String _xsd;
/*     */   private String _xmlns;
/*     */ 
/*     */   public Comprobante()
/*     */   {
/* 233 */     setVersion("2.0");
/*     */   }
/*     */ 
/*     */   public void deleteAnoAprobacion()
/*     */   {
/* 243 */     this._has_anoAprobacion = false;
/*     */   }
/*     */ 
/*     */   public void deleteNoAprobacion()
/*     */   {
/* 249 */     this._has_noAprobacion = false;
/*     */   }
/*     */ 
/*     */   public Addenda getAddenda()
/*     */   {
/* 261 */     return this._addenda;
/*     */   }
/*     */ 
/*     */   public String getCertificado()
/*     */   {
/* 284 */     return this._certificado;
/*     */   }
/*     */ 
/*     */   public Complemento getComplemento()
/*     */   {
/* 296 */     return this._complemento;
/*     */   }
/*     */ 
/*     */   public Conceptos getConceptos()
/*     */   {
/* 307 */     return this._conceptos;
/*     */   }
/*     */ 
/*     */   public ConceptosAdicionales getConceptosAdicionales()
/*     */   {
/* 318 */     return this._conceptosadicionales;
/*     */   }
/*     */ 
/*     */   public String getCondicionesDePago()
/*     */   {
/* 330 */     return this._condicionesDePago;
/*     */   }
/*     */ 
/*     */   public BigDecimal getDescuento()
/*     */   {
/* 341 */     return this._descuento;
/*     */   }
/*     */ 
/*     */   public Emisor getEmisor()
/*     */   {
/* 352 */     return this._emisor;
/*     */   }
/*     */ 
/*     */   public String getFecha()
/*     */   {
/* 364 */     return this._fecha;
/*     */   }
/*     */ 
/*     */   public String getFolio()
/*     */   {
/* 375 */     return this._folio;
/*     */   }
/*     */ 
/*     */   public String getFormaDePago()
/*     */   {
/* 388 */     return this._formaDePago;
/*     */   }
/*     */ 
/*     */   public Impuestos getImpuestos()
/*     */   {
/* 399 */     return this._impuestos;
/*     */   }
/*     */ 
/*     */   public String getMetodoDePago()
/*     */   {
/* 412 */     return this._metodoDePago;
/*     */   }
/*     */ 
/*     */   public String getMotivoDescuento()
/*     */   {
/* 423 */     return this._motivoDescuento;
/*     */   }
/*     */ 
/*     */   public String getNoCertificado()
/*     */   {
/* 448 */     return this._noCertificado;
/*     */   }
/*     */ 
/*     */   public Receptor getReceptor()
/*     */   {
/* 459 */     return this._receptor;
/*     */   }
/*     */ 
/*     */   public String getSello()
/*     */   {
/* 472 */     return this._sello;
/*     */   }
/*     */ 
/*     */   public String getSerie()
/*     */   {
/* 484 */     return this._serie;
/*     */   }
/*     */ 
/*     */   public BigDecimal getSubTotal()
/*     */   {
/* 495 */     return this._subTotal;
/*     */   }
/*     */ 
/*     */   public ComprobanteTipoDeComprobanteType getTipoDeComprobante()
/*     */   {
/* 507 */     return this._tipoDeComprobante;
/*     */   }
/*     */ 
/*     */   public BigDecimal getTotal()
/*     */   {
/* 519 */     return this._total;
/*     */   }
/*     */ 
/*     */   public String getVersion()
/*     */   {
/* 531 */     return this._version;
/*     */   }
/*     */ 
/*     */   public boolean hasAnoAprobacion()
/*     */   {
/* 540 */     return this._has_anoAprobacion;
/*     */   }
/*     */ 
/*     */   public boolean hasNoAprobacion()
/*     */   {
/* 549 */     return this._has_noAprobacion;
/*     */   }
/*     */ 
/*     */   public void setAddenda(Addenda addenda)
/*     */   {
/* 562 */     this._addenda = addenda;
/*     */   }
/*     */ 
/*     */   public void setCertificado(String certificado)
/*     */   {
/* 584 */     this._certificado = certificado;
/*     */   }
/*     */ 
/*     */   public void setComplemento(Complemento complemento)
/*     */   {
/* 597 */     this._complemento = complemento;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCondicionesDePago(String condicionesDePago)
/*     */   {
/* 611 */     this._condicionesDePago = condicionesDePago;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setDescuento(BigDecimal descuento)
/*     */   {
/* 624 */     this._descuento = descuento;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Emisor")
/*     */   public void setEmisor(Emisor emisor)
/*     */   {
/* 638 */     this._emisor = emisor;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setFecha(String nn)
/*     */   {
/* 652 */     SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
/* 653 */     String fecha = formateador.format(this._fechaauxiliar);
/*     */ 
/* 655 */     this._fecha = fecha;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setFolio(String folio)
/*     */   {
/* 668 */     this._folio = folio;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setFormaDePago(String formaDePago)
/*     */   {
/* 683 */     this._formaDePago = formaDePago;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Impuestos")
/*     */   public void setImpuestos(Impuestos impuestos)
/*     */   {
/* 696 */     this._impuestos = impuestos;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setMetodoDePago(String metodoDePago)
/*     */   {
/* 711 */     this._metodoDePago = metodoDePago;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setMotivoDescuento(String motivoDescuento)
/*     */   {
/* 724 */     this._motivoDescuento = motivoDescuento;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoCertificado(String noCertificado)
/*     */   {
/* 753 */     this._noCertificado = noCertificado;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Receptor")
/*     */   public void setReceptor(Receptor receptor)
/*     */   {
/* 766 */     this._receptor = receptor;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Conceptos")
/*     */   public void setConceptos(Conceptos conceptos)
/*     */   {
/* 779 */     this._conceptos = conceptos;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="ConceptosAdicionales")
/*     */   public void setConceptosAdicionales(ConceptosAdicionales conceptosadicionales)
/*     */   {
/* 792 */     this._conceptosadicionales = conceptosadicionales;
/*     */   }
/*     */ 
/*     */   public void setSello(String sello)
/*     */   {
/* 806 */     this._sello = sello;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setSerie(String serie)
/*     */   {
/* 820 */     this._serie = serie;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setSubTotal(BigDecimal subTotal)
/*     */   {
/* 833 */     this._subTotal = subTotal;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setTipoDeComprobante(ComprobanteTipoDeComprobanteType tipoDeComprobante)
/*     */   {
/* 848 */     this._tipoDeComprobante = tipoDeComprobante;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setTotal(BigDecimal total)
/*     */   {
/* 862 */     this._total = total;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setVersion(String version)
/*     */   {
/* 875 */     this._version = version;
/*     */   }
/*     */ 
/*     */   public String getTipoCambio()
/*     */   {
/* 881 */     return this._tipoCambio;
/*     */   }
/*     */   @XmlAttribute(name="TipoCambio")
/*     */   public void setTipoCambio(String _tipoCambio) {
/* 886 */     this._tipoCambio = _tipoCambio;
/*     */   }
/*     */ 
/*     */   public String getMoneda() {
/* 890 */     return this._moneda;
/*     */   }
/*     */   @XmlAttribute(name="Moneda")
/*     */   public void setMoneda(String _moneda) {
/* 895 */     this._moneda = _moneda;
/*     */   }
/*     */ 
/*     */   public String getLugarExpedicion() {
/* 899 */     return this._lugarExpedicion;
/*     */   }
/*     */   @XmlAttribute(name="LugarExpedicion")
/*     */   public void setLugarExpedicion(String _lugarExpedicion) {
/* 904 */     this._lugarExpedicion = _lugarExpedicion;
/*     */   }
/*     */ 
/*     */   public String getNumCtaPago() {
/* 908 */     return this._numCtaPago;
/*     */   }
/*     */   @XmlAttribute(name="NumCtaPago")
/*     */   public void setNumCtaPago(String _numCtaPago) {
/* 913 */     this._numCtaPago = _numCtaPago;
/*     */   }
/*     */ 
/*     */   public String get_xsi() {
/* 917 */     return this._xsi;
/*     */   }
/*     */   @XmlAttribute(name="xmlns:xsi")
/*     */   public void set_xsi(String _xsi) {
/* 922 */     this._xsi = _xsi;
/*     */   }
/*     */ 
/*     */   public String get_xsd() {
/* 926 */     return this._xsd;
/*     */   }
/*     */   @XmlAttribute(name="xmlns:xsd")
/*     */   public void set_xsd(String _xsd) {
/* 931 */     this._xsd = _xsd;
/*     */   }
/*     */ 
/*     */   public String get_xmlns() {
/* 935 */     return this._xmlns;
/*     */   }
/*     */   @XmlAttribute(name="xmlns")
/*     */   public void set_xmlns(String _xmlns) {
/* 940 */     this._xmlns = _xmlns;
/*     */   }
/*     */ 
/*     */   public String getCorreo() {
/* 944 */     return this.correo;
/*     */   }
/*     */ 
/*     */   @XmlAttribute(name="correo")
/*     */   public void setCorreo(String correo) {
/* 950 */     this.correo = correo;
/*     */   }
/*     */ 
/*     */   public String getCURP() {
/* 954 */     return this.CURP;
/*     */   }
/*     */   @XmlAttribute(name="CURP")
/*     */   public void setCURP(String cURP) {
/* 959 */     this.CURP = cURP;
/*     */   }
/*     */ 
/*     */   public String getCveCliente() {
/* 963 */     return this.cveCliente;
/*     */   }
/*     */   @XmlAttribute(name="cve_cliente")
/*     */   public void setCveCliente(String cveCliente) {
/* 968 */     this.cveCliente = cveCliente;
/*     */   }
/*     */ 
/*     */   public void setfechaauxiliar(Date fechaauxiliar) {
/* 972 */     this._fechaauxiliar = fechaauxiliar;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Comprobante
 * JD-Core Version:    0.6.0
 */