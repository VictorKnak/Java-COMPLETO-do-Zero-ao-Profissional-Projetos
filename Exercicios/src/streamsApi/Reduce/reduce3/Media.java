package streamsApi.Reduce.reduce3;

public class Media {

	private double total;
	private int quantidade;
	
	// Soma as notas e a quantidade de notas
	public void adicionar(double valor) {
		total += valor;
		quantidade++;
	}
	
	// Retorna a media das notas
	public double getValor() {
		return total / quantidade;
	}
	
	// Soma o valor entre duas medias
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		
		resultante.total = m1.total + m2.total;                 // Soma o total das duas medias
		resultante.quantidade = m1.quantidade + m2.quantidade;  // Soma a quantiade de medias
		
		return resultante;
	}
	
	
}
