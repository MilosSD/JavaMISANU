package K9;

public class Box {

	private double sirina;
	private double visina;
	private double dubina;

	Box(double sirina, double visina, double dubina) {
		this.sirina = sirina;
		this.visina = visina;
		this.dubina = dubina;
	}

	double zapremina() {
		return sirina * visina * dubina;
	}
}
