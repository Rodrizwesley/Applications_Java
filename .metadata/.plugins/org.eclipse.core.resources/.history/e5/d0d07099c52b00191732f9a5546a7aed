package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Enter the name of student: ");
		student.name = sc.nextLine();
		System.out.println("Enter the 3 notes: ");
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.media());
		
		if (student.media() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.printf("MISSING %.2f POINTS", student.missing());
		}
		
		sc.close();
	}

}
