/*    */ package com.dlya.facturews;
/*    */ 
/*    */ import java.rmi.RemoteException;
/*    */ import javax.xml.rpc.ServiceException;
/*    */ import javax.xml.rpc.Stub;
/*    */ 
/*    */ public class FactureServicioProxy
/*    */   implements FactureServicio
/*    */ {
/*  4 */   private String _endpoint = null;
/*  5 */   private FactureServicio factureServicio = null;
/*    */ 
/*    */   public FactureServicioProxy() {
/*  8 */     _initFactureServicioProxy();
/*    */   }
/*    */ 
/*    */   public FactureServicioProxy(String endpoint) {
/* 12 */     this._endpoint = endpoint;
/* 13 */     _initFactureServicioProxy();
/*    */   }
/*    */ 
/*    */   private void _initFactureServicioProxy() {
/*    */     try {
/* 18 */       this.factureServicio = new FactureServicioServiceLocator().getFactureServicioPort();
/* 19 */       if (this.factureServicio != null)
/* 20 */         if (this._endpoint != null)
/* 21 */           ((Stub)this.factureServicio)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
/*    */         else
/* 23 */           this._endpoint = ((String)((Stub)this.factureServicio)._getProperty("javax.xml.rpc.service.endpoint.address"));
/*    */     }
/*    */     catch (ServiceException localServiceException)
/*    */     {
/*    */     }
/*    */   }
/*    */ 
/*    */   public String getEndpoint() {
/* 31 */     return this._endpoint;
/*    */   }
/*    */ 
/*    */   public void setEndpoint(String endpoint) {
/* 35 */     this._endpoint = endpoint;
/* 36 */     if (this.factureServicio != null)
/* 37 */       ((Stub)this.factureServicio)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
/*    */   }
/*    */ 
/*    */   public FactureServicio getFactureServicio()
/*    */   {
/* 42 */     if (this.factureServicio == null)
/* 43 */       _initFactureServicioProxy();
/* 44 */     return this.factureServicio;
/*    */   }
/*    */ 
/*    */   public Resultado generaFactura(String arg0) throws RemoteException {
/* 48 */     if (this.factureServicio == null)
/* 49 */       _initFactureServicioProxy();
/* 50 */     return this.factureServicio.generaFactura(arg0);
/*    */   }
/*    */ 
/*    */   public ResultadoCancelacion cancelaFactura(String arg0, String arg1, int arg2, String arg3, String arg4) throws RemoteException {
/* 54 */     if (this.factureServicio == null)
/* 55 */       _initFactureServicioProxy();
/* 56 */     return this.factureServicio.cancelaFactura(arg0, arg1, arg2, arg3, arg4);
/*    */   }
/*    */ }

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.FactureServicioProxy
 * JD-Core Version:    0.6.0
 */