package zadatak2;

public class Student {

	String ime;
	String prezime;
	String adresa;
	int brojIndeksa;

	Student(String ime, String prezime, String adresa, int brojIndeksa) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;

		if (brojIndeksa > 0 && brojIndeksa < 100)
			this.brojIndeksa = brojIndeksa;
		else
			throw new Izuzetak(brojIndeksa);
	}

	// Metoda za ispisivanje podataka o studentu
	public void ispisi() {
		System.out.println(ime + "\t" + prezime + "\t" + adresa + "\t" + brojIndeksa);
	}
}