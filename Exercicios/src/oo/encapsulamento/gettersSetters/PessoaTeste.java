package oo.encapsulamento.gettersSetters;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro", 30);
		
		p1.setIdade(-10);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);

	}

}
