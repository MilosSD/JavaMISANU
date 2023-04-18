package LambdaIzraz4;

public class Main {

	public static void main(String[] args) {

		testNeg t1 = (n) -> (n > 0);

		if (t1.test(-5)) {
			System.out.println("Broj je pozitivan.");
		} else
			System.out.println("Broj je negativan!");
	}

}
