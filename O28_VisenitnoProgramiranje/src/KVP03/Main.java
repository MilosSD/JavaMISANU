package KVP03;

public class Main {

	public static void main(String[] args) {

		A a1 = new A("Nit1");
		A a2 = new A("Nit2");
		A a3 = new A("Nit3");

		a1.start(); // zapocinje izvrsavanje niti pozivanjem njene metode run()
		a2.start();
		a3.start();

	}

}
