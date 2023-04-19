package UUP;

public class EksplicitnaKonverzija {

	public static void main(String[] args) {
			
		/*Napisati kod koji prikazuje ekspicitnu konverziju, tj, konverziju koja (uz gubitke) pretvara sa šireg na uži tip podatka (engl. Narrowing Casting). Mora da se uradi ru?no stavljanjem odgovaraju?eg tipa podatka u zagrade ispred vrednosti. */

		double d = 10.82d; 
		int i = (int) d;
		System.out.println("d " + d); 
		System.out.println("i " + i);
	}

}
