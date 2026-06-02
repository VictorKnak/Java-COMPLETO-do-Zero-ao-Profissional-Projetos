package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Pilha:
 * Conceito de Pilha, "LIFO - Last-In, First Out."
 * "O Ultimo a Entrar é o Primeiro a Sair."
 * 
 * */

public class Pilha {

	public static void main(String[] args) {

		// Cria o Objeto Pilha
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Príncipe");   // .add() ao adicionar retorna bdolean
		livros.push("Dom Quixote");         // .push() lançará uma exceção caso a fila esteja cheia.
		livros.push("O Hobbit");
		
		System.out.println(livros);
		
		// Retorna o ultimo elemento a entrar na Pilha
		System.out.println("livros.peek() => " + livros.peek());        // .peek() retorna null caso a Pilha esteja vazia
		System.out.println("livros.element() => " + livros.element());  // .element() lança uma exceção caso a Pilha esteja vazia
		
		// Tamanho da Pilha
		System.out.println("livros.size() => " + livros.size());
		
		// Verifica se a Pilha esta vazia
		System.out.println("livros.isEmpty() => " + livros.isEmpty());
		
		// Limpa a Pilha
		System.out.println("livros.clear() => " );
		// livros.clear();   // Comentado por conta dos testes
		
		// Retorna o ultimo elemento a entrar na Pilha removendo o mesmo
		System.out.println("fila.poll()   => " + livros.poll());     // .poll() retorna null quando Pilha esta vazia		
		System.out.println("fila.pop()    => " + livros.pop()); // .pop() lança uma exceção caso a Pilha esteja vazia
		System.out.println("fila.remove() => " + livros.remove()); // .remove() lança uma exceção caso a Pilha esteja vazia
		System.out.println(livros);	
		
	}

}
