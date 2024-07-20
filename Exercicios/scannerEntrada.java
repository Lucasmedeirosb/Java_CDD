package Exercicios;
import java.util.Scanner;


public class scannerEntrada {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String nome;
	int idade;
	System.out.println("Digite o seu nome: ");
	nome = input.nextLine();
	System.out.println("Digite a sua idade: ");
	idade = input.nextInt();
	System.out.println(nome + " " + idade);
	System.out.printf("Olá %s, sua idade é %d", nome, idade);
	/* %s = String %d = int %f = Float */
	
	}

}
