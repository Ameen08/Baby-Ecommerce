/**
 * SellerInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sellerinfo;

public class SellerInfoServiceLocator extends org.apache.axis.client.Service implements sellerinfo.SellerInfoService {

    public SellerInfoServiceLocator() {
    }


    public SellerInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SellerInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SellerInfo
    private java.lang.String SellerInfo_address = "http://localhost:8080/Baby-Ecommerce/services/SellerInfo";

    public java.lang.String getSellerInfoAddress() {
        return SellerInfo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SellerInfoWSDDServiceName = "SellerInfo";

    public java.lang.String getSellerInfoWSDDServiceName() {
        return SellerInfoWSDDServiceName;
    }

    public void setSellerInfoWSDDServiceName(java.lang.String name) {
        SellerInfoWSDDServiceName = name;
    }

    public sellerinfo.SellerInfo getSellerInfo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SellerInfo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSellerInfo(endpoint);
    }

    public sellerinfo.SellerInfo getSellerInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            sellerinfo.SellerInfoSoapBindingStub _stub = new sellerinfo.SellerInfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getSellerInfoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSellerInfoEndpointAddress(java.lang.String address) {
        SellerInfo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (sellerinfo.SellerInfo.class.isAssignableFrom(serviceEndpointInterface)) {
                sellerinfo.SellerInfoSoapBindingStub _stub = new sellerinfo.SellerInfoSoapBindingStub(new java.net.URL(SellerInfo_address), this);
                _stub.setPortName(getSellerInfoWSDDServiceName());
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
        if ("SellerInfo".equals(inputPortName)) {
            return getSellerInfo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SellerInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "SellerInfo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SellerInfo".equals(portName)) {
            setSellerInfoEndpointAddress(address);
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
