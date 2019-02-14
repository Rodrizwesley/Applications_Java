package cap2_exer2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: "); // Alex Green
		String name = sc.next();
		System.out.println("How many bedrooms are there in your house? "); //3
		sc.nextLine();
		int bedroom = sc.nextInt();
		System.out.println("Enter product price: "); //500.50
		sc.nextLine();
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line): "); // Green 21 1.73
		sc.nextLine();
		String lastName  = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedroom);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		
		
		
		
		
		sc.close();
	}

}
