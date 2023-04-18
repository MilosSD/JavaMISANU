package Domaci;

public class Mmain {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		Thread t1 = new Thread(a, "Nit A");
		Thread t2 = new Thread(b, "Nit B");
		Thread t3 = new Thread(c, "Nit C");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Kraj glavne niti!");

	}

}
