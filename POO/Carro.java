package POO;

public class Carro {
			//Atributos
			public String motor;
			public String cor;
			public double valor;
			public boolean status;
			//metodo construtor
			
			public Carro() {
				
			}
			
			public Carro(String cor, double valor) {
				this.cor=cor;
				this.status = false;
				this.valor = valor;
			}
			
			public Carro(String cor, String motor, double valor) {
				this.cor = cor;
				this.motor = motor;
				this.valor = valor;
				this.status = false;
				
		}
			public void ligar() {
				if (status == false) {
				this.status = true;
				System.out.println("Carro ligou");
				}else {
					System.out.println("O carro já estava ligado");
				}
			}
			
			public void desligar() {
				if (status == true) {
				this.status = false;
				System.out.println("Carro Desligou");
				}else {
					System.out.println("O Carro já estava desligado");
				}
			}
			
			public void status() {
				if(this.status == false) {
					System.out.println("O carro está desligado!");
				}
				else {
					System.out.println("O carro está ligado");
				}
			}
			

	}

