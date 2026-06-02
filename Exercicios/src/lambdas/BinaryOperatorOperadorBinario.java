package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/*
 * Composição de Operador binário não é possivel, pois 
 * o Operador Binário recebe dois paramtros e tem somente 
 * um retorno.
 * Mas a composição pode ser utilizada entre Operador Binário
 * e Operador Unário, pois o Operadro Unário possui somente 
 * um parametro de entrada.
 * */

public class BinaryOperatorOperadorBinario {

	public static void main(String[] args) {

		// Operador binário do tipo Double
		BinaryOperator<Double> media = (Double n1, Double n2) ->{
			return (n1 + n2) / 2;
		};
		System.out.println(media.apply(9.8, 2.7));
		
		// funcao para composicao, pega o resultado da anterior e joga da entrada desta.
		Function<Double, String> conceito = (Double n1) ->{
			return n1 >= 7 ? "Aprovado" : "Reprovado";
		};		
		System.out.println(media.andThen(conceito).apply(9.8, 2.7));
		
		// espaçamento
		System.out.println();
		
		
		// Exemplo para a mesma funcao da duas anteriores
		// Esta é uma inteface Funciona que pode escolher o tipo dos dois parametros(1,2) e o tipo de retorno(3)		
		BiFunction<Double, Double, String> resultado = (Double n1, Double n2) ->{
			double result = (n1 + n2 ) / 2;
			return result >= 7 ? "Aprovado" : "Reprovado";
		};		
		System.out.println(resultado.apply(8.5, 6.4));

	}

}
