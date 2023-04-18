package E3;

/*Nabrajanje je vrsta klase.
 * Instanca klase ne pravi se pomocu kljucne reci new.
 * Rezervisana rec Enum definise klasu.
 * Svaka konstantadefinisana u nabrajanju je objekat ciji tip je 
 * to isto nabrajanje. 
 */

public class Main {

	public static void main(String[] args) {

		Boja b;

		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());

		System.out.println("Sve boje: ");
		for (Boja c : Boja.values()) {
			System.out.println(c + " " + c.getUdeo());
		}
	}

}
