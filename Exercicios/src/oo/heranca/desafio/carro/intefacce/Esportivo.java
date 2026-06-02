package oo.heranca.desafio.carro.intefacce;

/*
 * Interfaces em Java são contratos (ou padrões) que definem métodos
 * abstratos e constantes que classes devem implementar. Elas garantem
 * que as classes sigam um comportamento específico, forçando a 
 * implementação dos métodos definidos, mas sem dizer como realizá-los,
 * permitindo polimorfismo e herança múltipla de tipos.
 * 
 * Principais características:
 * 1 - Contrato de Comportamento: A interface define o que uma classe deve fazer, não como ela faz.
 * 2 - Implementação: Uma classe utiliza a palavra-chave implements para aderir ao contrato da interface.
 * 3 - Herança Múltipla: Diferente das classes (que só podem herdar de uma pai), uma classe em Java pode
 * implementar múltiplas interfaces.
 * 4 - Abstração: Métodos são públicos e abstratos por padrão; a partir do Java 8, interfaces podem ter 
 * métodos default (com corpo) e estáticos.
 * 
 * 
 * Basicamente eh para obrigar uma classe a implementar um metodo, mesmo que este metodo nao faça 
 * absolutamente nada.
 * 
 * Todo método de uma Interface é publico.
 * 
 * */

public interface Esportivo {

	public abstract void ligarTurbo();			// Metodo Default
	void desligarTurbo();       				// Metodo Default
}
