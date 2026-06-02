package oo.polimorfismo;

/* Classes abstratas não pode ser estanciadas elas 
 * somente podem ser herdadas por outras classes.
 * */

public abstract class Comida {
	
	private double peso;
	
	// contrutor
	public Comida(double peso) {
		setPeso(peso);
	}
	
	// Getter
	public double getPeso() {
		return peso;
	}

	// Setter
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;			
		}
	}
	
	
}
