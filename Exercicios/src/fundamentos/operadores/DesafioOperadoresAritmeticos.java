package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		/*** Explicacao de como usar a potenciacao em Java ***/
		int a = 3 * 4 - 10;
		int b =(int) Math.pow(a, 3);  // Eleva a pontencia com a biblioteca Math		
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------\n\n\n");
		
		
		
		System.out.println("Desafio Operadores Aritméticos:");
		double soma1 = Math.pow( 6 * ( 3 + 2 ) , 2 );           // Elevando a potencia ao Quadrado
		int soma2 = 3 * 2;
		
		
		double soma3 = ( 1 - 5 ) * ( 2 - 7 );
		int soma4 = 2;
		
		double result1 = soma1 / soma2;
		double result2 = Math.pow( soma3 / soma4 , 2 );         // Elevando a potencia ao Quadrado
		
//		System.out.println((int) result1);
//		System.out.println((int) result2);
		
		int result3 = (int) Math.pow(result1 - result2, 3);     // Elevando a potencia ao Cubo
		
		int result4 = (int) Math.pow(10, 3); 					// Elevando a potencia ao Cubo
		
		int resultadoFinal = result3 / result4;
		System.out.printf("O resultado final é: %d ", resultadoFinal);
	    
		
		
		
		
		
		
		
	}

}
