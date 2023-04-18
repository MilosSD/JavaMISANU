package Zadatak5;

public class Main {

	public static void main(String[] args) {

		Auto ta1 = new Auto(1000);

		Voznja v1 = new Voznja(3);
		Voznja v2 = new Voznja(3);

		Etapa v11 = new Etapa(15, 70);
		Etapa v12 = new Etapa(20, 80);
		Etapa v13 = new Etapa(30, 75);
		v1.dodajEtapu(v11);
		v1.dodajEtapu(v12);
		v1.dodajEtapu(v13);

		Etapa v21 = new Etapa(10, 60);
		Etapa v22 = new Etapa(20, 70);
		Etapa v23 = new Etapa(30, 75);
		v2.dodajEtapu(v21);
		v2.dodajEtapu(v22);
		v2.dodajEtapu(v23);

		ta1.dodajVoznju(v1);
		ta1.dodajVoznju(v2);

		System.out.println(ta1.opisAuta());

	}

}
