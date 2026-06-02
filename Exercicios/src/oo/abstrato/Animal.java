package oo.abstrato;

/* Classes abstratas não pode ser estanciadas, elas 
 * somente podem ser herdadas por outras classes.
 */

public abstract class Animal {

	public String respirar() {
		return "Usando Oxigênio.";
	}
	
	// metodo abstrato
	public abstract String mover();
}
