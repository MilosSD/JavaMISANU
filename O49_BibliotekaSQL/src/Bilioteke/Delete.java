package Bilioteke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String pass = "";

		System.out.println("Povezivanje sa bazom...");

		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Povezivanje sa bazom uspešno!");

			System.out.println("\nUnesite broj članske karte člana čije podatke želite da obrišete: ");
			String brClanske = bf.readLine();

			String insert = "DELETE FROM clanovi WHERE brclanskekarte = ?";

			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, brClanske);

			int unos = ps.executeUpdate();
			if (unos > 0)
				System.out.println("\nUspešno izvršeno brisanje!");

		} catch (SQLException | IOException e) {
			System.out.println("Povezivanje sa bazom nije uspešno izvršeno!");
			e.printStackTrace();
		}
	}

}
