package pirivatric.milos;

public class primer4sporednadijagonala {

	public static void main(String[] args) {

		int[][] a = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		System.out.println("Elementi dvodimenzionalnog niza su: ");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi na sporednoj dijagonali i ispod nje su: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}