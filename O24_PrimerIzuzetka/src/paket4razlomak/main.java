package paket4razlomak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static int kolicnik(int a, int b) throws ArithmeticException {
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("unesite brojilac razlomka: ");
			int br = sc.nextInt();

			System.out.println("unesite imenilac razlomka: ");
			int im = sc.nextInt();

			int rez = kolicnik(br, im);
			System.out.println("kolicnik iznosi: " + rez);
			;
		} catch (ArithmeticException e) {
			System.out.println("Deljenje nulom! " + "\n" + e);
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojne vrednosti! " + e);
		}

	}

}
