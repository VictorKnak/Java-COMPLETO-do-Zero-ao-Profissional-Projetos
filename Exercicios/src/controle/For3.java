package controle;


/*
 * Exemplo de 'for' aninhado:
 *   Quando a variavel eh definida dentro do 'for', ela fica 
 *   restrita a ser utilizada dentro do operador, nao podendo
 *   ser chamada depois do operador finalizar.
 *
 * */

public class For3 {

	public static void main(String[] args) {


		for(int x = 0; x < 10; x++) {
			
			for(int y = 0; y < 10; y++) {				
				System.out.printf("[ %d %d ]", x , y);				
			}
			
			System.out.println(); // faz a quebra de linha
		}
		
		System.out.println("Finalizado...");

	}

}
