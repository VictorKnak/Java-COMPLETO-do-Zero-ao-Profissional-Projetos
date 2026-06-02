package classe.desafioModulo5;

import java.text.DecimalFormat; // Pacote para formatar valores numéricos de decimais ou moeda

public class Jantar {

	public static void main(String[] args) {
		
		// Variaveis
		double pesoAtual = 0;

		// Cria o Objeto Pessoa
		Pessoa p = new Pessoa("João", 80);
		
		// Cria o Objeto Comida
		Comida c1 = new Comida("Arroz", 0.120);
		Comida c2 = new Comida("Feijão", 0.200);
		Comida c3 = new Comida("Carne", 0.300);
		
		// Cria o Objeto para formatar e retornar String
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(p.nome);
		
		// adiciona o pesso da comida
		pesoAtual = p.peso;
		pesoAtual = p.Comer(c1);
		pesoAtual = p.Comer(c2);
		pesoAtual = p.Comer(c3);
		
		// Se usa o %s pois quando a formatacao eh realizada retorna uma String 
		System.out.printf("Peso atual => %skg", df.format(pesoAtual));

	}

}
