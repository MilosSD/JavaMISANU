package K6;

public class Krug {

	private double poluprecnik;

	Krug() {
		poluprecnik = 0.0;
	}

	Krug(double radius) {
		this.poluprecnik = radius;
	}

	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
		/*
		 * This * * Kljucna rec this ili referenca this pruza nacin da metoda zna koji
		 * tacno objekat je pozvao metodu, tj sa cijim podacima radi. * Takodje, moze se
		 * koristiti za pristup podacima objekta koji su sakriveni lokalnim
		 * promenljivama ili parametrima metode. * Takodje, odnosi se na trenutni
		 * objekat u metodi ili konstruktoru.
		 */
	}
}
