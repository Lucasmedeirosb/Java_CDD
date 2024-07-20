package Exercicios;
import java.util.Scanner;

public class maiorMenor {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n1;
	int n2;
	int n3;
	System.out.println("Digite o Primeiro número: ");
	n1 = input.nextInt();
	System.out.println("Digite o Segundo número: ");
	n2 = input.nextInt();
	System.out.println("Digite o Terceiro número: ");
	n3 = input.nextInt();
	
	if (n1 > n2) {
		if (n1 > n3) {
			System.out.printf("O %d é o maior", n1);
		}}
	else if (n2 > n3) {
		if(n2 > n3) {
			System.out.printf("O %d é o maior", n2);
			}}
	else if (n3 > n1) {
		if(n3 > n2) {
			System.out.printf("O %d é o maior", n3);
			}}
		
	}

}

