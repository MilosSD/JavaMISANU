package Zadatak1;

import java.util.Random;

public class Zadatak1 {

	public static void main(String[] args) {

		Random rand = new Random();

		int a = rand.nextInt();
		float b = rand.nextFloat();
		boolean c = rand.nextBoolean();
		double d = rand.nextDouble();
		byte e = (byte) rand.nextInt(-128, 127);

		System.out.println("Nasumicno generisani broj tipa int: " + a);
		System.out.println("Nasumicno generisani broj tipa float: " + b);
		System.out.println("Nasumicno generisani podatak tipa boolean: " + c);
		System.out.println("Nasumicno generisani broj tipa double: " + d);
		System.out.println("Nasumicno generisani broj tipa byte: " + e);
	}

}
