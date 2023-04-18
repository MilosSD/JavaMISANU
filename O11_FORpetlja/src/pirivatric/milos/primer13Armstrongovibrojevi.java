package pirivatric.milos;

public class primer13Armstrongovibrojevi {

	public static void main(String[] args) {

		int broj, s, d, j;

		System.out.println("armstrongovi brojevi od 100 do 999 su: ");

		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					broj = 100 * s + 10 * d + j;

					if (broj == Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3))
						System.out.println(broj);
				}
	}

}
