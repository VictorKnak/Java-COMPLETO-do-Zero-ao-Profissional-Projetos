package collections;

import java.util.LinkedList;
import java.util.Queue;			// Interface de Fila

/*
 * Fila:
 * Conceito de Fila, "FIFO - First In, First Out."
 * "Primeiro a Entrar é o Primeiro a Sair".
 * 
 * */

public class Fila {

	public static void main(String[] args) {

		// Cria um Objeto de fila de tipo String
		Queue<String> fila = new LinkedList<String>();
				
		fila.add("Ana");	// .add() lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia");	// .offer() retorna falso caso a fila esteja cheia.		
		fila.add("Carlos");	
		fila.offer("Daniel");		
		fila.add("Rafael");
		fila.offer("Gui");
		System.out.println(fila);
		
		// Retorna o proximo elemento da lista
		System.out.println("fila.peek() => " + fila.peek());        // .peek() retorna null caso a fila esteja vazia
		System.out.println("fila.element() => " + fila.element());  // .element() lança uma exceção caso a fila esteja vazia
		
		// Tamanho da fila
		System.out.println("fila.size() => " + fila.size());
		
		// Verifica se a fila esta vazia
		System.out.println("fila.isEmpty() => " + fila.isEmpty());
		
		// Limpa a fila
		System.out.println("fila.clear() => " );
		// fila.clear();   // Comentado por conta dos testes
		
		// Retorna o proximo elemento da fila removendo o mesmo
		System.out.println("fila.poll() => " + fila.poll());   // .poll() retorna null quando lista esta vazia
		System.out.println("fila.poll() => " + fila.poll());
		System.out.println("fila.poll() => " + fila.poll());
		System.out.println("fila.remove() => " + fila.remove()); // .remove() lança uma exceção caso a lista esteja vazia
		System.out.println(fila);		

	}

}
