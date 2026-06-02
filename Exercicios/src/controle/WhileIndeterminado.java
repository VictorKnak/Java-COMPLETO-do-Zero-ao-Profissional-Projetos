package controle;

import java.util.Scanner;		// importa o packed scanner

public class WhileIndeterminado {

	public static void main(String[] args) {

		// cria objeto scanner
		Scanner entrada = new Scanner(System.in);
		
		// cria string vazia
		String valor = "";
		
		// enquanto o dado digitado nao for "sair" faz o loop
		while( !valor.equalsIgnoreCase("sair") ) {
			
			// solicita ao usuario 
			System.out.print("Digite algo:");
			valor = entrada.nextLine();
		}
		
		System.out.println("Programa encerrado...");
		
		entrada.close();

	}

}
