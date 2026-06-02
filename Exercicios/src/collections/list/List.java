package collections.list;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		// Lista de Objetos do tipo usuario
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		// Cria o objeto do tipo usuario
		Usuario usr1 = new Usuario("Ana");
		
		// Adiciona os objetos na lista
		lista.add(usr1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		// Aqui foi add o metodo toString para não retornar o endereco de memoria
		// Caso nao tivesse sido criado, teria que utilizar 'lista.get(3).nome' para retornar o nome
		System.out.println("Acessa pelo Indice => " + lista.get(3));
		
		 // Remove pelo indice - Retorna um Objeto removido, no caso o usuário removido
		System.out.println("Removido pelo Indice => " + lista.remove(1));
		
		// Remove pelo Objeto - Retorna true ou false
		System.out.println("Remove pelo Objeto 'usr1' => " +lista.remove(usr1));		
		System.out.println("Remove pelo Objeto 'Manu' => " +lista.remove(new Usuario("Manu")));

		// Verifica se contem o Objeto
		System.out.println("Contains 'Lia'  => " + lista.contains(new Usuario("Lia")));
		System.out.println("Contains 'usr1' => " + lista.contains(usr1));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}

	}

}
