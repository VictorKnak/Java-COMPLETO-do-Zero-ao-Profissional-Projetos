package oo.composicao.umPraMuitos;

public class Item {

	// Atributos dos itens
	String nome;
	int quantidade;
	double preco;
	public Compra compra;    // Associa a compra ao item

	
	// Contrutor criado para facilitar na hora de criar os itens na lista
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Subscrevendo o toString para nao retornar o endereco de memoria
	@Override
	public String toString() {
		return "[" + nome + "," + quantidade + "," + preco + "]";
	}
	
	
}
