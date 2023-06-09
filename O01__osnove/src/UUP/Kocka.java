package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		/*Sastaviti algoritam i napisati program kojim se na osnovu unete stranice kocke a izra?unava povr�ina i zapremina. 
Na izlazu �tampati povr�inu i zapreminu kocke.*/

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("Unesite duzinu stranice a : ");

		double a = input.nextDouble();

		double p = 6 * (a * a);
		double v = Math.pow(a, 3);

		System.out.println("Vrednost povrsine za unetu stranicu a je : " + df.format(p));
		System.out.println("Vrednost zapremine za unetu stranicu a je : " + df.format(v));
	}

}
