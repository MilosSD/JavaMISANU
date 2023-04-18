package Zadatak1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZarubljenaKupa {

	int r1 = 2;
	int r2 = 1;
	int h = 1;

	ZarubljenaKupa() {

	}

	ZarubljenaKupa(int r1, int r2, int h) {
		this.r1 = r1;
		this.r2 = r2;
		this.h = h;
	}

	public int getR1() {
		return r1;
	}

	public int getR2() {
		return r2;
	}

	public int getH() {
		return h;
	}

	public void setR1(int r1) {
		this.r1 = r1;
	}

	public void setR2(int r2) {
		this.r2 = r2;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double zapreminaKupe() {
		return Math.PI * h * (Math.pow(r1, 2) + Math.pow(r2, 2) + r1 * r2) / 3;
	}

	public boolean ispitajZapremine(ZarubljenaKupa k1, ZarubljenaKupa k2) {
		boolean ispitivanje = false;
		if (k1.zapreminaKupe() < k2.zapreminaKupe())
			ispitivanje = true;
		return ispitivanje;
	}

	public void citanjeDimenzija(String filepath) throws FileNotFoundException {
		Scanner sc;
		try {
			File fajl = new File(filepath);
			sc = new Scanner(fajl);

			while (sc.hasNextLine()) {
				String podaci = sc.nextLine();
				setR1(podaci.charAt(3));
				setR2(podaci.charAt(5));
				setH(podaci.charAt(7));
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fajl koji se nalazi na navedenoj lokaciji nije pronađen!");
			e.printStackTrace();
		}
	}

	public void upisDimenzija() {
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("dimenzije.txt", true));
			bw.write("K(" + this.getR1() + "," + this.getR2() + "," + this.getH() + ")");
			bw.newLine();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String opisKupe() {
		return "K(" + this.getR1() + "," + this.getR2() + "," + this.getH() + ")";
	}

}
