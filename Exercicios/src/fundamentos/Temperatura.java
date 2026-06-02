package fundamentos;

/*
 * Desafio:
 * Converter Fahrenheit em Celsius
 * */
public class Temperatura {

	public static void main(String[] args) {
		// Exemplo da formula
		//(Fº - 32) * 5/9 = Cº
		
		double temp = 86;   // temperatura
		double result = 0;
		
		// Constantes por convesao precisam ser em maiusculas
		final int AUX1 = 32;
		final double AUX2 = 5.0/9.0;
		
		// Calculo
		result = (temp - AUX1) * AUX2;
		
		System.out.println("A temperatura é " + result + " Cº");
				
	}	
}
