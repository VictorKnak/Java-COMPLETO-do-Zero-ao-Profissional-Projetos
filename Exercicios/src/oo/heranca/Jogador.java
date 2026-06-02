package oo.heranca;


public class Jogador {

	public int vida = 100;		// seta valor da vida
	public int x; 				// posicao 
	public int y; 				// posicao 


	/* Contrutor PADRAO por conta que no Monstro
	 * nao foi criado o construtor com parametros.
	 * Este construtor PADRAO, chama o Personalizado
	 * da prooria clase por conta do 'this'passado 
	 * os valores (0,0) por parametro*/
	public Jogador() {
		this(0,0);
	}
	
	// Construtor Personalizado
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// faz o ataque no outro oponente
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)){
			oponente.vida -= 10;
			return true;			
		} else {
			return false;			
		}		
	}
	
	// Medotodo para o jogador andar
	public boolean andar(Direcao direcao) {
		
		switch(direcao) {
		case NORTE:
			y--;
			break;
			
		case LESTE:
			x++;
			break;
		
		case SUL:
			y++;
			break;
		
		case OESTE:
			x--;
			break;		
		}				
		return true;
	}
	
}
