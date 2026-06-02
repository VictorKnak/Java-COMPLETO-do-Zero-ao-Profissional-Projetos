package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto prod1 = new Produto("Notebook", 4356.89, 0.25);		
//		prod1.nome = "Notebook";
//		prod1.preco = 4356.89;
//		prod1.desconto = 0.25;
		
		var prod2 = new Produto();
		prod2.nome = "Caneta preta";
		prod2.preco = 12.56;
		prod2.desconto = 0.29;
		
		System.out.println("Nome......." + prod1.nome);
		System.out.println("Preço......R$" + prod1.preco);
		System.out.println("Desconto..." + prod1.desconto + "%");
		
		System.out.println();		
		System.out.println(prod2.nome);
		
		// faz o calculo chamando o metodo do desconto
		double precoFinal1 = prod1.precoComDesconto();     // desconto normal
		double precoFinal2 = prod2.precoComDesconto(0.1);  // desconto do gerente
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média Carrinho = %.2f", mediaCarrinho);
		
		
	}

}
