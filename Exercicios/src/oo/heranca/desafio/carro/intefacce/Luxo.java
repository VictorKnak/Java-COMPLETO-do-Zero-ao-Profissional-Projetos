package oo.heranca.desafio.carro.intefacce;

public interface Luxo {

	public void ligarAr();
	abstract void desligarAr();
	
	// método padrão pode ser utilizad para nao obrigar as outras classes a utiliza-lo
	default int velocidadeDoAr() {
		return 1;
	}
}
