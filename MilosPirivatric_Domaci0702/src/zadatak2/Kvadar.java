package zadatak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kvadar extends Predmet {

	private double a, b, c;

	Kvadar() {

	}

	Kvadar(double a, double b, double c) {
		super('k');
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public char getO() {
		return super.oznaka;
	}

	public double zapremina() {
		return this.a * this.b * this.c;
	}

	public double tezina() {
		return this.zapremina() * spTezina;
	}

	public String ispis() {
		return "Kvadar oznake: " + super.getOznaka() + ", ima stranice a: " + this.a + ",b: " + this.b + ", c: "
				+ this.c + " zapreminu: " + this.zapremina() + " i tezinu: " + this.tezina();
	}

	public static Kvadar dodajKvadar() throws NumberFormatException, IOException {
		Kvadar k = new Kvadar();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite a: ");
		double a = Double.parseDouble(bf.readLine());
		System.out.println("Unesite b: ");
		double b = Double.parseDouble(bf.readLine());
		System.out.println("Unesite c: ");
		double c = Double.parseDouble(bf.readLine());
		System.out.println("Unesite specificnu tezinu: ");
		double spT = Double.parseDouble(bf.readLine());
		k.a = a;
		k.b = b;
		k.c = c;
		k.spTezina = spT;
		k.oznaka = 'K';

		return k;
	}

}
