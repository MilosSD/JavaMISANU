package AdjacencyList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Grafička struktura podataka uglavnom predstavlja mrežu koja povezuje
		 * različite tačke. Te se tačke nazivaju čvorovima, a veze koje povezuju ove
		 * čvorove nazivaju se 'grane'. Graf je definisan kao skup čvorova i grana koje
		 * ih povezuju. Grafovi se uglavnom koriste za prikazivanje različitih vrsta
		 * mreža, kakve su recimo računarske ili društvene mreže.
		 * 
		 * Predstavljanje grafa u obliku Adjacency List-e zapravo čini dinamički niz u
		 * kome su sačuvane povezane liste koje sadrže sve čvorove prema kojima taj čvor
		 * ima grane (veze).
		 */

		Graph graf = new Graph();

		graf.dodajCvor(new Node('A'));
		graf.dodajCvor(new Node('B'));
		graf.dodajCvor(new Node('C'));
		graf.dodajCvor(new Node('D'));
		graf.dodajCvor(new Node('E'));

		graf.dodajGranu(0, 1);
		graf.dodajGranu(1, 2);
		graf.dodajGranu(2, 3);
		graf.dodajGranu(2, 4);
		graf.dodajGranu(4, 0);
		graf.dodajGranu(4, 2);
		graf.dodajGranu(3, 2);

		graf.stampaj();

		System.out.println("\nDa li među navedenim čvorovima postoji grana? " + "\n" + graf.proveriGranu(4, 0));
		System.out.println("\nUkupan broj čvorova: " + "\n" + graf.brojCvorova());
		System.out.println("\nUkupan broj grana: " + "\n" + graf.brojGrana());
	}

}
