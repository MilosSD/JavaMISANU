package p1;

public class AccountBalance {

	public static void main(String[] args) {
		Balance current[] = new Balance[3];

		try {
			current[0] = new Balance("Mika", 123.45);
			current[1] = new Balance("Zika", 345.67);
			current[2] = new Balance("Ljubivoje ", -12.34);

			for (int i = 0; i < 3; i++) {
				current[i].show();
			}

			current[3] = new Balance("Milisav", 132.45);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Nepostojeci indeks!");
		}

	}

}
