package E1;

/*Nabrajanje je lista imenovanih vrednost koje definisu novi
 * tip podataka i njegove dozvoljene vrednosti.
 * to znaci da nabrajanje moze da sadrzi samo neku od 
 * vrednosti koje su navedene na listi.
 * Druge vrednosti nisu dozvoljene.
*/
public class Main {

	public static void main(String[] args) {

		Boje b;

		b = Boje.crvena;

		System.out.println("Boja: " + b);

		b = Boje.plava;

		if (b == Boje.plava) {
			System.out.println("Plava");

		}

		switch (b) {
		case crvena:
			System.out.println("crvena");
			break;
		case zelena:
			System.out.println("Zelena");
			break;
		case plava:
			System.out.println("Plava");
			break;
		case bela:
			System.out.println("Bela");
			break;
		case crna:
			System.out.println("Crna");
			break;
		case zuta:
			System.out.println("Zuta");
			break;
		case narandzasta:
			System.out.println("Narandzasta");
			break;
		}
	}

}
