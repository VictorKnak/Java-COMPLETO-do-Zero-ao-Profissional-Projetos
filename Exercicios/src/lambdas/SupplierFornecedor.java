package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
 * Supplier seria o "fornecedor" ou "supridor"
 * Basicamente esta função te fornece algo no retorno.
 * E ela nao tem como fazer composição, quando usamos a saida
 * de uma funcao para entrada de outra.
 * */

public class SupplierFornecedor {

	public static void main(String[] args) {

		// Neste caso, nao tem especificado o tipo de retorno que sera do supplier
		// mas no teste foi colocado para retornar uma lista de String. Mas poderia 
		// ser qualquer outro tipo de retorno.
		// Outra questao é que ele nao tem parametro de entrada, e como pode notar
		// precisa obrigatoriamente colocar os parenteses vazios por conta da sintaxe.
		Supplier<List<String>> umLista = () -> {
			return Arrays.asList("Bia", "Lia", "Ana", "Gui");
		};

		System.out.println(umLista.get());
	}

}
