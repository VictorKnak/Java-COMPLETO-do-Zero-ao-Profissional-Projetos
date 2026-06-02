package oo.abstrato;

/* Classes abstratas não pode ser estanciadas elas 
 * somente podem ser herdadas por outras classes.
 * 
 * Classes abstratas nao precisam ter corpo(metodos).
 * */

public abstract class Mamiferos extends Animal{

	// subscricao do metodo abstrato da classe extendida 'Animal'
//	@Override
//	public String mover() {	
//		return "Usando as patas.";
//	}
	
	// metodo abstrato
	public abstract String mamar();
	
}
