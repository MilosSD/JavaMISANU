package zadatak7;

import java.io.FileWriter;
import java.io.IOException;

public class Fajl {

	public static void main(String[] args) throws IOException {

		try {

			FileWriter fw = new FileWriter("Programer.txt");
			fw.write("Ja sam programer!");

			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
