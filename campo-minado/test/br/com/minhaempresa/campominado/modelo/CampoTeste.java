package br.com.minhaempresa.campominado.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.minhaempresa.campominado.excecao.ExplosaoException;

/* 
 * Classe de teste para inserir o vizinho do campo 
 * */

public class CampoTeste {

	private Campo campoOrigem;   // Variavel que ira guardar o campo origem
	
	// @BeforeEach assinala que o metodo devera executar antes de cada metodo teste
	@BeforeEach
	void iniciarCampoOrigem() {
		campoOrigem = new Campo(3, 3);  // estancia a classe campo passando as coordenadas
	}
	
	@Test
	void testeVizinhoDistanciaUm() {
		Campo vizinho = new Campo(3, 2);  // estancia a classe campo passando as coordenadas		
		boolean retorno = campoOrigem.adicionarVizinho(vizinho);
		
		// Testa e verifica se o retorno eh True
		assertTrue(retorno);		
	}
 
	@Test
	void testeVizinhoDistanciaDois() {
		Campo vizinho = new Campo(2, 2);  // estancia a classe campo passando as coordenadas		
		boolean retorno = campoOrigem.adicionarVizinho(vizinho);
		
		// Testa e verifica se o retorno eh True
		assertTrue(retorno);		
	}

	// Faz o teste para verificar se o valor de marcado esta iniciado como False
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campoOrigem.isMarcado());
	}
	
	// Testa a marcacao do campo alterando a marcacao do campo para true
	@Test
	void testeAlteraMarcacao() {
		campoOrigem.alternaMarcacao();
		assertTrue(campoOrigem.isMarcado());
	}
	
	@Test
	void testeAlteraMarcacaoDuasChamadas() {
		campoOrigem.alternaMarcacao();               // altera para true
		campoOrigem.alternaMarcacao();               // altera para False
		assertFalse(campoOrigem.isMarcado());
	}
	
	// Testa campo Nao minado e nao marcado
	@Test
	void testeAbrirCampoLivre() {
		assertTrue(campoOrigem.abrir());
	}
	
	// testa campo sem minhha e marcado
	@Test
	void testeAbrirCampoNaoMinadoMarcado() {
		campoOrigem.alternaMarcacao();                // Altera para True a marcacao
		assertFalse(campoOrigem.abrir());             // Tenta abrir e retorna false
	}
	
	
	@Test
	void testeAbrirMinadoMarcado() {
		campoOrigem.alternaMarcacao();                // Altera para True a marcacao
		campoOrigem.minar();                          // Coloca uma mina no campo		
		assertFalse(campoOrigem.abrir());             // Tenta abrir e retorna false
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campoOrigem.minar();                          // Coloca uma mina no campo	
		
		// Verifica se a excessao foi lancada vinda do metodo abri
		assertThrows( ExplosaoException.class, () -> { 
			campoOrigem.abrir();
			});
		

	}
	
}

























