package streamsApi.Reduce.reduce3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import streamsApi.Reduce.Aluno;

public class Reduce3 {

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
		
		// Funcao Acumuladora
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> {
					media.adicionar(nota);
					return media;
				};
		
		// Funcao de combinacao
        BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
							.filter(aprovado)
							.map(apenasNota)
							.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A média é " + media.getValor());
		

	}

}
