package E2;

public class Main {

	public static void main(String[] args) {

		/*
		 * Sva nabrajanja
		 *
		 * 
		 */
		Boja b;

		System.out.println("boje: ");

		Boja nizBoja[] = Boja.values();

		for (Boja c : nizBoja) {
			System.out.println(c + " ");
		}

		Boja c1;
		c1 = Boja.valueOf("Zuta"); // vraca vrednost iz nabrajanja koja odgovara
		// imenu zadate konstante.
		System.out.println("Boja: " + c1);
	}

}
