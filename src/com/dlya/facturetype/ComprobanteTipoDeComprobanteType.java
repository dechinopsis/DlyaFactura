/*     */ package com.dlya.facturetype;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public enum ComprobanteTipoDeComprobanteType
/*     */ {
/*  25 */   ingreso("ingreso"), 
/*     */ 
/*  29 */   egreso("egreso"), 
/*     */ 
/*  33 */   traslado("traslado");
/*     */ 
/*     */   private final String value;
/*     */   private static final Map<String, ComprobanteTipoDeComprobanteType> enumConstants;
/*     */ 
/*     */   static
/*     */   {
/*  47 */     enumConstants = new HashMap();
/*     */ 
/*  51 */     for (ComprobanteTipoDeComprobanteType c : values())
/*  52 */       enumConstants.put(c.value, c);
/*     */   }
/*     */ 
/*     */   private ComprobanteTipoDeComprobanteType(String value)
/*     */   {
/*  63 */     this.value = value;
/*     */   }
/*     */ 
/*     */   public static ComprobanteTipoDeComprobanteType fromValue(String value)
/*     */   {
/*  79 */     ComprobanteTipoDeComprobanteType c = (ComprobanteTipoDeComprobanteType)enumConstants.get(value);
/*  80 */     if (c != null) {
/*  81 */       return c;
/*     */     }
/*  83 */     throw new IllegalArgumentException(value);
/*     */   }
/*     */ 
/*     */   public void setValue(String value)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/* 102 */     return this.value.toLowerCase();
/*     */   }
/*     */ 
/*     */   public String value()
/*     */   {
/* 112 */     return this.value;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturetype.ComprobanteTipoDeComprobanteType
 * JD-Core Version:    0.6.0
 */