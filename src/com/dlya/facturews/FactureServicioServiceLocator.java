/*     */ package com.dlya.facturews;
/*     */ 
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.rmi.Remote;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import javax.xml.namespace.QName;
/*     */ import javax.xml.rpc.ServiceException;
/*     */ import org.apache.axis.AxisFault;
/*     */ import org.apache.axis.EngineConfiguration;
/*     */ import org.apache.axis.client.Service;
/*     */ import org.apache.axis.client.Stub;
/*     */ 
/*     */ public class FactureServicioServiceLocator extends Service
/*     */   implements FactureServicioService
/*     */ {
/*  25 */   private String FactureServicioPort_address = "http://www.jonima.com.mx:3014/FactureWS/FactureServicio";
/*     */ 
/*  32 */   private String FactureServicioPortWSDDServiceName = "FactureServicioPort";
/*     */ 
/* 111 */   private HashSet ports = null;
/*     */ 
/*     */   public FactureServicioServiceLocator()
/*     */   {
/*     */   }
/*     */ 
/*     */   public FactureServicioServiceLocator(EngineConfiguration config)
/*     */   {
/*  17 */     super(config);
/*     */   }
/*     */ 
/*     */   public FactureServicioServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
/*  21 */     super(wsdlLoc, sName);
/*     */   }
/*     */ 
/*     */   public String getFactureServicioPortAddress()
/*     */   {
/*  28 */     return this.FactureServicioPort_address;
/*     */   }
/*     */ 
/*     */   public String getFactureServicioPortWSDDServiceName()
/*     */   {
/*  35 */     return this.FactureServicioPortWSDDServiceName;
/*     */   }
/*     */ 
/*     */   public void setFactureServicioPortWSDDServiceName(String name) {
/*  39 */     this.FactureServicioPortWSDDServiceName = name;
/*     */   }
/*     */ 
/*     */   public FactureServicio getFactureServicioPort() throws ServiceException
/*     */   {
/*     */     try {
/*  45 */       endpoint = new URL(this.FactureServicioPort_address);
/*     */     }
/*     */     catch (MalformedURLException e)
/*     */     {
/*     */       URL endpoint;
/*  48 */       throw new ServiceException(e);
/*     */     }
/*     */     URL endpoint;
/*  50 */     return getFactureServicioPort(endpoint);
/*     */   }
/*     */ 
/*     */   public FactureServicio getFactureServicioPort(URL portAddress) throws ServiceException {
/*     */     try {
/*  55 */       FactureServicioPortBindingStub _stub = new FactureServicioPortBindingStub(portAddress, this);
/*  56 */       _stub.setPortName(getFactureServicioPortWSDDServiceName());
/*  57 */       return _stub;
/*     */     } catch (AxisFault e) {
/*     */     }
/*  60 */     return null;
/*     */   }
/*     */ 
/*     */   public void setFactureServicioPortEndpointAddress(String address)
/*     */   {
/*  65 */     this.FactureServicioPort_address = address;
/*     */   }
/*     */ 
/*     */   public Remote getPort(Class serviceEndpointInterface)
/*     */     throws ServiceException
/*     */   {
/*     */     try
/*     */     {
/*  75 */       if (FactureServicio.class.isAssignableFrom(serviceEndpointInterface)) {
/*  76 */         FactureServicioPortBindingStub _stub = new FactureServicioPortBindingStub(new URL(this.FactureServicioPort_address), this);
/*  77 */         _stub.setPortName(getFactureServicioPortWSDDServiceName());
/*  78 */         return _stub;
/*     */       }
/*     */     }
/*     */     catch (Throwable t) {
/*  82 */       throw new ServiceException(t);
/*     */     }
/*  84 */     throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
/*     */   }
/*     */ 
/*     */   public Remote getPort(QName portName, Class serviceEndpointInterface)
/*     */     throws ServiceException
/*     */   {
/*  93 */     if (portName == null) {
/*  94 */       return getPort(serviceEndpointInterface);
/*     */     }
/*  96 */     String inputPortName = portName.getLocalPart();
/*  97 */     if ("FactureServicioPort".equals(inputPortName)) {
/*  98 */       return getFactureServicioPort();
/*     */     }
/*     */ 
/* 101 */     Remote _stub = getPort(serviceEndpointInterface);
/* 102 */     ((Stub)_stub).setPortName(portName);
/* 103 */     return _stub;
/*     */   }
/*     */ 
/*     */   public QName getServiceName()
/*     */   {
/* 108 */     return new QName("http://facturews/", "FactureServicioService");
/*     */   }
/*     */ 
/*     */   public Iterator getPorts()
/*     */   {
/* 114 */     if (this.ports == null) {
/* 115 */       this.ports = new HashSet();
/* 116 */       this.ports.add(new QName("http://facturews/", "FactureServicioPort"));
/*     */     }
/* 118 */     return this.ports.iterator();
/*     */   }
/*     */ 
/*     */   public void setEndpointAddress(String portName, String address)
/*     */     throws ServiceException
/*     */   {
/* 126 */     if ("FactureServicioPort".equals(portName)) {
/* 127 */       setFactureServicioPortEndpointAddress(address);
/*     */     }
/*     */     else
/*     */     {
/* 131 */       throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setEndpointAddress(QName portName, String address)
/*     */     throws ServiceException
/*     */   {
/* 139 */     setEndpointAddress(portName.getLocalPart(), address);
/*     */   }
/*     */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.FactureServicioServiceLocator
 * JD-Core Version:    0.6.0
 */