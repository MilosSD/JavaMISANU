package K11;

public class Knjiga {
	String naslov;
	int brStr;

	Knjiga(String n, int b) {
		this.naslov = n;
		this.brStr = b;
	}

	void prikaz() {
		System.out.println("Naslov knjige je: " + naslov);
		System.out.println("Broj stranica knjige je: " + brStr);
	}

}
