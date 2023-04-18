package K7;

public class Box {
	private double sirina;
	private double visina;
	private double dubina;

	Box() {
		sirina = 10;
		visina = 10;
		dubina = 10;
	}

	double volume() {
		return sirina * visina * dubina;
	}
}
