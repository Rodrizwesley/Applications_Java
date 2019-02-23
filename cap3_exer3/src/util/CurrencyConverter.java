package util;

public class CurrencyConverter {
	public static double contDol(double valorDol, double quantDol) {
		double iof = 0.06;
		double aux;
		
		aux = valorDol * quantDol;
		return (aux * iof) + aux;
	}
}
