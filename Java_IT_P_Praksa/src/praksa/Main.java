package praksa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends FileHelper {

	// Metoda za brojanje poruka koje karakter ima u .txt fajlu
	public static String brojPoruka(Karakter nn) {
		List<String> nnPoruke = loadMessages(nn.getImeFajla());

		// Штампање свих порука карактер које су прочитане у динамички низ.
		// System.out.println("\n" + nnPoruke.toString());

		// Креирање регуларног израза који препознаје
		// поруку као текст под знацима навода.
		Pattern poruka = Pattern.compile("(\\“.*\\\"|\\“.*\\”|\\\".*\\\")");
		int dbrPoruka = 0;
		for (String s : nnPoruke) {
			Matcher d1 = poruka.matcher(s);
			if (d1.find())
				dbrPoruka++;
		}
		return "\nBroj poruka " + nn.getIme() + " : " + dbrPoruka;
	}

	// 5.(б) Одштампати карактер који има најпозитивнију и најнегативнију
	// диспозицију.
	// Дефинисање метода за одређивање најпозитивније и најнегативније диспозиције.
	public static String najpozitivniji(List<Karakter> lista) {
		int disp = 0;
		Karakter poz = null;
		for (Karakter k : lista)
			if (k.dispozicija() > disp) {
				disp = k.dispozicija();
				poz = k;
			}
		return poz.toString();
	}

	public static String najnegativniji(List<Karakter> lista) {
		int disp = lista.get(1).dispozicija();
		Karakter poz = null;
		for (Karakter k : lista)
			if (k.dispozicija() < disp) {
				disp = k.dispozicija();
				poz = k;
			}
		return poz.toString();
	}

	// 6.(б) Да ли Jon воли Daenerys више него што она воли њега.
	public static String koKogaVoliVise(Karakter j, Karakter d) {
		if (j.ljubav() > d.ljubav())
			return j.getIme() + " više voli " + d.getIme() + ".";
		else if (j.ljubav() < d.ljubav())
			return d.getIme() + " više voli " + j.getIme() + ".";
		else
			return d.getIme() + " i " + j.getIme() + " se vole podjednako.";
	}

	public static void main(String[] args) {

		/*
		 * 1. (б) Креирање објеката класе Карактер и упис података на основу података
		 * добијених из фајла "got_meta_data.txt" коришћењем методе loadMetaData() класе
		 * FileHelper.
		 */
		Karakter Daenerys = new Karakter();
		Karakter Jon = new Karakter();
		Karakter Tyrion = new Karakter();
		Karakter Cersei = new Karakter();

		String data = loadMetaData();

		Pattern Deni = Pattern.compile("(D[A-Za-z]+ [A-Za-z]+), (House [A-Za-z]+), ([A-Za-z]+[0-9]+\\.txt)");
		Matcher m1 = Deni.matcher(data);

		m1.find();

		Daenerys.setIme(m1.group(1));
		Daenerys.setKuca(m1.group(2));
		Daenerys.setImeFajla(m1.group(3));

		System.out.println(Daenerys.toString());

		Pattern John = Pattern.compile("(J[A-Za-z]+ [A-Za-z]+), (House [A-Za-z]+), ([A-Za-z]+[0-9]+\\.txt)");
		Matcher m2 = John.matcher(data);

		m2.find();

		Jon.setIme(m2.group(1));
		Jon.setKuca(m2.group(2));
		Jon.setImeFajla(m2.group(3));

		System.out.println("\n" + Jon.toString());

		Pattern Tirion = Pattern.compile("(T[A-Za-z]+ [A-Za-z]+), (House [A-Za-z]+), ([A-Za-z]+[0-9]+\\.txt)");
		Matcher m3 = Tirion.matcher(data);

		m3.find();

		Tyrion.setIme(m3.group(1));
		Tyrion.setKuca(m3.group(2));
		Tyrion.setImeFajla(m3.group(3));

		System.out.println("\n" + Tyrion.toString());

		Pattern Sersei = Pattern.compile("(C[A-Za-z]+ [A-Za-z]+), (House [A-Za-z]+), ([A-Za-z]+[0-9]+\\.txt)");
		Matcher m4 = Sersei.matcher(data);

		m4.find();

		Cersei.setIme(m4.group(1));
		Cersei.setKuca(m4.group(2));
		Cersei.setImeFajla(m4.group(3));

		System.out.println("\n" + Cersei.toString());

		// 2. Одштампајте све поруке особе Daenerys уз коришћење мало
		// измењене методе у класи FileHelper
		System.out.println("\n" + loadMessagesString(Daenerys.getImeFajla()));

		// Други начин решења задатка бр. 2.
		// List<String> deniPoruke = loadMessages(Daenerys.getImeFajla());
		// System.out.println("\n" + deniPoruke.toString());

		// 3. Креирајте обавештење које приказује број порука који се сваки карактер
		// послао.
		System.out.println(brojPoruka(Daenerys));
		System.out.println(brojPoruka(Jon));
		System.out.println(brojPoruka(Tyrion));
		System.out.println(brojPoruka(Cersei));

		// 4.(б) Урадити анализу карактера, бројећи њихову употребу смајлија:
		System.out.println(Daenerys.happyVsSad());
		System.out.println(Jon.happyVsSad());
		System.out.println(Tyrion.happyVsSad());
		System.out.println(Cersei.happyVsSad());

		// 5. (в) Одштампати карактер који има најпозитивнију и најнегативнију
		// диспозицију.
		List<Karakter> karakteri = new ArrayList<Karakter>();
		karakteri.add(Daenerys);
		karakteri.add(Jon);
		karakteri.add(Tyrion);
		karakteri.add(Cersei);
		System.out.println("\nLik sa najpozitivnijom dispozicijom: " + "\n" + najpozitivniji(karakteri));
		System.out.println("\nLik sa najnegativnijom dispozicijom: " + "\n" + najnegativniji(karakteri));

		// 6.(в) Да ли Jon воли Daenerys више него што она воли њега.
		System.out.println("\n" + koKogaVoliVise(Jon, Daenerys));

	}

}
