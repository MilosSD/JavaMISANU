package Input;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// Osnovne UI operacije
		// za input operacije Java koristi Streamove. Oni obezbedjuju nacin za rad sa
		// podacimo koji se primaju i salju

		// Klasa koja omogucuje da se poveze tastatura sa Streamom (tokom) je DataInput
		// Stream
		DataInputStream ds = new DataInputStream(System.in);

		// Povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt");

		System.out.println("Unesite string (za kraj unosa unesite $): ");

		// read()
		// write()

		char ch;

		while ((ch = (char) ds.read()) != '$') {
			fos.write(ch);
		}

		fos.close();

	}

}
