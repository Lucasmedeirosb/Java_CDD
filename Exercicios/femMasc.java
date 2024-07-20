package Exercicios;
import java.util.Scanner;

public class femMasc {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o seu Sexo F ou M: ");
	char secso = input.next().charAt(0);
	if (secso == 'F' || secso == 'f') {
		System.out.println("Feminino");}
	else if (secso == 'M' || secso == 'm') {
		System.out.println("Masculino");
	}
	else {
		System.out.println("Opção Inválida!");
	}
	
	}

}
