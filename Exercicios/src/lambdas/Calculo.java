package lambdas;

// Esta notação indica que a interface terá somente um método abstrato, não termitindo criar mais de um.
// método Default ou Static são permitidos.
@FunctionalInterface  
public interface Calculo {

	// em interface, todo metodo eh publico e abstrato(isso fica implicito, mas eu deixei explicito)
	public abstract double executar(double a, double b);
	
	// metodo default
	default String legal() {
		return "legal";
	}
	
	// metodo estático
	static String muitoLegal() {
		return "muito legal";
	}
}
