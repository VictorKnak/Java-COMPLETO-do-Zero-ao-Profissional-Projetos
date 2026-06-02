package fundamentos;

/*
 * Tipo String eh um valor imutavel, ou 
 * seja, o valor da String original dela 
 * nao eh alterado. Os metodos utilizados
 * somente retornam uma nova String formatada.
 * 
 * */

public class TipoString {

	public static void main(String[] args) {
		
		// consegue extrair uma letra especifica dentro da string
		System.out.println("olá pessoal".charAt(4));
		
		String teste = "Boa tarde";
		
		// Concatena algum valor
		System.out.println(teste.concat("!!!"));
		System.out.println(teste + "!!!");
		
		// Retorna se a Strig inicia com determinado valor
		System.out.println("Inicia com | .startsWith() => " + teste.startsWith("B"));
		System.out.println("Inicia com | .toLowerCase().startsWith() => " + teste.toLowerCase().startsWith("b"));  // coloca em minusculo para comparar
		
		// Termina com
		System.out.println("Termina com | .endsWith() => " + teste.endsWith("e"));
		
		// Pega o comprimento da String
		System.out.println("Tamanho String | .length()=> " + teste.length());
		
		// Compara se o valor eh igual
		System.out.println("Comparacao de valor | .equals => " + teste.equals("boa tarde"));
		System.out.println("Comparacao de valor ignorando maiusculo e minusculo, menos caracteres especiais | .equalsIgnoreCase => " + teste.equalsIgnoreCase("boa tarde"));

		// Verifica se contem algum dado na string
		System.out.println(".contains() => " + teste.contains("tar"));
		
		// Verifica a posicao onde se encontra o valor do paramerto dentro de uma string
		System.out.println(".indexOf => " + teste.indexOf("t"));
		
		// Extrai algum dado em determinada posicao denro da string conforme parametro
		System.out.println(".ubstring() => " + teste.substring(4, 7));
		
		// Substituir um determinado valor dentro da String como se fosse um StrTran
		System.out.println("Substitui um valor dentro da string | .replace() => " + teste.replace("a", "z"));
		
		// Substitui tudo que não for dígito ou vírgula por nada (remove) utilizando expressoes regulares
		String preco = "R$ 10.50";
		String limpo = preco.replaceAll("[^0-9,]", "");
		System.out.println(".replaceAll() => " + limpo);
		
		// Substirui somente a primeira ocorrencia encontrada
		String texto = "banana, banana, banana";
		String umMenos = texto.replaceFirst("banana", "maçã");
		System.out.println(".replaceFirst() => " + umMenos);

		
		
		
		//-------------------------------------------------
		// Utilizando declaracao de variavel generica, as notacoes pontos
		// sao reconhecidas pelo java pelo tipo da String
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// Concatenando a string com quebra de linha
		System.out.println( "\n\n\n" + "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		
		// Colocando a saida do console formatada de forma simples, 
		// mas este print nao da quebra de linha ao final
		// * Primeiro parametro string e segundo parametro os argumentos separados por virgula
		// %s -> String
		// %d -> Inteiro
		// %f -> Ponto Flutuante( .2f para arredondamento )
		// %n -> Faz a quebra de linha
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f %n %n", nome, sobrenome, idade, salario);
		
		// formatando a String da mesma forma que a anterior e guardando dentro de uma variavel
		String frase = String.format("O Senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
				
	}

}











