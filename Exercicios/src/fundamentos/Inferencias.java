package fundamentos;

/*
 * Inferencia de Tipos no Java:
 * 
 * Significa que a linguagem pode interpretar o tipo
 * de dado que irá ficar dentro dela automaticamente,
 * sem precisar que o tipo de variavel seja informada
 * explicitamente, da mesma forma que funciona o Python,
 * JavaScript, Corebuilder etc.
 * 
 * Mas para isso precisa-se colocar que o tipo da variavel
 * seja 'var'.
 * 
 * Apartir do momento que a variavel eh carregada com o tipo 
 * da variavel, este tipo nao pode ser mais mudado.
 * Ex: var teste = 4.5;  -> Double
 *     teste = "Texto";  -> Causara ERRO 
 * 
 * Outra observacao a se fazer, eh que ao utilizar a 
 * INFERENCIA no Java, obrigatoriamente ela devera ser 
 * inicializada, nao podendo ser declarada para depois 
 * nas linhas abaixo ser inicializada. 
 * 
 * */


public class Inferencias {

	public static void main(String[] args) {

		double a = 4.5;		
		System.out.println(a);
		
		// Inferencia de tipo de variavel, interpreta que é um double
		var b = 4.5;
		System.out.println("Inferencia -> " + b);
		
		// Aqui nesta linha vai dar erro
		// b = "texto"; 
		System.out.println(b);

		// Variaveis de valor inteiro nao podem receber Double
		// mas variaveis Double podem receber valor inteiro
		var f = 12; // inteiro
		// f = 12.5;   // double -> Da erro ERRO
		System.out.println(f);
		
		var g = 12.5;
		g = 12;
		System.out.println(g);
	}

}
