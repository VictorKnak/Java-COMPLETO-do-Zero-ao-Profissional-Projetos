package javaComSwing.exemplo;

/*
 * Implementação da interface sempre será necessaria para 
 * que determinado evento aconteça. Pois por padrão, todo o
 * Observador(Observer) precisa ter uma interface para implemtentar
 * o Evento.
 * */


public interface ObservadorChegadaAniversariante {
	
	// metodo abstrato(sempre abstrato)
	public void chegou(EventoChegadaAniversariante evento);

}
