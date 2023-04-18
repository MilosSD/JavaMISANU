package pirivatric.milos;

import java.util.Scanner;

public class Operatori {

	public static void main(String[] args) {
		char operator;
		double a, b, rez;

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost prvog operanda a: ");
		a = sc.nextDouble();

		System.out.print("Unesite vrednost drugog operanda b: ");
		b = sc.nextDouble();

		System.out.println("Unesite operator zeljene aritmeticke operacije (+, - , /, *): ");
		operator = sc.next().charAt(0);

		switch (operator) {
		case '+': {
			rez = a + b;
			System.out.println("a + b = " + rez);
			break;
		}
		case '-': {
			rez = a - b;
			System.out.println("a - b = " + rez);
			break;
		}
		case '*': {
			rez = a * b;
			System.out.println("a * b = " + rez);
			break;
		}
		case '/': {
			rez = a / b;
			System.out.println("a / b = " + rez);
			break;
		}
		default: {
			System.out.println("Niste uneli moguc operator. ");
		}
		}
		sc.close();

	}

}
