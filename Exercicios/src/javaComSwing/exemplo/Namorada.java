package javaComSwing.exemplo;

public class Namorada implements ObservadorChegadaAniversariante{

	// Implementa por obrigatoriedade o metodo da interface para executar o Evento
	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("e...SURPRESA!!!");
		
	}
	
}
