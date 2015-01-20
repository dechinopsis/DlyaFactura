package com.dlya.facturews;

import java.rmi.Remote;
import java.rmi.RemoteException;

public abstract interface FactureServicio extends Remote
{
  public abstract Resultado generaFactura(String paramString)
    throws RemoteException;

  public abstract ResultadoCancelacion cancelaFactura(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
    throws RemoteException;
}

/* Location:           C:\Users\David\Desktop\BasesR\JAR\
 * Qualified Name:     com.dlya.facturews.FactureServicio
 * JD-Core Version:    0.6.0
 */