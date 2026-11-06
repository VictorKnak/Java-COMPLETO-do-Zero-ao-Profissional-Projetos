package br.com.empresa.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.empresa.calc.modelo.Memoria;
import br.com.empresa.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{

	private JLabel label;
	
	// Construtor
	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);           // adiciona o display como observador
		
		setBackground(new Color(46, 49 ,50));				        // Seta a cor do display
		label = new JLabel(Memoria.getInstancia().getTextoAtual()); // Estancia o Label
		label.setForeground(Color.WHITE);           		        // Seta a cor da Fonte
		label.setFont(new Font("corier", Font.PLAIN, 30));          // Seta o tamanho e estilo da fonte
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));         // 'FlowLayout' - Gerenciador de Layout
		add(label);											        // Adiciona o Display na telaa
	}
	
	
	@Override
	public void valorAlterado(String novoValor) {	
		label.setText(novoValor);      // set o valor do label no display
	}
	
	
	
}
