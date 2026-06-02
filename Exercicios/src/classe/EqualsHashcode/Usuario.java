package classe.EqualsHashcode;

public class Usuario {

	String nome;
	String email;
	
	// Implementacao e Subscricao(Override) do equals
	@Override
	public boolean equals(Object objeto) {

		// Instaceof verificar se o objeto generico passado eh a instancia de um objeto especifico
		if(objeto instanceof Usuario) {
			
			// Faz um 'Cast' para forçar a conversao do objeto generico para um Objeto Usuario
			Usuario outro = (Usuario) objeto;
			
			// Faz a comparacao dos atributos do objeto passado com os atributos da classe
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			// retorno
			return nomeIgual && emailIgual;
			
		} else { // Se nao for a estancia do Objeto especifico retorna falso por padrao
			return false;
		}
		
	}
	
	// Hash code implementado, mas sera abordado em outra aula
	@Override
	public int hashCode() {	
		return 0;
	}
	
}
