package array;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] a;
		a = new int[10];
		for(int i=0;i<10;i++) {
			System.out.printf("Digite o %dº valor do array: ", i+1);
			a[i] = sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		int[] b;
		b = new int[10];
		for(int y=0;y<10;y++) {
			System.out.printf("Digite o %dº valor do array dois: ", y+1);
			b[y] = sc.nextInt();
		}
		for(int t=0;t<b.length;t++) {
			System.out.print(a[t]+" ");
		}
		
		int[] c;
		c = new int[10];
		for(int p=0;p<10;p++) {
			System.out.printf("Digite o %dº valor do array três: ", p+1);
			c[p] = sc.nextInt();
		}
		for(int h=0;h<c.length;h++) {
			System.out.print(a[h]+" ");
		}

	}

}
