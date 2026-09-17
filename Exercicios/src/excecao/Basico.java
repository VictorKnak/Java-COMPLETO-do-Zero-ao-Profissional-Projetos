package excecao;

public class Basico {

	public static void main(String[] args) {


		// tratamento de erro
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro => " + e.getMessage());  // Mostra a mensagem do erro
//			e.printStackTrace();             // metodo padrao que mostra a pilha de execucao
		}
		
		System.out.println("Fim :)");
		

	}

}
