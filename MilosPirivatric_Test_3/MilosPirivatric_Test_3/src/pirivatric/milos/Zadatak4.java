package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		System.out.print("Unesite dimenziju matrice N: ");
		int n = sc.nextInt();
		
		double A [][] = new double [n][n];
		double B [][] = new double [n][n];
		double C [][] = new double [n][n];
		
		System.out.println("Unesite vrednost elemenata matrice A: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("A["+i+","+j+"]= ");
				A[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Unesite vrednost elemenata matrice B: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("B["+i+","+j+"]= ");
				B[i][j] = sc.nextDouble();
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i<j)
					C[i][j] = Math.pow(A[i][j], 2) - Math.pow(B[i][j], 2);
				else if (i>j)
					C[i][j] = Math.sqrt(Math.pow(A[i][j], 2) + Math.pow(B[i][j], 2));
					else
						C[i][j] = Math.abs(A[i][j])+Math.abs(B[i][j])+1;
					}
			}
		System.out.println("Matrica C: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(df.format(C[i][j])+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
