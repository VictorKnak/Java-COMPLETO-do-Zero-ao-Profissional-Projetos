package oo.composicao.umPraMuitos;

import java.util.ArrayList;

public class Compra {

	String cliente;  // simula cliente
	
	// lista homogenia de itens
	ArrayList<Item> itens = new ArrayList<Item>();
	
	// [Relacao Bidirecional] - Metodo para estanciar o objeto item
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));    // Cria o Objeto Item pelo metodo
	}
	
	//[Relacao Bidirecional] - Adiciona o Objeto criado acima a lista de Itens 
	void adicionarItem(Item item) {
		this.itens.add(item);     // add o objeto
		item.compra = this;       // indica que o item eh associado a propria classe da compra
	}
		
	// metodo quando chamado, ira percorrer a lista e retornar o valor total dos itens da lista
	double getValorTotal() {
		double total = 0 ;
		
		for(Item i : itens) {
			total += i.quantidade * i.preco;
		}		
		return total;
	}
	
}
