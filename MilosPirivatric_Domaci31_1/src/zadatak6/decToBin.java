package zadatak6;

public class decToBin {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++)
			System.out.println("Broj " + a[i] + " u binarnom obliku: " + Integer.toBinaryString(a[i]));

	}

}
