package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Student> setA = new HashSet<>();
		Set<Student> setB = new HashSet<>();
		Set<Student> setC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for( int i = 0; i < n; i++) {
			setA.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for( int i = 0; i < n; i++) {
			setB.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for( int i = 0; i < n; i++) {
			setC.add(new Student(sc.nextInt()));
		}
		
		Set<Student> total = new HashSet<>(setA);
		total.addAll(setB);
		total.addAll(setC);
		
		System.out.println("Total students: " + total.size());
		sc.close();
	}

}
