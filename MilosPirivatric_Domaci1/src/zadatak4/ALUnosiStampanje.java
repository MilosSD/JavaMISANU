package zadatak4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ALUnosiStampanje {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		List<Integer> al1 = new ArrayList<Integer>();

		System.out.println("Za prekid unosa unesite slovo.");

		System.out.println("Unesite broj: ");

		while (unos.hasNextInt())
			al1.add(unos.nextInt());

		Iterator<Integer> it = al1.iterator();

		System.out.println("Uneti elementi kolekcije su: ");
		while (it.hasNext())
			System.out.print(it.next() + " ");

		unos.close();

	}

}
