package MVC;

public class StudentController {

	/*
	 * Klasa Cointroller omogucava interakciju sa Model i View klasama. Stvaraju se
	 * objekti klasa Model (u ovom slučaju Student) i View. Omogućava osvežavanje
	 * vizuelnog prikaza kada se podaci u klasi Model promene. Služi kao posrednik
	 * između klasa View i Model.
	 */

	private Student student;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		this.student = model;
		this.view = view;
	}

	public void postaviImeStudenta(String ime) {
		student.setIme(ime);
	}

	public void postaviPrezimeStudenta(String prezime) {
		student.setPrezime(prezime);
		;
	}

	public void postaviBrIndeska(String brIndeksa) {
		student.setBrIndeksa(brIndeksa);
		;
	}

	public void postaviOdeljenje(String odeljenje) {
		student.setOdeljenje(odeljenje);
		;
	}

	public String dohvatiImeStudenta() {
		return student.getIme();
	}

	public String dohvatiPrezimeStudenta() {
		return student.getPrezime();
	}

	public String dohvatiBrIndeksa() {
		return student.getBrIndeksa();
	}

	public String dohvatiOdeljenje() {
		return student.getOdeljenje();
	}

	public void updateView() {
		view.prikaziPodatkeStudenta(student.getIme(), student.getPrezime(), student.getBrIndeksa(),
				student.getOdeljenje());
	}

}
