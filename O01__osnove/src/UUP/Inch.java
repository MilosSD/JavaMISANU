package UUP;

import java.util.Scanner;

public class Inch {

	public static void main(String[] args) {

		/*Sastaviti algoritam i napisati program za prevo?enje dužine zadate u in?ima u centimetre, ako važi relacija 1 in? = 2.54 cm. 
Na izlazu štampati koliko iznosi u centimetrima dijagonala televizora od 26 in?a.*/

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite duzinu dijagonale u incima: ");

		int n = input.nextInt();

		double d = n * 2.54;

		// Stampanje rezultata
		System.out.println("Duzina dijagonale u centimetrima " + d + " cm");
	}
}
