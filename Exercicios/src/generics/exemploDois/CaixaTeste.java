package generics.exemploDois;

/* 
 * Exemplo da forma mais atual de como usar o Generics apartir do Java5
 * 
 * Antes (com Object): Você podia colocar qualquer dado na caixa, mas o Java 
 * te devolvia um Object. Você era obrigado a adivinhar o tipo e fazer um cast 
 * manual (Double). Se errasse a adivinhação, o programa quebrava rodando.
 * 
 * Depois (com Generics): Você coloca uma "etiqueta" na caixa dizendo o que 
 * vai dentro. O compilador não te deixa errar o tipo e te devolve o dado pronto 
 * para uso, sem precisar de cast.
 * 
 * Por convenção, usamos letras maiúsculas específicas para indicar o propósito do tipo: 
 *  <T> (Type)        : Tipo genérico para qualquer objeto (usado em classes como a Caixa).
 *  <E> (Element)     : Usado para elementos de coleções (como List<E>).
 *  <K, V> (Key/Value): Usado para mapas que associam Chave e Valor (como Map<K,V>).
 *  <N> (Number)      : Usado quando o tipo deve ser estritamente numérico.
 * 
 * */

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<String>();
		
		caixaA.setGuardar("Testeeee!!!!!!!");
		
		String coisaA = caixaA.getAbri();        // Sem precisar de Cast		
		System.out.println(coisaA);

	}

}
