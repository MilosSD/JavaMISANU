package AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	// Kreiranje dinamičkog niza koji sadrži povezane liste koje dalje sadrže
	// čvorove i grane ka čvorovima sa kojima je početni čvor povezan.
	ArrayList<LinkedList<Node>> lista;

	Graph() {
		lista = new ArrayList<>();
	}

	// Dodavanje novog čvora u graf.
	public void dodajCvor(Node cvor) {
		LinkedList<Node> list = new LinkedList<>();
		list.add(cvor);
		lista.add(list);
	}

	// Dodavanje grane među čvorovima.
	public void dodajGranu(int izv, int odr) {
		LinkedList<Node> list = lista.get(izv);
		Node odredisniCvor = lista.get(odr).get(0);
		list.add(odredisniCvor);
	}

	// Provera da li postoji grana među navedenim čvorovima.
	public boolean proveriGranu(int izv, int odr) {
		LinkedList<Node> list = lista.get(izv);
		Node odredisniCvor = lista.get(odr).get(0);
		for (Node cvor : list) {
			if (cvor == odredisniCvor) {
				return true;
			}
		}
		return false;
	}

	// Prebrojavanje grana
	public int brojGrana() {
		int br = 0;
		for (LinkedList<Node> list : lista) {
			for (Node cvor : list) {
				br++;
			}
		}
		return br - this.brojCvorova();
	}

	// Prebrojavanje broja čvorova
	public int brojCvorova() {
		return lista.size();
	}

	// Štampanje prikaza grafa sa prikazom grana među čvorovima.
	public void stampaj() {

		for (LinkedList<Node> list : lista) {
			for (Node cvor : list) {
				System.out.print(cvor.podatak + " -> ");
			}
			System.out.println();
		}
	}
}
