package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Niz<T> {

	int kapacitet = 20;

	List<T> niz = new ArrayList<T>(kapacitet);

	public void dodajElement(T t) {

		try {
			this.niz.add(t);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška! Niz je prepunjen. ");
			e.printStackTrace();
		}
	}

	public int getBrElemenata() {
		return niz.size();
	}

	public T getElement(int indeks) {
		T t = null;
		try {
			t = niz.get(indeks);
			if (t.equals(null)) {
				System.out.println("Greška! Element ne postoji! ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška! Element ne postoji! ");
			e.printStackTrace();
		}
		return t;
	}

	public void isprazniNiz() {
		this.niz.clear();
	}
}
