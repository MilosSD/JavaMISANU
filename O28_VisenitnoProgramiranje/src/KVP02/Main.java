package KVP02;

//Pokretanje nove niti.
// Novu nit pokrecete tao sto napravite instancu objekta tipa thread.
// To se moze uraditi na 2 nacina:
//1. nacin podrazumeva omplementaciju interfejsa Runnable **
//2. nacin Prosirivanjem (nasledjivanjem) klase Thread

// U main klasi:
// Nakon kreiranja klase koja implementira interfejs Runnable, potrebno je napraviti
// instancu objekta tipa Thread. ***

public class Main {

	public static void main(String[] args) {

		A a = new A(); // **

		// ***
		// Oblik kontruktora:
		// Thread(Runnable objekatNit, String imeNiti)
		// objekatnit je instanca klase koja implementira interfejs Runnable.
		// Definise mesto gde zapocinje nit.

		// imeNiti predstavlja ime nove niti (koje vi zadajete)

		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");

		t1.start(); // metoda start() poziva metodu run()
		t2.start();
		t3.start();

	}

}
