package fundamentos;

/*
 * Tipos Primitivos em Java:
 * 
 * Existem até 8 tipos:
 * 
 *   Tipo     | Qtd. Bits | Qtd. Bytes  
 *--------------------------------------
 * 1- byte    |  8 bits   | 1 byte
 * 2- short   |  16 bits  | 2 bytes
 * 3- int     |  32 bits  | 4 bytes
 * 4- long    |  64 bits  | 8 bytes
 * 5- double  |  64 bits  | 8 bytes
 * 6- float   |  32 bits  | 4 bytes
 * 7- char    |  16 bytes | 2 bytes
 * 8- boolean |  8 bytes  | 1 byte
 * 
 * O tamanho dos tipos primitivos variam 
 * conforme o tamanho de bytes de cada tipo.
 * Em tipos numericos devera verificar 
 * ate o maximo do valor numerico que cada
 * tipo comporta dentro de si.
 * 
 * O Java nao interpreta o valor que esta
 * dentro da variavel e sim o tipo dela,
 * por padrao, todo numero eh um inteiro e 
 * todo numero de ponto flutuante eh um double.
 * 
 * Valores LITERAIS eh tudo aquilo 
 * que se coloca chumbado no codigo.
 * 
 * Tipos Primitivos NAO POSSUEM NOTACAO PONTO
 * 
 * */

public class TiposPrimitivos {

	public static void main(String[] args) {

		// Inforcações do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		
		// Quando se utilizar um dado literal e passar a capacidade de um inteiro
		// precisa identificar que eh um long, utilizando a letra L ao final do numero
		long pontosAcumulados = 3_234_845_223L;  // Pode usar underscore para separar numeros maiores
		
		
		
		// Tipos numericos reias
		// Por padrao, todo numero real em Java eh um Double, entao para indicar que se quer utilizar 
		// um Float, deve ser indicado com a letra F ao final do numero, pois o java nao identifica o conteudo e sim o tipo
		float salario = 11_445.44F;		
		double vendasAcumuladas = 11_445.44;
		
		
		// Tipo booleano
		boolean estaDeFerias = true;
		boolean estarDeFerias = false;
		
		// Tipo caractere
		char status = 'A' ;   // Char somente um numero
		
		System.out.println(anosDeEmpresa);
		System.out.println(numerosDeVoos);
		System.out.println(id);
		System.out.println(pontosAcumulados);
		System.out.println(salario);
		System.out.println(vendasAcumuladas);
		System.out.println(estaDeFerias);
		System.out.println(estarDeFerias);
		System.out.println(status);
	
		
	}

}
















