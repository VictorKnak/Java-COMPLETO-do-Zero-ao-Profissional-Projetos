package fundamentos.operadores;

/* 
 * Operador termario eh como se fosse um If de linha
 * ontem a '?' seria o separador da primeira parte onde
 * contem a condicional e o ':' seria o else da condicional.
 * 
 * Exemplo: 
 *    -> variavel := if( var > 2, "teste_1", "teste_2")
 *    
 *    -> variavel = var > 2 ? "teste_1" : "teste_2";
 * */


public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
				
		// Exemplo de um operador ternario
		String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";

		System.out.println(resultado);
	}

}
