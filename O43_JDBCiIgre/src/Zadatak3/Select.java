package Zadatak3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String username = "root";
		String pass = "";

		System.out.println("Povezivanje sa bazom...");

		try {
			Connection conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Povezivanje sa bazom uspesno!");

			String select = "SELECT * FROM spisakbiblioteka";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);

			while (rs.next()) {
				String ime = rs.getString(2);
				String ulica = rs.getString(3);
				String broj = rs.getString(4);

				StringBuilder sb = new StringBuilder();
				sb.append("Ime biblioteke: ");
				sb.append(ime);
				sb.append("\nUlica: ");
				sb.append(ulica);
				sb.append("\nBroj: ");
				sb.append(broj);
				sb.append("\n--------------------------");

				System.out.println(sb.toString());
			}

		} catch (SQLException e) {
			System.out.println("Povezivanje sa bazom nije uspesno izvrseno!");
			e.printStackTrace();
		}

	}

}
