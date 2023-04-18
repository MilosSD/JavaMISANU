package primer1;

public class TestPas {

	public static void main(String[] args) {
		Pas p = new Pas();

		System.out.println("Klasa Pas");
		p.laj();
		p.dahci();
		p.uzmiBojuOciju();

		ZlatniRetriver zr = new ZlatniRetriver();

		System.out.println("Klasa ZlatniRetriver");
		zr.laj();
		zr.dahci();
		zr.aportiraj();

		zr.uzmiBojuOciju();

		LhasaApso la = new LhasaApso();

		System.out.println("Klasa LhasaApso");
		la.cuvaj();
		la.laj();
		la.dahci();

	}
}
