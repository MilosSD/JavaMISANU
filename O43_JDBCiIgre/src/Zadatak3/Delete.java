
package Zadatak3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String pass = "";

		System.out.println("Povezivanje sa bazom...");

		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Povezivanje sa bazom uspesno!");

			System.out.println("Unesite ID biblioteke: ");
			String id = bf.readLine();

			String insert = "DELETE FROM `spisakbiblioteka` WHERE bibliotekaID = ?";

			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setString(1, id);

			int unos = ps.executeUpdate();
			if (unos > 0)
				System.out.println("Uspesno izvrseno brisanje!");

		} catch (SQLException e) {
			System.out.println("Povezivanje sa bazom nije uspesno izvrseno!");
			e.printStackTrace();
		}
	}

}
