package fundamentos.operadores;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {

		// Trabalho na terça
		// Trabalho na quinta
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;       // AND
		boolean comprouSorvete = trabalho1 || trabalho2;    // OR
		boolean comprouTV32 = trabalho1 ^ trabalho2;        // XOR (OU exclusivo)
		
		// Operador Unario
		boolean maisSaudavel = !comprouSorvete;             // NOT
		
		System.out.println("Comprou TV 50\"? " + comprouTV50 );
		System.out.println("Comprou TV 32\"? " + comprouTV32 );
		System.out.println("Comprou Sorvete? " + comprouSorvete );
		System.out.println("Mais Saudável? " + maisSaudavel);

	}
}
