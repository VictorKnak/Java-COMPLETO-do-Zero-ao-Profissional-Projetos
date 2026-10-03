package javaComSwing.exemplo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * O porteiro seria o Subject, que tem a responsabilidade 
 * de notificar todos os observadores.
 * */

public class Porteiro {

	// Cria uma lista de Observadores
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	// Metodo para adicionar o observador a Lista
	public void registrarObservadores(ObservadorChegadaAniversariante o) {
		observadores.add(o);
		
	}
	
	// Metodo para notifiar os observadores
	public void monitorar() {
		
		// estancia o objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Inicializa a variavel que vai controlar o loop
		String valor = "";
		
		// Enquanto nao for pra sair executa
		while (!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();                  // pega o que foi digitado no console
			
			// Se foi digitado sim, cria um objeto de evento e executa o metodo para todos os observadores
			if("sim".equalsIgnoreCase(valor)) {

				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				observadores.stream().forEach(o -> o.chegou(evento));				
				break;				
			}else {
				System.out.println("Alarme falso!");
			}
		}
		
		entrada.close();
	}
	
}










