package classe.desafioModulo5;

public class Pessoa {

	// Atributos
	String nome;
	double peso;
	
	// Contrutor
	Pessoa( String nome, int peso ){
		this.nome = nome;
		this.peso = peso;
	}
	
	// Metodo comer
	double Comer( Comida c ) {
		
		// testa se passou algum objeto nulo
		if( c != null) {
			peso += c.pesoComida;
		}
		
		return peso;
	}
}
