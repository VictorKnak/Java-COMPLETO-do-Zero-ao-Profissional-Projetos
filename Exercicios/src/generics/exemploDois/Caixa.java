package generics.exemploDois;



public class Caixa<T> {

	private T coisa;
	
	
	public void setGuardar(T coisa) {
		this.coisa = coisa;
	}
		
	public T getAbri() {
		return coisa;
	}	
	
}
