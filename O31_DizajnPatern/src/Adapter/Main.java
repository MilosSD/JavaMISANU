package Adapter;

public class Main {

	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {

		// DivljaCurka patka = new DivljaCurka();

		DivljaPatka patka = new DivljaPatka();
		Curka curka = new DivljaCurka();

// Umotavamo Curku u CurkaAdapter, zahvaljujuci kome ce izgledati kao Patka
		Patka curkaAdapter = new CurkaAdapter(curka);

		System.out.println("Curka: ");

		curka.curlice();
		curka.letiKratko();

		System.out.println("\nPatka: ");
		testPatka(patka);

		// Pokusavamo da poturimo Curku kao Patku
		System.out.println("\nAdapterCurka: ");
		testPatka(curkaAdapter);

	}

}
