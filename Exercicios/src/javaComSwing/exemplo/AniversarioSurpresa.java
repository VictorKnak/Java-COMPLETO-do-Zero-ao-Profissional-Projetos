package javaComSwing.exemplo;


/*
 * Esta classe Mae simula um evento de aniversario, onde o Porteiro é o Observador(Observer)
 * e a namorada é a parte interessada na Execução do Evento que será notificada quando 
 * o Evento ocorrer.
 * */


public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		// Adiciona o interessado ao Evento 
		porteiro.registrarObservadores(namorada);
		
		// Executa o metodo de monitoramento
		porteiro.monitorar();
		
	}
	
}
