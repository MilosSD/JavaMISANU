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

	// 1 . (а) Читање података из фајла и додавање одговарајућих података пољима.
	public void dodajIzStringa(Karakter n, char prvoSlovo) {
		String data = loadMetaData();

		Pattern obrazac = Pattern
				.compile("(" + prvoSlovo + "[A-Za-z]+ [A-Za-z]+), (House [A-Za-z]+), ([A-Za-z]+[0-9]+\\.txt)");
		Matcher m1 = obrazac.matcher(data);

		m1.find();
		switch (prvoSlovo) {
		case 'D' & 'd': {
			n.setIme(m1.group(1));
			n.setKuca(m1.group(2));
			n.setImeFajla(m1.group(3));
			break;
		}
		case 'T' & 't': {
			n.setIme(m1.group(1));
			n.setKuca(m1.group(2));
			n.setImeFajla(m1.group(3));
			break;
		}
		case 'J' & 'j': {
			n.setIme(m1.group(1));
			n.setKuca(m1.group(2));
			n.setImeFajla(m1.group(3));
			break;
		}
		case 'C' & 'c': {
			n.setIme(m1.group(1));
			n.setKuca(m1.group(2));
			n.setImeFajla(m1.group(3));
			break;
		}
		default: {
			System.out.println("Unesite slova D, J, T ili C !");
			this.dodajIzStringa(n, prvoSlovo);
		}

		}

	}

	// 6.(а) Да ли Jon воли Daenerys више него што она воли њега.
	public int ljubav(String imePosiljaoca) {
		List<String> nnPoruke = loadMessages(this.getImeFajla());
		StringBuilder izdvojenePoruke = new StringBuilder();
		Pattern porukaOd = Pattern.compile("(" + imePosiljaoca + "), (\\\".*\\\")");

		for (String s : nnPoruke) {
			Matcher porukaOdPosijlaoca = porukaOd.matcher(s);
			if (porukaOdPosijlaoca.find()) {
				izdvojenePoruke.append(porukaOdPosijlaoca.group());
			}
		}
		Pattern lovePattern = Pattern.compile("\\😍|\\😘");
		Matcher loveMatch = lovePattern.matcher(izdvojenePoruke.toString());
		int love = 0;

		while (loveMatch.find())
			love++;

		return love;

	}

	// 6.(б) Да ли Jon воли Daenerys више него што она воли њега.
	public String koKogaVoliVise(Karakter d) {
		int loveJ = this.ljubav(d.getIme());
		int loveD = d.ljubav(this.getIme());
		if (loveJ > loveD)
			return this.getIme() + "( " + loveJ + " ) " + " više voli " + d.getIme() + "( " + loveD + " ).";
		else if (loveJ < loveD)
			return d.getIme() + "( " + loveD + " ) " + " više voli " + this.getIme() + "( " + loveD + " ).";
		else
			return d.getIme() + " i " + this.getIme() + " se vole podjednako.";
	}

}
