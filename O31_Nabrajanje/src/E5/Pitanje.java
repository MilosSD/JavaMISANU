package E5;

import java.util.Random;

public class Pitanje {

	Random rand = new Random();

	Odgovori odg() {

		int vrednost = (int) (rand.nextDouble() * 100);

		if (vrednost < 15)
			return Odgovori.Mozda;
		else if (vrednost < 30)
			return Odgovori.Da;
		else if (vrednost < 60)
			return Odgovori.Ne;
		else if (vrednost < 75)
			return Odgovori.Kasnije;
		else if (vrednost < 95)
			return Odgovori.Uskoro;
		else
			return Odgovori.Nikad;
	}
}
