package Output;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("ispis.txt");

		System.out.println("Sadrzaj fajla: ");

		// metoda read() cita vrednosti iz fajla bajt po bajt i vraca celobrojnu
		// vrednost.

		int ch;

		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);
		}
		fis.close();
	}

}
