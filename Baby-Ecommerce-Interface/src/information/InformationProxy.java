package information;

public class InformationProxy implements information.Information {
  private String _endpoint = null;
  private information.Information information = null;
  
  public InformationProxy() {
    _initInformationProxy();
  }
  
  public InformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initInformationProxy();
  }
  
  private void _initInformationProxy() {
    try {
      information = (new information.InformationServiceLocator()).getInformation();
      if (information != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)information)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (information != null)
      ((javax.xml.rpc.Stub)information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public information.Information getInformation() {
    if (information == null)
      _initInformationProxy();
    return information;
  }
  
  public java.lang.String getProductInformation(int receiptID) throws java.rmi.RemoteException{
    if (information == null)
      _initInformationProxy();
    return information.getProductInformation(receiptID);
  }
  
  
}