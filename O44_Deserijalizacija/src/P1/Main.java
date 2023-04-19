package P1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Deklarisanje objekta koji će prihvatiti vrednosti deserijalizovanog objekta.
		Student s2 = null;

		FileInputStream fin = new FileInputStream(
				"C:\\Users\\Milos\\eclipse-workspace\\O44_Serijalizacija\\student.ser");
		ObjectInputStream in = new ObjectInputStream(fin);

		s2 = (Student) in.readObject();

		in.close();
		fin.close();

		System.out.println("Objekat uspešno učitan! ");
		System.out.println("---------------------------------");
		System.out.println("Podaci o studentu: ");
		System.out.println(s2.toString());

		// serialVersionUID treba da obezbedi da objekat koji se serijalizuje i
		// deserijalizuje pripadaju istoj klasi.
		// To je njihova zajednicka jedinstvena oznaka.

		long serialVersionUID = ObjectStreamClass.lookup(s2.getClass()).getSerialVersionUID();
		System.out.println("\nSerialVersionUID: " + serialVersionUID);

	}

}
