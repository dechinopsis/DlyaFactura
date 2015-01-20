/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ 
/*     */ public class T_Ubicacion
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
/* 112 */     return this._calle;
/*     */   }
/*     */ 
/*     */   public String getCodigoPostal()
/*     */   {
/* 125 */     return this._codigoPostal;
/*     */   }
/*     */ 
/*     */   public String getColonia()
/*     */   {
/* 139 */     return this._colonia;
/*     */   }
/*     */ 
/*     */   public String getEstado()
/*     */   {
/* 152 */     return this._estado;
/*     */   }
/*     */ 
/*     */   public String getLocalidad()
/*     */   {
/* 165 */     return this._localidad;
/*     */   }
/*     */ 
/*     */   public String getMunicipio()
/*     */   {
/* 178 */     return this._municipio;
/*     */   }
/*     */ 
/*     */   public String getNoExterior()
/*     */   {
/* 191 */     return this._noExterior;
/*     */   }
/*     */ 
/*     */   public String getNoInterior()
/*     */   {
/* 206 */     return this._noInterior;
/*     */   }
/*     */ 
/*     */   public String getPais()
/*     */   {
/* 218 */     return this._pais;
/*     */   }
/*     */ 
/*     */   public String getReferencia()
/*     */   {
/* 231 */     return this._referencia;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCalle(String calle)
/*     */   {
/* 245 */     this._calle = calle;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCodigoPostal(String codigoPostal)
/*     */   {
/* 260 */     this._codigoPostal = codigoPostal;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setColonia(String colonia)
/*     */   {
/* 274 */     this._colonia = colonia;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setEstado(String estado)
/*     */   {
/* 288 */     this._estado = estado;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setLocalidad(String localidad)
/*     */   {
/* 302 */     this._localidad = localidad;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setMunicipio(String municipio)
/*     */   {
/* 316 */     this._municipio = municipio;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoExterior(String noExterior)
/*     */   {
/* 330 */     this._noExterior = noExterior;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoInterior(String noInterior)
/*     */   {
/* 346 */     this._noInterior = noInterior;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setPais(String pais)
/*     */   {
/* 359 */     this._pais = pais;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setReferencia(String referencia)
/*     */   {
/* 372 */     this._referencia = referencia;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.T_Ubicacion
 * JD-Core Version:    0.6.0
 */