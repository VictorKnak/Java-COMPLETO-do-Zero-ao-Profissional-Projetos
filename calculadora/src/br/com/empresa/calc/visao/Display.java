package br.com.empresa.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private JLabel label;
	
	// Construtor
	public Display() {
		setBackground(new Color(46, 49 ,50));				 // Seta a cor do display
		label = new JLabel("123,45");   					 // Estancia o Label
		label.setForeground(Color.WHITE);           		 // Seta a cor da Fonte
		label.setFont(new Font("corier", Font.PLAIN, 30));   // Seta o tamanho e estilo da fonte
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20)); // 'FlowLayout' - Gerenciador de Layout
		add(label);											 // Adiciona o Display na telaa
	}
	
	
}
