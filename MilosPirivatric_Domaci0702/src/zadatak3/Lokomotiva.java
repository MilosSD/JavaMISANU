package zadatak3;

public class Lokomotiva extends vozilo {

	double vucnaSila;

	public String opis() {
		return "L(" + ukupnaTezina() + "|" + vucnaSila + ") ";
	}

}
