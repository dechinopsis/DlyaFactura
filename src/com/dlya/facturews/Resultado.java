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
/*     */ public class Resultado
/*     */   implements Serializable
/*     */ {
/*     */   private int AAprobacion;
/*     */   private String cadenaOriginal;
/*     */   private String cadenaPac;
/*     */   private String certificado;
/*     */   private String codigoBarras;
/*     */   private String fechaTimbrado;
/*     */   private int NAprobacion;
/*     */   private String numCertificadoPac;
/*     */   private String sello;
/*     */   private String selloPac;
/*     */   private int status;
/*     */   private String strStatus;
/*     */   private String uuid;
/*     */   private String xml;
/* 353 */   private Object __equalsCalc = null;
/*     */ 
/* 405 */   private boolean __hashCodeCalc = false;
/*     */ 
/* 454 */   private static TypeDesc typeDesc = new TypeDesc(Resultado.class, true);
/*     */ 
/*     */   static {
/* 457 */     typeDesc.setXmlType(new QName("http://facturews/", "resultado"));
/* 458 */     ElementDesc elemField = new ElementDesc();
/* 459 */     elemField.setFieldName("AAprobacion");
/* 460 */     elemField.setXmlName(new QName("", "AAprobacion"));
/* 461 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
/* 462 */     elemField.setNillable(false);
/* 463 */     typeDesc.addFieldDesc(elemField);
/* 464 */     elemField = new ElementDesc();
/* 465 */     elemField.setFieldName("cadenaOriginal");
/* 466 */     elemField.setXmlName(new QName("", "cadenaOriginal"));
/* 467 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 468 */     elemField.setMinOccurs(0);
/* 469 */     elemField.setNillable(false);
/* 470 */     typeDesc.addFieldDesc(elemField);
/* 471 */     elemField = new ElementDesc();
/* 472 */     elemField.setFieldName("cadenaPac");
/* 473 */     elemField.setXmlName(new QName("", "cadenaPac"));
/* 474 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 475 */     elemField.setMinOccurs(0);
/* 476 */     elemField.setNillable(false);
/* 477 */     typeDesc.addFieldDesc(elemField);
/* 478 */     elemField = new ElementDesc();
/* 479 */     elemField.setFieldName("certificado");
/* 480 */     elemField.setXmlName(new QName("", "certificado"));
/* 481 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 482 */     elemField.setMinOccurs(0);
/* 483 */     elemField.setNillable(false);
/* 484 */     typeDesc.addFieldDesc(elemField);
/* 485 */     elemField = new ElementDesc();
/* 486 */     elemField.setFieldName("codigoBarras");
/* 487 */     elemField.setXmlName(new QName("", "codigoBarras"));
/* 488 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 489 */     elemField.setMinOccurs(0);
/* 490 */     elemField.setNillable(false);
/* 491 */     typeDesc.addFieldDesc(elemField);
/* 492 */     elemField = new ElementDesc();
/* 493 */     elemField.setFieldName("fechaTimbrado");
/* 494 */     elemField.setXmlName(new QName("", "fechaTimbrado"));
/* 495 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 496 */     elemField.setMinOccurs(0);
/* 497 */     elemField.setNillable(false);
/* 498 */     typeDesc.addFieldDesc(elemField);
/* 499 */     elemField = new ElementDesc();
/* 500 */     elemField.setFieldName("NAprobacion");
/* 501 */     elemField.setXmlName(new QName("", "NAprobacion"));
/* 502 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
/* 503 */     elemField.setNillable(false);
/* 504 */     typeDesc.addFieldDesc(elemField);
/* 505 */     elemField = new ElementDesc();
/* 506 */     elemField.setFieldName("numCertificadoPac");
/* 507 */     elemField.setXmlName(new QName("", "numCertificadoPac"));
/* 508 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 509 */     elemField.setMinOccurs(0);
/* 510 */     elemField.setNillable(false);
/* 511 */     typeDesc.addFieldDesc(elemField);
/* 512 */     elemField = new ElementDesc();
/* 513 */     elemField.setFieldName("sello");
/* 514 */     elemField.setXmlName(new QName("", "sello"));
/* 515 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 516 */     elemField.setMinOccurs(0);
/* 517 */     elemField.setNillable(false);
/* 518 */     typeDesc.addFieldDesc(elemField);
/* 519 */     elemField = new ElementDesc();
/* 520 */     elemField.setFieldName("selloPac");
/* 521 */     elemField.setXmlName(new QName("", "selloPac"));
/* 522 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 523 */     elemField.setMinOccurs(0);
/* 524 */     elemField.setNillable(false);
/* 525 */     typeDesc.addFieldDesc(elemField);
/* 526 */     elemField = new ElementDesc();
/* 527 */     elemField.setFieldName("status");
/* 528 */     elemField.setXmlName(new QName("", "status"));
/* 529 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
/* 530 */     elemField.setNillable(false);
/* 531 */     typeDesc.addFieldDesc(elemField);
/* 532 */     elemField = new ElementDesc();
/* 533 */     elemField.setFieldName("strStatus");
/* 534 */     elemField.setXmlName(new QName("", "strStatus"));
/* 535 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 536 */     elemField.setMinOccurs(0);
/* 537 */     elemField.setNillable(false);
/* 538 */     typeDesc.addFieldDesc(elemField);
/* 539 */     elemField = new ElementDesc();
/* 540 */     elemField.setFieldName("uuid");
/* 541 */     elemField.setXmlName(new QName("", "uuid"));
/* 542 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 543 */     elemField.setMinOccurs(0);
/* 544 */     elemField.setNillable(false);
/* 545 */     typeDesc.addFieldDesc(elemField);
/* 546 */     elemField = new ElementDesc();
/* 547 */     elemField.setFieldName("xml");
/* 548 */     elemField.setXmlName(new QName("", "xml"));
/* 549 */     elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
/* 550 */     elemField.setMinOccurs(0);
/* 551 */     elemField.setNillable(false);
/* 552 */     typeDesc.addFieldDesc(elemField);
/*     */   }
/*     */ 
/*     */   public Resultado()
/*     */   {
/*     */   }
/*     */ 
/*     */   public Resultado(int AAprobacion, String cadenaOriginal, String cadenaPac, String certificado, String codigoBarras, String fechaTimbrado, int NAprobacion, String numCertificadoPac, String sello, String selloPac, int status, String strStatus, String uuid, String xml)
/*     */   {
/*  57 */     this.AAprobacion = AAprobacion;
/*  58 */     this.cadenaOriginal = cadenaOriginal;
/*  59 */     this.cadenaPac = cadenaPac;
/*  60 */     this.certificado = certificado;
/*  61 */     this.codigoBarras = codigoBarras;
/*  62 */     this.fechaTimbrado = fechaTimbrado;
/*  63 */     this.NAprobacion = NAprobacion;
/*  64 */     this.numCertificadoPac = numCertificadoPac;
/*  65 */     this.sello = sello;
/*  66 */     this.selloPac = selloPac;
/*  67 */     this.status = status;
/*  68 */     this.strStatus = strStatus;
/*  69 */     this.uuid = uuid;
/*  70 */     this.xml = xml;
/*     */   }
/*     */ 
/*     */   public int getAAprobacion()
/*     */   {
/*  80 */     return this.AAprobacion;
/*     */   }
/*     */ 
/*     */   public void setAAprobacion(int AAprobacion)
/*     */   {
/*  90 */     this.AAprobacion = AAprobacion;
/*     */   }
/*     */ 
/*     */   public String getCadenaOriginal()
/*     */   {
/* 100 */     return this.cadenaOriginal;
/*     */   }
/*     */ 
/*     */   public void setCadenaOriginal(String cadenaOriginal)
/*     */   {
/* 110 */     this.cadenaOriginal = cadenaOriginal;
/*     */   }
/*     */ 
/*     */   public String getCadenaPac()
/*     */   {
/* 120 */     return this.cadenaPac;
/*     */   }
/*     */ 
/*     */   public void setCadenaPac(String cadenaPac)
/*     */   {
/* 130 */     this.cadenaPac = cadenaPac;
/*     */   }
/*     */ 
/*     */   public String getCertificado()
/*     */   {
/* 140 */     return this.certificado;
/*     */   }
/*     */ 
/*     */   public void setCertificado(String certificado)
/*     */   {
/* 150 */     this.certificado = certificado;
/*     */   }
/*     */ 
/*     */   public String getCodigoBarras()
/*     */   {
/* 160 */     return this.codigoBarras;
/*     */   }
/*     */ 
/*     */   public void setCodigoBarras(String codigoBarras)
/*     */   {
/* 170 */     this.codigoBarras = codigoBarras;
/*     */   }
/*     */ 
/*     */   public String getFechaTimbrado()
/*     */   {
/* 180 */     return this.fechaTimbrado;
/*     */   }
/*     */ 
/*     */   public void setFechaTimbrado(String fechaTimbrado)
/*     */   {
/* 190 */     this.fechaTimbrado = fechaTimbrado;
/*     */   }
/*     */ 
/*     */   public int getNAprobacion()
/*     */   {
/* 200 */     return this.NAprobacion;
/*     */   }
/*     */ 
/*     */   public void setNAprobacion(int NAprobacion)
/*     */   {
/* 210 */     this.NAprobacion = NAprobacion;
/*     */   }
/*     */ 
/*     */   public String getNumCertificadoPac()
/*     */   {
/* 220 */     return this.numCertificadoPac;
/*     */   }
/*     */ 
/*     */   public void setNumCertificadoPac(String numCertificadoPac)
/*     */   {
/* 230 */     this.numCertificadoPac = numCertificadoPac;
/*     */   }
/*     */ 
/*     */   public String getSello()
/*     */   {
/* 240 */     return this.sello;
/*     */   }
/*     */ 
/*     */   public void setSello(String sello)
/*     */   {
/* 250 */     this.sello = sello;
/*     */   }
/*     */ 
/*     */   public String getSelloPac()
/*     */   {
/* 260 */     return this.selloPac;
/*     */   }
/*     */ 
/*     */   public void setSelloPac(String selloPac)
/*     */   {
/* 270 */     this.selloPac = selloPac;
/*     */   }
/*     */ 
/*     */   public int getStatus()
/*     */   {
/* 280 */     return this.status;
/*     */   }
/*     */ 
/*     */   public void setStatus(int status)
/*     */   {
/* 290 */     this.status = status;
/*     */   }
/*     */ 
/*     */   public String getStrStatus()
/*     */   {
/* 300 */     return this.strStatus;
/*     */   }
/*     */ 
/*     */   public void setStrStatus(String strStatus)
/*     */   {
/* 310 */     this.strStatus = strStatus;
/*     */   }
/*     */ 
/*     */   public String getUuid()
/*     */   {
/* 320 */     return this.uuid;
/*     */   }
/*     */ 
/*     */   public void setUuid(String uuid)
/*     */   {
/* 330 */     this.uuid = uuid;
/*     */   }
/*     */ 
/*     */   public String getXml()
/*     */   {
/* 340 */     return this.xml;
/*     */   }
/*     */ 
/*     */   public void setXml(String xml)
/*     */   {
/* 350 */     this.xml = xml;
/*     */   }
/*     */ 
/*     */   public synchronized boolean equals(Object obj)
/*     */   {
/* 355 */     if (!(obj instanceof Resultado)) return false;
/* 356 */     Resultado other = (Resultado)obj;
/* 357 */     if (obj == null) return false;
/* 358 */     if (this == obj) return true;
/* 359 */     if (this.__equalsCalc != null) {
/* 360 */       return this.__equalsCalc == obj;
/*     */     }
/* 362 */     this.__equalsCalc = obj;
/*     */ 
/* 364 */     boolean _equals = 
/* 365 */       (this.AAprobacion == other.getAAprobacion()) && (
/* 366 */       ((this.cadenaOriginal == null) && (other.getCadenaOriginal() == null)) || (
/* 367 */       (this.cadenaOriginal != null) && 
/* 368 */       (this.cadenaOriginal.equals(other.getCadenaOriginal())) && (
/* 369 */       ((this.cadenaPac == null) && (other.getCadenaPac() == null)) || (
/* 370 */       (this.cadenaPac != null) && 
/* 371 */       (this.cadenaPac.equals(other.getCadenaPac())) && (
/* 372 */       ((this.certificado == null) && (other.getCertificado() == null)) || (
/* 373 */       (this.certificado != null) && 
/* 374 */       (this.certificado.equals(other.getCertificado())) && (
/* 375 */       ((this.codigoBarras == null) && (other.getCodigoBarras() == null)) || (
/* 376 */       (this.codigoBarras != null) && 
/* 377 */       (this.codigoBarras.equals(other.getCodigoBarras())) && (
/* 378 */       ((this.fechaTimbrado == null) && (other.getFechaTimbrado() == null)) || (
/* 379 */       (this.fechaTimbrado != null) && 
/* 380 */       (this.fechaTimbrado.equals(other.getFechaTimbrado())) && 
/* 381 */       (this.NAprobacion == other.getNAprobacion()) && (
/* 382 */       ((this.numCertificadoPac == null) && (other.getNumCertificadoPac() == null)) || (
/* 383 */       (this.numCertificadoPac != null) && 
/* 384 */       (this.numCertificadoPac.equals(other.getNumCertificadoPac())) && (
/* 385 */       ((this.sello == null) && (other.getSello() == null)) || (
/* 386 */       (this.sello != null) && 
/* 387 */       (this.sello.equals(other.getSello())) && (
/* 388 */       ((this.selloPac == null) && (other.getSelloPac() == null)) || (
/* 389 */       (this.selloPac != null) && 
/* 390 */       (this.selloPac.equals(other.getSelloPac())) && 
/* 391 */       (this.status == other.getStatus()) && (
/* 392 */       ((this.strStatus == null) && (other.getStrStatus() == null)) || (
/* 393 */       (this.strStatus != null) && 
/* 394 */       (this.strStatus.equals(other.getStrStatus())) && (
/* 395 */       ((this.uuid == null) && (other.getUuid() == null)) || (
/* 396 */       (this.uuid != null) && 
/* 397 */       (this.uuid.equals(other.getUuid())) && (
/* 398 */       ((this.xml == null) && (other.getXml() == null)) || (
/* 399 */       (this.xml != null) && 
/* 400 */       (this.xml.equals(other.getXml()))))))))))))))))))))))));
/* 401 */     this.__equalsCalc = null;
/* 402 */     return _equals;
/*     */   }
/*     */ 
/*     */   public synchronized int hashCode()
/*     */   {
/* 407 */     if (this.__hashCodeCalc) {
/* 408 */       return 0;
/*     */     }
/* 410 */     this.__hashCodeCalc = true;
/* 411 */     int _hashCode = 1;
/* 412 */     _hashCode += getAAprobacion();
/* 413 */     if (getCadenaOriginal() != null) {
/* 414 */       _hashCode += getCadenaOriginal().hashCode();
/*     */     }
/* 416 */     if (getCadenaPac() != null) {
/* 417 */       _hashCode += getCadenaPac().hashCode();
/*     */     }
/* 419 */     if (getCertificado() != null) {
/* 420 */       _hashCode += getCertificado().hashCode();
/*     */     }
/* 422 */     if (getCodigoBarras() != null) {
/* 423 */       _hashCode += getCodigoBarras().hashCode();
/*     */     }
/* 425 */     if (getFechaTimbrado() != null) {
/* 426 */       _hashCode += getFechaTimbrado().hashCode();
/*     */     }
/* 428 */     _hashCode += getNAprobacion();
/* 429 */     if (getNumCertificadoPac() != null) {
/* 430 */       _hashCode += getNumCertificadoPac().hashCode();
/*     */     }
/* 432 */     if (getSello() != null) {
/* 433 */       _hashCode += getSello().hashCode();
/*     */     }
/* 435 */     if (getSelloPac() != null) {
/* 436 */       _hashCode += getSelloPac().hashCode();
/*     */     }
/* 438 */     _hashCode += getStatus();
/* 439 */     if (getStrStatus() != null) {
/* 440 */       _hashCode += getStrStatus().hashCode();
/*     */     }
/* 442 */     if (getUuid() != null) {
/* 443 */       _hashCode += getUuid().hashCode();
/*     */     }
/* 445 */     if (getXml() != null) {
/* 446 */       _hashCode += getXml().hashCode();
/*     */     }
/* 448 */     this.__hashCodeCalc = false;
/* 449 */     return _hashCode;
/*     */   }
/*     */ 
/*     */   public static TypeDesc getTypeDesc()
/*     */   {
/* 559 */     return typeDesc;
/*     */   }
/*     */ 
/*     */   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType)
/*     */   {
/* 569 */     return 
/* 570 */       new BeanSerializer(
/* 571 */       _javaType, _xmlType, typeDesc);
/*     */   }
/*     */ 
/*     */   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType)
/*     */   {
/* 581 */     return 
/* 582 */       new BeanDeserializer(
/* 583 */       _javaType, _xmlType, typeDesc);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.Resultado
 * JD-Core Version:    0.6.0
 */