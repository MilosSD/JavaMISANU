package AL2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlBrojevi {

	Scanner sc = new Scanner(System.in);

	List<Integer> brojevi = new ArrayList<Integer>();

	void unosBrojeva() {
		System.out.println("Za  prekid unosenja, unesite -1: ");
		while (true) {
			System.out.println("Unesite broj: ");
			int num = sc.nextInt();
			if (num == -1) {
				return;
			}
			this.brojevi.add(num); // smestanje ucitanih vrednosti sa konzole u kolekciju
		}
	}

	void ispisBrojeva() {
		System.out.println(this.brojevi);
	}

}
