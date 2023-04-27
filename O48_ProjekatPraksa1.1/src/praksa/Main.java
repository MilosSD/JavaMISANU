package praksa;

public class Main extends FileHelper {

	public static void main(String[] args) {

		/*
		 * 1. (б) Креирање објеката класе Карактер и упис података на основу података
		 * добијених из фајла "got_meta_data.txt" коришћењем методе dodajIzStringa() у
		 * класи Карактер, а која користи методу loadmetadata() класе FileHelper.
		 */
		Karakter Daenerys = new Karakter();
		Karakter Jon = new Karakter();
		Karakter Tyrion = new Karakter();
		Karakter Cersei = new Karakter();

		Daenerys.dodajIzStringa(Daenerys, 'D');
		Daenerys.dodajIzStringa(Jon, 'J');
		Daenerys.dodajIzStringa(Tyrion, 'T');
		Daenerys.dodajIzStringa(Cersei, 'C');

		System.out.println(Daenerys.toString());
		System.out.println("\n" + Jon.toString());
		System.out.println("\n" + Tyrion.toString());
		System.out.println("\n" + Cersei.toString());

		// 2. Одштампајте све поруке особе Daenerys уз коришћење мало
		// измењене методе у класи FileHelper
		System.out.println("\n" + loadMessagesString(Daenerys.getImeFajla()));

		// Други начин решења задатка бр. 2.
		// List<String> deniPoruke = loadMessages(Daenerys.getImeFajla());
		// System.out.println("\n" + deniPoruke.toString());

		// 3. Креирајте обавештење које приказује број порука који се сваки карактер
		// послао.
		Poruke D = new Poruke(Daenerys.getIme(), Daenerys.getImeFajla());
		Poruke J = new Poruke(Jon.getIme(), Jon.getImeFajla());
		Poruke T = new Poruke(Tyrion.getIme(), Tyrion.getImeFajla());
		Poruke C = new Poruke(Cersei.getIme(), Cersei.getImeFajla());
		System.out.println(D.brojPoruka());
		System.out.println(J.brojPoruka());
		System.out.println(T.brojPoruka());
		System.out.println(C.brojPoruka());

		// 4.(б) Урадити анализу карактера, бројећи њихову употребу смајлија:
		System.out.println(D.happyVsSad());
		System.out.println(J.happyVsSad());
		System.out.println(T.happyVsSad());
		System.out.println(C.happyVsSad());

		// 5. (в) Одштампати карактер који има најпозитивнију и најнегативнију
		// диспозицију.
		ListPoruka lista = new ListPoruka();
		lista.dodaj(D);
		lista.dodaj(J);
		lista.dodaj(T);
		lista.dodaj(C);
		System.out.println("\nLik sa najpozitivnijom dispozicijom: " + "\n" + lista.najpozitivniji());
		System.out.println("\nLik sa najnegativnijom dispozicijom: " + "\n" + lista.najnegativniji());

		// 6.(в) Да ли Jon воли Daenerys више него што она воли њега.
		System.out.println("\n" + Jon.koKogaVoliVise(Daenerys));

	}

}
