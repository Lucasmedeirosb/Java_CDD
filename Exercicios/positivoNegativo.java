package Exercicios;

import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int numero;
	System.out.println("Digite um número: ");
	numero = input.nextInt();
	if (numero>0) {
		System.out.printf("O número %d é positivo", numero);
	}
	else if (numero<0)
		System.out.printf("O número %d é negativo", numero);
	else {
		System.out.println("Esse número é neutre");
	}
	}

}

