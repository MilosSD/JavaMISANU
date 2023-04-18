package zadatak1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int br = input.nextInt();

		TestNeg test1 = (n) -> n < 0;

		if (test1.test(br)) {
			System.out.println("Broj je negativan!");
		} else
			System.out.println("Broj je pozitivan! ");

		input.close();
	}

}
