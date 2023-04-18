package paket7;

public class main {

	public static void main(String[] args) {

		try {
			int a = 2;
			int b = 10 / a;
			System.out.println(" a = " + a);
			try {
				if (a == 1)
					a = a / (a - a);
				if (a == 2) {
					int c[] = { 1 };
					c[10] = 100;
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Nedozvoljena vrednost indeksa! " + e);
			}

		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom! " + e);
		}

	}

}
