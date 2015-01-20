/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ 
/*     */ public class T_UbicacionFiscal
/*     */   implements Serializable
/*     */ {
/*     */   private String _calle;
/*     */   private String _noExterior;
/*     */   private String _noInterior;
/*     */   private String _colonia;
/*     */   private String _localidad;
/*     */   private String _referencia;
/*     */   private String _municipio;
/*     */   private String _estado;
/*     */   private String _pais;
/*     */   private String _codigoPostal;
/*     */ 
/*     */   public String getCalle()
/*     */   {
/* 113 */     return this._calle;
/*     */   }
/*     */ 
/*     */   public String getCodigoPostal()
/*     */   {
/* 126 */     return this._codigoPostal;
/*     */   }
/*     */ 
/*     */   public String getColonia()
/*     */   {
/* 140 */     return this._colonia;
/*     */   }
/*     */ 
/*     */   public String getEstado()
/*     */   {
/* 153 */     return this._estado;
/*     */   }
/*     */ 
/*     */   public String getLocalidad()
/*     */   {
/* 166 */     return this._localidad;
/*     */   }
/*     */ 
/*     */   public String getMunicipio()
/*     */   {
/* 180 */     return this._municipio;
/*     */   }
/*     */ 
/*     */   public String getNoExterior()
/*     */   {
/* 193 */     return this._noExterior;
/*     */   }
/*     */ 
/*     */   public String getNoInterior()
/*     */   {
/* 208 */     return this._noInterior;
/*     */   }
/*     */ 
/*     */   public String getPais()
/*     */   {
/* 220 */     return this._pais;
/*     */   }
/*     */ 
/*     */   public String getReferencia()
/*     */   {
/* 233 */     return this._referencia;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCalle(String calle)
/*     */   {
/* 247 */     this._calle = calle;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCodigoPostal(String codigoPostal)
/*     */   {
/* 261 */     this._codigoPostal = codigoPostal;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setColonia(String colonia)
/*     */   {
/* 275 */     this._colonia = colonia;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setEstado(String estado)
/*     */   {
/* 289 */     this._estado = estado;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setLocalidad(String localidad)
/*     */   {
/* 303 */     this._localidad = localidad;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setMunicipio(String municipio)
/*     */   {
/* 317 */     this._municipio = municipio;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoExterior(String noExterior)
/*     */   {
/* 331 */     this._noExterior = noExterior;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoInterior(String noInterior)
/*     */   {
/* 347 */     this._noInterior = noInterior;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setPais(String pais)
/*     */   {
/* 360 */     this._pais = pais;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setReferencia(String referencia)
/*     */   {
/* 373 */     this._referencia = referencia;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.T_UbicacionFiscal
 * JD-Core Version:    0.6.0
 */