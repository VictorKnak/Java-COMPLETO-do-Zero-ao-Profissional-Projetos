package controle;

import java.util.Scanner;	// Importa a biblioteca Scanner

/*
 * Anotar passo a passo para eclipse nao considerar a virgura 
 * como separador de casas decimais e sim o ponto
 * 
 * Acessar: Preferences > Java > Installed JREs > Edit...
 * 		Adicionar no campo 'Default VM arguments' -> -Duser.language=en -Duser.country=US
 * 
 * */

public class If {

	public static void main(String[] args) {
		
		// chama o Objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");		
		double nota = entrada.nextDouble(); 	// chama o scanner para receber a entrada

		if(nota >= 7.0 && nota <= 10.0) {
			System.out.println("Aluno foi aprovado!");
		} else {
			System.out.println("Aluno foi reprovado!");
		}
		
		// fecha o scanner
		entrada.close();
	}

}
