package oo.composicao.muitosPraMuitos;

public class CursoTeste {

	public static void main(String[] args) {

		// Estanncia os alunos
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		// adiciona os alunos criados nos cursos(Relacao Bidirecional)
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		// adiciona os cursos nos alunos(Relacao Bidirecional)
		aluno1.adidionarCurso(curso3);
		aluno2.adidionarCurso(curso3);
		aluno3.adidionarCurso(curso3);
		
		// percorre a lista dos alunos
		for (Aluno aluno : curso3.alunos) {			
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("...e meu nome é " + aluno.nome);
			System.out.println();
		}

		System.out.println(aluno1.cursos.get(0).alunos);
		
		// Pesquisa pelo nome do curso
		Curso cursoEncontrado = aluno3.obterCursoPorNome("Web 2023");		
		if(cursoEncontrado != null) {
			System.out.println("\n" + cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}

}











