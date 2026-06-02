package controle;


/*
 * Mesmo conceito do 'BreakRotulado'.
 * 
 * --> Lembrando que este exemplo não é muito utilizado como boa prática.
 * 
 * A utilização do 'Rotulos' vem do conceito de identificador.
 * 
 * No exemplo abaixo, foi utilizado o nome 'externo' para identificar
 * o 'for' mais por fora da execucao.
 * Como isso ao utilizar o 'continue', nos permite explicitamente identificar
 * qual loop deverá continuar e execução para o proximo laço. 
 * */

public class ContinueRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
//					continue;				
					continue externo;				
				}
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim da execução");
		
	}

}
