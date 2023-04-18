package Z4;

public class Radnik {

	private double prihod;
	private double procenat;
	private String ime;

	Radnik(String i, double pr, double proc) {
		ime = i;
		prihod = pr;
		procenat = proc;
	}

	double getPrihod() {
		return prihod;
	}

	public double obracun() {
		return getPrihod() * procenat / 100;
	}

	public void ispis() {
		System.out.println("Radnik: " + ime + " / " + obracun());
	}

}
