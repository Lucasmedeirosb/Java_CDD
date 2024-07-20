package basico2;

import java.util.Scanner;

public class notasFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos Alunos");
		double nota, soma = 0, media;
		int alunos = input.nextInt();
		for (int i = 1; i <= alunos; i++) {
			System.out.println("Informe as Notas");
			nota = input.nextDouble();
			soma = soma + nota;
	}
		media = soma/alunos;
		System.out.printf("A media %s", media);

	}}
