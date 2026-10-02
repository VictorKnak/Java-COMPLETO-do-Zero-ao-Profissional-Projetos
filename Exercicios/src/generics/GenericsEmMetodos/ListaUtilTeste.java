package generics.GenericsEmMetodos;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

		String ultimaLinguagem = (String) ListaUtil.getUltimoUm(langs);		
		System.out.println(ultimaLinguagem);
		
		Integer ultimaNumero = (Integer) ListaUtil.getUltimoUm(nums);		
		System.out.println(ultimaNumero);
		
		
		// Usando Metodos Generics sem precisa usar o CAST para forçar a conversar explicitamente
		String ultimaLinguagemDois = ListaUtil.getUltimoDois(langs);		
		System.out.println(ultimaLinguagemDois);
		
		Integer ultimaNumeroDois = ListaUtil.getUltimoDois(nums);		
		System.out.println(ultimaNumeroDois);

	}

}
