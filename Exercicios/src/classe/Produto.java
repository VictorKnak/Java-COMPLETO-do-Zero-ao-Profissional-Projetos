package classe;

/*
 * Por convecao, o nome de um metodo eh feito em CamelCase
 * mas com a primeira letra em minusculo, diferente da classe
 * 
 * Ex: Metodo -> nomeDoMetodo
 *     Classe -> NomeDaClasse
 *     
 * METODOS - Obs. 1: Pode ser criado dois metodos com o mesmo nome
 * mas com assinaturas diferentes.
 * A assinatura seria o nome do metodo + quantidade e tipo de parametros. * 
 * Ou seja, Se eu tiver 'nome e quantidade+tipo' de parametros iguais em outro metodo da erro.
 * Mas se eu tiver:
 * 'nome igual, quantidade de parametros igual com tipos diferentes' da certo. Ou
 * 'nome igual, quantidade de parametros diferentes com tipos iguais' da certo. Ou
 * 
 * Ex: 
 * precoComDesconto(int x , int y, int b); -> Erro
 * precoComDesconto(int x , int y, int b); -> Erro
 * ----------
 * precoComDesconto(int x , int y, int b); -> OKA
 * precoComDesconto(int x , int y);        -> OK
 * ----------
 * precoComDesconto(int x    , int y   , int b   ); -> OK
 * precoComDesconto(double x , double y, double b); -> OK
 * 
 * METODOS - Obs. 2: Quando se cria uma metodo sem parametros, o Java consegue
 * executar pois ao chamar a classe para inserir os valores de variaveis  
 * da classe, estes valores ja estao dentro da classe.
 * Entao por conta disso o metodo sem parametros passados ira funcionar.
 ************************************************************************** 
 * 
 * CONTRUTORES:
 * O construtor em Java garante que os atributos da classe recebam os valores 
 * inicias válidos, preparando os objetos para uso e pode ser usado para alocar
 * recursos necessários. 
 * 
 * Quanto se cria uma classe, o Java criar implicitamente um contrutor padrão
 * sem parametros para que a classe seja executada corretamente. Contudo, esta 
 * garantia de que os atributos iram receber os valores corretamente, não é garantida.
 * 
 * Então para isso é criado um CONTRUTOR EXPLICITAMENTE para que esta garantida 
 * de valores dos atributos seja realizada.
 * 
 * CONSTRUTOR - Obs. 1: Pode ser criado mais de um contrutor dentro de uma classe 
 * CONSTRUTOR - Obs. 2: Pode ser criado um contrutor padrao caso seja necessario para
 * garantir o funcionamento do sistema onde objetos foram criados sem a utilizacao 
 * de algum contrutor explicito. 
 * CONSTRUTOR - Obs. 3: Construtores não retornam valores.
 *  
 * */

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	// Construtor criado com parametros
	Produto(String nome, double preco, double desconto) {		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	// Contrutor padrao
	Produto(){
		
	}

	// Metodo SEM parametro
	double precoComDesconto() {
		
		/* Os dados de 'preco' e 'desconto' podem ser acessados 
		 * diretamente pois estao denro da mesma classe*/
		return preco * (1 - desconto);
	}
	
	// Metodo COM parametro
	double precoComDesconto(double descontoDoGerente) {				
		return preco * (1 - (desconto + descontoDoGerente));
	}
}
