package UUP;

import java.util.Scanner;

public class ZamenaVrednosti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite brojeve x,y: ");
		int x = input.nextInt();
		int y = input.nextInt();

		int temp;

		System.out.println("Pre zamene\nx = " + x + "\ny = " + y);
		temp = x;
		// temp - privremena promenljiva
		x = y; // x može primiti novu vrednost jer je kopija u temp
		y = temp; // y prima vrednost od temp
		System.out.println("Posle zamene\nx = " + x + "\ny = " + y);
		input.close();
	}
}
