/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class Emisor
/*     */   implements Serializable
/*     */ {
/*     */   private String _rfc;
/*     */   private String _nombre;
/*     */   private DomicilioFiscal _domicilioFiscal;
/*     */   private ExpedidoEn _expedidoEn;
/*     */   private RegimenFiscal _regimen;
/*     */ 
/*     */   public DomicilioFiscal getDomicilioFiscal()
/*     */   {
/* 105 */     return this._domicilioFiscal;
/*     */   }
/*     */ 
/*     */   public ExpedidoEn getExpedidoEn()
/*     */   {
/* 119 */     return this._expedidoEn;
/*     */   }
/*     */ 
/*     */   public String getNombre()
/*     */   {
/* 131 */     return this._nombre;
/*     */   }
/*     */ 
/*     */   public String getRfc()
/*     */   {
/* 144 */     return this._rfc;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="DomicilioFiscal")
/*     */   public void setDomicilioFiscal(DomicilioFiscal domicilioFiscal)
/*     */   {
/* 177 */     this._domicilioFiscal = domicilioFiscal;
/*     */   }
/*     */ 
/*     */   public RegimenFiscal getRegimen() {
/* 181 */     return this._regimen;
/*     */   }
/*     */   @XmlElement(name="RegimenFiscal")
/*     */   public void setRegimen(RegimenFiscal _regimen) {
/* 186 */     this._regimen = _regimen;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="ExpedidoEn")
/*     */   public void setExpedidoEn(ExpedidoEn expedidoEn)
/*     */   {
/* 203 */     this._expedidoEn = expedidoEn;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNombre(String nombre)
/*     */   {
/* 216 */     this._nombre = nombre;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setRfc(String rfc)
/*     */   {
/* 230 */     this._rfc = rfc;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Emisor
 * JD-Core Version:    0.6.0
 */