package Z5;

public class Domina {
	private int a, b;

	Domina(int aa, int bb) {
		a = aa;
		b = bb;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public Domina zamena() {
		int p = a;
		a = b;
		b = p;
		return this;
	}

	public boolean poredjenje(Domina d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}

	public void opis() {
		System.out.println("(" + a + " , " + b + ")");
	}
}
