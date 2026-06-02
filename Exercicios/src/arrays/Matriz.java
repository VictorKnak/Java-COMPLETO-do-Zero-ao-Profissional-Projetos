package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		double total = 0;
		
		// Obejto Scanner
		Scanner entrada =  new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
				
		System.out.print("Quantos notas por aluno? ");
		int qtdNotas = entrada.nextInt();
		
		// Cria a Matriz
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];
		
		// loop para quantidade de alunos
		for (int a = 0; a < notasDaTurma.length; a++) {
			
			// loop para capturar notas de cada aluno
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble(); // Captura o valor na nota e quarda na posicao da matriz
				total += notasDaTurma[a][n];
			}			
		}
		
		// calcula a media da turma 
		double media = total / (qtdAlunos * qtdNotas);
		System.out.printf("Média da turma é: %.2f", media);
		
		entrada.close();
	}

}
