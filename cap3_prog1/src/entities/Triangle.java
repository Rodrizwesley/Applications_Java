package entities; // pacote da classe

public class Triangle { //Nome da Classe

	/* O prefixo "public" indica que o atributo ou método 
	 * pode ser usado em outros aqruivos
	 */
	
	public double a; //
	public double b; // Atributos da classe
	public double c; //
	
	/*
	 * double = Tipo do dado que o método retorna ( se o método não retorna nada,
	 * usa-se a palavra void.
	 * area = Nome do método
	 * () = Lista de parâmetros do método
	 */
	
	public double area() {
		double p = (a + b + c) / 2.0;						// Corpo do método
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));  //
	}
}
