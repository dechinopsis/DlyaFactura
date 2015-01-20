/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class EmisorSequence
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<RegimenFiscal> _regimenFiscalList;
/*     */ 
/*     */   public EmisorSequence()
/*     */   {
/*  38 */     this._regimenFiscalList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addRegimenFiscal(RegimenFiscal vRegimenFiscal)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  56 */     this._regimenFiscalList.addElement(vRegimenFiscal);
/*     */   }
/*     */ 
/*     */   public void addRegimenFiscal(int index, RegimenFiscal vRegimenFiscal)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  71 */     this._regimenFiscalList.add(index, vRegimenFiscal);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends RegimenFiscal> enumerateRegimenFiscal()
/*     */   {
/*  81 */     return this._regimenFiscalList.elements();
/*     */   }
/*     */ 
/*     */   public RegimenFiscal getRegimenFiscal(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  96 */     if ((index < 0) || (index >= this._regimenFiscalList.size())) {
/*  97 */       throw new IndexOutOfBoundsException("getRegimenFiscal: Index value '" + index + "' not in range [0.." + (this._regimenFiscalList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 100 */     return (RegimenFiscal)this._regimenFiscalList.get(index);
/*     */   }
/*     */ 
/*     */   public RegimenFiscal[] getRegimenFiscal()
/*     */   {
/* 115 */     RegimenFiscal[] array = new RegimenFiscal[0];
/* 116 */     return (RegimenFiscal[])this._regimenFiscalList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getRegimenFiscalCount()
/*     */   {
/* 126 */     return this._regimenFiscalList.size();
/*     */   }
/*     */ 
/*     */   public void removeAllRegimenFiscal()
/*     */   {
/* 133 */     this._regimenFiscalList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeRegimenFiscal(RegimenFiscal vRegimenFiscal)
/*     */   {
/* 144 */     boolean removed = this._regimenFiscalList.remove(vRegimenFiscal);
/* 145 */     return removed;
/*     */   }
/*     */ 
/*     */   public RegimenFiscal removeRegimenFiscalAt(int index)
/*     */   {
/* 156 */     Object obj = this._regimenFiscalList.remove(index);
/* 157 */     return (RegimenFiscal)obj;
/*     */   }
/*     */ 
/*     */   public void setRegimenFiscal(int index, RegimenFiscal vRegimenFiscal)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 173 */     if ((index < 0) || (index >= this._regimenFiscalList.size())) {
/* 174 */       throw new IndexOutOfBoundsException("setRegimenFiscal: Index value '" + index + "' not in range [0.." + (this._regimenFiscalList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 177 */     this._regimenFiscalList.set(index, vRegimenFiscal);
/*     */   }
/*     */ 
/*     */   @XmlElement(namespace="http://www.sat.gob.mx/cfd/3", name="Regimen")
/*     */   public void setRegimenFiscal(RegimenFiscal[] vRegimenFiscalArray)
/*     */   {
/* 190 */     this._regimenFiscalList.clear();
/*     */ 
/* 192 */     for (int i = 0; i < vRegimenFiscalArray.length; i++)
/* 193 */       this._regimenFiscalList.add(vRegimenFiscalArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.EmisorSequence
 * JD-Core Version:    0.6.0
 */