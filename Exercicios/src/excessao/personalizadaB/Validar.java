package excessao.personalizadaB;

import excessao.Aluno;

public class Validar {

	// Construtor privado para ninguem estanciar esta classe
	private Validar() {
		
	}

	// metodo statico
	public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException {
		
		// Excecao do proprio java.lang
		if(aluno == null) {
			throw new IllegalArgumentException("O Aluno está nulo!");
		}
		
		// Excecao Personalizada
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}

		// Excecao Personalizada
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
		
	}
	
	
}
