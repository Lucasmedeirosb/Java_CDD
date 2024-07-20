/*escreva um programa que pergunte ao usuario quantos alunos tem
na sala dele. em seguida atraves de um laço while, pede ao usuario
para que digite as notas de todos os alunos da sala um por vez,
por fim o programa mostra a média  aritimmettica da turma*/

package basico2;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos têm na sala?");
		int qtdAlunos = input.nextInt();
		while (qtdAlunos <= 0 ) {
			System.out.println("Números de alunos inválido. Digite novamente: ");
			qtdAlunos = input.nextInt();
		}
		
		double somaNotas = 0.0;
		double media;
		
		int contador = 1;
        while (contador > qtdAlunos) {
            System.out.print("Digite a nota do aluno " + contador + ": ");
          
			double nota = input.nextDouble();
            
        while (nota < 0 || nota > 10) {
        	System.out.println("Nota inválida. Digite novamente:");
        	nota = input.nextDouble();
        }
        somaNotas += nota;
        contador++;
		}
        media = somaNotas / qtdAlunos;
        
        System.out.println("A média da turma é: " + media);
        
		input.close();
		
	}
}


