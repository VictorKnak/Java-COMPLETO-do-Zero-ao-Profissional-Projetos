package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		// Predicate é uma Interface Funcional ja existente no Java, ela obrigatoriamente deve retornar 
		// um boolean e pode ser exclusivamente para Lambdas
		Predicate<Produto> isCaro = (prod) -> {
			return (prod.preco * (1 - prod.desconto)) >= 750;	
		};
		
		// Aqui a gente cria o objeto do tipo produto para fazer o teste logo em seguida
		// utilizando um método da função 'Predicate'
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));

	}

}
