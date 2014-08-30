package logic.datatypes;

/***
 * 
 * @author Cristiano
 *	Contiene posibles valores de atributos.
 */
public class Constants {

	public static String dateFormat = "ddmmyy";
	public static String timeFormat = "hhmmss";
	public static String[] transactionTypes = new String[]{"Compra", "depósito", "consulta de saldo"};
	public static String[] cardTypes = new String[]{"Débito", "crédito", "prepaga"};
	public static String[] currencyTypes = new String[] {"UY","USD"};
	public static String deviceType = "POS"; //Solo soporta tipos POS
	
}
