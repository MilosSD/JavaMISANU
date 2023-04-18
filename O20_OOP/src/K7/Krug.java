package K7;

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
	}
}