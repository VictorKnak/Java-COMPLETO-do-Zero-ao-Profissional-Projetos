package generics.heranca;

import generics.exemploDois.Caixa;

/*
 * Exemplo de que podemos 'restringir' o tipo de dado na classe filha
 * para que quem estanciar esta classe só poderá adicionar numeros 
 * a ela. 
 * 
 * Esse recurso se chama Bounded Type Parameters (Parâmetros de Tipo Limitados) 
 * e serve exatamente para impor limites ao que o Generics aceita.
 * 
 * Ao usar <N extends Number>, foi criado uma trava de segurança. O Java agora 
 * só aceita a classe Number ou qualquer filha dela (como Integer, Double, Float, Long).
 * Se alguém tentar passar uma String, o código nem compila.
 * 
 * Por Exemplo, quando é usado <N extends Number>, o Java libera para você usar todos 
 * os métodos da classe Number (como .intValue(), .doubleValue()) dentro da sua classe 
 * CaixaNumero, pois ele já tem certeza absoluta de que o dado guardado será um número.
 * 
 * */


public class CaixaNumero<N extends Number> extends Caixa<N> {

}
