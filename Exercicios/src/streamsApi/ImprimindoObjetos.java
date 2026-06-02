package streamsApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * Foram demonstrados tipos diferente de Iterações de Objetos
 * deste a forma tradicional até a forma mais atual, podendo 
 * ser utilizadas a partir das ultimas verções de java.
 * Podendo ter um código um pouco mais enxuto e performático
 * 
 * A Stream API do Java (introduzida no Java 8) é uma ferramenta 
 * que permite processar sequências de elementos de forma 
 * declarativa e funcional. Em vez de usar loops tradicionais, 
 * você descreve o que precisa ser feito em vez de como fazê-lo.
 * */

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando 'for' tradicional...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
						
		System.out.println("\nUsando o 'foreach'...");
		for (String ap : aprovados) {
			System.out.println(ap);
		}

		/*
		 * Iterator valida se existe o proximo dado para iteração automaticamente
		 * seria como se tivesse um IF que validasse se o dado existe denro da lista
		 * ele é controlado por um 'while' pois quando é usado geralmente não se conhece
		 * o tamanho real da lista.
		 * */
		System.out.println("\nUsando o 'Iterador'...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * Usando Stream, a validação e o laço de iteração fica totalmente interno 
		 * dentro da linguagem, sem precisar realiza-las explicitamente
		 * O ganho que isso dá é o código mais enxuto e consequentemente um 
		 * pouco mais performático
		 * */
		System.out.println("\nUsando o 'Stream'...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);              // laço interno
	}

}
