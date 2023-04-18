package Zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Niz {

	int kapacitet = 5;

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	List<ZarubljenaKupa> niz = new ArrayList<ZarubljenaKupa>(kapacitet);

	public void dodajKupu(ZarubljenaKupa zk) {

		try {
			niz.add(zk);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greska! Niz je popunjen. d");
			e.printStackTrace();
		}
	}

	public int getPopunjenaMesta() {
		return niz.size();
	}

	public boolean imaLiMesta() {
		boolean slobodno = false;

		if (this.niz.size() < this.kapacitet)
			slobodno = true;

		return slobodno;
	}

	public ZarubljenaKupa getZk(int indeks) {
		return niz.get(indeks);
	}

	public int najmanjaZapremina() {
		int indeks = 0;
		ZarubljenaKupa z1 = niz.get(0);
		double min = z1.zapreminaKupe();
		for (ZarubljenaKupa z : niz) {
			if (z.zapreminaKupe() < min) {
				min = z.zapreminaKupe();
				indeks = niz.indexOf(z);
			}
		}
		for (ZarubljenaKupa z : niz) {
			if (min == z.zapreminaKupe()) {
				indeks = niz.indexOf(z);
			}
		}
		return indeks;
	}

	public void obrisiKupu(int indeks) {
		try {
			niz.remove(indeks);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška! Uneta vrednost je van granica niza! ");
			e.printStackTrace();
		}
	}
}