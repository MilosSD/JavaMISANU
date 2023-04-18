package zadatak5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LLunosiStampanje {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		List<Integer> ll = new LinkedList<Integer>();

		System.out.println("Za prekid unosa unesite slovo.");

		System.out.println("Unesite broj: ");

		while (unos.hasNextInt())
			ll.add(unos.nextInt());

		Iterator<Integer> it = ll.iterator();

		System.out.println("Uneti elementi kolekcije su: ");
		while (it.hasNext())
			System.out.print(it.next() + " ");

		unos.close();

	}

}