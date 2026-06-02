package oo.abstrato;

public class Cachorro extends Mamiferos {
	
	// metodo abstrato herdado da classe Mamifero->Animal.
	// deve ser implementado obrigatoriamente.
	@Override
	public String mover() {
		return "Usando as patas.";
	}
		
	// metodo abstrato obrigatoriamente deve ser implementado por conta da classe extendida.
	@Override
	public String mamar() {
		return "Com a boca.";
	}
}
