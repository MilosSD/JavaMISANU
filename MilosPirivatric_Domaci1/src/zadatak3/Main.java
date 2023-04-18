package zadatak3;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.###");
		Random r1 = () -> Math.random();

		System.out.println("Nasumično generisan broj: " + df.format(r1.nasumicanBr()));

	}

}
