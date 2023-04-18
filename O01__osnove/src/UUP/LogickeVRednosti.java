package UUP;

import java.util.Scanner;

public class LogickeVRednosti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println(" Unesite logicku vrednost x : ");

		Boolean x = input.nextBoolean();

		System.out.println(" Unesite logicku vrednost y : ");

		Boolean y = input.nextBoolean();

		Boolean z = !(x || y) && !x || y;

		System.out.println(" Vrednost funkcije z je " + z);
	}

}
