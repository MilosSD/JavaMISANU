package KVP05;

public class B extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("Nit B" + i);
		System.out.println("Kraj izvrsavanja niti B!");
	}

}
