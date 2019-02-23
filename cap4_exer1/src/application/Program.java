package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double iniDeposit;
		
		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		String accHolder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String choice = sc.nextLine();
	
		sc.close();
	}
}