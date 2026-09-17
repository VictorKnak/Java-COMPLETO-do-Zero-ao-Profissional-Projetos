package excecao;

import java.util.Scanner;

/*
 * O bloco 'finally' sempre seja executado indepentende de deu erro ou nao na execucao do metodo.
 * Ele serve para finalizar a execucao de todo o bloco.
 * É excelente para fechar a conexao com o banco de dados caso ocorra algum erro, ou finalizar algum 
 * consumo de servico por exemplo.
 * 
 * */

public class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		try {			
			System.out.println( 7 / entrada.nextInt());
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		// Finaliza o bloco da tentativa do try	
		} finally {
			entrada.close();
			System.out.println("Recurso fechado...");
			
		}

		System.out.println("Fim!");
	}

}
