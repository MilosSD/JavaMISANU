package K4;

public class demoPrikaz {

	public static void main(String[] args) {

		Krug c1 = new Krug(); // kreiranjem objekta se poziva kontruktor iz metode

		System.out.println("Povrsina kruga: " + c1.area());
		/*
		 * Kljucnom recju new kreira se nova instanca klase Krug, pri cemu se objekat
		 * inicijalizuje sa vrednoscu 10. Za kontruktor vazi sledece - mora imati isto
		 * ime kao i klasa -moze imati i parametre - kontruktor ne vraca vrednosti -
		 * javna je metoda Ukoliko nema inicijalizacije vrednosti kompajker dodeljuje
		 * podrazumevane vrednosti.
		 * 
		 */
	}

}
