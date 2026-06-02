package oo.heranca.desafio.carro;


// Classe generica
public class Carro {
	
	final int VELOCIDADE_MAXIMA;    // constante
	int velocidade;
		
	// Construtor personalizado da classe pai - So pode ser acessado por herança(encapsulamento)
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	// Todos podem acessar
	public void acelerar() {
		velocidade += 5;
		
		// Se a velocidade atual do carro ultrapasasr a maxima, coloca a maxima
		if( velocidade + 5 > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}
		
	}

	public void frear() {				
		velocidade -= 5;		
		velocidade = velocidade > 0 ? velocidade : 0 ;  // operador ternario, se for menor ou igual a zero recebe zero		
	}

	public int velocidadeAtual() {		
		return velocidade;		
	}
	
}
