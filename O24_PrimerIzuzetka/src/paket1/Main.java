package paket1;

public class Main {

	public static void main(String[] args) {

		int d, a;
		try { // U try bloku se stavljaju naredbe koje mogu baciti izuzetak.
				// kao i one naredbe koje se nece izvrsiti ako dodje do izuzetka.
			a = 0;
			d = 10 / a;
			System.out.println("Ova poruka nece biti odstampana.");
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom. ");
		}
		System.out.println("Program nastavlja sa izvrsenjem! ");
	}

}
