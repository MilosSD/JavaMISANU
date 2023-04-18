package Zadatak62;

public class OpisnaOcena<T, V> {

	private T OpOc;
	private V Oc;

	OpisnaOcena() {

	}

	public String toString() {
		return OpOc + " ( " + Oc + " )";
	}

	public void setOpisnaOcena(T opisnaOcena) {
		OpOc = opisnaOcena;
	}

	public void setOcena(V ocena) {
		Oc = ocena;
	}

}