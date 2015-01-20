/*    */ package com.dlya.facturexsd;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ 
/*    */ public class ConceptoAdicional
/*    */   implements Serializable
/*    */ {
/*    */   private String _descripcion;
/*    */   private BigDecimal _importe;
/*    */ 
/*    */   public String getDescripcion()
/*    */   {
/* 51 */     return this._descripcion;
/*    */   }
/*    */ 
/*    */   public BigDecimal getImporte()
/*    */   {
/* 65 */     return this._importe;
/*    */   }
/*    */ 
/*    */   @XmlAttribute
/*    */   public void setDescripcion(String descripcion)
/*    */   {
/* 78 */     this._descripcion = descripcion;
/*    */   }
/*    */ 
/*    */   @XmlAttribute
/*    */   public void setImporte(BigDecimal importe)
/*    */   {
/* 92 */     this._importe = importe;
/*    */   }
/*    */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.ConceptoAdicional
 * JD-Core Version:    0.6.0
 */