package zadatak1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tacka {

	public double x;
	public double y;

	Tacka() {

	}

	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String ispis() {
		return "(" + x + " , " + y + ")";
	}

	public double rastojanje(Tacka b) {
		return Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2));
	}

	public void citaj() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite x: ");
		setX(Double.parseDouble(bf.readLine()));
		System.out.println("Unesite y: ");
		setY(Double.parseDouble(bf.readLine()));
	}

}
