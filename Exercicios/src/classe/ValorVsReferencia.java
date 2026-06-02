package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;  // atribuicao por valor (Tipo Primitivo)
		
		// teste alteracao atribuicao por valor
		a++;
		b--;
		System.out.println( "a => " + a + " | " + "b => " + b );
		
		
		Data d1 = new Data(1,6,2022);
		Data d2 = d1;             // atribuicao por referencia ( Objeto )

		// teste alteracao por referencia, ira impactar nos dois  
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		System.out.println(d1.obterDataFormatada2());
		System.out.println(d2.obterDataFormatada2());
		
	}
	

}
