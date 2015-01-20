/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class Traslados
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<Traslado> _trasladoList;
/*     */ 
/*     */   public Traslados()
/*     */   {
/*  38 */     this._trasladoList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addTraslado(Traslado vTraslado)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  56 */     this._trasladoList.addElement(vTraslado);
/*     */   }
/*     */ 
/*     */   public void addTraslado(int index, Traslado vTraslado)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  72 */     this._trasladoList.add(index, vTraslado);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends Traslado> enumerateTraslado()
/*     */   {
/*  82 */     return this._trasladoList.elements();
/*     */   }
/*     */ 
/*     */   public Traslado getTraslado(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  97 */     if ((index < 0) || (index >= this._trasladoList.size())) {
/*  98 */       throw new IndexOutOfBoundsException("getTraslado: Index value '" + index + "' not in range [0.." + (this._trasladoList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 101 */     return (Traslado)this._trasladoList.get(index);
/*     */   }
/*     */ 
/*     */   public Traslado[] getTraslado()
/*     */   {
/* 115 */     Traslado[] array = new Traslado[0];
/* 116 */     return (Traslado[])this._trasladoList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getTrasladoCount()
/*     */   {
/* 126 */     return this._trasladoList.size();
/*     */   }
/*     */ 
/*     */   public void removeAllTraslado()
/*     */   {
/* 133 */     this._trasladoList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeTraslado(Traslado vTraslado)
/*     */   {
/* 144 */     boolean removed = this._trasladoList.remove(vTraslado);
/* 145 */     return removed;
/*     */   }
/*     */ 
/*     */   public Traslado removeTrasladoAt(int index)
/*     */   {
/* 156 */     Object obj = this._trasladoList.remove(index);
/* 157 */     return (Traslado)obj;
/*     */   }
/*     */ 
/*     */   public void setTraslado(int index, Traslado vTraslado)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 173 */     if ((index < 0) || (index >= this._trasladoList.size())) {
/* 174 */       throw new IndexOutOfBoundsException("setTraslado: Index value '" + index + "' not in range [0.." + (this._trasladoList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 177 */     this._trasladoList.set(index, vTraslado);
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Traslado")
/*     */   public void setTraslado(Traslado[] vTrasladoArray)
/*     */   {
/* 189 */     this._trasladoList.clear();
/*     */ 
/* 191 */     for (int i = 0; i < vTrasladoArray.length; i++)
/* 192 */       this._trasladoList.add(vTrasladoArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Traslados
 * JD-Core Version:    0.6.0
 */