package generics.GenericsEmMetodos;

import java.util.List;

public class ListaUtil {

	// Ponto de interrogacao<?> indica que a lista pode ser de qualquer coisa
	public static Object getUltimoUm(List<?> lista){
		return lista.get(lista.size() - 1);
	}
	
	// Metodo usando Generics, T representa o tipo generico de retorno do metodo e do parametro do metodo
	public static <T> T getUltimoDois(List<T> lista){
		return lista.get(lista.size() - 1);
	}
	
	public static <A , B, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}
}
