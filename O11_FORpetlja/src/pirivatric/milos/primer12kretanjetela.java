package pirivatric.milos;

public class primer12kretanjetela {

	public static void main(String[] args) {
		double s, s1 = 0, s2 = 0;

		System.out.println("\tT\tS1\tS2\tS=(S1-S2)");

		for (int t = 0; t <= 15; t++) {
			s1 = 2 * Math.pow(t, 3) + Math.pow(t, 2);
			s2 = 2 * Math.pow(t, 2) + 5 * t;
			s = Math.abs(s1 - s2);

			System.out.println("\t" + t + "\t" + s1 + "\t" + s2 + "\t" + s);
		}

	}

}
