package primer6;

public class testOblik {

	public static void main(String[] args) {

		Krug k = new Krug(3);
		Pravougaonik p = new Pravougaonik(3, 5);

		System.out.println("Povrsina kruga je : " + k.uzmiPovrsinu());
		System.out.println("Povrsina pravougaonika je: " + p.uzmiPovrsinu());

	}

}
