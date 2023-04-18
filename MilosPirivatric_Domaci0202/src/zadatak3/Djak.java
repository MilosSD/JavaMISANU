package zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Djak extends Osoba {

	String skola;
	int razred;

	Djak() {
		super();
	}

	Djak(String i, String d, String a, String s, int r) {
		super(i, d, a);
		this.skola = s;
		this.razred = r;

	}

	public String getSkola() {
		return skola;
	}

	public void setSkola(String skola) {
		this.skola = skola;
	}

	public int getRazred() {
		return razred;
	}

	public void setRazred(int razred) {
		this.razred = razred;
	}

	public String toString(String s, int r) {
		return super.toString() + "\nSkola:" + skola + "\nRazred: " + r;
	}

	public void unosDjak() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		super.unosOsoba();
		System.out.println("Unesite naziv skole: ");
		this.skola = bf.readLine();
		System.out.println("Unesite razred: ");
		this.razred = bf.read();
	}

}
