package domaci;

public class Main {

	public static void main(String[] args) {

		Knjiga k1 = new Knjiga();

		k1.unetiNazivKnjige();
		k1.unetiAutoraKnjige();
		k1.unetiIzdavacaKnjige();

		System.out.println(k1.ispis());

	}

}
