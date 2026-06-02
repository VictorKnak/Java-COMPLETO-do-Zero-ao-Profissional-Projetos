package oo.encapsulamento.casaA;

public class Ana {

	@SuppressWarnings("unused") // Suprime a Advertencia do atributo que nao esta sendo usado
	private String segredo = "Xiuuuu";               // Privado
	
	String facoDentroDeCasa = "Nada";                // Default ou packege
	protected String formaDeFalar = "bla-bla-bla"; 	 // Protegido(Por herança)
	public String todosSabem = "Alguma coisa legal"; // Publico
}
