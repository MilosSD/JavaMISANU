package paket9;

public class InvalidAge extends Throwable {

	private int age;

	InvalidAge(int a) {
		age = a;
	}

	public String toString() {
		return "Age: " + age + " is not a valid age. ";
	}

}
