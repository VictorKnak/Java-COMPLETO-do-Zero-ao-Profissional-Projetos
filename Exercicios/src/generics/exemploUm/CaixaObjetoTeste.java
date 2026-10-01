package generics.exemploUm;

/* 
 * Generics em Java são um recurso que permite parametrizar tipos 
 * (como classes, interfaces e métodos), possibilitando escrever códigos 
 * reutilizáveis, flexíveis e seguros para diferentes tipos de dados.
 * 
 *  A grande vantagem do Generics é justamente eliminar a necessidade de 
 *  realizar 'casts' manuais. Antes dele, coleções retornavam o tipo 'Object' 
 *  e o desenvolvedor precisava forçar a conversão explicitamente. Com o Generics, 
 *  o Java valida o tipo em tempo de compilação e faz as conversões internas 
 *  de forma automática e invisível, tornando o desenvolvimento mais limpo e seguro.
 *  
 *  
 *  No caso do Exemplo abaixo, seria a forma antiga da que era usada no inicio do Java 1.4
 *  Exempo atual esta no package 'exemploDois'
 *  
 * */

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();		
		caixaA.setGuardar(2.3);     // double converte em wrapper Double com o autobox
		
		// Faz o cast para Double
		Double coisaA = (Double) caixaA.getAbri();
		System.out.println(coisaA);
		

	}

}
