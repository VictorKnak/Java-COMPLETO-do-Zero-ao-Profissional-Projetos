package lambdas;

/* Este exemplo foi de uma for tradicional de ser executado */

public class CalculoTeste1 {

	public static void main(String[] args) {

		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		// Como o Somar e Multiplicar implementam a mesma interface, pode ser aprovaitado o polimorfismo
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));

	}

}
