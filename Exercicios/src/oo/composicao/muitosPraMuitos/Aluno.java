package oo.composicao.muitosPraMuitos;

import java.util.ArrayList;

public class Aluno {

	final String nome;
	
	// Lista constante - é quando o endereco de memoria nao pode ser modificao
	// Ou seja, nao posso estanciar nova lista em outra variavel
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	// construtor
	Aluno(String nome){
		this.nome = nome;
	}
		
	// metodo bidirecional para add aluno no curso e o curso no aluno
	void adidionarCurso(Curso curso){
		this.cursos.add(curso);      // add objeto curso dentro do arrayList
		curso.alunos.add(this);      // add objeto aluno dentro dos cursos
	}
	
	// Metodo do tipo 'Curso' que retorna o curso por nome
	Curso obterCursoPorNome(String nome) {
		
		// percorre a lista de cursos atrelado ao aluno
		 for(Curso curso: this.cursos) {
			 if(curso.nome.equalsIgnoreCase(nome)) {
				 return curso;
			 }
		 }		
		return null;
	}
	
	
	@Override
	public String toString() {	
		return nome;
	}
}
