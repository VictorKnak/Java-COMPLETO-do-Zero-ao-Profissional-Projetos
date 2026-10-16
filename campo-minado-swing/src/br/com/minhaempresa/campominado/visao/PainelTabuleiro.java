package br.com.minhaempresa.campominado.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.minhaempresa.campominado.modelo.Tabuleiro;

/*
 * Biblioteca 'JPanel' é um container(agrupador) de componentes
 * */

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
	
		// 'setLayout'  - Seta e Organiza os componentes na tela
		// 'GridLayout' - Organiza em forma de grid, com linhas e colunas
		setLayout(new GridLayout(tabuleiro.getQtdLinhas(), tabuleiro.getQtdColunas()));

		// TESTE REALIZADO PARA POPULAR A AREA DO TABULEIRO
		/* pega o tamanho total da area do tabuleiro */
//		int total = tabuleiro.getQtdLinhas() * tabuleiro.getQtdColunas();
		
		/* Realiza um for para o tamanho total da area do tabuleiro e 
		 * adiciona os botoes em toda a area calculada */
//		for (int i = 0; i < total; i++) {
//			add(new BotaoCampo(null));
//		}
		
		// Adiciona o botao com o campo 
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		
		tabuleiro.registrarObservador(e -> {
			// TODO mostrar resultado par ao usuario
		});
		
	}
	
	
}
