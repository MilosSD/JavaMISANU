package LL3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		List<String> LList = new LinkedList<String>();
		LList.add("1");
		LList.add("2");
		LList.add("3");
		LList.add("4");
		LList.add("5");

		ListIterator itr = LList.listIterator();

		System.out.println("Kretanje kroz listu od prvog do poslednjeg elementa: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");

		}
		System.out.println("\nKretanje kroz listu od poslednjeg do prvog elementa: ");
		while (itr.hasPrevious())
			System.out.print(itr.previous() + " ");

	}

}
