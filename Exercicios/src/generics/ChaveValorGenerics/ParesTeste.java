package generics.ChaveValorGenerics;

public class ParesTeste {

	public static void main(String[] args) {


		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Biddo");
		resultadoConcurso.adicionar(2, "Victor");     // Teste substituicao
		resultadoConcurso.adicionar(3, "Bruna");
		resultadoConcurso.adicionar(4, "BiddoCao");
		resultadoConcurso.adicionar(2, "Pinguelo");   // Teste substituicao
		
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));

	}

}
