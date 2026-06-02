package controle;


/*
 * Break:
 * 
 * Interrompe a iteração de um laço 'for'
 * como se fosse o 'exit' do Corebuilder
 * */

public class Break {

	public static void main(String[] args) {

		for( int i = 0; i < 10 ; i++) {
			
			if(i == 5) {
				break;
			}
			
			System.out.println("i => " + i);			
		}
		System.out.println("Fim da execução.");			

	}

}
