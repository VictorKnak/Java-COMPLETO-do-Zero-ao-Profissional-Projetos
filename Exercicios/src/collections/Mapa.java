package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Map (Mapa): 
 * Estrutura de chave-valor. 
 * Não permite chaves duplicadas (ex: HashMap, TreeMap). 
 * É como se fosse um Hash Corebuilder.
 * 
 * */

public class Mapa {

	public static void main(String[] args) {

		// Cria o Objeto Map(HashMap)
		//    Key  , Value
		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// Monta o Map
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		// Tamanho
		System.out.println("usuarios.size()    => " + usuarios.size());
		
		// Verifica se esta vazio
		System.out.println("usuarios.isEmpty() => " + usuarios.isEmpty());
		
		// Busca somente as chaves 
		System.out.println("usuarios.keySet()  => " + usuarios.keySet());
		
		// Busca somente os valores
		System.out.println("usuarios.values()  => " + usuarios.values());
		
		// Busca Chave e Valor
		System.out.println("usuarios.entrySet() => " + usuarios.entrySet());		
		
		// Verifica se contem a chave
		System.out.println("usuarios.containsKey()  => " + usuarios.containsKey(20));
		
		// Verifica se contem o valor 
		System.out.println("usuarios.containsValue()  => " + usuarios.containsValue("Rebeca"));

		// Pega o valor por um indice
		System.out.println("usuarios.get()  => " + usuarios.get(20));
		
		// Remove a partir da chave
		System.out.println("usuarios.remove() => " + usuarios.remove(1));

		// Remove a partir da chave e valor
		System.out.println("usuarios.remove() => " + usuarios.remove(4, "Gui"));
		
		
		// Percorre pelas chaves
		System.out.println("\nPercorre as chaves:");
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		
		// Percorre pelos valores
		System.out.println("\nPercorre pelos valores:");
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		// Percorre pela Chave e Valore
		System.out.println("\nPercorre pela Chave e Valor:");		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + "=>" );
			System.out.println(registro.getValue());
		}
				
	}

}








