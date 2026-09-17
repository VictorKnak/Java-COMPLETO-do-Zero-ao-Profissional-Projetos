package excecao;


/*
 * Exemplo de excecao Causal, pois como podemos ter diversos metodos e tratamento sendo chamados
 * um dentro do outro, pode correr de ser lancada uma excecao e desecadear o lancamento de diversas
 * outras excecoes.
 * Entao este exemplo mostrado, eh para lancar o erro da excecao 'raiz' que desencadeou todas as outras
 * */

public class Causa {

	public static void main(String[] args) {

		// Tenta executar o metodo A e lanca e execao do metodo A, mostrando a causa que venho do metodo B 
		try {
			metodoA(null);
			
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
	}
		
	static void metodoA(Aluno aluno) {		
		
		// Tenta o metodo B e lanca um novo erro passando a causa como parametro 
		try {
			metodoB(aluno);
			
		} catch (Exception e) {
			throw new IllegalArgumentException(e); // passa a causa por parametro-(IllegalArgumentException Throwable cause)
		}
	}
	
	
	// Valida excecao
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno esta NULLLOOO!!!");
		}
		
		
	}


}
