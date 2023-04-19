package UUP;

import java. util.Scanner;

public class Bajt {

	public static void main(String[] args) {
		
		//Napisati program za pretvaranje veli?ine fajla izražene u kilobajtima u veli?inu u bajtima.
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Unesite vrednost u kilobajtima: "); 
		
		double g=input.nextDouble();
		
		System.out.println("Velicina u bajtima je: " + g * 1024); 

	}

}
