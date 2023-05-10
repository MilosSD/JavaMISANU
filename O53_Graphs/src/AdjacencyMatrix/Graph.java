package AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {

	ArrayList<Node> cvorovi;
	int[][] matrica;

	Graph(int velicina) {
		cvorovi = new ArrayList<>();
		matrica = new int[velicina][velicina];
	}

	public void dodajCvor(Node cvor) {
		cvorovi.add(cvor);
	}

	public void dodajGranu(int izv, int odr) {
		matrica[izv][odr] = 1;
	}

	public boolean proveriGranu(int izv, int odr) {
		if (matrica[izv][odr] == 1)
			return true;
		else
			return false;
	}

	public int brojCvorova() {

		return cvorovi.size();
	}

	public int brojGrana() {
		int br = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (this.proveriGranu(i, j))
					br++;
			}
		}
		return br;
	}

	public void stampaj() {

		// Štampanje zaglavlja.
		System.out.print("  ");
		for (Node cvor : cvorovi) {
			System.out.print(cvor.podatak + " ");
		}
		System.out.println();

		for (int i = 0; i < matrica.length; i++) {
			System.out.print(cvorovi.get(i).podatak + " ");
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " "); // Štampanje grana u obliku 2D matrice susedstva.
			}
			System.out.println();
		}
	}
}
