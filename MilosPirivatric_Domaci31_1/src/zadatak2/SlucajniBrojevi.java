package zadatak2;

import java.util.Random;

public class SlucajniBrojevi {

	public static void main(String[] args) {

		int a, b, c, d, e;
		Random rand = new Random();

		a = rand.nextInt();
		b = rand.nextInt();
		c = rand.nextInt();
		d = rand.nextInt();
		e = rand.nextInt();

		System.out.println("Pet nasumično generisanih celih brojeva: " + a + ", " + b + ", " + c + ", " + d + ", " + e);

	}

}
