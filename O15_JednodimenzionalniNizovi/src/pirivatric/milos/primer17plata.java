package pirivatric.milos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class primer17plata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");

		double suma = 0, vrednostBoda;
		String[] ime = new String[20];
		double[] brojBodova = new double[20];
		double[] kredit = new double[20];
		double[] clanarina = new double[20];
		double[] licniDohodak = new double[20];
		int brojRadnika;

		System.out.print("Unesite vrednost boda: ");
		vrednostBoda = sc.nextDouble();
		System.out.print("Uneiste broj radnika: ");
		brojRadnika = sc.nextInt();
		System.out.println(" Unesite podatke o radnicima: ime, broj bodova, ratu kredita i clanarinu: ");
		for (int i = 1; i <= brojRadnika; i++) {
			System.out.println("Podaci za " + i + ". radnika");
			System.out.print("Ime: ");
			ime[i] = sc.next();
			System.out.print("broj bodova: ");
			brojBodova[i] = sc.nextDouble();
			System.out.print("Rata kredita: ");
			kredit[i] = sc.nextDouble();
			System.out.print("Clanarina: ");
			clanarina[i] = sc.nextDouble();

			licniDohodak[i] = brojBodova[i] * vrednostBoda - kredit[i] - clanarina[i];
			suma += licniDohodak[i];
		}
		System.out.println("Ime\tBroj bodova\tKredit\tClanarina\tPlata");

		for (int i = 1; i <= brojRadnika; i++)
			System.out.println(ime[i] + "\t\t" + brojBodova[i] + "\t" + kredit[i] + "\t" + clanarina[i] + "\t\t"
					+ licniDohodak[i]);

		System.out.println("========================================================");
		System.out.println("Ukupno za isplatu: \t\t\t" + suma);

		sc.close();
	}

}
