package com.dlya.facturews;

public class FactureServicioProxy implements com.dlya.facturews.FactureServicio {
  private String _endpoint = null;
  private com.dlya.facturews.FactureServicio factureServicio = null;
  
  public FactureServicioProxy() {
    _initFactureServicioProxy();
  }
  
  public FactureServicioProxy(String endpoint) {
    _endpoint = endpoint;
    _initFactureServicioProxy();
  }
  
  private void _initFactureServicioProxy() {
    try {
      factureServicio = (new com.dlya.facturews.FactureServicioServiceLocator()).getFactureServicioPort();
      if (factureServicio != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)factureServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)factureServicio)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (factureServicio != null)
      ((javax.xml.rpc.Stub)factureServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dlya.facturews.FactureServicio getFactureServicio() {
    if (factureServicio == null)
      _initFactureServicioProxy();
    return factureServicio;
  }
  
  public com.dlya.facturews.Resultado generaFactura(java.lang.String arg0) throws java.rmi.RemoteException{
    if (factureServicio == null)
      _initFactureServicioProxy();
    return factureServicio.generaFactura(arg0);
  }
  
  public com.dlya.facturews.ResultadoCancelacion cancelaFactura(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (factureServicio == null)
      _initFactureServicioProxy();
    return factureServicio.cancelaFactura(arg0, arg1, arg2, arg3, arg4);
  }
  
  
}