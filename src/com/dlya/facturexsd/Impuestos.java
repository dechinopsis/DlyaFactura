/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class Impuestos
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal _totalImpuestosRetenidos;
/*     */   private BigDecimal _totalImpuestosTrasladados;
/*     */   private Retenciones _retenciones;
/*     */   private Traslados _traslados;
/*     */ 
/*     */   public Retenciones getRetenciones()
/*     */   {
/*  73 */     return this._retenciones;
/*     */   }
/*     */ 
/*     */   public BigDecimal getTotalImpuestosRetenidos()
/*     */   {
/*  87 */     return this._totalImpuestosRetenidos;
/*     */   }
/*     */ 
/*     */   public BigDecimal getTotalImpuestosTrasladados()
/*     */   {
/* 101 */     return this._totalImpuestosTrasladados;
/*     */   }
/*     */ 
/*     */   public Traslados getTraslados()
/*     */   {
/* 113 */     return this._traslados;
/*     */   }
/*     */ 
/*     */   public void setRetenciones(Retenciones retenciones)
/*     */   {
/* 125 */     this._retenciones = retenciones;
/*     */   }
/*     */ 
/*     */   public void setTotalImpuestosRetenidos(BigDecimal totalImpuestosRetenidos)
/*     */   {
/* 140 */     this._totalImpuestosRetenidos = totalImpuestosRetenidos;
/*     */   }
/*     */ 
/*     */   @XmlAttribute(name="totalImpuestosTrasladados")
/*     */   public void setTotalImpuestosTrasladados(BigDecimal totalImpuestosTrasladados)
/*     */   {
/* 156 */     this._totalImpuestosTrasladados = totalImpuestosTrasladados;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Traslados")
/*     */   public void setTraslados(Traslados traslados)
/*     */   {
/* 169 */     this._traslados = traslados;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Impuestos
 * JD-Core Version:    0.6.0
 */