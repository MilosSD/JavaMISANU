package Domaci;

public class A implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Nit A " + i);
		System.out.println("Kraj niti A!");
	}
}
