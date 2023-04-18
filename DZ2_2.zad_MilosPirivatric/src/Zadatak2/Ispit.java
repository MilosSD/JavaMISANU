package Zadatak2;

public class Ispit {

	private int maxDuzina = 6;

	String sifra;
	int ocena;

	public Ispit(String s, int o) {
		if (s.length() > maxDuzina) {
			this.sifra = s.substring(0, maxDuzina);
		} else
			this.sifra = s;

		if (o == 5) {
			this.ocena = o;
		} else if (o == 6) {
			this.ocena = o;
		} else if (o == 7) {
			this.ocena = o;
		} else if (o == 8) {
			this.ocena = o;
		} else if (o == 9) {
			this.ocena = o;
		} else if (o == 10) {
			this.ocena = o;
		} else if (o < 5) {
			this.ocena = 5;
		} else if (o > 10) {
			this.ocena = 10;
		}
	}

	public String opis() {
		return this.sifra + " : " + this.ocena;
	}

}
