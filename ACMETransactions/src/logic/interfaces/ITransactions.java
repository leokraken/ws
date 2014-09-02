package logic.interfaces;

import java.util.List;

import logic.datatypes.DTTransaction;
import logic.datatypes.InvalidDataException;


public interface ITransactions {
	
	/***
	 * Procesa una lista de transacciones. Si alguna tiene error se lanza excepcion.
	 * La cual contiene en message informacion sobre las transacciones invalidas.
	 * @param data
	 * @throws InvalidDataException si contiene datos invalidos.
	 */
	public void ProcessTransaction(List<DTTransaction> data) throws InvalidDataException;

}
