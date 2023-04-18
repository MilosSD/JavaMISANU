package Zadatak4;

public class Tacka {

	double masa = 1;
	double x = 0;
	double y = 0;
	double z = 0;

	Tacka() {

	}

	Tacka(double m, double x, double y, double z) {
		this.masa = m;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double rastojanje(Tacka t) {
		return Math.sqrt(
				(t.x - this.x) * (t.x - this.x) + (t.y - this.y) * (t.y - this.y) + (t.z - this.z) * (t.z - this.z));
	}

	public double privlacnaSila(Tacka t) {
		double r = this.rastojanje(t);
		return (6.67e-11 * this.masa * t.masa) / Math.pow(r, 2);
	}

	public String opis() {
		return "Tačka koordinata x = " + this.x + " y = " + this.y + " z = " + this.z + " Mase m = " + this.masa;
	}
}
