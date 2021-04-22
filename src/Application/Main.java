package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCurrenter;

public class Main {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dolar price: ");
		CurrencyCurrenter.dolar = sc.nextDouble();
		System.out.println("Requested Value: ");
		CurrencyCurrenter.requested = sc.nextDouble();
		
		System.out.println("Dolar price: "+CurrencyCurrenter.dolar);
		System.out.println("Requested Value: "+CurrencyCurrenter.requested);
		
		System.out.println("Amount to be paid in real = "+CurrencyCurrenter.needed());
		
		
		sc.close();		
	}

}
