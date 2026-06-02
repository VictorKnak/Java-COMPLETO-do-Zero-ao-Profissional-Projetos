package arrays;

/*
 * Foreach:
 * 
 * Ao realizar a iteracao utilizando este laço de repetição
 * a variavel do 'foreach' aponta diretamente para a posicao
 * do array que esta realizando a iteracao. Ou seja, nao eh 
 * necessario realizar o controle pela posicao do loop em 
 * que esta a iteração. 
 *
 * For each significa "para cada", ou seja, para cada 
 * elemento em um determinado array faça: tal coisa.
 * 
 * */


public class Foreach {

	public static void main(String[] args) {

		// incializacao do array de 4 posicoes
		double[] notas = new double[4];
		notas[0] = 9.9; 
		notas[1] = 8.7; 
		notas[2] = 7.2; 
		notas[3] = 9.4;

		// array convencional utilizando variavel de controle 'i'
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		// Foreach
		for(double a : notas) {
			System.out.println(a);
		}

	}

}
