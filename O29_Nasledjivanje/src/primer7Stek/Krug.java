package primer7Stek;

public class Krug extends Oblik {

	double poluprecnik;

	public Krug(double r) {
		poluprecnik = r;

	}

	public double uzmiPovrsinu() {
		return Math.pow(poluprecnik, 2) * Math.PI;
	}

}
