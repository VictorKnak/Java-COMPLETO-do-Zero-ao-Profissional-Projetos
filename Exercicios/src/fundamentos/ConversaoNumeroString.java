package fundamentos;


/*
 * So eh possivel realizar a conversao de numeros
 * para String, se utilizar Wrapper's, pois tipos
 * primitivos não tem métodos disponível para realizar
 * as conversões.
 * Para converter tipos primitivos em String, precisa
 * utilizar o Wrapper explicitamente no tipo primitovo
 * antes de realizar a conversao.
 * */

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
        // Wrapper
		Integer num1 = 10000;
		
		// Converte em String
		System.out.println(num1.toString());
		
		// Quantidade de caracteres
		System.out.println(num1.toString().length());
		
		// Convertendo tipo primitivo em String
		int num2 = 20000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());
		
		// Fazendo o Java converter o numerico para String implicitamente sem utilziar Wrapper's
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}
	
	
}
