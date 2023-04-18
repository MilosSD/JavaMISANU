package pirivatric.milos;

public class primer1metodakvadrat {
	public static int kvadratBroja(int x) {
		return x * x;
	}

	public static void main(String[] args) {
		int x = 10;

		System.out.println("Kvadrat broja " + x + " je " + kvadratBroja(x));
	}
}
