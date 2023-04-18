package K5;

public class Krug {

	private double radius;

	Krug(double rad) {
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}
