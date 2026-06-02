package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {


		var x = 34.56;		// Inferencia
		double y = 2.2;		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		// Operacoes com inteiro, resultam em inteiro, a nao ser que faca um Cast
		int a = 8;
		double b = 3;		
		System.out.println("\n" + a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b);   // cast
		
		
		// Modulo(resto da divisao)
		System.out.println("\nModulo => "+ 8 % 3);
		
		

	}

}
