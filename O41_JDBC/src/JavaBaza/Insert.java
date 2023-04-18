package JavaBaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";

		System.out.println("Konekcija... ");
		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi! ");

			String sqlinsert = "INSERT INTO korisnici( korisnickoIme,lozinka,ime,email) VALUES ( ?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(sqlinsert);
			ps.setString(1, "ABC");
			ps.setString(2, "pass123");
			ps.setString(3, "Abc");
			ps.setString(4, "abc@gmail.com");

			int unetpodatak = ps.executeUpdate();

			if (unetpodatak > 0) {
				System.out.println("Podatak je upisan! ");
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

}
