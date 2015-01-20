/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class Retenciones
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<Retencion> _retencionList;
/*     */ 
/*     */   public Retenciones()
/*     */   {
/*  35 */     this._retencionList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addRetencion(Retencion vRetencion)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  53 */     this._retencionList.addElement(vRetencion);
/*     */   }
/*     */ 
/*     */   public void addRetencion(int index, Retencion vRetencion)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  68 */     this._retencionList.add(index, vRetencion);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends Retencion> enumerateRetencion()
/*     */   {
/*  78 */     return this._retencionList.elements();
/*     */   }
/*     */ 
/*     */   public Retencion getRetencion(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  93 */     if ((index < 0) || (index >= this._retencionList.size())) {
/*  94 */       throw new IndexOutOfBoundsException("getRetencion: Index value '" + index + "' not in range [0.." + (this._retencionList.size() - 1) + "]");
/*     */     }
/*     */ 
/*  97 */     return (Retencion)this._retencionList.get(index);
/*     */   }
/*     */ 
/*     */   public Retencion[] getRetencion()
/*     */   {
/* 111 */     Retencion[] array = new Retencion[0];
/* 112 */     return (Retencion[])this._retencionList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getRetencionCount()
/*     */   {
/* 122 */     return this._retencionList.size();
/*     */   }
/*     */ 
/*     */   public void removeAllRetencion()
/*     */   {
/* 129 */     this._retencionList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeRetencion(Retencion vRetencion)
/*     */   {
/* 140 */     boolean removed = this._retencionList.remove(vRetencion);
/* 141 */     return removed;
/*     */   }
/*     */ 
/*     */   public Retencion removeRetencionAt(int index)
/*     */   {
/* 152 */     Object obj = this._retencionList.remove(index);
/* 153 */     return (Retencion)obj;
/*     */   }
/*     */ 
/*     */   public void setRetencion(int index, Retencion vRetencion)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 169 */     if ((index < 0) || (index >= this._retencionList.size())) {
/* 170 */       throw new IndexOutOfBoundsException("setRetencion: Index value '" + index + "' not in range [0.." + (this._retencionList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 173 */     this._retencionList.set(index, vRetencion);
/*     */   }
/*     */ 
/*     */   public void setRetencion(Retencion[] vRetencionArray)
/*     */   {
/* 184 */     this._retencionList.clear();
/*     */ 
/* 186 */     for (int i = 0; i < vRetencionArray.length; i++)
/* 187 */       this._retencionList.add(vRetencionArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Retenciones
 * JD-Core Version:    0.6.0
 */