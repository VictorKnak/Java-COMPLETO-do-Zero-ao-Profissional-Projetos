package br.com.empresa.calc.modelo;

public class Memoria {

	/* Cria uma memoria de estancia para o construtor privado
	   assim gera somente em get para buscar esta estancia da classe */
	private static final Memoria instancia = new Memoria();
	
	private String textoAtual = "";
	
	/* Construtor privado para permitir estanciar somente uma vez a classe
	   Isso se chama o padrao de projeto singleton */
	private Memoria() {
		
		

	}

	// retorna a estancia da classe singleton
	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	
	
}
