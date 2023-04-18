package E5;

public class EnumPrikaz {

	static void odgovor(Odgovori odg) {

		switch (odg) {
		case Ne:
			System.out.println("Ne");
			break;
		case Da:
			System.out.println("Da");
			break;
		case Mozda:
			System.out.println("Mozda");
			break;
		case Kasnije:
			System.out.println("Kasnije");
			break;
		case Nikad:
			System.out.println("Nikad");
			break;
		case Uskoro:
			System.out.println("Uskoro");
			break;
		}
	}

}
