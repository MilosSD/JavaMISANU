package Domaci;

public class C implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nit C: " + i);
		}
		System.out.println("Kraj niti C!");
	}

}
