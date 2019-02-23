package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Entre com o valor do Dollar: ");
		double valueDol = sc.nextDouble();
		System.out.println("Entre com a quantidade que deseja comprar: ");
		double quantDol = sc.nextDouble();
	
		System.out.printf("Valor a ser pago em reais com imposto: %.2f", CurrencyConverter.contDol(valueDol, quantDol) );

		sc.close();
	}

}
