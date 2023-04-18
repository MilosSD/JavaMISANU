package zadatak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sfera extends Predmet {

	private double r;

	public Sfera() {
	}

	Sfera(double r) {
		super('s');
		this.r = 1;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public char getO() {
		return super.oznaka;
	}

	public double zapremina() {
		return 4 / 3 * Math.pow(r, 3) * Math.PI;
	}

	public double tezina() {
		return this.zapremina() * spTezina;
	}

	public static Sfera dodajSferu() throws NumberFormatException, IOException {
		Sfera sfera = new Sfera();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite r: ");
		double r = Double.parseDouble(bf.readLine());
		System.out.println("Unesite specificnu tezinu: ");
		double spT = Double.parseDouble(bf.readLine());
		sfera.r = r;
		sfera.spTezina = spT;
		sfera.oznaka = 'S';

		return sfera;
	}

	public String ispis() {
		return "Sfera oznake: " + super.getOznaka() + ", ima poluprecnik: " + r + " zapreminu: " + this.zapremina()
				+ " i tezinu: " + this.tezina();
	}

}
