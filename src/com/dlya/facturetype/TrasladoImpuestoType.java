/*     */ package com.dlya.facturetype;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public enum TrasladoImpuestoType
/*     */ {
/*  25 */   IVA("IVA"), 
/*     */ 
/*  29 */   IEPS("IEPS");
/*     */ 
/*     */   private final String value;
/*     */   private static final Map<String, TrasladoImpuestoType> enumConstants;
/*     */ 
/*     */   static
/*     */   {
/*  43 */     enumConstants = new HashMap();
/*     */ 
/*  47 */     for (TrasladoImpuestoType c : values())
/*  48 */       enumConstants.put(c.value, c);
/*     */   }
/*     */ 
/*     */   private TrasladoImpuestoType(String value)
/*     */   {
/*  59 */     this.value = value;
/*     */   }
/*     */ 
/*     */   public static TrasladoImpuestoType fromValue(String value)
/*     */   {
/*  75 */     TrasladoImpuestoType c = (TrasladoImpuestoType)enumConstants.get(value);
/*  76 */     if (c != null) {
/*  77 */       return c;
/*     */     }
/*  79 */     throw new IllegalArgumentException(value);
/*     */   }
/*     */ 
/*     */   public void setValue(String value)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String toString()
/*     */   {
/*  98 */     return this.value;
/*     */   }
/*     */ 
/*     */   public String value()
/*     */   {
/* 108 */     return this.value;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturetype.TrasladoImpuestoType
 * JD-Core Version:    0.6.0
 */