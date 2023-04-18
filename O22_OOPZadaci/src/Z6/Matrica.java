package Z6;

public class Matrica {

	private double a[][];

	Matrica(int r, int k) {
		a = new double[r][k];
	}

	public int getR() {
		return a.length;
	}

	public int getK() {
		return a[0].length;
	}

	public Matrica postavi(int r, int k, double vr) {
		// if (r>0 || k>0)
		a[r][k] = vr;
		return this;
	}

	public double dohvati(int r, int k) {
		return a[r][k];
	}

	public String toString() {
		String s = "";
		for (int v = 0; v < a.length; v++) {
			for (int k = 0; k < a[0].length; k++) {
				System.out.print(a[v][k] + " ");
				s = s + ' ';
			}
			System.out.println();
		}
		return s;
	}
}
