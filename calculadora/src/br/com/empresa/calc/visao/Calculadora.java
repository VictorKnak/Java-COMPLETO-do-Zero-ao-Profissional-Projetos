package br.com.empresa.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

/*
 * Esta classe inicializa a aplicação, declara o construtor da classe
 * e inicializa a mesma.
 * */

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);						 // Seta o tamanho da tela
//		setUndecorated(true);                    // Remove a barra de cima
		setTitle("Calculadora");                 // Coloca o nome da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Seta por Default para encerrar a aplicacao sempre que fechar a tela
		setLocationRelativeTo(null);             // Coloca a aplicacao no dentro da tela
		setVisible(true);        				 // ja mostra a tela
		
	}
		
	
	private void organizarLayout() {
		setLayout(new BorderLayout());			// 'BorderLayout' - Organiza a tela conforme pontos cardinais(Norte, Sul, Leste e Oeste)
		
		// cria um objeto do Display na tela
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));   // Define o tamanho do display
		add(display, BorderLayout.NORTH);                  // adiciona o <display> na tela no "NORTE"
		
		Teclado teclado = new Teclado();		
		add(teclado, BorderLayout.CENTER);    // adiciona o <teclado> na tela no "CENTRO"
	
		
	}



	public static void main(String[] args) {
		new Calculadora();			// Executa a aplicação
	}
	
}
