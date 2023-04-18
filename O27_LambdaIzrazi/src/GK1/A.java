package GK1;

public class A<T> {// Genericka klasa. Ovde je T parametar tipa, koji
	// ce biti zamenjen tipom kada se napravi objekat tipa A.

	T ob;

	A(T o) {
		ob = o;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public T getob() {
		return ob;
	}

	void prikaziTip() {
		System.out.println("tip T je: " + ob.getClass().getName());
	}
}
