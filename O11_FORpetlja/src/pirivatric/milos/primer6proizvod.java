package pirivatric.milos;

public class primer6proizvod {

	public static void main(String[] args) {
		double p = 1;

		for (int i = 1; i <= 5; i++)
			p = p * (i + 2.5) / (i * i + 1.2);

		System.out.println("P = " + p);

	}

}
