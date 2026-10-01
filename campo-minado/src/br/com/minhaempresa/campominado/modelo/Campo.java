package br.com.minhaempresa.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.minhaempresa.campominado.excecao.ExplosaoException;

public class Campo {
	
	private final int linha;      // constante
	private final int coluna;     // constante
	
	// variaveis de acao do campo
	private boolean aberto = false; 
	private boolean minado = false;
	private boolean marcado = false;
	
	// Lista de Objetos do tipo Campo da classe para os vizinhos que forem inseridos
	private List<Campo> vizinhos = new ArrayList<Campo>();

	
	// Construtor privado da classe passando as constantes
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}

	// Metodo que retorna um boolean para indicar se adicionou o vizinho ou nao
	boolean adicionarVizinho(Campo vizinho) {
		
		boolean diagonal = false;
		
		// Se a linha e coluna sao diferentes, entao o vizinho esta na diagonal
		if( linha != vizinho.linha && coluna != vizinho.coluna ) {
			diagonal = true;
		}
		
		// Calcula a posicao 
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;
				
		// Verifica se a posicao eh na diagonal ou nao da posicao origem
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;			
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;			
		}else {
			return false;
		}				
	}
	
	// Altera a marcacao do campo
	void alternaMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}
	}
	
	
	// abre o campo
	boolean abrir() {
		
		// campo nao esta aberto e nao estar marcado
		if (!aberto && !marcado) {
			aberto = true;
			
			// verifica se esta minado
			if(minado) {
				throw new ExplosaoException();				
			}
			
			// Verifica se tem minha nos vizinhos e executa o metodo recursivamente ate encontrar uma mina
			if (vizinhancaSegura()) {
				vizinhos.stream().forEach(v -> v.abrir());   // Passa um Consumer por parametro
			}
			
			return true;			
		} else {
			return false;			
		}
		
	}
	
	// Verifica se os campos vizinhos estao minados usando API Stream
	boolean vizinhancaSegura() {
		return vizinhos
				.stream()
				.noneMatch(v -> v.minado);	// Passa um Predicate no parametro, ele retorna true ou false 
	}
	
	// Mina o campo selecionado
	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
		
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !aberto;
	}
	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	// valida se o campo esta protegido ou se ja foi aberto
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;		
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	

	public String toString() {
		
		if (marcado) {
			return "x";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return ".";
		}		
	}
}














