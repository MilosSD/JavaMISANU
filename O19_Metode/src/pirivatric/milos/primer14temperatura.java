package pirivatric.milos;

public class primer14temperatura {
	// Metoda za prevođenje Celzijusovih u Farenhajtove stepene
	public static double CuF(double celsius) {
		return (((0.9 / 0.5) * celsius) + 32);
	}

	public static void main(String[] args) throws Exception {
		// Izmerena temperatura
		double temp = 25;

		// Štampanje rezultata
		System.out.println("Temperatura prevedena u Farenthajte iznosi: " + CuF(temp));
	}
}
