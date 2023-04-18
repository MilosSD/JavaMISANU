package milos.pirivatric;

import java.util.Scanner;

public class Zadatak6_Milos_Pirivatric {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int br, i=0;
		
		System.out.println("Unesite broj: ");
		br = sc.nextInt();
		
		while (br>0) {
			br/=10;
			i++;
		}
		System.out.println("Ukupan broj cifara je: "+ i);
		sc.close();

	}

}
