package Zadatak4;

import java.util.ArrayList;
import java.util.List;

public class Meni {

	int kapacitet;
	List<Namirnica> m = new ArrayList<Namirnica>(kapacitet);

	Meni(int k) {
		this.kapacitet = k;
	}

	public void dodajNamirnicu(Namirnica n) {
		m.add(n);
	}

	public double ukupnaEV() {
		double ev = 0;
		for (Namirnica n : m) {
			ev = ev + n.izracunajEnergetskuVred();
		}
		return ev;
	}

	public void opis() {
		System.out.print("{ ");
		for (Namirnica n : m) {

			System.out.print(n.opis() + ", ");
		}
		System.out.print(" }" + " [" + ukupnaEV() + "] ");
	}

}
