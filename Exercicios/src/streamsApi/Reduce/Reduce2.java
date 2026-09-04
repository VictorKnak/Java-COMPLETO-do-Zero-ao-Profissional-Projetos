package streamsApi.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana" , 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui" , 8.1);
		Aluno a4 = new Aluno("Gabi",  10);
				
		// Cria lista do tipo objeto(Aluno)
		List<Aluno> alunos = Arrays.asList(a1 ,a2 ,a3 ,a4 );
		

		// Predicado, que recebe um aluno e retorna true/false, usado quando precisa filtrar
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		// Function que recebe um valor e retorna outro
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		// Cria uma operacao binaria de soma para ser usada no 'reduce'
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream()
		      .filter(aprovado)                                      // Filtra os aprovados
		      .map(apenasNota)                                       // Mapeia para retornar somente a nota
		      .reduce(somatorio)                                     // Soma todas as notas
		      .ifPresentOrElse(System.out::println,
		    		  () -> System.out.println("Nao encontrado"));   // Verifica se achou ou nao a nota
		
		
		
		

	}

}
