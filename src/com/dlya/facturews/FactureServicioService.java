package com.dlya.facturews;

import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public abstract interface FactureServicioService extends Service
{
  public abstract String getFactureServicioPortAddress();

  public abstract FactureServicio getFactureServicioPort()
    throws ServiceException;

  public abstract FactureServicio getFactureServicioPort(URL paramURL)
    throws ServiceException;
}

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.FactureServicioService
 * JD-Core Version:    0.6.0
 */