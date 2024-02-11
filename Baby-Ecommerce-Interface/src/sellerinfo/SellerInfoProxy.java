package sellerinfo;

public class SellerInfoProxy implements sellerinfo.SellerInfo {
  private String _endpoint = null;
  private sellerinfo.SellerInfo sellerInfo = null;
  
  public SellerInfoProxy() {
    _initSellerInfoProxy();
  }
  
  public SellerInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initSellerInfoProxy();
  }
  
  private void _initSellerInfoProxy() {
    try {
      sellerInfo = (new sellerinfo.SellerInfoServiceLocator()).getSellerInfo();
      if (sellerInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sellerInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sellerInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sellerInfo != null)
      ((javax.xml.rpc.Stub)sellerInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public sellerinfo.SellerInfo getSellerInfo() {
    if (sellerInfo == null)
      _initSellerInfoProxy();
    return sellerInfo;
  }
  
  public java.lang.String getSellerInformation(int productID) throws java.rmi.RemoteException{
    if (sellerInfo == null)
      _initSellerInfoProxy();
    return sellerInfo.getSellerInformation(productID);
  }
  
  
}