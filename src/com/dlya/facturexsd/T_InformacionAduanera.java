/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import org.exolab.castor.types.Date;
/*     */ 
/*     */ public class T_InformacionAduanera
/*     */   implements Serializable
/*     */ {
/*     */   private String _numero;
/*     */   private Date _fecha;
/*     */   private String _aduana;
/*     */ 
/*     */   public String getAduana()
/*     */   {
/*  64 */     return this._aduana;
/*     */   }
/*     */ 
/*     */   public Date getFecha()
/*     */   {
/*  77 */     return this._fecha;
/*     */   }
/*     */ 
/*     */   public String getNumero()
/*     */   {
/*  90 */     return this._numero;
/*     */   }
/*     */ 
/*     */   public void setAduana(String aduana)
/*     */   {
/* 102 */     this._aduana = aduana;
/*     */   }
/*     */ 
/*     */   public void setFecha(Date fecha)
/*     */   {
/* 115 */     this._fecha = fecha;
/*     */   }
/*     */ 
/*     */   public void setNumero(String numero)
/*     */   {
/* 128 */     this._numero = numero;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.T_InformacionAduanera
 * JD-Core Version:    0.6.0
 */