package UUP;

import java.util.Scanner;

public class LogOperatori {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite logicku vrednost promenljive x: ");
		boolean x = input.nextBoolean();

		System.out.println("Unesite logicku vrednost promenljive y: ");
		boolean y = input.nextBoolean();

		boolean z = !(x && y) || x && y;

		System.out.print("Vrednost funkcije z je : " + z);

	}

}
