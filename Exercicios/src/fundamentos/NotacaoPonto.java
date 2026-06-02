package fundamentos;

/* Tipos que nao sao primitivos tem disponibilidade da notacao ponto
 * onde existiram diversos metodos e funcoes a serem usadas por este tipo
*/


public class NotacaoPonto {

	public static void main(String[] args) {
	
		String s = "Bom dia X";
		s = s.toUpperCase();		
		System.out.println(s);
		
		s = s.replace("X", "teste");
		System.out.println(s);
		
		s = s.concat(", alguma coisa lega!!");
		System.out.println(s);
		System.out.println("Quantidade de caracteres: " + s.length());
		
		System.out.println("teste__2".toUpperCase());
				
		
	}

}
