package ACME;

public class TransactionsProxy implements ACME.Transactions_PortType {
  private String _endpoint = null;
  private ACME.Transactions_PortType transactions_PortType = null;
  
  public TransactionsProxy() {
    _initTransactionsProxy();
  }
  
  public TransactionsProxy(String endpoint) {
    _endpoint = endpoint;
    _initTransactionsProxy();
  }
  
  private void _initTransactionsProxy() {
    try {
      transactions_PortType = (new ACME.Transactions_ServiceLocator()).gettransactionsPort();
      if (transactions_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)transactions_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)transactions_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (transactions_PortType != null)
      ((javax.xml.rpc.Stub)transactions_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ACME.Transactions_PortType getTransactions_PortType() {
    if (transactions_PortType == null)
      _initTransactionsProxy();
    return transactions_PortType;
  }
  
  public ACME.Result receiveTransactions(ACME.Transaction[] arg0) throws java.rmi.RemoteException{
    if (transactions_PortType == null)
      _initTransactionsProxy();
    return transactions_PortType.receiveTransactions(arg0);
  }
  
  
}