package streamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import streamsApi.Reduce.Aluno;

public class Match {

	public static void main(String[] args) {

		boolean m;
		
		Aluno a1 = new Aluno("Ana" , 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui" , 8.1);
		Aluno a4 = new Aluno("Gabi",  10);
				
		// Cria lista do tipo objeto(Aluno)
		List<Aluno> alunos = Arrays.asList(a1 ,a2 ,a3 ,a4 );
		
		// Predicado, que recebe um aluno e retorna true ou false, usado quando precisa filtrar
		Predicate<Aluno> aprovado = a -> a.nota >= 7;

		// verifica se todos alunos foram aprovados com 'allMatch'
		m = alunos.stream().allMatch(aprovado);		
		System.out.println("allMatch  => " +m);
		
		// verifica se algum aluno foi aprovado com 'anyMatch'
		m = alunos.stream().anyMatch(aprovado);		
		System.out.println("anyMatch  => " + m);

		// verifica se nenhum aluno foi aprovado com 'noneMatch'
		m = alunos.stream().noneMatch(aprovado);		
		System.out.println("noneMatch => " + m);
		
		

	}

}
