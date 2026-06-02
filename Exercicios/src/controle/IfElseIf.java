package controle;

import java.util.Scanner;        // importa packed scanner para inputar dados

public class IfElseIf {

	public static void main(String[] args) {
	
		// cria o objeto scanner para inputar os dados
		Scanner entrada = new Scanner(System.in);
		
		// solicita ao usuario a nota
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

		// Validacoes
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
			
		} else if(nota >= 8.1){
			System.out.println("Conceito A");
			
		} else if(nota >= 6.1) {
			System.out.println("Conceito B");
			
		} else if(nota >= 4.1) {
			System.out.println("Conceito C");
		
		} else if(nota >= 2.1) {
			System.out.println("Conceito D");
			
		} else {
			System.out.println("Conceito E");
		}
		
		entrada.close(); // fecha o scanner

	}

}
