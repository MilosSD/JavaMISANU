package domaci;

import java.util.Scanner;

public class Knjiga {

	String naziv;
	String autor;
	String izdavac;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public void unetiNazivKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naslov knjige: ");
		naziv = sc.nextLine();
		if (naziv.isBlank())
			unetiNazivKnjige();
	}

	public void unetiAutoraKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite autora knjige: ");
		autor = sc.nextLine();
		if (autor.isBlank())
			unetiAutoraKnjige();
	}

	public void unetiIzdavacaKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite izdavaca knjige: ");
		izdavac = sc.nextLine();
		if (izdavac.isBlank())
			unetiIzdavacaKnjige();
	}

	String ispis() {
		return "Naslov: " + naziv + "\nAutor: " + autor + "\nIzdavac: " + izdavac;
	}

}
