package oo.composicao.umPraMuitos;

public class CompraTeste {

	public static void main(String[] args) {

		// Cria o Objeto da compra
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
				
		
		/*// Maneira mais DIFICIL de implementar, SEM O CONTRUT0R 
		Item item1 = new Item();
		item1.nome = "Caneta";
		item1.quantidade = 20;
		item1.preco = 7.45;
		compra1.itens.add(item1);
		System.out.println(compra1.itens);
        */
		
		
		// Maneira mais FACIL de implementar, COM O CONTRUTOR
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Caderno", 3, 18.79));

		// [Relacao Bidirecional] - Add novo item sem estanciar um novo objeto
		compra1.adicionarItem("Carro", 1, 10000);


		System.out.println(compra1.cliente);
		System.out.println(compra1.itens); // Soh mostra a lista em formato de String pois o toString foi subscrito
		
		System.out.println(compra1.getValorTotal());
		
//		[Teste relacao Bidirecional] - Verificar o porque esta dando erro
//		double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
//		System.out.println("O total é R$" + total);
		
		
	}

}
