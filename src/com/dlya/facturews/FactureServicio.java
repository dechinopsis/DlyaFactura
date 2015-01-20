/**
 * FactureServicio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dlya.facturews;

public interface FactureServicio extends java.rmi.Remote {
    public com.dlya.facturews.Resultado generaFactura(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.dlya.facturews.ResultadoCancelacion cancelaFactura(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException;
}
