package Metodos;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		CalcularMetodos calculadora1=new CalcularMetodos();
		Scanner sc = new Scanner(System.in);
		char continuar='s';
		int valor1=0;
		int valor2=0;
		int valor3=0;
		while(continuar=='s' || continuar=='S') {
		System.out.println("ESCOLHA: \n1 = Somar\n2 = Subtrair\n3 = Multiplicar\n4 = Dividir\n");
		int escolha = sc.nextInt();
		if(escolha==1) {
			System.out.println("2=Soma de dois números\n3=Soma de três números");
			int escolha2=sc.nextInt();
			if (escolha2==2){
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo e último valor: ");
				valor2=sc.nextInt();
				double resultado=calculadora1.somar(valor1, valor2);
				System.out.println(resultado);
			}
			else {
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo valor: ");
				valor2=sc.nextInt();
				System.out.println("Digite o terceiro e último valor: ");
				valor3=sc.nextInt();
				double resultado=calculadora1.somar(valor1, valor2, valor3);
				System.out.println(resultado);
			}
		}
		else if(escolha==2) {
			System.out.println("2=Subtração de dois números\n3=Subtração de três números");
			int escolha2=sc.nextInt();
			if (escolha2==2){
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo e último valor: ");
				valor2=sc.nextInt();
				double resultado=calculadora1.subtrair(valor1, valor2);
				System.out.println(resultado);
			}
			else {
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo valor: ");
				valor2=sc.nextInt();
				System.out.println("Digite o terceiro e último valor: ");
				valor3=sc.nextInt();
				double resultado=calculadora1.subtrair(valor1, valor2, valor3);
				System.out.println(resultado);
			}
		}
		else if(escolha==3) {
			System.out.println("2=Multiplicação de dois números\n3=Multiplicação de três números");
			int escolha2=sc.nextInt();
			if (escolha2==2){
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo e último valor: ");
				valor2=sc.nextInt();
				double resultado=calculadora1.multiplicar(valor1, valor2);
				System.out.println(resultado);
			}
			else {
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo valor: ");
				valor2=sc.nextInt();
				System.out.println("Digite o terceiro e último valor: ");
				valor3=sc.nextInt();
				double resultado=calculadora1.multiplicar(valor1, valor2, valor3);
				System.out.println(resultado);
			}
		}
		else if(escolha==4){
			System.out.println("2=Divisão de dois números\n3=Divisão de três números");
			int escolha2=sc.nextInt();
			if (escolha2==2){
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo e último valor: ");
				valor2=sc.nextInt();
				double resultado=calculadora1.dividir(valor1, valor2);
				System.out.println(resultado);
			}
			else {
				System.out.println("Digite o primeiro valor: ");
				valor1=sc.nextInt();
				System.out.println("Digite o segundo valor: ");
				valor2=sc.nextInt();
				System.out.println("Digite o terceiro e último valor: ");
				valor3=sc.nextInt();
				double resultado=calculadora1.dividir(valor1, valor2, valor3);
				System.out.println(resultado);
			}
		}
		System.out.println("Deseja continuar? - Digite S ou s");
		continuar=sc.next().charAt(0);
		}

	}

}