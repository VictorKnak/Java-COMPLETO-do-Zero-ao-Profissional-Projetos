package collections.Testes;

import java.util.Objects;

/*
 * Objects.hash(Object... values) é um método estático utilitário em Java, 
 * disponível a partir do Java 7 na classe java.util.Objects, usado para 
 * gerar um código hash(hashCode) para um objeto com base em múltiplos campos. 
 * 
 * Ele facilita a implementação de hashCode(), recebendo vários atributos e 
 * combinando-os em um único valor inteiro.
 * 
 * Principais características:
 * Simplicidade: Evita o cálculo manual de hash, que é propenso a 
 *               erros (como combinar campos com números primos).
 * 
 * Varargs: Aceita um número variável de argumentos (Object... values), 
 *          permitindo passar qualquer quantidade de campos.
 * 
 * Segurança com Nulos: Lida corretamente com valores nulos, chamando hashCode() 
 *                      nos objetos fornecidos e combinando os resultados.
 * 
 * Implementação Ideal: A melhor prática é usá-lo dentro do método hashCode() 
 *                      da classe, junto com equals(), para garantir que objetos 
 *                      com dados iguais gerem o mesmo código hash.
 * 
 * */

public class HashExample {

	public static void main(String[] args) {

		int i = Objects.hash("one",3,'e');		
		System.out.println(i);

	}

}
