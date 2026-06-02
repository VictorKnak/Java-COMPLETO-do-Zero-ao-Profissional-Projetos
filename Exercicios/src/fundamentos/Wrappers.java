package fundamentos;

/*
 * Wrapper:
 * Quer dizer "embrulho" que envolve um tipo primitivo.
 * Permitindo que os tipos primitivos tenham recursos como 
 * classes.
 * */
public class Wrappers {

	public static void main(String[] args) {

		// Tipos primitivos declarados normalmente
		byte b = 100;
		short s = 1000;
		int i = 1;
		long l = 100000L;
		float f = 123.0F;
		boolean bo = true;
		
		// Impressao dos tipo, sem a utilizacao de classes
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(bo);
		System.out.println("------------------------\n");
		
		
		// Tipos primitivos declarados como classes - (Wrapper's)
		System.out.println("Wrapper - Utilizando classes de tipos primitivos:");
		
		// byte
		Byte bi = 100;
		System.out.println(".byteValue() => " + bi.byteValue());
		
		// short
		Short sh = 1000;
		System.out.println(".toString() => " + sh.toString());     // converte em string
		
		// int
		//Integer in = 1;
		Integer in2 = Integer.parseInt("1000");   // converte string para numerico
		System.out.println("Integer.parseInt('1000') => " + in2 * 3);
		
		// long
		Long lo = 100000L;
		System.out.println("Imprimindo o Long => " + lo / 3);
		
		// float
		Float fl = 123.0F;
		System.out.println("Float .toString() => " + fl.toString());
		
		// double
		Double dob = 1234.5678;
		System.out.println("Double => " + dob);		
	
		// boolean
		Boolean bol = Boolean.parseBoolean("true");				// transforma string para boolean
		System.out.println("Boolean.parseBoolean(\"true\") => " + bol);
		System.out.println(bol.toString().toUpperCase());
		
		// char
		Character c = '#';			// Tipos caractere precisam ser declarados com aspas simpls, aspas duplas sao para String
		System.out.println("Character => " + c.toString());  // Transforma o caractere em String

	}

}
