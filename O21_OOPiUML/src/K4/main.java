package K4;

public class main {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();

		b1.width = 10;
		b1.depth = 20;
		b1.heigth = 15;

		b2.width = 5;
		b2.heigth = 6;
		b2.depth = 7;

		double vol;

		vol = b1.width * b1.heigth * b1.depth;
		System.out.println("Zapremina " + vol);

		vol = b2.width * b2.heigth * b2.depth;
		System.out.println("Zapremina " + vol);
	}

}
