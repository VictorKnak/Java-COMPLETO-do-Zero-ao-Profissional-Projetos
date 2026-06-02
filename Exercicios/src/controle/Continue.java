package controle;


/*
 * Continue:
 * 
 * Continue é usado em um loop para alterar o fluxo 
 * dentro de um loop.
 * 
 * Seria o mesmo conceito de utilizar o loop do Corebuilder 
 * */


public class Continue {

	public static void main(String[] args) {
		
		
		for( int i = 0; i < 10 ; i++) {
			
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println("i => " + i);			
		}
		System.out.println("Fim da execução.");		

	}

}
