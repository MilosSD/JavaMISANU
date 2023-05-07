package Bilioteke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi. ");
			String sqlselect = "SELECT * FROM clanovi";

			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sqlselect);

			while (result.next()) {

				String clanID = result.getString(1);
				String brClKarte = result.getString(2);
				String ime = result.getString(3);
				String prezime = result.getString(4);
				String datumRodjenja = result.getString(5);
				String telefon = result.getString(6);
				String adresa = result.getString(7) + " " + result.getString(8);

				StringBuilder builder = new StringBuilder();
				builder.append("\nID broj u bazi: ");
				builder.append(clanID);
				builder.append("\nIme i prezime: ");
				builder.append(ime + " " + prezime);
				builder.append("\nDatum rođenja: ");
				builder.append(datumRodjenja);
				builder.append("\nAdresa: ");
				builder.append(adresa);
				builder.append("\nTelefon: ");
				builder.append(telefon);
				builder.append("\nBroj članske karte: ");
				builder.append(brClKarte);
				builder.append("\n");

				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
