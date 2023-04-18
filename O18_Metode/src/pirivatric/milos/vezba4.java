package pirivatric.milos;

public class vezba4 {

	static double zbir(double x, double y) {

		return x + y;
	}

	static int zbir(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		double a = 2.5, b = 3.6;
		int c = 6, d = 13;

		System.out.print("Zbir dva realna broja: " + zbir(a, b) + "\n");

		System.out.print("Zbir dva cela broja: " + zbir(c, d) + "\n");
	}

}
