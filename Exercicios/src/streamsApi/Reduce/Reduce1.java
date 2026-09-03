package streamsApi.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * O método reduce da Java Stream API é uma operação terminal 
 * que serve para combinar todos os elementos de um fluxo de 
 * dados em um único valor resultante
 * */

public class Reduce1 {

	public static void main(String[] args) {
			
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac , n) -> ac + n;
		
		// Sem passar valor incial
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println("Sem valor inicial => " +total1);
		
		// Passando valor inicial com Strem sequencial
		// nao precisa do GET pois o Java entende que retornara um Integer por conta do valor inicial passado
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println("Com valor inicial => " + total2);
		
		// Passando valor inicial com parallelStream, ele coloca um valor inicial para todas as chamadas
		Integer total3 = nums.parallelStream().reduce(100, soma);
		System.out.println("Com valor inicial e parallelStream => " + total3);
		
	}
	
}
