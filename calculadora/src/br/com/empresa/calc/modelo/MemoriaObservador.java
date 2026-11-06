package br.com.empresa.calc.modelo;

/*
 * @FunctionalInterface - Serve para indicar explicitamente que uma interface possui 
 * apenas um único método abstrato e garantir que o compilador valide essa regra.
 * 
 * 
 * */

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);    // unico método a ser implementado
	
}
