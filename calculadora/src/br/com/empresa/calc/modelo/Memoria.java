package br.com.empresa.calc.modelo;

import java.util.ArrayList;
import java.util.List;

/*
 * O Singleton é um padrão de projeto criacional (do inglês, Design Pattern) 
 * que garante que uma classe tenha apenas uma instância em toda a aplicação 
 * e fornece um ponto de acesso global para ela
 * 
 * */

public class Memoria {
	
	private enum TipoComando {
			ZERAR, NUMERO, DIVISAO, MULTIPLICACAO, SUBTRACAO, SOMA, IGUAL, VIRGULA, SINAL;
	};
	

	/* Cria uma memoria de estancia para o construtor privado
	   assim gera somente em get para buscar esta estancia da classe */
	private static final Memoria instancia = new Memoria();
	
	// Lista para os observadores
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;	
	private String textoAtual = "";
	private String textoBuffer = "";
	
	/* Construtor privado para permitir estanciar somente uma vez a classe
	   Isso se chama o padrao de projeto singleton */
	private Memoria() {

	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	// Adiciona os observadores na lista
	public void adicionarObservador(MemoriaObservador o) {
		observadores.add(o);
	}

	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	// Processa o novo texto
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detectarTipoComando(texto);

		if(tipoComando == null) {
			return;
			
		} else if(tipoComando == TipoComando.ZERAR){
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
			
		} else if(tipoComando == TipoComando.SINAL){
			
			// Valida se coloca ou remove o sinal
			if (!textoAtual.contains("-")) {
				textoAtual = "-" + textoAtual;				
			} else {
				textoAtual = textoAtual.substring(1);
			}
			
		} else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
			
		} else {			
			substituir = true;
			textoAtual = obterResultadoOperacao();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
		
		
		observadores.forEach( o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultadoOperacao() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
			
		} else {
			
			double numeroBuffer = Double.parseDouble( textoBuffer.replace(",", ".") ); // Altera o texto para double			
			double numeroAtual = Double.parseDouble( textoAtual.replace(",", ".") );   // Altera o texto para double
			
			double resultado = 0;
			
			if (ultimaOperacao == TipoComando.SOMA) {
				resultado = numeroBuffer + numeroAtual;
				
			} else if(ultimaOperacao == TipoComando.SUBTRACAO) {
				resultado = numeroBuffer - numeroAtual;
				
			} else if(ultimaOperacao == TipoComando.MULTIPLICACAO) {
				resultado = numeroBuffer * numeroAtual;
				
			} else if(ultimaOperacao == TipoComando.DIVISAO) {
				resultado = numeroBuffer / numeroAtual;				
			}
			
			// Converte o resultado em String
			String resultadoString = Double.toString(resultado).replace(".", ",");
			
			// Verifica se o final da string termina com virgula zero
			boolean inteiro = resultadoString.endsWith(",0");
						
			// Se for inteiro remove o ",0" do final da String
			return inteiro ? resultadoString.replace(",0", "") : resultadoString;			
		}		
	}

	private TipoComando detectarTipoComando(String texto) {

		if (textoAtual.isEmpty() && texto == "0") {
			return null;
		}
		
		// Tenta converter o texto em numerico, se der errado joga a excessao
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
			
		} catch (NumberFormatException e) {

			// quando nao for numero
			if("AC".equals(texto)) {
				return TipoComando.ZERAR;
				
			} else if("/".equals(texto)) {
				return TipoComando.DIVISAO;
				
			} else if("*".equals(texto)) {
				return TipoComando.MULTIPLICACAO;
				
			} else if("+".equals(texto)) {
				return TipoComando.SOMA;
				
			} else if("-".equals(texto)) {
				return TipoComando.SUBTRACAO;
				
			} else if("=".equals(texto)) {
				return TipoComando.IGUAL;
				
			} else if("+/-".equals(texto)) {
				return TipoComando.SINAL;
				
			} else if(",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}
		}
		
		return null;
	}

	
	
}
