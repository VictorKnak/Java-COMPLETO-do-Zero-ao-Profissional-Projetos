package excecao;

/*
 * 'throw' faz o lançamento da excessao de erro
 * 
 * 'RuntimeException' -> Excecao em tempo de execusao, eh uma Excecao NAO CHECADA/NAO VERIFICADA 
 *                    -> Nao eh obrigatorio tratar e excecao
 * 
 * 'Exception' -> Excecao CHECADA/VERIFICADA
 * 
 * */


public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();			
		} catch (Throwable e) {  // 'Throwable' tratamento generico de lancamento de excecao
           System.out.println(e.getMessage());
		}

		System.out.println("Fim :)");
	}
	
	// Excecao em tempo de execusao eh uma Excecao NAO CHECADA
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!"); // throw faz o lançamento da excessao
	}
	
	// Excessao CHECADA/VERIFICADA
	// Para uma Excecao CHECADA precisa colocar na assinatura que o metodo
	// pode lançar (throws) excecoes do tipo EXCEPTION 
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
		
	}

}
