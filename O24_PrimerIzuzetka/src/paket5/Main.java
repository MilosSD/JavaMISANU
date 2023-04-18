package paket5;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 10 / a;

		} catch (ArithmeticException e) {
			System.out.println("izuzetak...");
		}
		/*
		 * catch (ArithmeticException e) { Ukoliko postoji vise catch blokova ciji tip
		 * parametara odgovara tipu bacenog izuzetka izvrsava se samo prvi blok. Greska
		 * je navesti dva catch bloka sa istim tipom parametara. }
		 */
	}

}
