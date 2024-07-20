package POO;

public class Aplicacao {

	public static void main(String[] args) {
		Carro c1 = new Carro("Amarelo", "1.0 a água", 12000);
		
		c1.cor = "Vermelho";
		c1.motor = "turbo diesel 4.0";
		c1.valor = 250.000;
		c1.status();
		c1.ligar();
		c1.desligar();
		c1.status();
		c1.ligar();
		c1.status();
		
	 Honda CarroHonda = new Honda("1.0", "Verde", 63.000); 
		c1.status();
	}

}
