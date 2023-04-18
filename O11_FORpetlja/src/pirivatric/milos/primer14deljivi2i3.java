package pirivatric.milos;

public class primer14deljivi2i3 {

	public static void main(String[] args) {
		int broj, s, d, j;

		System.out.println("Trocifreni brojevi deljivi sa 2 i 3 su: ");

		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					broj = s * 100 + d * 10 + j;

					if (broj % 2 == 0 && broj % 3 == 0)
						System.out.println(broj);
				}
	}

}
