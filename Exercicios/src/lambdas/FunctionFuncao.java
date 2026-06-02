package lambdas;

import java.util.function.Function;


/*
 * Este exemplo é sobre o uso de Interface Funcional encadeada
 * em que a saida(resultado) de uma função é utilizada na 
 * entrada(parametro) da outra função.
 * Este tipo de operação se chama COMPOSICAO 
 * */

public class FunctionFuncao {

	public static void main(String[] args) {

		// Interface Funciona 'Function' ja existente no Java permite escolher 
		// o tipo do paramero de Entrada e de saída da função.
		// 'numero' é o parametro da função
		Function<Integer, String> parOuImpar = numero -> {
			return numero % 2 == 0 ? "Par" : "Impar";
		};
		System.out.println(parOuImpar.apply(32));
		
		// Interface funcional - 'valor' é o parametro da função
		Function<String, String> oResultadoE = valor -> {
			return "O resultado é: " + valor;
		};
		
		// Como nao tem muita logica, o java ja entende que devera retornar 
		// a string concatenada, entao no caso nao tem necessidade de 
		// criar o 'corpo da funcao' com as chaves
		Function<String, String> empolgado = valor -> valor + "!!!";		
		
		
		// 'andThen' chama a funcao 'encadeada', ou seja, a saida de uma
		// função deverá ser o tipo de dado da entrada da outra Função.
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
	}

}
