/**
 * UniversityDBServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.web;

public class UniversityDBServiceLocator extends org.apache.axis.client.Service implements edu.web.UniversityDBService {

    public UniversityDBServiceLocator() {
    }


    public UniversityDBServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UniversityDBServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UniversityDB
    private java.lang.String UniversityDB_address = "http://localhost:8080/UniversityManagement2/services/UniversityDB";

    public java.lang.String getUniversityDBAddress() {
        return UniversityDB_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UniversityDBWSDDServiceName = "UniversityDB";

    public java.lang.String getUniversityDBWSDDServiceName() {
        return UniversityDBWSDDServiceName;
    }

    public void setUniversityDBWSDDServiceName(java.lang.String name) {
        UniversityDBWSDDServiceName = name;
    }

    public edu.web.UniversityDB getUniversityDB() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UniversityDB_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUniversityDB(endpoint);
    }

    public edu.web.UniversityDB getUniversityDB(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.web.UniversityDBSoapBindingStub _stub = new edu.web.UniversityDBSoapBindingStub(portAddress, this);
            _stub.setPortName(getUniversityDBWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUniversityDBEndpointAddress(java.lang.String address) {
        UniversityDB_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.web.UniversityDB.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.web.UniversityDBSoapBindingStub _stub = new edu.web.UniversityDBSoapBindingStub(new java.net.URL(UniversityDB_address), this);
                _stub.setPortName(getUniversityDBWSDDServiceName());
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
        if ("UniversityDB".equals(inputPortName)) {
            return getUniversityDB();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.edu", "UniversityDBService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://web.edu", "UniversityDB"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UniversityDB".equals(portName)) {
            setUniversityDBEndpointAddress(address);
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
