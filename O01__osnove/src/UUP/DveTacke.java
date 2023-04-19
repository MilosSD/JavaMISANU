package UUP; 

import java.util.Scanner; 

public class DveTacke { public static void main(String[] args) {

	/*U?itati koordinate dve ta?ke M1(x1,y1) i M2(x2, y2) i izra?unati njihovu me?usobnu udaljenost. 
Opis re�enja: Posmatra se trougao koji formiraju ta?ke M1(x1,y1), hipotenuza je du� izme?u ovih ta?aka. 
Katete su ?x = x2- x1, druga kateta trougla je ?y = y2- y1. Na osnovu Pitagorine teoreme hipotenuza se ra?una: hipotenuza
d2 = (x2- x1)2 + (y2- y1)2 odnosno kvadratni koren iz sume kvadrata.*/
 
	Scanner input = new Scanner(System.in); 
	System.out.println("Unesite koordinate tačke M: "); 
	double x1 = input.nextDouble(); 
	double y1 = input.nextDouble(); 
	
	System.out.println("Unesite koordinate tačke N: "); 
	
	double x2 = input.nextDouble();
	double y2 = input.nextDouble(); 
	double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); 
	
	System.out.println("Rastojanje između tačaka M (" + x1 + "," + y1 + ") i N (" + x2 + "," + y2 + ") je " + d); 
	} 
}
