/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Vector;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ 
/*     */ public class Concepto
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal _cantidad;
/*     */   private String _unidad;
/*     */   private String _noIdentificacion;
/*     */   private String _descripcion;
/*     */   private BigDecimal _valorUnitario;
/*     */   private BigDecimal _importe;
/*     */   private Object _choiceValue;
/*     */   private Vector<InformacionAduanera> _informacionAduaneraList;
/*     */   private CuentaPredial _cuentaPredial;
/*     */   private ComplementoConcepto _complementoConcepto;
/*     */   private Vector<Parte> _parteList;
/*     */ 
/*     */   public Concepto()
/*     */   {
/* 113 */     this._informacionAduaneraList = new Vector();
/* 114 */     this._parteList = new Vector();
/*     */   }
/*     */ 
/*     */   public void addInformacionAduanera(InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 132 */     this._informacionAduaneraList.addElement(vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public void addInformacionAduanera(int index, InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 147 */     this._informacionAduaneraList.add(index, vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public void addParte(Parte vParte)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 160 */     this._parteList.addElement(vParte);
/*     */   }
/*     */ 
/*     */   public void addParte(int index, Parte vParte)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 175 */     this._parteList.add(index, vParte);
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends InformacionAduanera> enumerateInformacionAduanera()
/*     */   {
/* 185 */     return this._informacionAduaneraList.elements();
/*     */   }
/*     */ 
/*     */   public Enumeration<? extends Parte> enumerateParte()
/*     */   {
/* 195 */     return this._parteList.elements();
/*     */   }
/*     */ 
/*     */   public BigDecimal getCantidad()
/*     */   {
/* 208 */     return this._cantidad;
/*     */   }
/*     */ 
/*     */   public Object getChoiceValue()
/*     */   {
/* 220 */     return this._choiceValue;
/*     */   }
/*     */ 
/*     */   public ComplementoConcepto getComplementoConcepto()
/*     */   {
/* 235 */     return this._complementoConcepto;
/*     */   }
/*     */ 
/*     */   public CuentaPredial getCuentaPredial()
/*     */   {
/* 249 */     return this._cuentaPredial;
/*     */   }
/*     */ 
/*     */   public String getDescripcion()
/*     */   {
/* 262 */     return this._descripcion;
/*     */   }
/*     */ 
/*     */   public BigDecimal getImporte()
/*     */   {
/* 277 */     return this._importe;
/*     */   }
/*     */ 
/*     */   public InformacionAduanera getInformacionAduanera(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 293 */     if ((index < 0) || (index >= this._informacionAduaneraList.size())) {
/* 294 */       throw new IndexOutOfBoundsException("getInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 297 */     return (InformacionAduanera)this._informacionAduaneraList.get(index);
/*     */   }
/*     */ 
/*     */   public InformacionAduanera[] getInformacionAduanera()
/*     */   {
/* 312 */     InformacionAduanera[] array = new InformacionAduanera[0];
/* 313 */     return (InformacionAduanera[])this._informacionAduaneraList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getInformacionAduaneraCount()
/*     */   {
/* 323 */     return this._informacionAduaneraList.size();
/*     */   }
/*     */ 
/*     */   public String getNoIdentificacion()
/*     */   {
/* 337 */     return this._noIdentificacion;
/*     */   }
/*     */ 
/*     */   public Parte getParte(int index)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 352 */     if ((index < 0) || (index >= this._parteList.size())) {
/* 353 */       throw new IndexOutOfBoundsException("getParte: Index value '" + index + "' not in range [0.." + (this._parteList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 356 */     return (Parte)this._parteList.get(index);
/*     */   }
/*     */ 
/*     */   public Parte[] getParte()
/*     */   {
/* 370 */     Parte[] array = new Parte[0];
/* 371 */     return (Parte[])this._parteList.toArray(array);
/*     */   }
/*     */ 
/*     */   public int getParteCount()
/*     */   {
/* 381 */     return this._parteList.size();
/*     */   }
/*     */ 
/*     */   public String getUnidad()
/*     */   {
/* 394 */     return this._unidad;
/*     */   }
/*     */ 
/*     */   public BigDecimal getValorUnitario()
/*     */   {
/* 407 */     return this._valorUnitario;
/*     */   }
/*     */ 
/*     */   public void removeAllInformacionAduanera()
/*     */   {
/* 414 */     this._informacionAduaneraList.clear();
/*     */   }
/*     */ 
/*     */   public void removeAllParte()
/*     */   {
/* 421 */     this._parteList.clear();
/*     */   }
/*     */ 
/*     */   public boolean removeInformacionAduanera(InformacionAduanera vInformacionAduanera)
/*     */   {
/* 432 */     boolean removed = this._informacionAduaneraList.remove(vInformacionAduanera);
/* 433 */     return removed;
/*     */   }
/*     */ 
/*     */   public InformacionAduanera removeInformacionAduaneraAt(int index)
/*     */   {
/* 444 */     Object obj = this._informacionAduaneraList.remove(index);
/* 445 */     return (InformacionAduanera)obj;
/*     */   }
/*     */ 
/*     */   public boolean removeParte(Parte vParte)
/*     */   {
/* 456 */     boolean removed = this._parteList.remove(vParte);
/* 457 */     return removed;
/*     */   }
/*     */ 
/*     */   public Parte removeParteAt(int index)
/*     */   {
/* 468 */     Object obj = this._parteList.remove(index);
/* 469 */     return (Parte)obj;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setCantidad(BigDecimal cantidad)
/*     */   {
/* 483 */     this._cantidad = cantidad;
/*     */   }
/*     */ 
/*     */   public void setComplementoConcepto(ComplementoConcepto complementoConcepto)
/*     */   {
/* 499 */     this._complementoConcepto = complementoConcepto;
/* 500 */     this._choiceValue = complementoConcepto;
/*     */   }
/*     */ 
/*     */   public void setCuentaPredial(CuentaPredial cuentaPredial)
/*     */   {
/* 514 */     this._cuentaPredial = cuentaPredial;
/* 515 */     this._choiceValue = cuentaPredial;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setDescripcion(String descripcion)
/*     */   {
/* 529 */     this._descripcion = descripcion;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setImporte(BigDecimal importe)
/*     */   {
/* 544 */     this._importe = importe;
/*     */   }
/*     */ 
/*     */   public void setInformacionAduanera(int index, InformacionAduanera vInformacionAduanera)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 560 */     if ((index < 0) || (index >= this._informacionAduaneraList.size())) {
/* 561 */       throw new IndexOutOfBoundsException("setInformacionAduanera: Index value '" + index + "' not in range [0.." + (this._informacionAduaneraList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 564 */     this._informacionAduaneraList.set(index, vInformacionAduanera);
/*     */   }
/*     */ 
/*     */   public void setInformacionAduanera(InformacionAduanera[] vInformacionAduaneraArray)
/*     */   {
/* 575 */     this._informacionAduaneraList.clear();
/*     */ 
/* 577 */     for (int i = 0; i < vInformacionAduaneraArray.length; i++)
/* 578 */       this._informacionAduaneraList.add(vInformacionAduaneraArray[i]);
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNoIdentificacion(String noIdentificacion)
/*     */   {
/* 594 */     this._noIdentificacion = noIdentificacion;
/*     */   }
/*     */ 
/*     */   public void setParte(int index, Parte vParte)
/*     */     throws IndexOutOfBoundsException
/*     */   {
/* 610 */     if ((index < 0) || (index >= this._parteList.size())) {
/* 611 */       throw new IndexOutOfBoundsException("setParte: Index value '" + index + "' not in range [0.." + (this._parteList.size() - 1) + "]");
/*     */     }
/*     */ 
/* 614 */     this._parteList.set(index, vParte);
/*     */   }
/*     */ 
/*     */   public void setParte(Parte[] vParteArray)
/*     */   {
/* 625 */     this._parteList.clear();
/*     */ 
/* 627 */     for (int i = 0; i < vParteArray.length; i++)
/* 628 */       this._parteList.add(vParteArray[i]);
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setUnidad(String unidad)
/*     */   {
/* 643 */     this._unidad = unidad;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setValorUnitario(BigDecimal valorUnitario)
/*     */   {
/* 657 */     this._valorUnitario = valorUnitario;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Concepto
 * JD-Core Version:    0.6.0
 */