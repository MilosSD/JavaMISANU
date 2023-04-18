package KVP05;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
// Kada odredjenoj niti zelite da dodate prioritet prilikom izvrsavanja
// pozovite metodu setPriority() koja je clan klase Thread.
// parametrom "nivo" zadaje se nivo prioriteta niti za koju je metoda pozvana
// vrednost mora biti u opsegu od 1 (min_priority) i 10 (MAX_PRIORITY)
// Podrazumevana vrednost se moze vratiti preko NORM_PRIORITY na vrednost 5.

		a.setPriority(Thread.MAX_PRIORITY - 7); // 3
		b.setPriority(Thread.MIN_PRIORITY + 5); // 6

		a.start();
		b.start();

		System.out.println("Kraj glavne niti!");
	}

}
