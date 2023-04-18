package LambdaIzraz1;

public class Main {

	public static void main(String[] args) {

		TestiraBroj paranBroj = (n) -> (n % 2) == 0; /* ovde dolazi lambda izraz */
		// levaStranaLambdaIzraza -> desnaStranaLambdaIzraza

		if (paranBroj.test(9)) {
			System.out.println("Broj 10 je parana broj.");
		} else
			System.out.println("Broj nije paran.");

	}

}
