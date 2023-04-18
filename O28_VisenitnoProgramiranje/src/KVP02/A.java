package KVP02;

// Nit se moze napraviti za svaki objekat koji implementira interfejs Runnable.
// Da bi klasa implementirala interfeks Runnable potrebno je samo da ima metodu 
// run(), deklarisana u sledecem obliku: public void run ()
// u metodi run() zadajete kod koji treba da se izvrsava u novoj niti.
// kada se izvrsi metoda run() nit se unistava.

public class A implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
