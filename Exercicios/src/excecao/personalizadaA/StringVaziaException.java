package excecao.personalizadaA;

/*
 * A classe herdada da classe RuntimeException(Excecao em tempo de execucao), ou seja, Excecao 'nao checada'
 * */


// Supre a serealizacao(seria um numero serial caso queira criar um obj em .txt por exemplo)
@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	// Contrutor
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	// Subscreve o metodo que retorna a mensagem de erro
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}
	
}
