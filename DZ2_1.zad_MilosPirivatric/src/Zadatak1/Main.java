package Zadatak1;

public class Main {

	public static void main(String[] args) {

		ZarubljenaKupa zk1 = new ZarubljenaKupa(2, 4, 5);
		zk1.upisDimenzija();

		ZarubljenaKupa zk2 = new ZarubljenaKupa(1, 3, 3);
		zk2.upisDimenzija();

		ZarubljenaKupa zk3 = new ZarubljenaKupa(2, 6, 7);
		zk3.upisDimenzija();

		ZarubljenaKupa zk4 = new ZarubljenaKupa(3, 5, 8);
		zk4.upisDimenzija();

		Niz n1 = new Niz();

		n1.dodajKupu(zk1);
		n1.dodajKupu(zk2);
		n1.dodajKupu(zk3);
		n1.dodajKupu(zk4);

		while (n1.getPopunjenaMesta() > 0) {

			int min = n1.najmanjaZapremina();
			ZarubljenaKupa zk = n1.getZk(min);
			System.out.println("Kupa najmanje zapremine: " + zk.opisKupe());
			n1.obrisiKupu(min);
		}

	}

}
