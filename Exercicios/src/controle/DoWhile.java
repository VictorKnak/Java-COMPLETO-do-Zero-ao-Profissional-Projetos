package controle;

import java.util.Scanner;

/*
 * Do While: 
 *    Pelo menos uma vez ele vai rodar o loop, diferentemente do While normal,
 * que dependendo da variável de controle, pode não rodar nenhuma vez.
 * 
 *    É uma estrutura de controle ontem irá ter ';' ao final
 *       Ex: do{...} while();
 *       
 *   A principal diferença é que o 'while' verifica a condição antes de executar 
 * o bloco de código (pode nunca rodar), enquanto o 'do-while' executa o bloco 
 * primeiro e verifica a condição no final, garantindo pelo menos uma execução. 
 *   O 'while' é ideal para repetições condicionais, e o 'do-while' para menus.      
 *
 * */


public class DoWhile {

	public static void main(String[] args) {

		// cria um objeto Scanner para captura de dados do usuario
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		// 
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			
			System.out.println("Quer sair?");			
			texto = entrada.nextLine();      // pega a entrada
			
		} while (!texto.equalsIgnoreCase("por favor"));

		
		System.out.println("Programa encerrado...");
		
		// fecha o Scanner
		entrada.close();
	}

}
