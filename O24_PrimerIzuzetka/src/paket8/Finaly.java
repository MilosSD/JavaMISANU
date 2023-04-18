package paket8;

public class Finaly {

	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo");

		} finally {
			System.out.println("procA");
		}
	}

	static void procB() {
		try {
			System.out.println(" proc B");
			return; // break, continue, System.exit (0) finally blok se izvrsava uvek
		} finally {
			System.out.println(" procB's finally");
		}
	}

	static void procC() {
		try {
			System.out.println("inside procC");
		} finally {
			System.out.println("procC's finally");
		}
	}

	public static void main(String[] args) {

		Finaly f1 = new Finaly();

		try {
			f1.procA();
		} catch (Exception e) {
			System.out.println("Uhvacen izuzetak!");
		}
		f1.procB();
		f1.procC();

	}

}
