package zadatak3;

public class Sanduk extends teret {
	{
		super.oznaka = 'S';
		super.spT = 2.0;
	}
	public double a;
	public double b;
	public double c;

	Sanduk() {
		this.a = 1;
		this.b = 2;
		this.c = 3;
	}

	public void setId(int i) {
		id = i;
	}

	public double zapremina() {
		return this.a * this.b * this.c;
	}

	public double tezina() {
		return this.zapremina() * spT;
	}

	public String opis() {
		return "oznaka:" + oznaka + " ," + " ID: " + id;
	}

}
