package util;

public class CurrencyCurrenter {
	
	public static double dolar;
	public static double requested;
	
	public static double needed() {
		return requested*dolar + requested*dolar*0.06;
	}
	
}
