package fundamentos;

import java.util.Scanner;      // importa clase scanner

/*
 * Scanner:
 * .nextLine() -> Captura String
 * .nextInt()  -> Captura inteiro(utilizar .nextLine() apos para capturar a quebra de linha '\n')
 * .close()    -> Faz o fechamento do Scanner para liberar recursos
 * */

public class Console {

	public static void main(String[] args) {
 
		// nao utilizando o 'println' ele nao da a quebra 
		// de minha ao final para imprimir uma nova linha  
		System.out.print("Bom");
		System.out.print(" dia!");

		System.out.println("Bom");
		System.out.println("dia!");
		
		// String formatada (verificar comandos no arquivo TipoString)
		System.out.printf("MegaSena: %d %d %d %d %d %n", 1,2,3,4,5);
		System.out.printf("Salario: %.1f %n%n", 123456.448845215);		
		System.out.println("---------------------------------------\n\n");
		
		/* Scanner serve para capturar dados, por padrao deve ser utilizado o 'System.in'
		   para capturar a entrada do teclado no sistema, diferente do 'System.out' que eh a saida.
		   Da mesma forma que esta utilizando o Scanner para capturar dados do teclado, podesse utilizar
		   para capturar dados de um arquivo por exemplo. */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		// nextLine aguarda o usuario digitar algo e ate que se fassa isso, o programa fica aguardando.
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		/* Neste caso, como eh inteiro, deve ser usado o nextInt para capturar o proximo inteiro 
		 * e logo apos deve ser utilizado o nextLine() para capturar a quebra de linha, como com o 
		 * nexInt(), por ser inteiro, o java nao coloca o \n ao final para quebra de linha */		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite algo:");
		String algo = entrada.nextLine();
				
		
		System.out.printf("\n\nNome digitado = %s %s %n", nome, sobrenome );
		System.out.printf("Idade digitada = %d anos %n", idade);
		System.out.printf("Voce digitou algo = %s", algo);
		
		// Faz o fechamento do Scanner ao final para liberar os recursos da maquina
		entrada.close();
		
		
		
		
	}

}
