package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registred? ");
		int quant = sc.nextInt();
		
		for (int i = 1; i <= quant; i++) {
			System.out.printf("Employee #%d%n", i);
			sc.nextLine();
			System.out.printf("Id: ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));	
		}
		
		System.out.println();
		System.out.println("Enter the employee Id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for ( Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
