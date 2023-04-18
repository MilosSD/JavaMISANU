package Zadatak4;

public abstract class Namirnica extends Energent {

	String ime;
	int id;

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}

	public String opis() {
		return ime + "[" + id + "]";
	}

	public abstract double izracunajEnergetskuVred();

}
