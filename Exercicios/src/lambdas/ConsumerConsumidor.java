package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerConsumidor {

	public static void main(String[] args) {
		
		// Consumer é uma Interface Funcional existente no Java que o retorno é void
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		// cria o objeto e imprime o Nome com a Interface Funcional 'Consumer'
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);
		
		// Cria mais objetos do tipo Produto
		Produto p2 = new Produto("Notebook", 1122.94, 0.29);
		Produto p3 = new Produto("Caderno", 15.00, 0.03);
		Produto p4 = new Produto("Borracha", 7.30, 0.05);
		Produto p5 = new Produto("Lapis", 4.39, 0.1);
		
		// Cria um arrayList
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		// forEach espera receber como parametro um 'Consumer'
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));    // chama o accept implicitamente
		produtos.forEach(System.out::println);                 // Method Reference
		
	}
	
}
