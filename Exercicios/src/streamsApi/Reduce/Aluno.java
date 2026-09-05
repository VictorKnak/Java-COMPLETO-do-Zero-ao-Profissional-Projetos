package streamsApi.Reduce;

public class Aluno {
	
	final String nome;
	public final double nota;
	final boolean bomComportamento;
	
	
	// Novo contrutor chama o debaixo passando um parametro como sempre verdadeiro
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	@Override
	public String toString() {	
		return nome + " tem nota " + nota;
	}
}
