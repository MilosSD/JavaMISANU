package zadatak9;

import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite neki tekst: ");
		String s = sc.nextLine();

		int br = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == ' ')
				br++;
		}
		System.out.println("Broj blanko znakova u tekstu je: " + br);
		sc.close();
	}

}
