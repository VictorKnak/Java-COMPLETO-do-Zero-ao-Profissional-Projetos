package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		// Cria o Objeto Scanner para receber a entrada
		Scanner entrada = new Scanner(System.in);

		// Pede ao usuario que digite os 3 valores
		System.out.println("Digite o primeiro valor de Salário:");
		String valor1 = entrada.nextLine();
		System.out.println("Digite o segundo valor de Salário:");
		String valor2 = entrada.nextLine();
		System.out.println("Digite o terceiro valor de Salário:");
		String valor3 = entrada.nextLine();
		
		// Remove a virgula e troca por ponto se precisar
		valor1 = valor1.replace(",", ".");
		valor2 = valor2.replace(",", ".");
		valor3 = valor3.replace(",", ".");

		// Transforma String em numerico
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		double num3 = Double.parseDouble(valor3);

		// Imprime no console
		System.out.printf("\nPrimeiro Salário.......R$%.2f %n", num1);
		System.out.printf("Segundo Salário........R$%.2f %n", num2);
		System.out.printf("Terceiro Salário.......R$%.2f %n", num3);		
		System.out.printf("\nMédia total dos salários......R$%.2f", (num1+num2+num3) /3 );

		// Fecha o Scanner
		entrada.close();
	}

}
