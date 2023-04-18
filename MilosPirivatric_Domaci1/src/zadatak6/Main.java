package zadatak6;

public class Main {

	public static void main(String[] args) {

		String[] oo = { "Nedovoljan", "Dovoljan", "Dobar", "Vrlodobar", "Odličan" };
		int[] o = { 1, 2, 3, 4, 5 };

		OpisnaOcena<String, Integer> ob1 = new OpisnaOcena<String, Integer>();

		for (int i = 0; i < o.length; i++) {
			ob1.setOcena(i + 1);
			ob1.setOpisnaOcena(oo[i]);
			System.out.println(ob1.toString());
		}

	}

}
