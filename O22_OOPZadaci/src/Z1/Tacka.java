package Z1;

public class Tacka {
	private double x;
	private double y;

	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}

	public String ispis() {
		return "(" + x + " , " + y + ")";
	}
}
