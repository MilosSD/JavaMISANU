package pirivatric.milos;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		double r, a;

		System.out.println("unesite poluprecnik: ");
		r = sc.nextDouble();

		a = 3.14 * r * r;
		System.out.println("poivrsina kruga je: " + a);

	}

}
