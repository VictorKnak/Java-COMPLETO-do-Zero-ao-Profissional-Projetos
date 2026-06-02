package lambdas;

import java.util.function.UnaryOperator;

/*
 * Operador unário pode ser realizada composicao
 * pois a entrada de um tipo de dado sera a saida 
 * com o mesmo tipo, ou seja, se a entrada é integer
 * a saida sera integer.
 * */

public class UnaryOperatorOperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = (n) -> n + 2;
		UnaryOperator<Integer> vezesDois = (n) -> n * 2;
		UnaryOperator<Integer> aoQuadrado = (n) -> n * n;
		
		// composicao normalmente utilizada
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(2);
		System.out.println(resultado1);
		
		// Esta maneira de composicao é menos utilizada, mas ah possibilidade
		// se notar, ela é ao contrário da outra pois ela vai 'componto' os 'passos'
		// de 'dentro para fora' do que deve ser feito.
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(2);
		System.out.println(resultado2);
		

	}

}
