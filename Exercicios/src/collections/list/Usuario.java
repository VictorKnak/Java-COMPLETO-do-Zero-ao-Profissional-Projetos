package collections.list;

public class Usuario {

	String nome;

	//Contrutor
	public Usuario(String nome) {	
		this.nome = nome;
	}
	
	// Metodo toString pode tratar o retorno do Objeto para nao retornar o enderco de memoria
	@Override
	public String toString() {
		return "Meu nome é " + nome + ".";
	}

	// HashCode Personalizado
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	// Equals personalizado
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
