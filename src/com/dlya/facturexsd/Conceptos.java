/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class Conceptos
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<Concepto> _conceptoList;
/*     */ 
/*     */   public Conceptos()
/*     */   {
/*  39 */     this._conceptoList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addConcepto(Concepto vConcepto)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  58 */     this._conceptoList.addElement(vConcepto);
/*     */   }
/*     */ 
/*     */   public void addConcepto(int index, Concepto vConcepto)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  73 */     this._conceptoList.add(index, vConcepto);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends Concepto> enumerateConcepto()
/*     */   {
/*  83 */     return this._conceptoList.elements();
/*     */   }
/*     */ 
/*     */   public Concepto getConcepto(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  98 */     if ((index < 0) || (index >= this._conceptoList.size())) {
/*  99 */       throw new IndexOutOfBoundsException("getConcepto: Index value '" + index + "' not in range [0.." + (this._conceptoList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 102 */     return (Concepto)this._conceptoList.get(index);
/*     */   }
/*     */ 
/*     */   public Concepto[] getConcepto()
/*     */   {
/* 116 */     Concepto[] array = new Concepto[0];
/* 117 */     return (Concepto[])this._conceptoList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getConceptoCount()
/*     */   {
/* 127 */     return this._conceptoList.size();
/*     */   }
/*     */ 
/*     */   public void removeAllConcepto()
/*     */   {
/* 134 */     this._conceptoList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeConcepto(Concepto vConcepto)
/*     */   {
/* 145 */     boolean removed = this._conceptoList.remove(vConcepto);
/* 146 */     return removed;
/*     */   }
/*     */ 
/*     */   public Concepto removeConceptoAt(int index)
/*     */   {
/* 157 */     Object obj = this._conceptoList.remove(index);
/* 158 */     return (Concepto)obj;
/*     */   }
/*     */ 
/*     */   public void setConcepto(int index, Concepto vConcepto)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 175 */     if ((index < 0) || (index >= this._conceptoList.size())) {
/* 176 */       throw new IndexOutOfBoundsException("setConcepto: Index value '" + index + "' not in range [0.." + (this._conceptoList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 179 */     this._conceptoList.set(index, vConcepto);
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Concepto")
/*     */   public void setConcepto(Concepto[] vConceptoArray)
/*     */   {
/* 191 */     this._conceptoList.clear();
/*     */ 
/* 193 */     for (int i = 0; i < vConceptoArray.length; i++)
/* 194 */       this._conceptoList.add(vConceptoArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Conceptos
 * JD-Core Version:    0.6.0
 */