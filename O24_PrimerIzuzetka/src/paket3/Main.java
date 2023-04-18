package paket3;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 0;
			System.out.println("a = " + a);
			int d = 10 / a;

			int c[] = { 1 };
			c[10] = 100;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Uhvacen exception!");
		}
		System.out.println("Nakon try/catch bloka. ");

	}

}
