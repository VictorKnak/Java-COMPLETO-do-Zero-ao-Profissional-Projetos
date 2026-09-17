package excecao.personalizadaB;

/*
 * A classe herdada diretamente da classe Exception, ou seja, Excecao 'checada'
 * */


// Supre a serealizacao(seria um numero serial caso queira criar um obj em .txt por exemplo)
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;
	
	// Contrutor
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	// Subscreve o metodo que retorna a mensagem de erro
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está negativo", nomeDoAtributo);
	}
	
}
