package zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zaposlen extends Osoba {

	public String firma;
	public String odeljenje;

	Zaposlen() {
		super();
	}

	Zaposlen(String i, String d, String a, String f, String o) {
		super(i, d, a);
		this.firma = f;
		this.odeljenje = o;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}

	public String toString(String firma, String odeljenje) {
		return super.toString() + "\nFirma:" + firma + "\nOdeljenje: " + odeljenje;
	}

	public void unosZaposlen() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		super.unosOsoba();
		System.out.println("Unesite naziv firme: ");
		this.firma = bf.readLine();
		System.out.println("Unesite odeljenje: ");
		this.odeljenje = bf.readLine();
	}

}
