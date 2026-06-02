package classe;

public class Data {

	int dia;                      // Variaveis de classe
	int mes;                      // Variaveis de classe
	int ano;                      // Variaveis de classe	                              
	static int anoBinario = 1000; // Variavel de Classe - (teste)
	
	// Construtor padrao
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		
		this(1,1,1970);		// this como metodo
	}
	
	// Contrutor criado
	Data(int dia , int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	

	String obterDataFormatada(int dia, int mes, int ano) {
		return dia + "/" + mes + "/" + ano;		
	}
	
	// Usando metodo da classe String para formatacao
	String obterDataFormatada2() {
		return String.format("%d/%d/%d", dia, mes, ano );		
	}
}
