package zadatak1;

public class bintToDek {

	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			String bin = Integer.toBinaryString(i);
			int dek = 0;

			for (int j = bin.length() - 1; j > 0; j--) {
				if (bin.charAt(j) == '1') {
					dek += Math.pow(2, j);
				}
			}
			System.out.println("Binarni broj: " + bin + " je dekadni broj: " + i);
		}

	}

}
