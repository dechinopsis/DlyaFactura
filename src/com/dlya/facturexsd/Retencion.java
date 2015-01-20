/*    */ package com.dlya.facturexsd;
/*    */ 
/*    */ import com.dlya.facturetype.RetencionImpuestoType;
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ public class Retencion
/*    */   implements Serializable
/*    */ {
/*    */   private RetencionImpuestoType _impuesto;
/*    */   private BigDecimal _importe;
/*    */ 
/*    */   public BigDecimal getImporte()
/*    */   {
/* 59 */     return this._importe;
/*    */   }
/*    */ 
/*    */   public RetencionImpuestoType getImpuesto()
/*    */   {
/* 71 */     return this._impuesto;
/*    */   }
/*    */ 
/*    */   public void setImporte(BigDecimal importe)
/*    */   {
/* 83 */     this._importe = importe;
/*    */   }
/*    */ 
/*    */   public void setImpuesto(RetencionImpuestoType impuesto)
/*    */   {
/* 95 */     this._impuesto = impuesto;
/*    */   }
/*    */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Retencion
 * JD-Core Version:    0.6.0
 */