package classe;

/*
 * Atributos e classes 'static'
 * 
 * Dica: Geralmente os atributos 'static' ficam em italico.
 * Quando alterado um valor de um atributo estatico, ele eh 
 * alterado para todas as estancias.
 * 
 * */

public class AreaCircTeste {

	public static void main(String[] args) {
		
		// Estanciando o Objeto(classe)
		AreaCirc a1 = new AreaCirc(10);
//		a1.pi = 100000;   // Teste alterando atributo 'static'
		
		AreaCirc a2 = new AreaCirc(5);
//		a2.pi = 0;        // Teste alterando atributo 'static'				
		AreaCirc.pi = 3.1415; // Acessando o atributo 'staic' da forma correta		
		System.out.println(a1.area());
		System.out.println(a2.area());
		
		
		// acessando metodo estatico		
		System.out.println(AreaCirc.area(100));
	}
	
}
