package br.com.empresa.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	// Construtor
	public Botao(String texto, Color cor) {
		setText(texto);                              			// Seta o Texto no botao
		setFont(new Font("corier", Font.PLAIN, 25)); 			// Seta estilo e tamanho da fronte
		setOpaque(true);                             			// Ativa a opacidade no botao para colocar a cor
		setBackground(cor);                          			// Seta a cor do botao
		setForeground(Color.WHITE);                             // Seta a cor do caracter do bota
		setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Seta a borda do botao		
		
	}
	
	
}
