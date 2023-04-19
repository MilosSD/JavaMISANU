package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Dekart {

	public static void main(String[] args) throws Exception {
		/*Sastaviti algoritam i napisati program kojim se izra?unavaju Dekartove koordinate sile inteziteta F = 6kN, ako je ugao ? = 60° izmedju sile F i koordinate ose. Na izlazu štampati vrednost Dekartovih koordinata.
Dekartove koordinate sile F na koordinatne ose odre?uju se izrazima
X = F * cos ?
Y = F * sin ? */

		double f, alfa, x, y;

		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite vrednost za intenzitet sile F(kN): ");
		f = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za ugao alfa u stepenima: ");

		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));

		x = f * Math.cos(alfa);
		y = f * Math.sin(alfa);

		System.out.println("Vrednosti Dekartovih koordinata su: X= " + df.format(x) + "\tY=" + df.format(y));

	}

}
