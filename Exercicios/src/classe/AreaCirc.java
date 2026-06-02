package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14;   // 'static' identifica que a variavel esta associada somente a classe e nao a estancia
	
	// construtor
	AreaCirc(double raio) {
      this.raio = raio;      
	}
	
	// metodo
	double area() {
		return pi * Math.pow(raio, 2);  // formula para calcular raio 'pow' metodo estatico
	}
	
	// metodo static-(mesmo sendo estaico, a assinatura deve ser difernte por conta do mesmo nome)
	static double area(double raio) {
		return pi * Math.pow(raio, 2);		
	}
	
}
