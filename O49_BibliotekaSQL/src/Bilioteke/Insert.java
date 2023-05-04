package Bilioteke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String password = "";

		System.out.println("Konekcija... ");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi! ");

			System.out.println("\nUnesite broj članske karte: ");
			String brClanskeKarte = bf.readLine();
			System.out.println("Unesite ime novog člana: ");
			String ime = bf.readLine();
			System.out.println("Unesite prezime novog člana: ");
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

			String sqlinsert = "INSERT INTO clanovi(brClanskeKarte, ime, prezime, datumrodj, telefon, ulica, broj, bibliotekaID) VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(sqlinsert);
			ps.setString(1, brClanskeKarte);
			ps.setString(2, ime);
			ps.setString(3, prezime);
			ps.setString(4, datumRodjenja);
			ps.setString(5, brTelefona);
			ps.setString(6, ulica);
			ps.setString(7, kucniBroj);
			ps.setString(8, bibliotekaID);

			int unetpodatak = ps.executeUpdate();

			if (unetpodatak > 0) {
				System.out.println("\nPodatak je upisan! ");
			}

		} catch (SQLException | IOException e) {
			// TODO: handle exception
		}
	}

}
