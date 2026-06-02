package oo.heranca;

/*
 * Exemplo de Herança da classe Jogador
 * */
public class Heroi extends Jogador{

	/* Como na classe pai possui um contrutor, 
	 * a classe filha brigatoriamente deve chamar 
	 * este construtor explicitamente*/
	public Heroi(int x, int y) {
		super(x, y);
	}

	// Subscricao do metodo da classe Jogador
	@Override
	public boolean atacar(Jogador oponente) {
		
		// chama 3x a classe pai(superclasse) para dar dano de 20 na vida
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
	
}
