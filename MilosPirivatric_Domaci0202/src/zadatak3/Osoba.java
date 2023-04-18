package zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Osoba {

	String ime;
	String datumRodjenja;
	String adresa;

	Osoba() {
	}

	Osoba(String i, String d, String a) {
		this.adresa = a;
		this.datumRodjenja = d;
		this.ime = i;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String toString() {
		return "Ime: " + ime + "\nDatum rodjenja: " + datumRodjenja + "\nAdresa: " + adresa;
	}

	public void unosOsoba() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite ime osobe: ");
		this.ime = bf.readLine();
		System.out.println("Unesite datum rodjenja: ");
		this.datumRodjenja = bf.readLine();
		System.out.println("Unesite adresu: ");
		this.adresa = bf.readLine();

	}

}
