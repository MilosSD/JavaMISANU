package zadatak6;

public class OpisnaOcena<T, V> {

	private T OpisnaOcena;
	private V Ocena;

	public String toString() {
		return OpisnaOcena + " ( " + Ocena + " )";
	}

	public void setOpisnaOcena(T opisnaOcena) {
		OpisnaOcena = opisnaOcena;
	}

	public void setOcena(V ocena) {
		Ocena = ocena;
	}

}
