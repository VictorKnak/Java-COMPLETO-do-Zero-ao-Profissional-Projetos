package arrays;

import java.util.Arrays; // Pacote utils para arrays

/*
 * Arrays:
 * 
 * Ao declarar um array, este valor eh fixo e nao pode 
 * ser alterado. Ou seja, caso precise adicionar mais 
 * uma posicao dentro de um array, precisa-se criar
 * outro array de mesmo tipo, com uma posicao a mais
 * e assim por diante.
 * 
 * Arrays sao objeto e sao Homogenios, sendo assim,
 * nao se pode adicionar tipos de dados diferentes 
 * dentro de um array. 
 * Ou seja, caso crie um array tipo 'Double' soh podera 
 * colocar valores do tipo 'Double' dentro deste array.
 * */

public class Exercicio {

	public static void main(String[] args) {

		double total = 0;
		
		// Cria um Objeto array de tipo double contendo 3 posicoes
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
			
		// acessando as posicoes
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);

		// percorre o array até o tamanho dele
		for(int x = 0; x < notasAlunoA.length; x++) {
			total += notasAlunoA[x];
		}
		
		System.out.printf("A média do aluno A é: %.2f %n" ,total / notasAlunoA.length);
		
		// forma menos convencional de inicializacao de array
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10 };
		
		total = 0; // zera a variavel
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		
		System.out.printf("A média do aluno B é: %.2f" ,total / notasAlunoB.length);
		
	}

}










