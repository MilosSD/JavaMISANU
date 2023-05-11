package MVC;

public class StudentView {

	// View klasa sadrži sve što je potrebno za vizuelizaciju podataka koji su
	// sadržani u klasi Model.

	public void prikaziPodatkeStudenta(String ime, String prezime, String brIndeksa, String odeljenje) {
		System.out.println("\nPodaci o studentu: ");
		System.out.println("Ime : " + ime);
		System.out.println("Prezime : " + prezime);
		System.out.println("Broj indeksa : " + brIndeksa);
		System.out.println("Odeljenje : " + odeljenje);
	}
}
