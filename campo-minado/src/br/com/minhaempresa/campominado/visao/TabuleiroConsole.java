package br.com.minhaempresa.campominado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.minhaempresa.campominado.excecao.ExplosaoException;
import br.com.minhaempresa.campominado.excecao.SairException;
import br.com.minhaempresa.campominado.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	// Construtor
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {

		try {
			
			boolean continuar = true;
		
			while(continuar) {
			
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");				
				String resposta = entrada.nextLine();
				
				// Testa a Responsta para continuar ou sair do jogo
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}			
			
		} catch (SairException e) {
			System.out.println("Bye-bye!");
			
		} finally {
			entrada.close();   // fecha o Scanner
		}
		
	}

	private void cicloDoJogo() {

		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());  // mostra o tabuleiro
				
				String digitado = capturarValorDigitado("Digite (linha, coluna):");
				
				// transforma o que foi digitado em uma array de string e 
				// depois mapeia para transformar em numerico
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
											 .map(e -> Integer.parseInt(e.trim())).iterator();

				// Testa os dois numeros digitados
//				System.out.println(xy.next());
//				System.out.println(xy.next());
				
				
				digitado = capturarValorDigitado("[1]-Abrir ou [2]-(Des)Marcar");
				
				// testa as opcoes digitadas
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
					
				} else if("2".equals(digitado)){
					tabuleiro.alternaMarcacao(xy.next(), xy.next());					
				}				
				
			}
			
			System.out.println("Você ganhou!");			
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você explodiu!");
		}		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		// testa se o usuario quer Sair da partida e joga a execao
		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;		
	}
	
	
}










