package Zadatak2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Student {

	String ime;

	int regBr;
	String brIndeksa;

	List<Ispit> ispiti = new ArrayList<Ispit>(40);

	public Student(String s, int rbr) {
		this.ime = s;
		this.regBr = rbr;
		this.brIndeksa = String.valueOf(this.regBr);
	}

	public void dodajIspit(String sifra, int ocena) {
		try {
			Ispit i = new Ispit(sifra, ocena);
			ispiti.add(i);
			System.out.println("Ispit je uspešno dodat!");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Greška! Nema mesta u nizu. ");
			e.printStackTrace();
		}
	}

	public String srOcena() {
		DecimalFormat df = new DecimalFormat("##.##");
		int brojac = 0;
		double suma = 0.0;
		String srOc = "";

		for (Ispit i : ispiti) {
			if (i.ocena > 5) {
				suma += i.ocena;
				brojac++;
			}
		}
		if (brojac == 0) {
			srOc = "Nema položenih ispita.";
		} else
			srOc = df.format(suma / brojac);
		return srOc;
	}

	public String opis() {
		return ime + "[" + brIndeksa.substring(0, 4) + "/" + brIndeksa.substring(4, 8) + " : " + this.srOcena() + "]";
	}

}
