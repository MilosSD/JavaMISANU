package pirivatric.milos;

import java.util.Scanner;

public class horoskop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mesec;
		int datum;
		System.out.print("Unesite mesec rodjenja (pocevsi veikim slovom): ");
		mesec = sc.nextLine();

		System.out.print("Unesite dan rodjenja: ");
		datum = sc.nextInt();

		switch (mesec) {

		case "Januar":
			if (datum <= 20 && datum >= 1) {
				System.out.println("Horoskopski znak je: Jarac");
			} else if (datum >= 21 && datum <= 31) {
				System.out.println("Horoskopski znak je: Vodolija");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Februar":
			if (datum <= 19 && datum >= 1) {
				System.out.println("Jarac");
			} else if (datum >= 20 && datum <= 28) {
				System.out.println("Horoskopski znak je: Ribe");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Mart":
			if (datum <= 20 && datum >= 1) {
				System.out.println("Horoskopski znak je: Ribe");
			} else if (datum >= 20 && datum <= 31) {
				System.out.println("Horoskopski znak je: Ovan");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "April":
			if (datum <= 21 && datum >= 1) {
				System.out.println("Horoskopski znak je: Ovan");
			} else if (datum >= 22 && datum <= 30) {
				System.out.println("Horoskopski znak je: Bik");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Maj":
			if (datum <= 21 && datum >= 1) {
				System.out.println("Horoskopski znak je: Bik");
			} else if (datum >= 22 && datum <= 31) {
				System.out.println("Horoskopski znak je: Blizanci");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Jun":
			if (datum <= 21 && datum >= 1) {
				System.out.println("Horoskopski znak je: Blizanci");
			} else if (datum >= 22 && datum <= 30) {
				System.out.println("Horoskopski znak je: Rak");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Jul":
			if (datum <= 22 && datum >= 1) {
				System.out.println("Horoskopski znak je: Rak");
			} else if (datum >= 23 && datum <= 31) {
				System.out.println("Horoskopski znak je: Lav");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Avgust":
			if (datum <= 23 && datum >= 1) {
				System.out.println("Horoskopski znak je: Lav");
			} else if (datum >= 24 && datum <= 31) {
				System.out.println("Horoskopski znak je: Devica");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Septembar":
			if (datum <= 23 && datum >= 1) {
				System.out.println("Horoskopski znak je: Devica");
			} else if (datum >= 24 && datum <= 30) {
				System.out.println("Horoskopski znak je: Vaga");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Oktobar":
			if (datum <= 23 && datum >= 1) {
				System.out.println("Horoskopski znak je: Vaga");
			} else if (datum >= 24 && datum <= 31) {
				System.out.println("Horoskopski znak je: Skorpija");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Novembar":
			if (datum <= 23 && datum >= 1) {
				System.out.println("Horoskopski znak je: Skorpija");
			} else if (datum >= 24 && datum <= 30) {
				System.out.println("Horoskopski znak je: Strelac");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		case "Decembar":
			if (datum <= 21 && datum >= 1) {
				System.out.println("Horoskopski znak je: Strelac");
			} else if (datum >= 22 && datum <= 30) {
				System.out.println("Horoskopski znak je: Jarac");
			} else {
				System.out.println("Pogresan unos!");
			}
			break;
		default: {
			System.out.println("Pogresan unos!");
		}
		}
		sc.close();
	}
}
