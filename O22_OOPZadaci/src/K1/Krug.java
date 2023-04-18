package K1;

public class Krug {
	private double radius;

	Krug() { // konstruktor bez parametara
		radius = 0.0;
	}

	Krug(double radius) { // ima jedan parametar
		this.radius = radius;
	}

	Krug(Krug ob) { // ima objekat kao parametar
		radius = ob.radius; // postupak inicijalizacije polja objekta klase
	}

	public double area() {
		return 3.14 * radius * radius;
	}

}
