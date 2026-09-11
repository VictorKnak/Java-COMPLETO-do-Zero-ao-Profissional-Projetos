package streamsApi.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * É uma operação intermediária que permite selecionar elementos 
 * de uma coleção com base em uma condição. Ele avalia um predicado 
 * e retorna uma nova stream contendo apenas os itens que retornam 
 * 'true' para essa condição.
 * 
 * */

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);
		
		// Cria uma lista com os Objetos
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		// Cria o filtro com o predicado
		Predicate<Aluno> aprovado = a -> a.NOTA >= 7;
		
		// Aplica o Stream para gerar o resultado final
		alunos.stream()
		    .filter(aprovado)                                           // Filtra o array conforme condicao da lambda
		    .map(a -> "Parabéns " + a.NOME + " você foi aprovado!")     // Faz o map para a transformacao do dado 
		    .forEach(System.out::println);                              // Executa o Stream de finalizacao para exibir no console
		
	}

}
