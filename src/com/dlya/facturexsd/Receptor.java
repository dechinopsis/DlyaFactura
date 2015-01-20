/*     */ package com.dlya.facturexsd;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ 
/*     */ public class Receptor
/*     */   implements Serializable
/*     */ {
/*     */   private String _rfc;
/*     */   private String _nombre;
/*     */   private Domicilio _domicilio;
/*     */ 
/*     */   public Domicilio getDomicilio()
/*     */   {
/*  69 */     return this._domicilio;
/*     */   }
/*     */ 
/*     */   public String getNombre()
/*     */   {
/*  81 */     return this._nombre;
/*     */   }
/*     */ 
/*     */   public String getRfc()
/*     */   {
/*  94 */     return this._rfc;
/*     */   }
/*     */ 
/*     */   @XmlElement(name="Domicilio")
/*     */   public void setDomicilio(Domicilio domicilio)
/*     */   {
/* 108 */     this._domicilio = domicilio;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setNombre(String nombre)
/*     */   {
/* 121 */     this._nombre = nombre;
/*     */   }
/*     */ 
/*     */   @XmlAttribute
/*     */   public void setRfc(String rfc)
/*     */   {
/* 135 */     this._rfc = rfc;
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturexsd.Receptor
 * JD-Core Version:    0.6.0
 */