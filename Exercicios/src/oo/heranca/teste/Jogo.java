package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

/*
 * Exemplo de exercicio para explicar
 * como funciona a Herança e o Enum
 * */


public class Jogo {

	public static void main(String[] args) {

		// Estancia os jogador e seta as posicoes iniciais
		Heroi heroi = new Heroi(10,10);
		Monstro monstro = new Monstro();
		
		// Seta posicoes inicias
		monstro.x = 10;
		monstro.y = 10;
		
		// anda com o jogador 1
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.LESTE);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.LESTE);
		System.out.println("Posicao heroi => " + heroi.x);
		System.out.println("Posicao heroi => " + heroi.y);
		
		// anda com o jogador 2
		monstro.andar(Direcao.NORTE);		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		System.out.println("\nPosicao monstro => " + monstro.x);
		System.out.println("Posicao monstro => " + monstro.y);

		System.out.println("\nVida antes ataque heroi => " + heroi.vida);
		System.out.println("Vida antes ataque monstro => " + monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida depois ataque heroi => " + heroi.vida);
		System.out.println("Vida depois ataque monstro => " + monstro.vida);
		
		
	}

}
