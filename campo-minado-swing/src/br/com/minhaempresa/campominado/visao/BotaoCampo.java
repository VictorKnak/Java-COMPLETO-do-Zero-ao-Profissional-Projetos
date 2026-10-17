package br.com.minhaempresa.campominado.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.minhaempresa.campominado.modelo.Campo;
import br.com.minhaempresa.campominado.modelo.CampoEvento;
import br.com.minhaempresa.campominado.modelo.CampoObservador;

/*
 * Classe BotaoCampo estende a JButton para criar e manipular os botoes da tela
 * e também implmenta a Interface CampoObservador para notificar e ser notificada de cada 
 * alteracao que ocorrer no BotaoCampo
 * */


@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {

	// Seta as cores do bota
	private final Color BG_PADRAO   = new Color(184 , 184 , 184 );
	private final Color BG_MARCAR   = new Color(  8 , 179 , 247 );
	private final Color BG_EXPLODIR = new Color(189 ,  66 ,  68 );
	private final Color TEXTO_VERDE = new Color(  0 , 100 ,   0 );
	
	private Campo campo;		// Define o atributo da classe
	
	// Construtor do botao que recebe um campo no parametro
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);                        // Seta a cor do background
		setBorder(BorderFactory.createBevelBorder(0));   // Seta o estilo da borda do botao
		
		addMouseListener(this);                          // Registra a classe como interessada em cada evento do mouse
		campo.registrarObservador(this);                 // Registra a classe como interessada em cada evento do campo
	}

	// Implementa o metodo Observer
	@Override
	public void eventoOcorreu(Campo c, CampoEvento e) {
		
		switch(e) {		
			case ABRIR:
				aplicarEstiloAbrir();
				break;
				
			case MARCAR:
				aplicarEstiloMarcar();
				break;
				
			case EXPLODIR:
				aplicarEstiloExplodir();
				break;
				
			default:
				aplicarEstiloPadrao();
		
		}
	}

	private void aplicarEstiloPadrao() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloExplodir() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloMarcar() {
		// TODO Auto-generated method stub
		
	}

	private void aplicarEstiloAbrir() {

		setBackground(BG_PADRAO);                                 // Seta a cor do background
		setBorder(BorderFactory.createLineBorder(Color.GRAY));    // Seta a cor da borda
		
		// case que verifica a quantidade de minas na vizinhanca e seta a cor do campo
		switch (campo.minasNaVizinhanca()) {
			case 1:
				setForeground(TEXTO_VERDE);
				break;
				
			case 2:
				setForeground(Color.BLUE);
				break;
	
			case 3:
				setForeground(Color.YELLOW);
				break;
				
			case 4:
			case 5:
			case 6:
				setForeground(Color.RED);
				break;
				
			default:
				setForeground(Color.PINK);
				break;
		}
		
		// Se a vizinhanca nao for segura, coloca seta a quantidade de minas no botao
		String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() + "" : "";		
		setText(valor);
		
	}

	
	
	// Interface dos Eventos do Mouse Obriga a implementar todos estes 5 metodos para funcionar
	// mesmo que não vá utilizar todos os metodos
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// verifica qual botao esta sendo precionado do mouse
		if (e.getButton() == 1) {
			campo.abrir();
			
		} else {
			campo.alternaMarcacao();
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

	
	
}
