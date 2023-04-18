package LL2;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String imena[] = { "mika", "zika", "fica" };
		List<String> listaImena = new LinkedList<String>();

		for (String s : imena) {
			listaImena.add(s);
		}

		String imena1[] = { "ana", "lena", " hana", "una" };
		List<String> listaImena1 = new LinkedList<String>();

		for (String ime : imena1)
			listaImena1.add(ime);

		System.out.println("Lista pre dodavanja imena: " + listaImena);

		listaImena.addAll(listaImena1);

		System.out.println("Nova lista: " + listaImena);

		listaImena.subList(1, 4).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksima od 1 do 4: " + listaImena);

	}

}
