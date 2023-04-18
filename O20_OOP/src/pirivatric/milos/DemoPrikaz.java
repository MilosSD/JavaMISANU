package pirivatric.milos;

public class DemoPrikaz {

	public static void main(String[] args) {

		Rastojanje r1 = new Rastojanje();
		Rastojanje r2 = new Rastojanje();

		r1.stopala = 14;
		r1.inci = 9.5; // vrednost se dodeljuje podatku r1

		r2.stopala = 19;
		r2.inci = 5.5;

		System.out.println("Rastojanje r1: " + r1.stopala + "\'-" + r1.inci + "\"");

		System.out.println("Rastojanje r2: " + r2.stopala + "\'-" + r2.inci + "\"");

	}

}
