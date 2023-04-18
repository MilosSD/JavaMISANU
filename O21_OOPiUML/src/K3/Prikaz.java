package K3;

public class Prikaz {

	public static void main(String[] args) {

		Kutija k = new Kutija();

		double zapremina;

		k.sirina = 10;
		k.visina = 15;
		k.dubina = 20;

		zapremina = k.sirina * k.visina * k.dubina;

		System.out.println(" Zapremina: " + zapremina);

	}

}
