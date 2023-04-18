package JavaBaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// adresa gde se nalazi baza sa kojom zelimo da se povezemo
		// korisnicko ime servera kome pristupamo
		// lozinka servera kome pristupamo

		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi. ");
			String sqlselect = "SELECT * FROM korisnici";

			Statement stmt = conn.createStatement(); // objekat za komunikaciju sa bazom
			ResultSet result = stmt.executeQuery(sqlselect); // izvrsavanje (namena)

			while (result.next()) {

				String ki = result.getString(2);
				String lo = result.getString(3);
				String ime = result.getString(4);
				String email = result.getString(5);

				StringBuilder builder = new StringBuilder();
				builder.append("Korisnicko ime: ");
				builder.append(ki);
				builder.append("\nLozinka: ");
				builder.append(lo);
				builder.append("\nIme: ");
				builder.append(ime);
				builder.append("\nEmail: ");
				builder.append(email);

				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
