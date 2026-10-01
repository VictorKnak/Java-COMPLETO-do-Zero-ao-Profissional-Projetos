package br.com.minhaempresa.campominado;

import br.com.minhaempresa.campominado.modelo.Tabuleiro;
import br.com.minhaempresa.campominado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		// cria um tabuleiro
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		
		// Teste para ver se esta funcionando o jogo corretamente
//		tabuleiro.abrir(3, 3);
//		tabuleiro.alternaMarcacao(4, 4);
//		tabuleiro.alternaMarcacao(4, 5);
//		System.out.println(tabuleiro);	// Printa o tabuleiro no console
		
		// Cria um Objeto para printar o Tabuleiro no console
		new TabuleiroConsole(tabuleiro);
		
	}

}
