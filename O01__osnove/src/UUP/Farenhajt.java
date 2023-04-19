package UUP;

import java. util.Scanner;

public class Farenhajt {

	public static void main(String[] args) {
		//Napisati program za pretvaranje temperature iz skale Celzijusa u skalu Farenhajta.

		Scanner input = new Scanner (System.in);
		
		System.out.print("Unesite temperaturu u celzijusima: "); 
		
		double tc=input.nextDouble();
		
		System.out.println("Temperatura u farenhajtima je: " + (tc * 1.8 + 32)); 
		} 
	}
