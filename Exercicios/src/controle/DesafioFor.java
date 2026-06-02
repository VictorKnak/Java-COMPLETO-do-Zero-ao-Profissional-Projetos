package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		
		for(int x = 1; x < 6 ; x++) {
			System.out.println(valor);
			valor += "#";			
		}
		
		System.out.println("\n");
		
		
		/* Obter o mesmo resultado do 'for' anterior 
		 * sem utilizar valores numericos */ 
		
		for( String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);			
		}

	}

}
