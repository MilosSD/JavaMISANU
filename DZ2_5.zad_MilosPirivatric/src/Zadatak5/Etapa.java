package Zadatak5;

public class Etapa {

	double duzina;
	double brzina;
	double vreme;

	Etapa(double duzina, double brzina) {
		this.duzina = duzina;
		this.brzina = brzina;
	}

	public double getDuzina() {
		return duzina;
	}

	public double getBrzina() {
		return brzina;
	}

	public double izracunajVreme() {
		return duzina / brzina;
	}

}
