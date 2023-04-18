package Zadatak2;

public class Ocena {

	// List <String> ocena = new ArrayList<String>(5);

	/*
	 * public enum ocena { PET(5), ŠEST(6), SEDAM(7), OSAM(8), DEVET(9), DESET(10);
	 * 
	 * private int oc; private ocena (int oc) { this.oc = oc; } };
	 */

	int ocBr;
	String ocena;
	// IntStream oc = IntStream.range (5,11);

	public Ocena(int oc) {
		if (oc == 5) {
			this.ocBr = oc;
			this.ocena = "pet";
		} else if (oc == 6) {
			this.ocBr = oc;
			this.ocena = "šest";
		} else if (oc == 7) {
			this.ocBr = oc;
			this.ocena = "sedam";
		} else if (oc == 8) {
			this.ocBr = oc;
			this.ocena = "osam";
		} else if (oc == 9) {
			this.ocBr = oc;
			this.ocena = "devet";
		} else if (oc == 10) {
			this.ocBr = oc;
			this.ocena = "deset";
		} else if (ocBr < 5) {
			this.ocBr = 5;
			this.ocena = "pet";
		} else if (ocBr > 10) {
			this.ocBr = 10;
			this.ocena = "deset";
		}

	}

	public int getOcBr() {
		return ocBr;
	}

	public String getOcena() {
		return ocena;
	}

	public void setOcBr(int ocBr) {
		if (ocBr < 5) {
			this.ocBr = 5;
			this.ocena = "pet";
		} else if (ocBr > 10) {
			this.ocBr = 10;
			this.ocena = "deset";
		} else
			this.ocBr = ocBr;
	}

	public String opis() {
		return this.ocBr + "(" + this.ocena + ") ";
	}

}
