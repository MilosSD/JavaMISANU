package primer9uredjaj;

public class Uredjaj {

	String marka;
	boolean ukljucen;

	public Uredjaj(String marka2, boolean ukljucen2) {
		if (marka != null) {
			this.marka = marka;
			this.ukljucen = ukljucen;
		} else
			System.out.println("Greška: Vrednost podatka marka ne sme biti null.");
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if (marka != null)
			this.marka = marka;
		else
			System.out.println("Greška: Vrednost podatka marka ne sme biti null.");
	}

	public void ukljuci() {
		ukljucen = true;
	}

	public void iskljuci() {
		ukljucen = false;
	}

	public void ispisi() {
		System.out.println("Marka: " + marka);
		if (ukljucen)
			System.out.println("Uređaj je uključen.");
		else
			System.out.println("Uređaj je isključen.");
	}
}
