package predavanje0612OOPiUML;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cat macka = new Cat();

		System.out.println("Unesite ime macke: ");
		macka.ime = sc.next();

		macka.Prikaz();

		sc.close();
	}

}
