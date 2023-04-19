package UUP;

import java.util.Scanner;

public class Trougao2 {

	public static void main(String[] args) {
		//Napisati program kojim se logi?koj promenljivoj p dodeljuje vrednost true, ako se od odse?aka sa dužinama x, y, z može konstruisati trougao.

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite stranicu trougla x: ");
		int x = input.nextInt();

		System.out.print("Unesite stranicu trougla y: ");
		int y = input.nextInt();

		System.out.print("Unesite stranicu trougla z: ");
		int z = input.nextInt();

		boolean p = (x + y > z) && (x + z > y) && (y + z > x);

		System.out.println("p = " + p);
	}

}
