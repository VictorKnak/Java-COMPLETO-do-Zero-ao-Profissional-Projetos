package br.com.minhaempresa.campominado.visao;

import br.com.minhaempresa.campominado.modelo.Tabuleiro;

public class temp {

	public static void main(String[] args) {


		Tabuleiro tabuleiro = new Tabuleiro(3,3,9);
		
		tabuleiro.registrarObservador(e -> {
			if (e.isGanhou()) {
				System.out.println("Ganhou.");
			}else {
				System.out.println("Perdeu.");				
			}				
				
		});
		
		tabuleiro.alternaMarcacao(0, 0);
		tabuleiro.alternaMarcacao(0, 1);
		tabuleiro.alternaMarcacao(0, 2);
		
		tabuleiro.alternaMarcacao(1, 0);
		tabuleiro.alternaMarcacao(1, 1);
		tabuleiro.alternaMarcacao(1, 2);
		
		tabuleiro.alternaMarcacao(2, 0);
		tabuleiro.alternaMarcacao(2, 1);		
		tabuleiro.alternaMarcacao(2, 2);
		

	}

}
