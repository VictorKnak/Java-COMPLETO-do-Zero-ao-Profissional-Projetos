package arrays;

import java.util.Scanner;

/*
 * Desafio:
 * Calcular média do aluno conforme notas passadas pelo usuário
 * utilizando array para armazenar as notas.
 * */

public class DesafioArray {

	public static void main(String[] args) {

		int quantidade   = 0;  // quantidade de notas a serem inseridas
		double somaNotas = 0;  // soma das notas
		
		// Cria o Objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Quantas nota quer informar
		System.out.print("Quantas notas deseja informar? ");		
		quantidade = entrada.nextInt();
		
		// Cria o array da quantidade desejada
		double[] aNotas = new double[quantidade]; 

		// Loop para pegar o valor das notas do usuario
		for (int i = 0; i < aNotas.length; i++) {			
			System.out.printf("Digite a %dº nota: ", i + 1 );
			aNotas[i] = entrada.nextDouble();				// armazena na posicao do array			
		}
		
		// loop para somar as notas
		for (double d : aNotas) {
			somaNotas += d;
		}
		
		// media
		System.out.println("Média: " + somaNotas / aNotas.length);
				
		entrada.close();		
	}

}
