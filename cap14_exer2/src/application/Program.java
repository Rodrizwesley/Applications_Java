package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> eleicao = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if(eleicao.containsKey(name)) {
					int somar = eleicao.get(name);
					eleicao.put(name, votos + somar);
				}
				else {
					eleicao.put(name, votos);
				}
				
				line = br.readLine();
			}
			for(String key : eleicao.keySet()) {
				System.out.println(key + ": " + eleicao.get(key));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
