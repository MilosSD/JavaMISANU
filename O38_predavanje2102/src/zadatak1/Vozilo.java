package zadatak1;

/*Vozilo ima sopstvenu tezinu. 
 * Teretno vozilo je vozilo koje je natovareno tretom određene težine.
 *  Putničko vozilo je vozilo u kome se nalazi određen ebroj putnika zadate prosečne težine. 
 *  Napisati klase koje omogućuju obradu navedenih vrsta vozila. 
 *  Predvideti inicijalizaciju zadatim vrednostima parametra, 
 *  dohvatanje jednoslovne oznake vrste vozila, 
 *  izračunavanje ukupne težine vozila i sastavjanje tekstulanog opisa vozila. 
 *  Omogućiti učitavanje podataka o zadatom vozilu i ispisivanje poruke da li dato vozilo može preći most zadate nosivosti
 */
public abstract class Vozilo {

	double tezina;
	char oznaka;

	Vozilo(double tezina) {
		this.tezina = tezina;
	}

	double getTezina() {
		return this.tezina;
	}

	abstract char vrstaVozila();

	String opis() {
		return "Tezina: " + tezina + "\nOpis: " + vrstaVozila();
	}
}
