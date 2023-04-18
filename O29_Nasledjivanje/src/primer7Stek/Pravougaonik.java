package primer7Stek;

public class Pravougaonik extends Oblik {

	double duzina;
	double sirina;

	Pravougaonik(double d, double s) {
		duzina = d;
		sirina = s;

	}

	public double uzmiPovrsinu() {
		return duzina * sirina;
	}

}
