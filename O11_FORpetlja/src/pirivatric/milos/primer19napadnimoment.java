package pirivatric.milos;

import java.text.DecimalFormat;

public class primer19napadnimoment {

	public static void main(String[] args) {
		double ft = 0, mz = 0, qo = 1.0, l = 6.0;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("\tz\tFt\tM");

		for (double z = 2.5; z < 3.5; z += 0.1) {
			ft = qo / 2 * (l / 3 - (Math.pow(z, 2) / l));
			mz = qo * l * l * (z / l - Math.pow(z / l, 3.0)) / 6.0;

			System.out.println("\t" + df.format(z) + "\t" + df.format(ft) + "\t" + df.format(mz));
		}

	}

}
