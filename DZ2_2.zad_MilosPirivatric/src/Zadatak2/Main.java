package Zadatak2;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Miloš Pirivatrić", 20231223);

		s1.dodajIspit("111111", 6);
		s1.dodajIspit("222222", 9);
		s1.dodajIspit("333333", 5);

		System.out.println("-------------------------------");
		System.out.println(s1.opis());
	}

}
