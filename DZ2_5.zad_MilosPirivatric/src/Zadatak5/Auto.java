package Zadatak5;

import java.util.ArrayList;
import java.util.List;

public class Auto extends Vozilo {

	int kapacitet = 10;

	List<Voznja> auto = new ArrayList<Voznja>(kapacitet);

	Auto(double tezina) {
		this.vrsta = "auto";
		this.tezina = tezina;
	}

	public void novaVoznja() {
		Voznja n = new Voznja(100);
		auto.add(n);
	}

	public void dodajVoznju(Voznja v) {
		try {
			auto.add(v);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška! Kapacitet je popunjen! ");
			e.printStackTrace();
		}
	}

	public void dodajEtapuPoslVoznji(Etapa e) {
		Voznja v = auto.get(auto.size());
		v.dodajEtapu(e);
		auto.set(auto.size(), v);
	}

	public Voznja maxBrzina() {
		Voznja a = auto.get(1);
		for (Voznja v : auto) {
			if (v.srednjaBrzina() > a.srednjaBrzina()) {
				a = v;
			}
		}
		return a;
	}

	public String opisAuta() {
		Voznja maxbr = this.maxBrzina();
		return super.opis() + "\nDuzina vožnje sa najvećom srednjom brzinom: " + maxbr.ukupnaDuzinaVoznje()
				+ "\nTrajanje vožnje sa najvećom srednjom brzinom: " + maxbr.ukupnoVremeVoznje()
				+ "\nNajveća srednja brzina vožnje: " + maxbr.srednjaBrzina();
	}

}
