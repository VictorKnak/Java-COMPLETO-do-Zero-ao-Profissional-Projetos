package fundamentos;

import javax.swing.JOptionPane;  // Biblioteca para Telas(Dialogos)

public class ConversaoStringNumero {

	public static void main(String[] args) {

		// Abre dois dialogos para que o usuario digite algo
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		// Imprime o valor das String's concatenadas
		System.out.println(valor1 + valor2);
		
		// Transforma Numerico em String
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.printf("Soma é: %.0f %n%n", soma);		
		System.out.printf("A média é: %.2f", soma/2);
		
		
		

	}

}
