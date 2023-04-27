package praksa;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Poruke extends FileHelper {

	List<String> poruke = new ArrayList<String>();
	String ime;

	public Poruke(String ime, String nazivFajla) {
		this.ime = ime;
		this.poruke = loadMessages(nazivFajla);
	}

	// Metoda za brojanje poruka koje karakter ima u .txt fajlu
	public String brojPoruka() {

		// Креирање регуларног израза који препознаје
		// поруку као текст под знацима навода.
		Pattern poruka = Pattern.compile("(\\“.*\\\"|\\“.*\\”|\\\".*\\\")");
		int dbrPoruka = 0;
		for (String s : poruke) {
			Matcher d1 = poruka.matcher(s);
			if (d1.find())
				dbrPoruka++;
		}
		return "\nBroj poruka " + this.ime + " : " + dbrPoruka;
	}

	// 4.(а) Урадити анализу карактера, бројећи њихову употребу смајлија:

	public String happyVsSad() {

		// Креирање регуларног израза који препознаје
		// поруку као текст под знацима навода.
		Pattern porukaHappy = Pattern.compile("\\😄|\\🙂|\\😍");
		int happy = 0;
		for (String s : poruke) {
			Matcher happyMatch = porukaHappy.matcher(s);
			if (happyMatch.find())
				happy++;
		}
		Pattern porukaSad = Pattern.compile("\\😢|\\😭|\\😞|\\👿");
		int sad = 0;
		for (String s : poruke) {
			Matcher sadMatch = porukaSad.matcher(s);
			if (sadMatch.find())
				sad++;
		}
		String raspolozenje;
		if (happy > sad)
			raspolozenje = "😄";
		else if (sad > happy)
			raspolozenje = "😞";
		else
			raspolozenje = "🤔";
		return "\nPrepiska karaktera : " + this.ime + "\nBroj srećnih smajlija : " + happy + "\nBroj tužnih smajlija : "
				+ sad + "\nRaspoloženje : " + raspolozenje;
	}

	// 5. (а)Одштампати карактер који има најпозитивнију и најнегативнију
	// диспозицију.
	// Метода за одређивање диспозиције одређеног карактера.
	public int dispozicija() {

		Pattern porukaHappy = Pattern.compile("\\😄|\\🙂|\\😍");
		int happy = 0;
		for (String s : poruke) {
			Matcher happyMatch = porukaHappy.matcher(s);
			if (happyMatch.find())
				happy++;
		}
		Pattern porukaSad = Pattern.compile("\\😢|\\😭|\\😞|\\👿");
		int sad = 0;
		for (String s : poruke) {
			Matcher sadMatch = porukaSad.matcher(s);
			if (sadMatch.find())
				sad++;
		}
		return happy - sad;
	}

}
