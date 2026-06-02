package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
		Ana mae = new Ana();		
//		System.out.println(mae.segredo);		   // nao consegue acessar por eh um atributo privado
//		System.out.println(mae.facoDentroDeCasa);  // Default - Packege, só eh visivel no mesmo pacote
		System.out.println(formaDeFalar);          // Protected - Consegue acessar diretamente pois eh por Herança
		System.out.println(mae.todosSabem);        // Public - todos conseguem acessar
	
	}

}
