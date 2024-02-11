/**
 * InformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package information;

public class InformationServiceLocator extends org.apache.axis.client.Service implements information.InformationService {

    public InformationServiceLocator() {
    }


    public InformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Information
    private java.lang.String Information_address = "http://localhost:8080/Baby-Ecommerce/services/Information";

    public java.lang.String getInformationAddress() {
        return Information_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InformationWSDDServiceName = "Information";

    public java.lang.String getInformationWSDDServiceName() {
        return InformationWSDDServiceName;
    }

    public void setInformationWSDDServiceName(java.lang.String name) {
        InformationWSDDServiceName = name;
    }

    public information.Information getInformation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Information_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInformation(endpoint);
    }

    public information.Information getInformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            information.InformationSoapBindingStub _stub = new information.InformationSoapBindingStub(portAddress, this);
            _stub.setPortName(getInformationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInformationEndpointAddress(java.lang.String address) {
        Information_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (information.Information.class.isAssignableFrom(serviceEndpointInterface)) {
                information.InformationSoapBindingStub _stub = new information.InformationSoapBindingStub(new java.net.URL(Information_address), this);
                _stub.setPortName(getInformationWSDDServiceName());
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
        if ("Information".equals(inputPortName)) {
            return getInformation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "InformationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Information"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Information".equals(portName)) {
            setInformationEndpointAddress(address);
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
