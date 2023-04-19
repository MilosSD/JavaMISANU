package P1;

import java.io.Serializable;

public class Student implements Serializable {

	/*
	 * Interfejs Serializable ne sadrži bilo kakve metode. Implementira se kod klasa
	 * čiji se objekti žele serijalizovati ili deserijalizovati. Sam taj proces
	 * obavljaju klase ObjectOutputStream i ObjectInputStream.
	 */
	private String ime;
	private String prezime;
	private String brIndeksa;
	private String odeljenje;

	public Student(String ime, String prezime, String brIndeksa, String odeljenje) {

		this.ime = ime;
		this.prezime = prezime;
		this.brIndeksa = brIndeksa;
		this.odeljenje = odeljenje;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}

	@Override
	public String toString() {
		return "Student: " + ime + " " + prezime + "\nBroj indeksa: " + brIndeksa + "\nOdeljenje: " + odeljenje;
	}

}
