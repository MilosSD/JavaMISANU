package Z6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Matrica m1 = new Matrica(5, 5);

		System.out.println(" Matrica ima: " + m1.getR() + " redova");
		System.out.println(" Matrica ima: " + m1.getK() + " kolona.");

		System.out.println(m1.postavi(1, 2, 3));
		System.out.println("Vrednost: " + m1.dohvati(1, 2));

		System.out.println(m1.toString());

	}

}
