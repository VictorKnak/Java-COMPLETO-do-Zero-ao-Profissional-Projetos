package classe;

/*
 * Testes de criacao de classes(objetos):
 * 
 * Uma observacao é que não é necessário criar variaveis
 * para o carregamento dos valores como foi feito com a 
 * 'inferencia'. 
 * */

public class DataTeste {

	public static void main(String[] args) {
		
		// declaracao das variaveis
		int dia;
		int mes;		
		int ano;
		String dataFormatada;
		
		// cria o objeto de data
		Data data = new Data();
		
		data.dia = 6;
		data.mes = 8;
		data.ano = 2026;
		
		// carrega as variaveis
		dia = data.dia;
		mes = data.mes;
		ano = data.ano;
		
		dataFormatada = data.obterDataFormatada(dia, mes, ano);
				
		System.out.println(dataFormatada);
		
		// Usando inferencia
		var data2 = new Data();
		
		// pode carregar os valores sem a inicializacao de outras variaveis
		data2.dia = 1;
		data2.mes = 2;
		data2.ano = 2023;
		
		// Usando metodo da classe String para formatacao
		dataFormatada = data2.obterDataFormatada2();		
		System.out.println(dataFormatada);
		
		// Usando o CONTRUTOR PADRAO
		var data3 = new Data();
		dataFormatada = data3.obterDataFormatada2();
		System.out.println(dataFormatada);
		
		// Usando o CONTRUTOR CUSTOMIZADO
		var data4 = new Data(1, 6, 2010);
		data4.ano = 2000;         //  pode alterar um parametro somente
		System.out.println(data4.obterDataFormatada2());
		
		
	}

}
