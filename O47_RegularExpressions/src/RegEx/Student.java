package RegEx;

public class Student {

	private String ime;
	private String prezime;
	private String brIndeksa;
	private String odeljenje;
	private String email;

	public Student(String ime, String prezime, String brIndeksa, String odeljenje, String email) {
		this.ime = ime;
		this.prezime = prezime;
		this.brIndeksa = brIndeksa;
		this.odeljenje = odeljenje;
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getOdeljenje() {
		return odeljenje;
	}

	public void setOdeljenje(String odeljenje) {
		this.odeljenje = odeljenje;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student: " + ime + " " + prezime + "\nBroj indeksa: " + brIndeksa + "\nOdeljenje: " + odeljenje;
	}

}
