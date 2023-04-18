package zadatak3;

public class Bure extends teret {
	{
		super.oznaka = 'B';
		super.spT = 3.0;
	}
	public double r;
	public double h;

	Bure() {
		this.r = 1;
		this.h = 3;
	}

	public void setId(int i) {
		id = i;
	}

	public double zapremina() {
		return Math.pow(r, 2) * Math.PI * h;
	}

	public double tezina() {
		return this.zapremina() * spT;
	}

	public String opis() {
		return "oznaka:" + oznaka + " ," + " ID: " + id;
	}
}
