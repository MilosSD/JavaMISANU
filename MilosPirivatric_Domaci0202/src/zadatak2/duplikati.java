package zadatak2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplikati {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 1, 4, 5, 6, 5, 7 };
		List<Integer> al = new ArrayList<Integer>();

		System.out.print("Niz pre brisanja duplikata: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		Arrays.sort(a);

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				al.add(a[i]);
			}
		}
		al.add(a[a.length - 1]);

		System.out.println("\nNiz posle brisanja duplikata: " + al);

	}

}
