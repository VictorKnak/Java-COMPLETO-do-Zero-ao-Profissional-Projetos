package lambdas.DesafioLambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import lambdas.Produto;   // Importou a classe produto

public class Desafio {

	public static void main(String[] args) {
		

		/*
		 * 1. A partir do produto calcular o preco real(com desconto)
		 * 2. Imposto municipal: >= 2500 ()8,5% | < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) | < 3000(50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 * */
		
		Double valorFinal;
		String valorFormatado;
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		// Calcula o Desconto
		BinaryOperator<Double> precoReal = (Double preco, Double desconto)->{
			return preco * (1 - desconto);
		};
		System.out.println("Preco real => " + precoReal.apply(p.getPreco(), p.getDesconto()));		
		
		// Se for maior que 2500, adicinoar mais 8,5% de imposto municipal
		UnaryOperator<Double> impostoMunicipal = (Double valorReal) ->{			
			return valorReal >= 2500 ? valorReal * (1 + 0.085) : valorReal;
		};
		System.out.println("Imposto Municipal => " + precoReal.andThen(impostoMunicipal).apply(p.getPreco(), p.getDesconto()));
		
		
		// Calcula o frete
		UnaryOperator<Double> Frete = (Double valorMunicipal) ->{
			return valorMunicipal >= 3000 ? valorMunicipal + 100 : valorMunicipal + 50;			
		};
		System.out.println("Com Frete => " + precoReal.andThen(impostoMunicipal).andThen(Frete).apply(p.getPreco(), p.getDesconto()));
		
		
		valorFinal = precoReal.andThen(impostoMunicipal).andThen(Frete).apply(p.getPreco(), p.getDesconto());
		valorFormatado = String.format("%.2f", valorFinal);
		System.out.println("R$" + valorFormatado.replace(".", ","));
		
		

	}

}
