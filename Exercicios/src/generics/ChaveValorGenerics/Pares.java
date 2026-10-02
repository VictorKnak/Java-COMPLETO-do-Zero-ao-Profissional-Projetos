package generics.ChaveValorGenerics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/*
 * Exemplo de Clsse Generics usando chave e valor
 * parametro entre <> indica se sera chave e valor.
 * 
 * Assim como eh passa no tipo da Lista que sera gerada
 * */

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	// Metodo que verifica se existe um mesmo valor de chave e substitui a chave e valor passados
	public void adicionar(C chave, V valor) {		
		if(chave == null) return;
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		// Verifica se o novo par ja existe e remove da lista para ser atualizado
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	// metodo que retorna o tipo do Valor
	public V getValor(C chave) {
	
		// Se a chave for nula
		if(chave == null) return null;
		
		// Retorna um Optional de Objeto Par
		Optional<Par<C, V>> parOpcional = itens
											.stream()
											.filter(par -> chave.equals(par.getChave()))
											.findFirst();
		
		// Se estiver presente depois do filtro aplicado retorna o valor
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
		
	}
	
	
}
