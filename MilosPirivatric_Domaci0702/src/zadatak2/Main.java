package zadatak2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		double sumat = 0;

		System.out.println("Koliko sfera unosite? ");
		int ns = sc.nextInt();

		Sfera[] s = new Sfera[ns];

		for (int i = 0; i < s.length; i++) {
			s[i] = Sfera.dodajSferu();
			sumat += s[i].tezina();
		}

		System.out.println("Koliko kvadara unosite? ");
		int nk = sc.nextInt();

		Kvadar[] k = new Kvadar[nk];

		for (int i = 0; i < k.length; i++) {
			k[i] = Kvadar.dodajKvadar();
			sumat += k[i].tezina();
		}

		double prosek = sumat / (ns + nk);
		System.out.println("Prosecna tezina je: " + prosek);

		for (int i = 0; i < s.length; i++) {
			if (s[i].tezina() > prosek) {
				System.out.println(s[i].ispis());
			}
		}
		for (int i = 0; i < k.length; i++) {
			if (k[i].tezina() > prosek) {
				System.out.println(k[i].ispis());
			}
		}

		sc.close();
	}

}
