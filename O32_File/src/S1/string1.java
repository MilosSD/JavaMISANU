package S1;

public class string1 {

	public static void main(String[] args) {

		// Stringovi se predstavljaju klasom String
		String str = "21`314;l,db./b./.bv/;ld";
		System.out.println(str);

		// Kreiranje Stringa pomocu kljucne reci new
		String str1 = new String("Utorak, 24. Januar");
		System.out.println(str1);

		// Inicijalizacija stringa postojecim stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);

		// Inicijalizacija nizom char vrednosti
		char s3[] = { 'J', 'A', 'V', 'A' };
		System.out.println(s3);

		// Inicijalizaciuja podnizom
		String s4 = new String(s3, 1, 3);
		System.out.println(s4);

		// Metoda charAt vraca karakter tipa char sa zadate pozicije u stringu.
		// Indeksiranje ide od 0.
		char ch2 = s4.charAt(2);
		System.out.println(ch2);

		// Duzina Stringa se odredjuje metodom length()
		String s7 = new String(s3);
		System.out.println("String = " + s7);
		System.out.println("Length = " + s7.length());
		System.out.println("Length = " + "Java programiranje".length());

		// Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi
		// razlika izmedju // velikih i malih slova. Vraca true ako su stringovi isti, u
		// suprotnom vraca false.

		// Metoda iqualsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku
		// izmedju malih i velikih slova.
		// Metoda copareTo poziva se kao: // s1.compareTo(s2) // vraca 0 ako su s1 i s2
		// jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.
		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s10 + " = " + s10.equalsIgnoreCase(s9));

		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");
		boolean b;

		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";

		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));
	}

}
