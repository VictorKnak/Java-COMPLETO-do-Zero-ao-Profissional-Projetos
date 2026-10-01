package br.com.minhaempresa.campominado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.minhaempresa.campominado.excecao.ExplosaoException;

public class Tabuleiro {

	private int qtdLinhas;
	private int qtdColunas;
	private int qtdMinas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	// Construtor
	public Tabuleiro(int qtdLinhas, int qtdColunas, int qtdMinas) {
		this.qtdLinhas = qtdLinhas;
		this.qtdColunas = qtdColunas;
		this.qtdMinas = qtdMinas;
		
		gerarCampo();
		associarVizinhos();
		sortearMinas();		
	}
	
	public void abrir(int linha, int coluna) {
		
		try {			
			campos
			.stream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna) // filtra a linha e coluna passadas
			.findFirst()                                                  // pega o primeiro elemento
			.ifPresent(c -> c.abrir());
			
		} catch(ExplosaoException e){
			
			// trata para abrir todos os campos quando achar uma bomba
			campos.forEach(c -> c.setAberto(true));			
			throw e;  // lanca excecao depois do tratamento
		}
	}
	
	public void alternaMarcacao(int linha, int coluna) {		
		campos
		.stream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna) // filtra a linha e coluna passadas
		.findFirst()                                                  // pega o primeiro elemento
		.ifPresent(c -> c.alternaMarcacao());
	}


	private void gerarCampo() {
		
		// percorre a quantidade de linhas
		for (int l = 0; l < qtdLinhas; l++) {
			
			// Percorre a quantidade de colunas
			for (int c = 0; c < qtdColunas; c++) {
				
				// Cria um Objeto com cada linha e coluna e add dentro da lista
				campos.add(new Campo(l, c));
			}			
		}
	}
	
	// Identifica se a posicao do campo eh vizinho ou nao 
	private void associarVizinhos() {

		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();   // Filtra a quantidade de minas armadas
		
		do {
			
			// Gera uma posicao aleatoria dentro do array para adicionar ao mina e faz um cast
			int aleratorio = (int) (Math.random() * campos.size());
			
			// pega a posicao e mina ela 
			campos.get(aleratorio).minar();
			
			// verifica quantas minhas estao armadas
			minasArmadas = campos
							.stream()
							.filter(minado)
							.count();
			
		} while (minasArmadas < qtdMinas);
		
	}
	
	// Verifica se todos os campos seguros foram abertos
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	// reinicia o jogo
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
	
		// StringBuilder eh utilizado quando tem um grande volume de concatenacoes
		StringBuilder sb = new StringBuilder();
		
		sb.append("  ");
		for (int c= 0; c < qtdColunas; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}
		sb.append("\n");
		
		int i = 0;
		for (int l = 0; l < qtdLinhas; l++) {
			sb.append(l);
			sb.append(" ");
			
			for (int c = 0; c < qtdColunas; c++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
			
		}		
		
		return sb.toString();		
		
	}
	
	
}
