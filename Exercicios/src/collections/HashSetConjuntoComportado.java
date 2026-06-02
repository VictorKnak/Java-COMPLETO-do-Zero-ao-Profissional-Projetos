package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
 * 
 * Este Exemplo abaixo, é um exemplo de HashSet Homogênio. 
 * 
 * */

public class HashSetConjuntoComportado {

	public static void main(String[] args) {

		// HashSet Homogenio
		// Maior e menor identifica qual sera a obrigatoriedade do tipo de dado
		Set<String> lista = new HashSet<String>(); // Nao respeita a ordenação ao adicionar
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		for (String c : lista) {
			System.out.println(c);
		}
		
		System.out.println("--------------------");
		
		// Pode usar o SortedSet ou o TreeSet para o tipo de objeto
		SortedSet<String> lista2 = new TreeSet<String>(); // Respeita a ordenação ao adicionar
		
		lista2.add("Ana");
		lista2.add("Carlos");
		lista2.add("Luca");
		lista2.add("Pedro");

		for (String c : lista2) {
			System.out.println(c);
		}
		
	}

}
