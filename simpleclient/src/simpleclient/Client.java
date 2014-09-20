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

            Transaction[] data = new Transaction[3];
            
            Transaction data1 = new Transaction();
            data1.setCodigoComercio("CACA");
            data1.setCodigoMoneda("UYU");
            data1.setFecha("280214");
            data1.setHora("220000");
            data1.setId(32);
            data1.setMonto(new BigDecimal("1233"));
            data1.setMumeroTarjeta("1234");
            data1.setNombreComercio("CACA");
            data1.setTipo("compra");
            data1.setTipoDispositivo("POS");
            data1.setTipoTarjeta("debito");
            
            Transaction data2 = new Transaction();
            data2.setCodigoComercio("caca2");
            data2.setCodigoMoneda("USD");
            data2.setFecha("280214");
            data2.setHora("220000");
            data2.setId(35);
            data2.setMonto(new BigDecimal("1233"));
            data2.setMumeroTarjeta("1234");
            data2.setNombreComercio("CACA");
            data2.setTipo("consulta de saldo");
            data2.setTipoDispositivo("POS");
            data2.setTipoTarjeta("credito");
            
            Transaction data3 = new Transaction();
            data3.setCodigoComercio("tres");
            data3.setCodigoMoneda("UYU");
            data3.setFecha("311215");
            data3.setHora("220000");
            data3.setId(35);
            data3.setMonto(new BigDecimal("1233"));
            data3.setMumeroTarjeta("1234");
            data3.setNombreComercio("CACA");
            data3.setTipo("deposito");
            data3.setTipoDispositivo("POS");
            data3.setTipoTarjeta("prepaga");
            
            data[0] = data1;
            data[1] = data2;
            data[2] = data3;
            
            Transactions_PortType myService = service.gettransactionsPort();
            
            Result res = myService.receiveTransactions(data);
            
            System.out.println(res.getMessage());
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}