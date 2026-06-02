package collections;

/*
 * Basicamente os Collections é uma array melhorado
 * que oferce diversar ferramentas para manipular e 
 * organizar grupos de objetos.
 * 
 * Por padrão o Set não aceita tipos primitivos,
 * ele converte automaticamente em Objetos(Wrappers)
 * 
 * Por Regra, o HashSet deverá ser um conjunto 
 * homogênio, ou seja, todos os dados devem ser do
 * mesmo tipo.
 * 
 * Verificar documentação Dicas Java para melhor 
 * explicação.
 * 
 * */

import java.util.HashSet;
import java.util.Set;			// Interface Set

public class HashSetConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // anotacao para ignorar advertencias
	public static void main(String[] args) {

		
		/* Este Exemplo abaixo, é um exemplo de HashSet Heterogênio. */
		
		// Cria um Set
		HashSet conjunto = new HashSet();
		
		// adiciona valores em cada posição para o hashSet heterogenio
		conjunto.add(1.2);      // double -> Double (Wrappers)
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		// Verifica o tamanho
		System.out.println("Size() => " + conjunto.size());
		System.out.println(conjunto);
		
		System.out.println();
		
		// Ao tentar adicionar uma elemento que ja existe, o Java o Ignora
		conjunto.add('x');
		System.out.println(conjunto);

		System.out.println();
		
		// remove um valor - Retorna 'true' ou 'false'
		System.out.println("remove('Teste') => " + conjunto.remove("Teste"));
		System.out.println(conjunto);

		System.out.println();
				
		// Verifica se contem algum valor especifico - Retorna 'true' ou 'false'
		System.out.println("contains('Teste') => " + conjunto.contains("teste"));
		System.out.println(conjunto);
		
		
		// Cria o Objeto da Interface "Geral"
		Set numeros = new HashSet();
		
		// adiciona  os valores
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		System.out.println();
		
		System.out.println("numeros => " + numeros);
		System.out.println("conjunto => " + conjunto);

		System.out.println();
		
		// Une os dois HashSet
		conjunto.addAll(numeros);
		System.out.println("conjunto.addAll(numeros) => " + conjunto);
		
		System.out.println();
		
		// Retém somente os valores que são iguais
		conjunto.retainAll(numeros);
		System.out.println("conjunto.retainAll(numeros) => " + conjunto);
		
		System.out.println();
		
		// Limpa o HashSet
		conjunto.clear();
		System.out.println("conjunto.clear() => " + conjunto);
		
		

	}

}
