package cap2_prog6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Integer number: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Even!");
		}
		else {
			System.out.println("Odd!");
		}
		
		sc.close();
	}

}
