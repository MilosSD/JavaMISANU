package Z3;

public class Valjak {
	private double r, h;

	Valjak(double rr, double hh) {
		r = rr;
		h = hh;
	}

	Valjak() {
		r = 1;
		h = 1;
	}

	private double getR() {
		return r;
	}

	private double getH() {
		return h;
	}

	public double zapremina() {
		return 3.14 * r * r * h;
	}

	public void opis() {
		System.out.println(
				"Valjak poluprecnika osnove r= " + r + " , i visine h= " + h + " ima zapreminu: " + 3.14 * r * r * h);
	}
}
