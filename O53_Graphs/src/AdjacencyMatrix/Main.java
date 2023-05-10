package AdjacencyMatrix;

public class Main {

	public static void main(String[] args) {

		/*
		 * U predstavljanju grafa kao 2D matrice koja predstavlja Adjacency Matrix
		 * (Matricu susedstva), 0 i 1 predstavljaju postojanje veza medju čvorovima.
		 * Broj kolona i broj redova predstavlja broj čvorova.
		 */

		Graph graf = new Graph(5);

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

		graf.stampaj();

		System.out.println("\nDa li među navedenim čvorovima postoji grana? " + "\n" + graf.proveriGranu(1, 2));
		System.out.println("\nUkupan broj čvorova: " + "\n" + graf.brojCvorova());
		System.out.println("\nUkupan broj grana: " + "\n" + graf.brojGrana());
	}

}
