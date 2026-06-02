package controle;


/*
 * Desafio de Bug:
 * 
 * A impressao das linhas ocorre pois tem um ponto e virgula 
 * depois da comparacao, e o ';' determina a finalizacao de 
 * uma sentenca de codigo. Ou seja, apos a finalizacao da 
 * sentenca, o proximo bloco com as strings sao impressas
 * sem qualquer condicional atrelada a elas, entao praticamente 
 * a primeira sentenca finalizada em ';' nao possui nada dentro dela.
 * 
 * Para melhor verificacao pode ser usada a 
 * formatacao automatica do eclipse no ( Ctrl+Shift+F )
 * 
 * */


public class DesafioIf {

	public static void main(String[] args) {	
		
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");

		}

	}

}
