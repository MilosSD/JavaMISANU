package Bilioteke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String pass = "";

		System.out.println("Povezivanje sa bazom...");

		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Povezivanje sa bazom uspešno!");

			System.out.println("\nUnesite broj članske karte: ");
			String brClanskeKarte = bf.readLine();
			System.out.println("Unesite ime člana: ");
			String ime = bf.readLine();
			System.out.println("Unesite prezime člana: ");
			String prezime = bf.readLine();
			System.out.println("Unesite datum rođenja: (u formatu YYYY-MM-DD) ");
			String datumRodjenja = bf.readLine();
			System.out.println("Unesite broj telefona: ");
			String brTelefona = bf.readLine();
			System.out.println("Unesite ulicu: ");
			String ulica = bf.readLine();
			System.out.println("Unesite kućni broj: ");
			String kucniBroj = bf.readLine();
			System.out.println("Unesite ID biblioteke: ");
			String bibliotekaID = bf.readLine();
			String insert = "UPDATE clanovi  SET ime=?, prezime=? ,datumrodj=?, telefon = ?, ulica = ?, broj = ?, bibliotekaID = ? WHERE brclanskekarte = ?";

			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, ime);
			ps.setString(2, prezime);
			ps.setString(3, datumRodjenja);
			ps.setString(4, brTelefona);
			ps.setString(5, ulica);
			ps.setString(6, kucniBroj);
			ps.setString(7, bibliotekaID);
			ps.setString(8, brClanskeKarte);

			int unos = ps.executeUpdate();
			if (unos > 0)
				System.out.println("Uspešno izvršena promena!");

		} catch (SQLException | IOException e) {
			System.out.println("Povezivanje sa bazom nije uspešno izvršeno!");
			e.printStackTrace();
		}
	}

}
