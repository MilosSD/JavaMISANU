package UUP;

import java.util.Scanner;

public class ObimiPovrsina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		System.out.println("Unesite stranice trougla a, b, c"); 
		double a = input.nextDouble();
		double b = input.nextDouble(); double c = input.nextDouble(); 
		double O = a + b + c; 
		System.out.println("Obim trougla je " + O); 
		double s = O / 2; 
		double P = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		System.out.print("Površina trougla je " + P); 
		} 
	}
