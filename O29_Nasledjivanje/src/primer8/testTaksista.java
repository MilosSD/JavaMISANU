package primer8;

public class testTaksista {

	public static void main(String[] args) {
		HonorarniTaksista ht = new HonorarniTaksista();
		ht.zadajIme("Žika");

		System.out.println(ht.uzmiIme());

		ht.zadajHonorarneSate(20);
		System.out.println(ht.uzmiHonorarneSate());
	}
}
