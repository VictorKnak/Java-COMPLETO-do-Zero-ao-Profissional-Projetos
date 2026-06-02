package oo.composicao.muitosPraMuitos;

import java.util.ArrayList;

public class Curso {
	
	final String nome;

	// Lista constante - é quando o endereco de memoria nao pode ser modificao
	// Ou seja, nao posso estanciar nova lista em outra variavel
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	// metodo bidirecional para add aluno no curso e o curso no aluno
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);          // adiciona objeto aluno do arrayList
		aluno.cursos.add(this);          // adiciona objeto curso dentro dos cursos do aluno
	}
}
