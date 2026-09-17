package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		try {			
			Aluno aluno = new Aluno("", 7);		
			Validar.aluno(aluno);         // Chama o metodo para validar o aluno
			
			Validar.aluno(null);         // teste aluno nulo

		// Testa a excecao Java
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			
		// Testa as excecoes personalizadas
		} catch (StringVaziaException | NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());			
		}
		
		System.out.println("Fim :)");

	}

}
