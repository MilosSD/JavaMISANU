package zadatak1p1;

import java.util.Scanner;

public class Knjiga {
	
	String naslov;
	String autor;
	String opis;
	double cena;
	boolean stanje;
	
	public Knjiga () {
		
	}
	
	public Knjiga(String naslov, String autor, String opis, double cena, boolean stanje) {
		
		this.naslov = naslov;
		this.autor = autor;
		this.opis = opis;
		this.cena = cena;
		this.stanje = stanje;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public double getCena() {
		return cena;
	}
	

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean isStanje() {
		return stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}
	
	public void kreirajOpis () {
		Scanner sc = new Scanner (System.in);
		System.out.print("Unesite kratak opis knjige: ");
		String op = sc.nextLine();
		setOpis(op);
	}
	
	public String toString () {
		return "Knjiga: " + naslov + "\nPisac: " + autor + "\nKratak opis: " + opis + "\nCena: " + cena + "\nNa stanju: " + stanje;
	}
	

}
