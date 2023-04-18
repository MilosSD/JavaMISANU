package Adapter;

//Prvo se implementira interfejs tipa prema kojem se vrsi prilagodjavanje
//To je interfejs koji klijent ocekuje.

public class CurkaAdapter implements Patka {

	Curka curka;

// 2. Dobiti referencu na objekat koji prilagodjavamo

	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}
// 3. Implementacija metoda u interfejsu

// Prevodjenje kvace() u metodu curlice() izmedju klasa.
	public void kvace() {
		curka.curlice();
	}

	public void leti() {
		for (int i = 0; i < 5; i++) {
			curka.letiKratko();
		}
	}

}
