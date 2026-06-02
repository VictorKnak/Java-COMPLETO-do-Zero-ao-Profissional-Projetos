package oo.encapsulamento.gettersSetters;


/*
 * Getters e setters em Java são métodos públicos 
 * usados para acessar e modificar atributos privados 
 * de uma classe (encapsulamento). O getter retorna 
 * o valor do atributo, enquanto o setter o define, 
 * permitindo validações, controle de acesso e segurança 
 * nos dados, evitando acesso direto a variáveis sensíveis.
 * 
 * Pra utilização de Getters e Setters o mais indicado é
 * tornar os atributos privados para a classe e acessa-los
 * apartir destes métodos.
 * Assim como no métodos 'setter', podendo realizar as validações 
 * necessárias para verificar se o dado é um dado válido.
 *   
 * */



public class Pessoa {

	private int idade;
	private String nome;
	
	// construtor
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// pega a idade
	public int getIdade() {
		return idade;
	}

	// altera a idade
	public void setIdade(int novaIdade) {
		if(novaIdade >= 0) {
			this.idade = novaIdade;			
		}
	}
	
	@Override
	public String toString() {	
		return "Ola meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
	}
	
}
