package br.com.minhaempresa.campominado.visao;

import javax.swing.JFrame;

import br.com.minhaempresa.campominado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	// Seta o tamanho da tela diretamente no construtor da classe com os metodos herdados do JFrame
	public TelaPrincipal() {
		
		// Estancia um tabuleiro
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		
		// Cria o painel tabuleiro
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		
		// adiciona o painel criado na tela
		add(painelTabuleiro);
		
		setTitle("Campo minado");
		setSize(690, 438);                            // tamanho da tela
		setLocationRelativeTo(null);                  // centraliza no meio do monitor
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   // Encerra o processo ao fechar
		setVisible(true);                             // ativa a tela
		
	}
	
	
	public static void main(String[] args) {

		// cria a tela principal
		new TelaPrincipal();

	}

}
