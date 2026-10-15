package br.com.minhaempresa.campominado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

	private int qtdLinhas;
	private int qtdColunas;
	private int qtdMinas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	// Lista de observadores
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
	
	// Construtor
	public Tabuleiro(int qtdLinhas, int qtdColunas, int qtdMinas) {
		this.qtdLinhas = qtdLinhas;
		this.qtdColunas = qtdColunas;
		this.qtdMinas = qtdMinas;
		
		gerarCampo();
		associarVizinhos();
		sortearMinas();		
	}
	
	// Registra os observadores na lista
	public void registrarObservador(Consumer<ResultadoEvento> observador){
		observadores.add(observador);		
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));  // Adiciona o resultado usando accept
	}
	
	
	public void abrir(int linha, int coluna) {				
		campos
		.stream()
		.filter(c -> c.getLinha() == linha && c.getColuna() == coluna) // filtra a linha e coluna passadas
		.findFirst()                                                  // pega o primeiro elemento
		.ifPresent(c -> c.abrir());
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
				
				// Cria um Objeto campo e adiciona no campo criado no observador
				Campo campo = new Campo( l , c);
				campo.registrarObservador(this);   // Coloca a estancia atual como observador para todos os campos criados
				campos.add(campo);
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
	
	@Override
	public void eventoOcorreu(Campo c, CampoEvento e) {
		
		if (e == CampoEvento.EXPLODIR) {
//			System.out.println("perdeu");
			mostrarMinas();
			notificarObservadores(false);
			
		} else if (objetivoAlcancado()) {
//			System.out.println("Ganhemo");
			notificarObservadores(true);
		} 
		
	}
		
	private void mostrarMinas() {		
		campos.stream()
		.filter(c -> c.isMinado())          // filtra pelos campos minhados
		.forEach(c -> c.setAberto(true));			
	}
			
	
}
