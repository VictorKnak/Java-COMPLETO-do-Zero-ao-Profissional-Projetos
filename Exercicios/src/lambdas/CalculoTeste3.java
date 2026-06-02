package lambdas;

import java.util.function.BinaryOperator;

/* Exemplo de lambdas utilizando funções ja existente no 'java.util.function' */

public class CalculoTeste3 {

	public static void main(String[] args) {

		// Funcao existente no 'java.util.function'. Precisa indicar o tipo de dado que sera retornado 
		BinaryOperator<Double> calc = (x, y) ->{
			return x + y;
		};		
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

		
		
		// Funcao existente no 'java.util.function'. Precisa indicar o tipo de dado que sera retornado 
		BinaryOperator<Integer> calc2 = (x, y) ->{
			return x + y;
		};		
		System.out.println(calc2.apply(2, 3));

		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
		

	}

}
