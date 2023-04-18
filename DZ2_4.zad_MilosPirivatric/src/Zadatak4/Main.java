package Zadatak4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Niz n = new Niz();
		System.out.println("Unesite tačke u niz. Za prekid unosa unesite negativnu vrednost mase. ");
		double m = 0;
		while (m >= 0) {
			System.out.println("Nova tačka: ");
			System.out.print("m = ");
			m = sc.nextDouble();
			if (m < 0)
				break;
			System.out.print("x = ");
			double x = sc.nextDouble();
			System.out.print("y = ");
			double y = sc.nextDouble();
			System.out.print("z = ");
			double z = sc.nextDouble();
			Tacka t = new Tacka(m, x, y, z);
			n.dodajTacku(t);
		}

		Tacka to = new Tacka();

		System.out.println("Niz: " + n.opisNiza());
		System.out.println(
				"Tačka sa najvećom privlačnom silom u odnosu na \ntačku jedinične mase u koordinatnom početku: "
						+ n.getTackaPrivlacenja(to));

		sc.close();

	}

}
