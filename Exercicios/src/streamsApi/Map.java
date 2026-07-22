package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


/*
 * O método 'map' na Stream API do Java é uma operação intermediária 
 * que transforma os dados de um stream. Ele aplica uma função a cada 
 * elemento existente, gerando um novo stream com os resultados.
 * 
 * Parâmetro: Recebe uma interface funcional Function<T, R> (geralmente escrita como uma expressão Lambda).
 * Objetivo : Converter o elemento T no elemento R.
 * 
 * */

public class Map {

	public static void main(String[] args) {

		// Cria uma variavel para facilitar o print no console
		Consumer<String> print = System.out::print;
		
		// Cria lista(array) de marcas de carro
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		// Usando stream e map para transformar tudo em maiusculo
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		
		// cria operadores unarios para utilizar em composicao de Stream
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();      // Coloca tudo em maiusculo
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + ""; // Pega primeira letra
		UnaryOperator<String> grito = n -> n + "!!! ";
		
		System.out.println("\n\nUsando composição de Stream...");
		marcas.stream()
		      .map(maiuscula)
		      .map(primeiraLetra)
		      .map(grito)
		      .forEach(print);

		
	}

}
