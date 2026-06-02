package oo.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {
		
		Ana esposa = new Ana();		
//		System.out.println(esposa.segredo);		      // nao consegue acessar por eh um atributo privado
		System.out.println(esposa.facoDentroDeCasa);  // Default - Packege
		System.out.println(esposa.formaDeFalar);      // Protected	
		System.out.println(esposa.todosSabem);        // Public			
	}
	
}
