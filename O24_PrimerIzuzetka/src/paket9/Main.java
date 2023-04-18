package paket9;

public class Main {

	public static void checkAge(int age) throws InvalidAge {
		System.out.println("Proverava se ispravnost starosti: (" + age + ")");
		if (age < 0 || age > 100)
			throw new InvalidAge(age);
		System.out.println(" Age: " + age + " is valid age.");
	}

	public static void main(String[] args) {

		try {
			checkAge(25);
			checkAge(-5);
		} catch (InvalidAge e) {
			System.out.println(" Uhvacen: " + e);
		} finally {
			System.out.println("Finally blok");
		}

	}

}
