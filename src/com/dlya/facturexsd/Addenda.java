/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class Addenda
/*     */   implements Serializable
/*     */ {
/*     */   private Vector<Object> _anyObject;
/*     */ 
/*     */   public Addenda()
/*     */   {
/*  36 */     this._anyObject = new Vector();
/*     */   }
/*     */ 
/*     */   public void addAnyObject(Object vAnyObject)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  54 */     this._anyObject.addElement(vAnyObject);
/*     */   }
/*     */ 
/*     */   public void addAnyObject(int index, Object vAnyObject)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  69 */     this._anyObject.add(index, vAnyObject);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends Object> enumerateAnyObject()
/*     */   {
/*  79 */     return this._anyObject.elements();
/*     */   }
/*     */ 
/*     */   public Object getAnyObject(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  94 */     if ((index < 0) || (index >= this._anyObject.size())) {
/*  95 */       throw new IndexOutOfBoundsException("getAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
/*     */     }
/*     */ 
/*  98 */     return this._anyObject.get(index);
/*     */   }
/*     */ 
/*     */   public Object[] getAnyObject()
/*     */   {
/* 112 */     Object[] array = new Object[0];
/* 113 */     return this._anyObject.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getAnyObjectCount()
/*     */   {
/* 123 */     return this._anyObject.size();
/*     */   }
/*     */ 
/*     */   public void removeAllAnyObject()
/*     */   {
/* 130 */     this._anyObject.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeAnyObject(Object vAnyObject)
/*     */   {
/* 141 */     boolean removed = this._anyObject.remove(vAnyObject);
/* 142 */     return removed;
/*     */   }
/*     */ 
/*     */   public Object removeAnyObjectAt(int index)
/*     */   {
/* 153 */     Object obj = this._anyObject.remove(index);
/* 154 */     return obj;
/*     */   }
/*     */ 
/*     */   public void setAnyObject(int index, Object vAnyObject)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 170 */     if ((index < 0) || (index >= this._anyObject.size())) {
/* 171 */       throw new IndexOutOfBoundsException("setAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
/*     */     }
/*     */ 
/* 174 */     this._anyObject.set(index, vAnyObject);
/*     */   }
/*     */ 
/*     */   public void setAnyObject(Object[] vAnyObjectArray)
/*     */   {
/* 185 */     this._anyObject.clear();
/*     */ 
/* 187 */     for (int i = 0; i < vAnyObjectArray.length; i++)
/* 188 */       this._anyObject.add(vAnyObjectArray[i]);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Addenda
 * JD-Core Version:    0.6.0
 */