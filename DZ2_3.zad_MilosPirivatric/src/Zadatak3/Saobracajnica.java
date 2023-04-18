package Zadatak3;

public class Saobracajnica {

	String ime;
	double duzina;

	public Saobracajnica(String i, double d) {
		if (i.length() > 30) {
			this.ime = i.substring(0, 31);
		} else
			this.ime = i;
		this.duzina = d;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}

	public String opis() {
		return ime + "(" + this.duzina + ")";
	}

}
