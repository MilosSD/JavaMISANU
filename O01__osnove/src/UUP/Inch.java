package UUP;

import java.util.Scanner;

public class Inch {

	public static void main(String[] args) {

		/*Sastaviti algoritam i napisati program za prevo?enje du�ine zadate u in?ima u centimetre, ako va�i relacija 1 in? = 2.54 cm. 
Na izlazu �tampati koliko iznosi u centimetrima dijagonala televizora od 26 in?a.*/

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite duzinu dijagonale u incima: ");

		int n = input.nextInt();

		double d = n * 2.54;

		// Stampanje rezultata
		System.out.println("Duzina dijagonale u centimetrima " + d + " cm");
	}
}
