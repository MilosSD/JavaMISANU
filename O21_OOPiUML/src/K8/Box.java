package K8;

public class Box {
	private double sirina;
	private double visina;
	private double dubina;

	Box(double w, double h, double d) {
		sirina = w;
		visina = h;
		dubina = d;
	}

	double volume() {
		return sirina * visina * dubina;
	}
}
