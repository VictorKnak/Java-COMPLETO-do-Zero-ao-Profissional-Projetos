package generics.heranca;

import generics.exemploDois.Caixa;

/*
 * Na herança com Generic, pode ser estendia a classe mae para resover o tipo generico
 * Ex: public class CaixaInt<T> extends Caixa<T> {
 *
 *			}
 *
 * Ou
 * 
 * O tipo generico pode ser resolvido dentro da propria classe filha para a classe mae
 * Ex: public class CaixaInt extends Caixa<Integer> {
 *
 *			}
 * */


public class CaixaInt extends Caixa<Integer> {
	
}
