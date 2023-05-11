package MVC;

public class DemoMVC {

	public static Student ucitajPodatkeStudenta() {
		Student student = new Student();
		student.setIme("Miloš");
		student.setPrezime("Pirivatrić");
		student.setBrIndeksa("IS26/2006");
		student.setOdeljenje("Istorija");
		return student;
	}

	public static void main(String[] args) {

		/*
		 * MVC obrazac omogućava da se razdvoje klase sa podacima (Model), klase u
		 * kojima su sadržane metode za prezentaciju podataka (View) i klasa koja sadrži
		 * logiku koja kontroliše podatke koji se kreću kroz Model klasu, šalje nove
		 * podatke View klasi kada dođe do njihove promene. Takođe, klasa Controller
		 * omogućava da su Model i View klase odvojene i nemaju uticaja jedna na drugu,
		 * čime se smanjuje mogućnost greške i olakšava održavanje. Upotrebom ovog
		 * obrasca olakšava se razumevanje programa drugim programerima koji na njemu
		 * mogu raditi. Korisnik komunicira samo sa Controller klasom. Obrazac omogućava
		 * lakše proširenje programa po potrebi.
		 */

		Student student = ucitajPodatkeStudenta();
		StudentView view = new StudentView();
		StudentController kontroler = new StudentController(student, view);

		kontroler.updateView(); // Pozivanje metode koja ispisuje trenutne podatke.

		kontroler.postaviBrIndeska("IS36/2006"); // Promena vrednosti kroz metodu klase Controller

		kontroler.updateView(); // Ispisivanje izmenjenih vrednosti.

	}

}
