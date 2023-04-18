package LambdaIzraz2;

public class Main {

	public static void main(String[] args) {

		TestirajBroj pd = (n, d) -> (n % d) == 0;

		if (pd.test(10, 2)) {
			System.out.println("Brojevi su deljivi. ");
		} else
			System.out.println("Brojevi nisu deljivi! ");

	}

}
