package Exercicios;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double n1;
	double n2;
	System.out.println("Digite a Primeira nota: ");
	n1 = input.nextDouble();
	System.out.println("Digite a Segunda nota: ");
	n2 = input.nextDouble();
	double media = (n1 + n2)/2;
	System.out.println(media);
	if (media >= 7) {
	System.out.printf("Aprovado, sua nota for %.2f", media);}
	else if (media >= 5) {
	System.out.printf("Recuperação, sua nota foi %.2f", media);}
	else if (media <= 4) {
		System.out.printf("Reprovado, sua nota foi %.2f", media);}
	
	}

}
