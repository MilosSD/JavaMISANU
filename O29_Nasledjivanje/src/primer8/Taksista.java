package primer8;

public class Taksista {

	private String imeKompanije = "Zuti Taksi";
	private String ime;

	public Taksista() {
		ime = null;
	}

	public Taksista(String i, String iK) {
		ime = i;
		imeKompanije = iK;
	}

	public void zadajIme(String ime) {
		this.ime = ime;
	}

	public String uzmiIme() {
		return ime;
	}

	public void zadajPravac() {
		System.out.println("Zadaj pravac: ");

	}

	private void skreniDesno() {
		System.out.println("Skreni desno");
	}

	private void skreniLevo() {
		System.out.println("Skreni levo");
	}

	public String uzmiImeKompanije() {
		return imeKompanije;
	}

}
