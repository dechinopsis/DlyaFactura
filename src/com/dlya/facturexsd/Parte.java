/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class Parte
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal _cantidad;
/*     */   private String _unidad;
/*     */   private String _noIdentificacion;
/*     */   private String _descripcion;
/*     */   private BigDecimal _valorUnitario;
/*     */   private BigDecimal _importe;
/*     */   private Vector<InformacionAduanera> _informacionAduaneraList;
/*     */ 
/*     */   public Parte()
/*     */   {
/*  76 */     this._informacionAduaneraList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addInformacionAduanera(InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/*  94 */     this._informacionAduaneraList.addElement(vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public void addInformacionAduanera(int index, InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 109 */     this._informacionAduaneraList.add(index, vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends InformacionAduanera> enumerateInformacionAduanera()
/*     */   {
/* 119 */     return this._informacionAduaneraList.elements();
/*     */   }
/*     */ 
/*     */   public BigDecimal getCantidad()
/*     */   {
/* 132 */     return this._cantidad;
/*     */   }
/*     */ 
/*     */   public String getDescripcion()
/*     */   {
/* 145 */     return this._descripcion;
/*     */   }
/*     */ 
/*     */   public BigDecimal getImporte()
/*     */   {
/* 160 */     return this._importe;
/*     */   }
/*     */ 
/*     */   public InformacionAduanera getInformacionAduanera(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 176 */     if ((index < 0) || (index >= this._informacionAduaneraList.size())) {
/* 177 */       throw new IndexOutOfBoundsException("getInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 180 */     return (InformacionAduanera)this._informacionAduaneraList.get(index);
/*     */   }
/*     */ 
/*     */   public InformacionAduanera[] getInformacionAduanera()
/*     */   {
/* 195 */     InformacionAduanera[] array = new InformacionAduanera[0];
/* 196 */     return (InformacionAduanera[])this._informacionAduaneraList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getInformacionAduaneraCount()
/*     */   {
/* 206 */     return this._informacionAduaneraList.size();
/*     */   }
/*     */ 
/*     */   public String getNoIdentificacion()
/*     */   {
/* 219 */     return this._noIdentificacion;
/*     */   }
/*     */ 
/*     */   public String getUnidad()
/*     */   {
/* 232 */     return this._unidad;
/*     */   }
/*     */ 
/*     */   public BigDecimal getValorUnitario()
/*     */   {
/* 245 */     return this._valorUnitario;
/*     */   }
/*     */ 
/*     */   public void removeAllInformacionAduanera()
/*     */   {
/* 252 */     this._informacionAduaneraList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeInformacionAduanera(InformacionAduanera vInformacionAduanera)
/*     */   {
/* 263 */     boolean removed = this._informacionAduaneraList.remove(vInformacionAduanera);
/* 264 */     return removed;
/*     */   }
/*     */ 
/*     */   public InformacionAduanera removeInformacionAduaneraAt(int index)
/*     */   {
/* 275 */     Object obj = this._informacionAduaneraList.remove(index);
/* 276 */     return (InformacionAduanera)obj;
/*     */   }
/*     */ 
/*     */   public void setCantidad(BigDecimal cantidad)
/*     */   {
/* 289 */     this._cantidad = cantidad;
/*     */   }
/*     */ 
/*     */   public void setDescripcion(String descripcion)
/*     */   {
/* 302 */     this._descripcion = descripcion;
/*     */   }
/*     */ 
/*     */   public void setImporte(BigDecimal importe)
/*     */   {
/* 316 */     this._importe = importe;
/*     */   }
/*     */ 
/*     */   public void setInformacionAduanera(int index, InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 332 */     if ((index < 0) || (index >= this._informacionAduaneraList.size())) {
/* 333 */       throw new IndexOutOfBoundsException("setInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 336 */     this._informacionAduaneraList.set(index, vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public void setInformacionAduanera(InformacionAduanera[] vInformacionAduaneraArray)
/*     */   {
/* 347 */     this._informacionAduaneraList.clear();
/*     */ 
/* 349 */     for (int i = 0; i < vInformacionAduaneraArray.length; i++)
/* 350 */       this._informacionAduaneraList.add(vInformacionAduaneraArray[i]);
/*     */   }
/*     */ 
/*     */   public void setNoIdentificacion(String noIdentificacion)
/*     */   {
/* 364 */     this._noIdentificacion = noIdentificacion;
/*     */   }
/*     */ 
/*     */   public void setUnidad(String unidad)
/*     */   {
/* 377 */     this._unidad = unidad;
/*     */   }
/*     */ 
/*     */   public void setValorUnitario(BigDecimal valorUnitario)
/*     */   {
/* 390 */     this._valorUnitario = valorUnitario;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Parte
 * JD-Core Version:    0.6.0
 */