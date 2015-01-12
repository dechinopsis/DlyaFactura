/**
 * FactureServicioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dlya.facturews;

public class FactureServicioServiceLocator extends org.apache.axis.client.Service implements com.dlya.facturews.FactureServicioService {

    public FactureServicioServiceLocator() {
    }


    public FactureServicioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FactureServicioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FactureServicioPort
    private java.lang.String FactureServicioPort_address = "http://www.jonima.com.mx:3014/FactureWS/FactureServicio";

    public java.lang.String getFactureServicioPortAddress() {
        return FactureServicioPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FactureServicioPortWSDDServiceName = "FactureServicioPort";

    public java.lang.String getFactureServicioPortWSDDServiceName() {
        return FactureServicioPortWSDDServiceName;
    }

    public void setFactureServicioPortWSDDServiceName(java.lang.String name) {
        FactureServicioPortWSDDServiceName = name;
    }

    public com.dlya.facturews.FactureServicio getFactureServicioPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FactureServicioPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFactureServicioPort(endpoint);
    }

    public com.dlya.facturews.FactureServicio getFactureServicioPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.dlya.facturews.FactureServicioPortBindingStub _stub = new com.dlya.facturews.FactureServicioPortBindingStub(portAddress, this);
            _stub.setPortName(getFactureServicioPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFactureServicioPortEndpointAddress(java.lang.String address) {
        FactureServicioPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.dlya.facturews.FactureServicio.class.isAssignableFrom(serviceEndpointInterface)) {
                com.dlya.facturews.FactureServicioPortBindingStub _stub = new com.dlya.facturews.FactureServicioPortBindingStub(new java.net.URL(FactureServicioPort_address), this);
                _stub.setPortName(getFactureServicioPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FactureServicioPort".equals(inputPortName)) {
            return getFactureServicioPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://facturews/", "FactureServicioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://facturews/", "FactureServicioPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FactureServicioPort".equals(portName)) {
            setFactureServicioPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
