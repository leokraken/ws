package simpleclient;

import java.math.BigDecimal;




import ACME.*;

public class Client {
	
       
    static Transactions_Service service = new Transactions_ServiceLocator();

    public static void main(String[] args) {
        try {
        	Client client = new Client();
            client.doTest(args);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void doTest(String[] args) {
        try {
                        
            System.out.println("Llamando servicio...");

            DtTransaction[] data = new DtTransaction[2];
            
            DtTransaction data1 = new DtTransaction();
            data1.setCodigoComercio("CACA");
            data1.setCodigoMoneda("UY");
            data1.setFecha("280214");
            data1.setHora("220000");
            data1.setId(32);
            data1.setMonto(new BigDecimal("1233"));
            data1.setMumeroTarjeta("1234");
            data1.setNombreComercio("CACA");
            data1.setTipo("Compra");
            data1.setTipoDispositivo("POS");
            data1.setTipoTarjeta("Débito");
            
            DtTransaction data2 = new DtTransaction();
            data2.setCodigoComercio("caca2");
            data2.setCodigoMoneda("USD");
            data2.setFecha("280214");
            data2.setHora("220000");
            data2.setId(35);
            data2.setMonto(new BigDecimal("1233"));
            data2.setMumeroTarjeta("1234");
            data2.setNombreComercio("CACA");
            data2.setTipo("Compra");
            data2.setTipoDispositivo("POS");
            data2.setTipoTarjeta("Débito");
            
            data[0] = data1;
            data[1] = data2;
            
            Transactions_PortType myService = service.gettransactionsPort();
            
            DtResult res = myService.receiveTransactions(data);
            
            System.out.println(res.getMessage());
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}