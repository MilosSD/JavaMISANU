package Z5;

public class main {

	public static void main(String[] args) {

		Domina d1 = new Domina(3, 5);
		Domina d2 = new Domina(3, 4);

		System.out.println(d1.poredjenje(d2));
		d1.zamena();
		d1.opis();

		d2.zamena();
		d2.opis();
	}

}
