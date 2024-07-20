package basico3;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o texto 1: ");
		String s1 = sc.next();
		System.out.println("Digite o texto 2: ");
		String s2 = sc.next();
		
		boolean b1 = s1.equals(s2);
		if (b1 == true) {
		System.out.println("São iguais");}
		else {
			System.out.println("São diferentes");
		
		}
	}

}

