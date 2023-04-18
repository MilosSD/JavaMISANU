package K10;

public class Box {
	private double sirina;
	private double visina;
	private double dubina;

	Box() {
		sirina = 1;
		visina = 1;
		dubina = 1;
	}

	Box(double w, double h, double d) {
		sirina = w;
		visina = h;
		dubina = d;
	}

	Box(double len) {
		sirina = visina = dubina = len;
	}

	Box(Box b) {
		sirina = b.sirina;
		visina = b.visina;
		dubina = b.dubina;
	}

	double zapremina() {
		return sirina * visina * dubina;
	}
}
