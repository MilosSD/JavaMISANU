package zadatak4;

public class parNepar {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int p = 0, n = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				p++;
			else
				n++;
		}

		System.out.println("Uneti clanovi niza su: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nBroj parnih clanova niza je: " + p);
		System.out.println("Broj neparnih clanova niza je: " + n);
	}

}
