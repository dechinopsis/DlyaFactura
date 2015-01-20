/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import com.dlya.facturetype.TrasladoImpuestoType;
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ 
/*     */ public class Traslado
/*     */   implements Serializable
/*     */ {
/*     */   private TrasladoImpuestoType _impuesto;
/*     */   private BigDecimal _tasa;
/*     */   private BigDecimal _importe;
/*     */ 
/*     */   public BigDecimal getImporte()
/*     */   {
/*  70 */     return this._importe;
/*     */   }
/*     */ 
/*     */   public TrasladoImpuestoType getImpuesto()
/*     */   {
/*  82 */     return this._impuesto;
/*     */   }
/*     */ 
/*     */   public BigDecimal getTasa()
/*     */   {
/*  95 */     return this._tasa;
/*     */   }
/*     */ 
/*     */   @XmlAttribute(name="importe")
/*     */   public void setImporte(BigDecimal importe)
/*     */   {
/* 108 */     this._importe = importe;
/*     */   }
/*     */ 
/*     */   @XmlAttribute(name="impuesto")
/*     */   public void setImpuesto(TrasladoImpuestoType impuesto)
/*     */   {
/* 121 */     this._impuesto = impuesto;
/*     */   }
/*     */ 
/*     */   @XmlAttribute(name="tasa")
/*     */   public void setTasa(BigDecimal tasa)
/*     */   {
/* 135 */     this._tasa = tasa;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Traslado
 * JD-Core Version:    0.6.0
 */