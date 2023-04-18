package UUP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfElseStruktura {
	public static void main(String[] args) throws Exception {

		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		if (x >= 0)
			y = x;

		else
			y = -x;

		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);
	}

}