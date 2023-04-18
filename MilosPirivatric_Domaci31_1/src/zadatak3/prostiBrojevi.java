package zadatak3;

import java.util.ArrayList;
import java.util.List;

public class prostiBrojevi {

	public static void main(String[] args) {

		List<Integer> pb = new ArrayList<Integer>();

		pb.add(2);
		pb.add(3);

		for (int i = 4; i <= 10; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				pb.add(i);
			}
		}
		System.out.println("Prosti brojevi izmedju 1 i 10 su: " + pb);
	}

}
