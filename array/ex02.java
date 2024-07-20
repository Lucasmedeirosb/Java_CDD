package array;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas[] = new double[5];
        double total = 0;

        // Entrada das notas
        for(int x = 0; x < notas.length; x++) {
            System.out.println("Digite a nota " + (x+1) + ": ");
            notas[x] = input.nextDouble();
            total += notas[x]; // Calcula o total enquanto lê as notas
        }

        // Cálculo da média
        double media = total / notas.length;

        // Saída dos resultados
        System.out.println("Total das notas: " + total);
        System.out.println("Média das notas: " + media);

        input.close(); // Fechar o Scanner
    }
}
