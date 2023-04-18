package zadatak2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite trocifren broj: ");
		int br = sc.nextInt();

		int s = br / 100;
		int d = (br / 10) % 10;
		int j = br % 10;

		System.out.println("Cifra stotina: " + s + ", desetica: " + d + ", jedinica: " + j);
		System.out.println("Proizvod cifara unetog broja = " + (s * d * j));
		System.out.println("Suma kubova cifara: " + (Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3)));
		System.out.println("Broj dobijen obrnutim redosledom cifara: " + (j * 100 + d * 10 + s));

		sc.close();
	}

}
