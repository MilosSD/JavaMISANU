package Zadatak62;

public class Main {

	public static void main(String[] args) {

		String[] oo = { "Nedovoljan", "Dovoljan", "Dobar", "Vrlodobar", "Odličan" };
		int[] o = { 1, 2, 3, 4, 5 };

		OpisnaOcena<String, Integer> oo1 = new OpisnaOcena<String, Integer>();
		int i = 0;

		for (int oc : o) {
			oo1.setOcena(oc);
			oo1.setOpisnaOcena(oo[i]);
			System.out.println(oo1.toString());
			i++;
		}
	}

}
