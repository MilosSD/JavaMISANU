package K10;

public class main {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box(10, 15, 20);
		Box b3 = new Box(b2);
		Box b4 = new Box(10);

		System.out.println("Zapremina je: " + b1.zapremina());
		System.out.println("Zapremina je: " + b2.zapremina());
		System.out.println("Zapremina je: " + b3.zapremina());
		System.out.println("Zapremina je: " + b4.zapremina());
	}

}
