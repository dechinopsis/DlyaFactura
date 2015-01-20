/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class ConceptosAdicionales
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<ConceptoAdicional> _conceptoAdicionalList;
/*     */ 
/*     */   public ConceptosAdicionales()
/*     */   {
/*  39 */     this._conceptoAdicionalList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addConceptoAdicional(ConceptoAdicional vConceptoAdicional)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  57 */     this._conceptoAdicionalList.addElement(vConceptoAdicional);
/*     */   }
/*     */ 
/*     */   public void addConceptoAdicional(int index, ConceptoAdicional vConceptoAdicional)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  72 */     this._conceptoAdicionalList.add(index, vConceptoAdicional);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends ConceptoAdicional> enumerateConceptoAdicional()
/*     */   {
/*  82 */     return this._conceptoAdicionalList.elements();
/*     */   }
/*     */ 
/*     */   public ConceptoAdicional getConceptoAdicional(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  97 */     if ((index < 0) || (index >= this._conceptoAdicionalList.size())) {
/*  98 */       throw new IndexOutOfBoundsException("getConceptoAdicional: Index value '" + index + "' not in range [0.." + (this._conceptoAdicionalList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 101 */     return (ConceptoAdicional)this._conceptoAdicionalList.get(index);
/*     */   }
/*     */ 
/*     */   public ConceptoAdicional[] getConceptoAdicional()
/*     */   {
/* 115 */     ConceptoAdicional[] array = new ConceptoAdicional[0];
/* 116 */     return (ConceptoAdicional[])this._conceptoAdicionalList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getConceptoAdicionalCount()
/*     */   {
/* 126 */     return this._conceptoAdicionalList.size();
/*     */   }
/*     */ 
/*     */   public void removeAllConceptoAdicional()
/*     */   {
/* 133 */     this._conceptoAdicionalList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeConceptoAdicional(ConceptoAdicional vConceptoAdicional)
/*     */   {
/* 144 */     boolean removed = this._conceptoAdicionalList.remove(vConceptoAdicional);
/* 145 */     return removed;
/*     */   }
/*     */ 
/*     */   public ConceptoAdicional removeConceptoAdicionalAt(int index)
/*     */   {
/* 156 */     Object obj = this._conceptoAdicionalList.remove(index);
/* 157 */     return (ConceptoAdicional)obj;
/*     */   }
/*     */ 
/*     */   public void setConceptoAdicional(int index, ConceptoAdicional vConceptoAdicional)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 174 */     if ((index < 0) || (index >= this._conceptoAdicionalList.size())) {
/* 175 */       throw new IndexOutOfBoundsException("setConceptoAdicional: Index value '" + index + "' not in range [0.." + (this._conceptoAdicionalList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 178 */     this._conceptoAdicionalList.set(index, vConceptoAdicional);
/*     */   }
/*     */ 
/*     */   @XmlElement(name="ConceptoAdicional")
/*     */   public void setConceptoAdicional(ConceptoAdicional[] vConceptoAdicionalArray)
/*     */   {
/* 190 */     this._conceptoAdicionalList.clear();
/*     */ 
/* 192 */     for (int i = 0; i < vConceptoAdicionalArray.length; i++)
/* 193 */       this._conceptoAdicionalList.add(vConceptoAdicionalArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.ConceptosAdicionales
 * JD-Core Version:    0.6.0
 */