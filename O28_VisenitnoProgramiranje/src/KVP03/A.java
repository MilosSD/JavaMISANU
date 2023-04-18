package KVP03;

// Nit se moze napraviti i kada klasu Thread prosirite novom nasledjenom klasom, a zatim napravite 
// instancu te klase.
// Nova podklasa mora da redefinise metodu Run()

public class A extends Thread {

	public A(String s) {
		super(s); // poziva se konstruktor Thread sledeceg oblika:
					// public Thread (String imeNiti)
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
