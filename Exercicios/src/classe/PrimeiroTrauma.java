package classe;


/*
 * Exemplo1 abaixo mostra que para acessar uma variavel de 
 * uma clsse publica em um metodo 'static' devera ser estanciada
 * a classe, mesmo que o metodo esteja dentro da propria classe.
 * 
 * Exemplo2 abaixo mostra com o mesmo cenario para acessar a variavel
 * em um metodo 'static' pode transformar esta variavel como 'static'
 * também.
 * 
 * Ou seja, para acessar um 'membro'/atributo de estancia em um método 'static' só
 * é possível se a classe estiver estanciada. Ou se o 'membro'/atributo de estancia
 * for 'static' também, da mesma forma que o metodo 'static'.
 * 
 * */

public class PrimeiroTrauma {
	
	int a = 3;	      	// Varivavel de estancia - (nao pode mexer nesta linha)	
	static int b = 4;	// Variavel de Clsse

	public static void main(String[] args) {
	
		// Ex.1 mostra que para acessar a variavel precisa estanciar a classe
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		// Ex.2 Imprime variavel estatica
		System.out.println(b);

	}

}
