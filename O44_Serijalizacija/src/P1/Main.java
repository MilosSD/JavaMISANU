package P1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class Main {

	public static void main(String[] args) throws IOException {

		/*
		 * Serijalizacija objekata omogućava njihovo pretvaranje u byte-stream koji je
		 * moguće koji je moguće snimiti u fajl ili poslati preko mreže. Fajl se snima u
		 * .ser formatu. Deserijalizacija omogućava proces suprotan serijalizaciji:
		 * pretvaranje toka podataka ili fajla u objekat u programu.
		 */

		// Stvaranje instance objekta koji se želi serijalizovati.
		// Objekat treba da implmentira interfejs Serializable.

		Student s1 = new Student("Miloš", "Pirivatrić", "IS56/06", "Istorija");

		// Za serijalizaciju se koriste klase FileOutputStream i ObjectOutputStream.
		FileOutputStream fo = new FileOutputStream("student.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);

		oo.writeObject(s1);

		oo.close();
		fo.close();

		System.out.println("Podaci za upis u fajl:");
		System.out.println(s1.toString());
		System.out.println("\nObjekat uspešno upisan u fajl! ");

		long serialVersionUID = ObjectStreamClass.lookup(s1.getClass()).getSerialVersionUID();
		System.out.println("\nSerialVersionUID: " + serialVersionUID);

	}

}
