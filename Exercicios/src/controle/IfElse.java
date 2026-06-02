package controle;

import javax.swing.JOptionPane;    // importa biblioteca

public class IfElse {

	public static void main(String[] args) {

		// cria um dialogo para inputar dos dados
		String valor = JOptionPane.showInputDialog("Informe o número");
		
		// transforma o valor para inteiro
		int numero = Integer.parseInt(valor);
		
		// valida o valor
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número impar!");
		}
		

	}

}
