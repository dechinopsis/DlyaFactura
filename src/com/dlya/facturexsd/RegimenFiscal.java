/*    */ package com.dlya.facturexsd;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ 
/*    */ public class RegimenFiscal
/*    */   implements Serializable
/*    */ {
/*    */   private String _regimen;
/*    */ 
/*    */   public String getRegimen()
/*    */   {
/* 57 */     return this._regimen;
/*    */   }
/*    */ 
/*    */   @XmlAttribute(name="Regimen")
/*    */   public void setRegimen(String regimen)
/*    */   {
/* 71 */     this._regimen = regimen;
/*    */   }
/*    */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.RegimenFiscal
 * JD-Core Version:    0.6.0
 */