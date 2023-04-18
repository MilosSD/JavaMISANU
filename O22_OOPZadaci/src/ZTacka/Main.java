package ZTacka;

public class Main {

	public static void main(String[] args) {
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);

		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t1.poteg());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t3: " + t3.poteg());
		System.out.println();
		System.out.println("Rastojanje tacke t3 od tacke t1: " + t3.Rastojanje(t1));
	}
}
