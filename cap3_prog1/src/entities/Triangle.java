package entities; // pacote da classe

public class Triangle { //Nome da Classe

	/* O prefixo "public" indica que o atributo ou m�todo 
	 * pode ser usado em outros aqruivos
	 */
	
	public double a; //
	public double b; // Atributos da classe
	public double c; //
	
	/*
	 * double = Tipo do dado que o m�todo retorna ( se o m�todo n�o retorna nada,
	 * usa-se a palavra void.
	 * area = Nome do m�todo
	 * () = Lista de par�metros do m�todo
	 */
	
	public double area() {
		double p = (a + b + c) / 2.0;						// Corpo do m�todo
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));  //
	}
}
