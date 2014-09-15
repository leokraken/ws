package ws;

import java.util.ArrayList;
import java.util.Arrays;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

import logic.datatypes.Transaction;
import logic.datatypes.Transactions;
import logic.interfaces.Factory;
import logic.interfaces.ITransactions;

@WebService(name = "transactions",
			serviceName = "transactions", 
			portName="transactionsPort",
			targetNamespace="ACME")
@SOAPBinding(style = Style.RPC, parameterStyle = ParameterStyle.WRAPPED)
public class TransactionsWS {
	
	private ITransactions transactionsLogic = Factory.getITransactions();
	
	
	/**
	 * Recibe, valida,y guarda un conjunto de transacciones.
	 * 
	 * @param data
	 * Lista de transacciones a procesar.
	 * 
	 * @return estructura que contiene si todo salio bien, y el mensaje en caso de error.
	 */
	@WebMethod
	public Result ReceiveTransactions(@WebParam(name ="Transactions")Transactions data){//(Transaction[] data){
		
		Result res = new Result();
		res.setOk(true);
		res.setMessage("Transacciones procesadas correctamente.");
		
		if(data == null){
			res.setOk(false);
			res.setMessage("Servicio no recibio ninguna transaccion.");
		}
		else{
			
			try{
				transactionsLogic.ProcessTransaction(data.getTransactionList());//(Arrays.asList(data));
				//transactionsLogic.ProcessTransaction(data.getTransactionList());
			}
			catch(Exception e){
				res.setOk(false);
				res.setMessage("No se pudo procesar las transacciones: " + e.getMessage());
			}
			
			
		}
		
		return res;
	}
}
