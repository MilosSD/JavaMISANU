package praksa;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.(a) Креирајте класу карактера која садржи 
//податке за сваки карактер у got_meta_data.txt фајлу.
public class Karakter extends FileHelper {

	private String ime;
	private String kuca;
	private String imeFajla;

	public Karakter() {

	}

	public Karakter(String ime, String kuca, String imeFajla) {
		super();
		this.ime = ime;
		this.kuca = kuca;
		this.imeFajla = imeFajla;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getKuca() {
		return kuca;
	}

	public void setKuca(String kuca) {
		this.kuca = kuca;
	}

	public String getImeFajla() {
		return imeFajla;
	}

	public void setImeFajla(String imeFajla) {
		this.imeFajla = imeFajla;
	}

	@Override
	public String toString() {
		return "Ime : " + ime + "\nkuća : " + kuca + "\nmessage log file : " + imeFajla;
	}

	// 4.(а) Урадити анализу карактера, бројећи њихову употребу смајлија:

	public String happyVsSad() {
		List<String> nnPoruke = loadMessages(this.getImeFajla());

		// Креирање регуларног израза који препознаје
		// поруку као текст под знацима навода.
		Pattern porukaHappy = Pattern.compile("\\😄|\\🙂|\\😍");
		int happy = 0;
		for (String s : nnPoruke) {
			Matcher happyMatch = porukaHappy.matcher(s);
			if (happyMatch.find())
				happy++;
		}
		Pattern porukaSad = Pattern.compile("\\😢|\\😭|\\😞|\\👿");
		int sad = 0;
		for (String s : nnPoruke) {
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
		return "\nPrepiska karaktera : " + this.getIme() + "\nBroj srećnih smajlija : " + happy
				+ "\nBroj tužnih smajlija : " + sad + "\nRaspoloženje : " + raspolozenje;
	}

	// 5. (а)Одштампати карактер који има најпозитивнију и најнегативнију
	// диспозицију.
	// Метода за одређивање диспозиције одређеног карактера.
	public int dispozicija() {
		List<String> nnPoruke = loadMessages(this.getImeFajla());
		Pattern porukaHappy = Pattern.compile("\\😄|\\🙂|\\😍");
		int happy = 0;
		for (String s : nnPoruke) {
			Matcher happyMatch = porukaHappy.matcher(s);
			if (happyMatch.find())
				happy++;
		}
		Pattern porukaSad = Pattern.compile("\\😢|\\😭|\\😞|\\👿");
		int sad = 0;
		for (String s : nnPoruke) {
			Matcher sadMatch = porukaSad.matcher(s);
			if (sadMatch.find())
				sad++;
		}
		return happy - sad;
	}

	// 6.(а) Да ли Jon воли Daenerys више него што она воли њега.
	public int ljubav() {
		List<String> nnPoruke = loadMessages(this.getImeFajla());
		Pattern porukaHappy = Pattern
				.compile("(Jon Snow), (\\\".*\\\")|((Daenerys Stormborn), (\\\".*\\\")), (\\\\\\\".*\\\\\\\")");

		StringBuffer poruke = new StringBuffer();
		for (String s : nnPoruke) {
			Matcher loveMatch = porukaHappy.matcher(s);
			if (loveMatch.find()) {
				poruke.append(loveMatch.group());
				poruke.append(System.lineSeparator());
			}
		}
		Pattern lovePattern = Pattern.compile("\\😍|\\😘");
		int love = 0;
		for (String s : nnPoruke) {
			Matcher sadMatch = lovePattern.matcher(s);
			if (sadMatch.find())
				love++;
		}
		return love;
	}

}
