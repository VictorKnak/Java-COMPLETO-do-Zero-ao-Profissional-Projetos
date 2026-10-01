package generics.heranca;

public class CaixaIntTeste {

	public static void main(String[] args) {

		CaixaInt caixaA = new CaixaInt();
		caixaA.setGuardar(132);
		
		Integer coisaA = caixaA.getAbri();
		System.out.println(coisaA);
		

	}

}
