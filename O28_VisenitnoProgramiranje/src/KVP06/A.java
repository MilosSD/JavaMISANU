package KVP06;

public class A extends Thread {

	public void run() {
		int i = 1;

		while (i <= 10) {
			System.out.println("i: " + i);
			// sleep(vrednost u ms-milisekundama)

			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				System.out.println("Nit je prekinuta.");
			}
			i++;
		}
	}
	// sleep() - privremeno zaustavlja izvrsavanje niti,
	// argument je interval u milisekundama

	/*
	 * Metoda Sleep() u klasi Thread moze da izazove iyuyetak Interuptedexception
	 * Desice se izuzetak u koliko neka druga nit pozeli da prekine ovu suspendovanu
	 * nit.
	 */

}
