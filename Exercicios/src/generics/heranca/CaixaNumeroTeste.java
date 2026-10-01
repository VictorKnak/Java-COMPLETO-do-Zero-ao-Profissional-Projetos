package generics.heranca;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.setGuardar(2.5);
		System.out.println(caixaA.getAbri());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.setGuardar(5);
		System.out.println(caixaB.getAbri());

	}

}
