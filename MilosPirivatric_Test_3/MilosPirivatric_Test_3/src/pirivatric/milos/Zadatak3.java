package pirivatric.milos;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Unesite dimenziju matrice N: ");
		int n = sc.nextInt();
		
		int A [][] = new int [n][n];
		
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++) {
				if (j==i || j+i==n-1)
					A[i][j] = 1;
				else 
					A[i][j] = 0;
			}
		
		System.out.println("Matrica A: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
