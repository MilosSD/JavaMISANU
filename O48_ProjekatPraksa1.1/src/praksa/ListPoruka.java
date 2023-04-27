package praksa;

import java.util.ArrayList;
import java.util.List;

public class ListPoruka {

	List<Poruke> poruke = new ArrayList<Poruke>();

	public void dodaj(Poruke p) {
		this.poruke.add(p);
	}

	// 5.(б) Одштампати карактер који има најпозитивнију и најнегативнију
	// диспозицију.
	// Дефинисање метода за одређивање најпозитивније и најнегативније диспозиције.

	public String najpozitivniji() {
		int disp = 0;
		Poruke poz = null;
		for (Poruke p : poruke)
			if (p.dispozicija() > disp) {
				disp = p.dispozicija();
				poz = p;
			}
		return poz.ime;
	}

	public String najnegativniji() {
		int disp = poruke.get(1).dispozicija();
		Poruke neg = null;
		for (Poruke p : poruke)
			if (p.dispozicija() < disp) {
				disp = p.dispozicija();
				neg = p;
			}
		return neg.ime;
	}
}
