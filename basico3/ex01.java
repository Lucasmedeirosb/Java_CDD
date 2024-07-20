package basico3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um Texto?");
		String texto = input.nextLine();
		StringTokenizer exemplo = new StringTokenizer(texto);
		System.out.println(exemplo.countTokens());
	}

}
