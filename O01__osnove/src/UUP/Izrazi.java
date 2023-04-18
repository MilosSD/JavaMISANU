package UUP;

import java.util.Scanner;

public class Izrazi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * (a-b)/(c+(a/c+(b/(c-b))));
		 * 
		 * (Math.tan(x)+1)(Math.pow(x, 4*n)+4*x+1);
		 * 
		 * (Math.pow((Math.pow(x, y)/Math.pow(y, x)), 2))/ Math.pow(y/x, z);
		 * 
		 * Math.sqrt(Math.sin(Math.sqrt(x))+ Math.pow(x,
		 * 3))/Math.pow(Math.log(Math.pow(Math.sin(x), 2)), 2);
		 * 
		 * y = (Math.pow(Math.pow(0, 0), Math.exp(0));
		 */

		Scanner scanner = new Scanner(System.in);

		int broj = scanner.nextInt();

		System.out.println("Broj je: " + broj);
	}

}
