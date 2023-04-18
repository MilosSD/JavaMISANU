package LambdaIzraz3;

public class Main {

	public static void main(String[] args) {

		OkreniRed o1 = (str) -> {
			String rezultat = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rezultat += str.charAt(i);
			}
			return rezultat;
		};
		System.out.println("12345 " + o1.OkreniString("12345"));
		System.out.println("Java obrnuto " + o1.OkreniString("Java"));
	}

}
