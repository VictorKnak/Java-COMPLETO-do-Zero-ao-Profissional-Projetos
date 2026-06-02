package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// forma pos-fixada
		a++;	// a = a + 1
		a--;	// a = a - 1

		// forma pre-fixada
		++b;	// b = b + 1
		--b;	// b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		/* pre-fixado tem precedencia para comparacao, neste caso ele soma o 'a' antes de comparar
		 * e depois de comparar ele decrementa o 'b'. Entao neste caso retorna true
		 */
		System.out.println( ++a == b--);
		
		
	}

}
