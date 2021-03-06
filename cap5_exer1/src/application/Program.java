package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rented;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rented[] vect = new Rented[10];
		
		System.out.print("How many rooms will be rented? ");
		int willBeRent = sc.nextInt();
		
		for(int i = 0; i < willBeRent; i++) {
			System.out.printf("Rent #%d:%n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rented(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
		
		sc.close();
	}

}
