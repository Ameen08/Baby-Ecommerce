/**
 * InformationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package information;

public interface InformationService extends javax.xml.rpc.Service {
    public java.lang.String getInformationAddress();

    public information.Information getInformation() throws javax.xml.rpc.ServiceException;

    public information.Information getInformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
