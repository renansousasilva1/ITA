package padraopackage;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Audi q3";
		c1.velocidade = 0;
	
		Carro c2 = new Carro();
		c2.potencia = 15;
		c2.nome = "Audi q5";
		c2.velocidade = 0;
		
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		c1.imprimir();
		c2.imprimir();
		
	}

}
