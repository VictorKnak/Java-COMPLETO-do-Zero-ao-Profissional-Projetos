package lambdas;

/* Este exemplo foi utilizado funcoes lambdas  */

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Funcao Lambda, no caso como JavaScrip, é criada uma função Anônima
		// utilizando diretamente a interface 'Calculo' que implementa o metodo executar
		Calculo calc = (x, y) ->{
			return x + y;
		};		
		System.out.println(calc.executar(2,3));
		
		// Se nao utiliza o par de chaves, o Java entende que automaticamente o resultado desta funcao sera retornado
		// então por conta disso, nao precisa adicionar explicitamente o 'return'.
		// Isso ocorre pois o Java entende que esta função Anônima terá APENAS UMA senteça de código.
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2,3));
		

	}

}
