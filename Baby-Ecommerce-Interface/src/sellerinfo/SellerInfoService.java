/**
 * SellerInfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package sellerinfo;

public interface SellerInfoService extends javax.xml.rpc.Service {
    public java.lang.String getSellerInfoAddress();

    public sellerinfo.SellerInfo getSellerInfo() throws javax.xml.rpc.ServiceException;

    public sellerinfo.SellerInfo getSellerInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
