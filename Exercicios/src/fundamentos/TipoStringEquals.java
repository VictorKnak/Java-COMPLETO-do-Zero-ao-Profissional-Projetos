package fundamentos;


/*
 * .equals tem a funcionalidade de compara o conteudo dentro de uma String.
 * 
 * No exemplo 1 o resultado retorna true pois estamos comparando uma String
 * "crua".
 * 
 * No exemplo 2 estamos comparando um objeto criado com uma string
 * "crua" e nao o conteudo deste objeto em si.
 * 
 * No exemplo 3 estamos realizando a comparacao com o .equals para comparar 
 * a String "crua" com o conteudo dentro do objeto.
 * 
 * */

public class TipoStringEquals {

	public static void main(String[] args) {

		// Exemplo 1
		System.out.println("2" == "2");  // --> true

		// Exemplo 2
		String s = new String("2");
		System.out.println("2" == s); 	// -> false
		
		// Exemplo 3
		System.out.println("2".equals(s)); 	// -> true

		
		
	}

}








