package Z4;

public class Main {

	public static void main(String[] args) {

		Radnik r1 = new Radnik("Pera", 150000, 90);
		Radnik r2 = new Radnik("Mika", 120000, 80);

		System.out.println("Plata prvog radnika " + r1.obracun());
		System.out.println("Prihod prvog radnika je: " + r1.getPrihod());

		System.out.println("Plata drugog radnika " + r2.obracun());
		System.out.println("Prihod drugog radnika je: " + r2.getPrihod());

		r1.ispis();
		r2.ispis();

	}

}
