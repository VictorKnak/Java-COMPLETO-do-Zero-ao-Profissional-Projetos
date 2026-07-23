package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		// Usa programacao funcional para criar um referencia print
		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::println;

		// Cria uma Stream, usando um metodo ESTATICO 'Strean.of'
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
	
		//----------------------------------------------
		
		// Cria um array de Strings
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLangs).forEach(print);              // Cria Stream apartir de um array
		Arrays.stream(maisLangs).forEach(print);          // Cria Stream apartir da classe arrays
		Arrays.stream(maisLangs, 1, 3).forEach(print);    // Cria Stream apartir da classe arrays delimitando a posicao do array
		
		System.out.println();
		
		// Stream apartir de uma Collection
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);     // Processamento paralelo
		
		// Usando o 'generate' eh uma Stream que recebe uma 'Supplier' como parametro, ou seja,
		// Uma funcao Lambda que não precisa de parametro mais retorna algo.
		// Esta Stream gera uma Stream potenciamente infinita que nao possui uma ordenacao
//		Stream.generate(() -> "a").forEach(print);
		
		// Outra forma de gerar uma Stream infinita mas que possui ordenacao, neste caso,
		// ela recebe parametros, onde o primeiro eh o valor iniciar e o segundo eh um operador unario
		// onde o parametro iniciar eh iniciardo com o operador unario para o calculo.
//		Stream.iterate(0, n -> n + 1).forEach(println);
		
	}

}

















