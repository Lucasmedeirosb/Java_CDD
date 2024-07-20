package Encapsulamento;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Pet p1 = new Pet();
		Retangulo r1 = new Retangulo(8,6);
		/*int vacinado = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Certidão De Nascimento");
		System.out.println("Digite o nome do seu Pet: ");
		p1.setNome(sc.nextLine());
		System.out.println("Digite a Raça do seu Pet: ");
		p1.setTipo(sc.nextLine());
		System.out.println("Digite o Signo do seu Pet: ");
		p1.setSigno(sc.nextLine());
		System.out.println("Digite o nome do padrinho do seu Pet ");
		p1.setPadrinho(sc.nextLine());
		System.out.println("Digite o Seu Nome: ");
		p1.setNomeDono(sc.nextLine());
		System.out.println("Digite a Cor do seu Pet: ");
		p1.setCor(sc.nextLine());
		System.out.println("Digite a idade do seu pet: ");
		p1.setIdade(sc.nextInt());
		System.out.println("O seu Cachorro é vacinado Sim[1] ou Não[2]");
		vacinado = sc.nextInt();
		if(vacinado == 1) {
			p1.setVacinado(true);
		}
		else {
			p1.setVacinado(false);
		}
		sc.close();*/
		
		
		double area = r1.CalculoArea();
		System.out.println(area);
		double perimetro = r1.CalculoPerimetro();
		System.out.println(perimetro);
		
	}
}


