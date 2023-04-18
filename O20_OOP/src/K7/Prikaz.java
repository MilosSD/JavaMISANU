package K7;

public class Prikaz {

	public static void main(String[] args) {
		Krug c1 = new Krug(20);

		calcArea(c1);

	}

	public static void calcArea(Krug c) {
		System.out.println("Povrsina kruga: " + c.area());
	}
}
