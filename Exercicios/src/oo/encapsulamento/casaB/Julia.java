package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {
		
		Ana sogra = new Ana();		
//		System.out.println(sogra.segredo);		     // nao consegue acessar por eh um atributo privado
//		System.out.println(sogra.facoDentroDeCasa);  // Default - Packege, só eh visivel no mesmo pacote
//		System.out.println(sogra.formaDeFalar);      // Protected - Consegue acessar diretamente pois eh por Herança
		System.out.println(sogra.todosSabem);        // Public - todos conseguem acessar
		
	}
	
}
