package K9;

public class ReturnTest {

	public static void test() {
		int a = 10;
		System.out.println("BBB");
		if (a == 10)
			return;
		System.out.println("CCC");
	}

	public static void main(String[] args) {
		System.out.println("AAA");
		test();
		System.out.println("DDD");

	}

}
