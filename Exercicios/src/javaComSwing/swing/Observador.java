package javaComSwing.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 'JFrame' eh equivalente a uma janela de navegacao
 * 
 * 
 * */

public class Observador {

	public static void main(String[] args) {
		

		JFrame janela = new JFrame("Observador");
		
		// Operacao padrao de fechamento da janela para matar a aplicacao,
		// o parametro passado no 'Set' eh um inteiro, mas o JFrame possui
		// constantes com as numeracoes corretas de cada Operacao.
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// tamanho da janela
		janela.setSize(600,200);
		
		// 'setLayout' - Define o gerenciamento do Layout, como os componentes serao posicionados
		// 'FlowLayout' - Gerenciamento mais simples, em uma forma linear dentro da janela, como se fosse escrita
		janela.setLayout(new FlowLayout());
		
		// Parametro 'null' Centraliza a janela na tela do PC, caso deseje centralizar em outra tela
		// devera passar como parametro a tela.
		janela.setLocationRelativeTo(null); 
		
		// Cria um botao na janela
		JButton botao = new JButton("Clicar");
				
		// Dimencao do botao
		botao.setPreferredSize(new Dimension(120, 20));
		
		janela.add(botao);
		
		// Adiciona uma acao no botao que passa no parametro uma interface de acao, ou um metodo funcional
		botao.addActionListener(e -> {
			System.out.println("Evento Ocorreu");
		});
		
		janela.setVisible(true);
		
	}
	
}
