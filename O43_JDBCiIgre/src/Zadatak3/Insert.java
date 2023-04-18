package Zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String pass = "";

		System.out.println("Povezivanje sa bazom...");

		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Povezivanje sa bazom uspesno!");

			System.out.println("Unesite ime biblioteke: ");
			String ime = bf.readLine();
			System.out.println("Unesite ulicu u kojoj se biblioteka nalazi: ");
			String ulica = bf.readLine();
			System.out.println("Unesite broj u ulici: ");
			String broj = bf.readLine();
			String insert = "INSERT INTO spisakbiblioteka (imeBiblioteke, ulica, broj) VALUES (?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, ime);
			ps.setString(2, ulica);
			ps.setString(3, broj);

			int unos = ps.executeUpdate();
			if (unos > 0)
				System.out.println("Uspesan unos podataka!");

		} catch (SQLException e) {
			System.out.println("Povezivanje sa bazom nije uspesno izvrseno!");
			e.printStackTrace();
		}
	}

}
