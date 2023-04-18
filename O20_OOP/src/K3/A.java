package K3;

public class A {

	private String message;

	// Deklarisanjem privatnih podataka vrsi se snkapuslacija podataka - skrivanje
	// podataka koji su vidljivi samo u toj klasi.
	// Sprecava se promena vrednosti promenljivih iz koda van zadate klase.

	// podatak = atribut = osobina klase
	// atributi se predstavljaju preko promenljivih u deklaraciji klase.
	public void setMessage(String msg) {
		message = msg; // postavlja vrednost promenljivoj message
	}

	// Metoda getMessage () vraca poruku
	public String getMessage() // nema parametara, vraca odgovarajuci tip podataka
	{
		return message;
	}
}
