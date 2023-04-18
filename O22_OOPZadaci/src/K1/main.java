package K1;

public class main {

	public static void main(String[] args) {

		Krug c1 = new Krug(10);
		Krug c2 = new Krug(c1); // c1 je objekat koji je vec kreiran

		System.out.println("Povrsina kruga: " + c1.area());

	}

}
