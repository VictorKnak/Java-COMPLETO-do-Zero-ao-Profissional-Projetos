package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b;	// c = c + b;	// Adicao
		c -= a; // c = c - a;	// Subtracao
		c *= b; // c = c * b;	// Multiplicacao
		c /= a; // c = c / a;	// Divisao
		
		System.out.println(c);
		
		c %= 2;	// c = c % 2;   // Modulo
		System.out.println(c);
	}

}
