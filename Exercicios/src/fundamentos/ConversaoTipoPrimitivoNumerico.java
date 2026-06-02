package fundamentos;

/*
 * Nas conversoes de tipos primitivos, todos os numero que forem
 * convertidos para tipos maiores(int -> double), o Java realiza
 * esta conversao Implicitamente.
 * Mas quando a conversao for para tipo menores, essa conversao
 * devera ser Explicita, pois gera o truncamento da informacao
 * e consequentemente a perca de uma parte dos dados
 * */

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// Colocando um int dentro de um double -> OK
		double d = 1;
		System.out.println(d);
		
		/****************************************************/		
		// realizando a conversao explicitamente, de um Double para um Float com perca de dados
		float fl = (float) 1.12345678888888;     // Explicita (CAST)
		System.out.println(fl);
		
		float fl2 = 1.12345678888888F;           // Explicita forma mais simples
		System.out.println(fl2);		
		
		/****************************************************/
		// Converte int para byte, respeitando o range do Byte
		int c = 127;
		byte b = (byte) c;                      // Explicita (CAST)
		System.out.println(b);
		
		/****************************************************/		
		// converte de double para int
		double e = 1.999999999;
		int f = (int) e;                         // Explicita (CAST)
		System.out.println(f);
		

	}

}
