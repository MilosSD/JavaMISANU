package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double nosivost = 2000.00;

		System.out.println("Da li vozilo teretno(T) ili putnicko(P)? ");
		char oznaka = sc.next().charAt(0);

		switch (oznaka) {
		case 'T':
		case 't': {
			System.out.println("Unesite tezinu vozila: ");
			double tezina = sc.nextDouble();
			System.out.println("Unesite tezinu tereta: ");
			double teret = sc.nextDouble();

			TeretnoVozilo t1 = new TeretnoVozilo(tezina, teret);
			if (nosivost >= t1.izracunajTezinu()) {
				System.out.println("Vozilo moze da predje most.");
			} else
				System.out.println("Vozilo ne moze da predje most.");
			break;
		}
		case 'P':
		case 'p': {
			System.out.println("Unesite tezinu vozila: ");
			double tezina = sc.nextDouble();
			System.out.println("Unesite broj putnika: ");
			int bp = sc.nextInt();
			System.out.println("Unesite prosecnu tezinu putnika: ");
			double tp = sc.nextDouble();

			PutnickoVozilo p1 = new PutnickoVozilo(tezina, tp, bp);
			if (nosivost >= p1.izracunajTezinu()) {
				System.out.println("Vozilo moze da predje most.");
			} else
				System.out.println("Vozilo ne moze da predje most.");
			break;
		}
		default:
			System.out.println("Niste uneli dozvoljenu vrednost! ");
			main(args);
		}

		sc.close();
	}

}
