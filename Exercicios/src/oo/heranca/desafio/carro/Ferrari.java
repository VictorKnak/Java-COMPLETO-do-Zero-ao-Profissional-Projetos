package oo.heranca.desafio.carro;

import oo.heranca.desafio.carro.intefacce.Esportivo;
import oo.heranca.desafio.carro.intefacce.Luxo;

// Herda da classe generica
public class Ferrari extends Carro implements Esportivo, Luxo{

	// Construtor personalizado pra antender o construtor da classe pai
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	// Subscrevendo a classe pai, referenciando a superclasse
	@Override
	public void acelerar() {
		velocidade += 10;
		
		// Se a velocidade atual do carro ultrapasasr a maxima, coloca a maxima
		if( velocidade > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}
	}

	// Metodo de Interface(obrigatorio implementar por causa da interface)
	@Override
	public void ligarTurbo() {
		velocidade += 32;
	}
	// Metodo de Interface(obrigatorio implementar por causa da interface)
	@Override
	public void desligarTurbo() {
		velocidade += 10;
	}

	// Metodo de Interface(obrigatorio implementar por causa da interface)	
	@Override
	public void ligarAr() {
		
	}

	// Metodo de Interface(obrigatorio implementar por causa da interface)	
	@Override
	public void desligarAr() {
		
	}
	
}
