package Z7;

public class Broj {
	int b;

	Broj(int br) {
		this.b = br;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void abs() {
		System.out.println("Apsolutna vrednost broja |" + getB() + "| je: " + Math.abs(b));
	}

}
