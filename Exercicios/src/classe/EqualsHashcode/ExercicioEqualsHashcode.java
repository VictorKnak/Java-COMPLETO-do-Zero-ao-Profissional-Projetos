package classe.EqualsHashcode;


/*
 * 
 * Metodo equals sempre ira comparar o endereco de memória
 * quando utilizado para comparar objetos, e não os conteúdos
 * em sí dentro dos objetos.
 * 
 * Por padrao, o metodo 'equals' sempre estara disponivel
 * em qualquer classe existente ou criada no java,
 * assim como outros metodos nativos.
 * 
 * E como estara disponivel, alguns destes metodos possibilitam
 * serem implementados e ajustados/sobrescrever (override) para 
 * atender os criterios especificos do seu sistema desenvolvido.
 *   
 * */

public class ExercicioEqualsHashcode {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@teste.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@teste.com.br";
		
		// Teste sem implementar o metodo equals na classe
		System.out.println(u1 == u2);
		
		// Metodo equals implementado
		System.out.println(u1.equals(u2));		
		System.out.println(u2.equals(u1));

	}

}
