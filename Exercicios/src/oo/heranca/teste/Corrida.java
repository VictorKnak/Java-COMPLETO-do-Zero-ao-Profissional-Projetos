package oo.heranca.teste;

import oo.heranca.desafio.carro.Carro;
import oo.heranca.desafio.carro.Ferrari;
import oo.heranca.desafio.carro.Fusca;

public class Corrida {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari(100);   	// Pra utilizar metodos de interface precisa estanciar o objeto mais especifico no caso a Ferrari
		Carro fusca = new Fusca();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.ligarTurbo();    // utiliza metodo de interface
		System.out.println("Ferrari acelerando=> " + ferrari.velocidadeAtual());
		
		System.out.println("Ferrari velocidadeDoAr=> " + ferrari.velocidadeDoAr());
		
		ferrari.frear();
		System.out.println("Ferrari freando => " + ferrari.velocidadeAtual());
		
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		System.out.println("Fusca acelerando=> " + fusca.velocidadeAtual());
		
		fusca.frear();
		fusca.frear();
		fusca.frear();
		System.out.println("Fusca freando=> " + fusca.velocidadeAtual());
	}

}
