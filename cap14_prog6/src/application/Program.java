package application;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Maria", "maria@gmail.com.br");
		Cliente c3 = new Cliente("Maria", "maria@gmail.com.br");
		Cliente c2 = new Cliente("Maria", "alex@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c3);
		System.out.println(s1 == s2);
	}

}
