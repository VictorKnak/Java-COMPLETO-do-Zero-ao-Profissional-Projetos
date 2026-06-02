package lambdas;

import java.util.function.Predicate;

/*
 * Exemplo de composicao de Predicado
 * onde utilizamos a saída de uma funcao para 
 * realizar o teste de outra funcao.
 * */

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num  -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDigitos).test(122)); // Operacao AND		
		System.out.println(isPar.or(isTresDigitos).test(12));  // Operacao OR
		
		
	}

}
