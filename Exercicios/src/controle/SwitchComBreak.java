package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		String conceito = "";
		
		// Cria o Objeto Scanner para receber a entrada
		Scanner entrada = new Scanner(System.in);
		
		// Informa a nota
		System.out.println("Informe a nota: ");		
		int nota = entrada.nextInt();
				
		switch(nota) {
		
		// Como o 'case' nao permite validacao booleana, 
		//precisa destacar o 'case' em que o resultado encaixa igualmente
		case 10: case 9:
			conceito = "A";
			break;
			
		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: case 5:
			conceito = "C";
			break;
			
		case 4: case 3:
			conceito = "D";
			break;
			
		case 2: case 1: case 0:
			conceito = "E";
			break;
			
		default:
			conceito = "não informado!";
		}
		
		System.out.println("Conceito é " + conceito);

		entrada.close();
	}

}
