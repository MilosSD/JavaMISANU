package primer3Zivotinja;

public class Zivotinja {

	private String vrsta;

	public Zivotinja() {

	}

	public Zivotinja(String vrsta) {
		this.vrsta = new String(vrsta);
	}

	public String toString() {
		return "Ovo je " + vrsta;
	}
}
