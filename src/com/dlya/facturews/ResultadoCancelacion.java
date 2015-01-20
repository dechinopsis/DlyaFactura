/*     */ package com.dlya.facturews;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.apache.axis.description.ElementDesc;
/*     */ import org.apache.axis.description.TypeDesc;
/*     */ import org.apache.axis.encoding.Deserializer;
/*     */ import org.apache.axis.encoding.Serializer;
/*     */ import org.apache.axis.encoding.ser.BeanDeserializer;
/*     */ import org.apache.axis.encoding.ser.BeanSerializer;
/*     */ 
/*     */ public class ResultadoCancelacion
/*     */   implements Serializable
/*     */ {
/*     */   private boolean cancelado;
/*     */   private int respuesta;
/*     */   private String resultado;
/*  89 */   private Object __equalsCalc = null;
/*     */ 
/* 110 */   private boolean __hashCodeCalc = false;
/*     */ 
/* 128 */   private static TypeDesc typeDesc = new TypeDesc(ResultadoCancelacion.class, true);
/*     */ 
/*     */   static {
/* 131 */     typeDesc.setXmlType(new QName("http://facturews/", "resultadoCancelacion"));
/* 132 */     ElementDesc elemField = new ElementDesc();
/* 133 */     elemField.setFieldName("cancelado");
/* 134 */     elemField.setXmlName(new QName("", "cancelado"));
/* 135 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
/* 136 */     elemField.setNillable(false);
/* 137 */     typeDesc.addFieldDesc(elemField);
/* 138 */     elemField = new ElementDesc();
/* 139 */     elemField.setFieldName("respuesta");
/* 140 */     elemField.setXmlName(new QName("", "respuesta"));
/* 141 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
/* 142 */     elemField.setNillable(false);
/* 143 */     typeDesc.addFieldDesc(elemField);
/* 144 */     elemField = new ElementDesc();
/* 145 */     elemField.setFieldName("resultado");
/* 146 */     elemField.setXmlName(new QName("", "resultado"));
/* 147 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 148 */     elemField.setMinOccurs(0);
/* 149 */     elemField.setNillable(false);
/* 150 */     typeDesc.addFieldDesc(elemField);
/*     */   }
/*     */ 
/*     */   public ResultadoCancelacion()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ResultadoCancelacion(boolean cancelado, int respuesta, String resultado)
/*     */   {
/*  24 */     this.cancelado = cancelado;
/*  25 */     this.respuesta = respuesta;
/*  26 */     this.resultado = resultado;
/*     */   }
/*     */ 
/*     */   public boolean isCancelado()
/*     */   {
/*  36 */     return this.cancelado;
/*     */   }
/*     */ 
/*     */   public void setCancelado(boolean cancelado)
/*     */   {
/*  46 */     this.cancelado = cancelado;
/*     */   }
/*     */ 
/*     */   public int getRespuesta()
/*     */   {
/*  56 */     return this.respuesta;
/*     */   }
/*     */ 
/*     */   public void setRespuesta(int respuesta)
/*     */   {
/*  66 */     this.respuesta = respuesta;
/*     */   }
/*     */ 
/*     */   public String getResultado()
/*     */   {
/*  76 */     return this.resultado;
/*     */   }
/*     */ 
/*     */   public void setResultado(String resultado)
/*     */   {
/*  86 */     this.resultado = resultado;
/*     */   }
/*     */ 
/*     */   public synchronized boolean equals(Object obj)
/*     */   {
/*  91 */     if (!(obj instanceof ResultadoCancelacion)) return false;
/*  92 */     ResultadoCancelacion other = (ResultadoCancelacion)obj;
/*  93 */     if (obj == null) return false;
/*  94 */     if (this == obj) return true;
/*  95 */     if (this.__equalsCalc != null) {
/*  96 */       return this.__equalsCalc == obj;
/*     */     }
/*  98 */     this.__equalsCalc = obj;
/*     */ 
/* 100 */     boolean _equals = 
/* 101 */       (this.cancelado == other.isCancelado()) && 
/* 102 */       (this.respuesta == other.getRespuesta()) && (
/* 103 */       ((this.resultado == null) && (other.getResultado() == null)) || (
/* 104 */       (this.resultado != null) && 
/* 105 */       (this.resultado.equals(other.getResultado()))));
/* 106 */     this.__equalsCalc = null;
/* 107 */     return _equals;
/*     */   }
/*     */ 
/*     */   public synchronized int hashCode()
/*     */   {
/* 112 */     if (this.__hashCodeCalc) {
/* 113 */       return 0;
/*     */     }
/* 115 */     this.__hashCodeCalc = true;
/* 116 */     int _hashCode = 1;
/* 117 */     _hashCode += (isCancelado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
/* 118 */     _hashCode += getRespuesta();
/* 119 */     if (getResultado() != null) {
/* 120 */       _hashCode += getResultado().hashCode();
/*     */     }
/* 122 */     this.__hashCodeCalc = false;
/* 123 */     return _hashCode;
/*     */   }
/*     */ 
/*     */   public static TypeDesc getTypeDesc()
/*     */   {
/* 157 */     return typeDesc;
/*     */   }
/*     */ 
/*     */   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType)
/*     */   {
/* 167 */     return 
/* 168 */       new BeanSerializer(
/* 169 */       _javaType, _xmlType, typeDesc);
/*     */   }
/*     */ 
/*     */   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType)
/*     */   {
/* 179 */     return 
/* 180 */       new BeanDeserializer(
/* 181 */       _javaType, _xmlType, typeDesc);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.ResultadoCancelacion
 * JD-Core Version:    0.6.0
 */