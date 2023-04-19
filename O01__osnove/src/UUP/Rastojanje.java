package UUP; 
import java.util.Scanner; 
public class Rastojanje { public static void main(String[] args) {
	/*U?itati koordinate dve ta?ke M1(x1,y1) i M2(x2, y2) i izra?unati pojedina?nu udaljenost ta?aka od koordinatnog po?etka 
Opis re쉋nja: Udaljenost ta?ke od koordinatnog po?etka je po Pitagori kvadratni koren sume kvadrata veli?ina kateta. Za ta?ku M1(x1, y1) udaljenost od koordinatnog po?etka je hipotenuza a12 = x12 + y12 odnosno kvadratni koren iz sume kvadrata.
 Na isti na?in se ra?una i udaljenost ta?ke M2(x2, y2), hipotenuza a22 = x22 + y22 odnosno kvadratni koren iz sume kvadrata kateta.*/
	
	Scanner input = new Scanner (System.in); 
	
	System.out.println("Unesite koordinate prve ta훾ke: "); 
	double x1 = input.nextDouble(); 
	double y1 = input.nextDouble(); 
	double a1 = Math.sqrt(x1 * x1 + y1 * y1); 
	
	System.out.println("Unesite koordinate druge ta훾ke: "); 
	double x2 = input.nextDouble(); 
	double y2 = input.nextDouble(); 
	double a2 = Math.sqrt(x2 * x2 + y2 * y2); 
	
	System.out.println("Rastojanje prve ta훾ke (" + x1 + "," + y1 + ") od koordinatnog po훾etka je " + a1); 
	System.out.println("Rastojanje druge ta훾ke (" + x2 + "," + y2 + ") od koordinatnog po훾etka je " + a2); 
	} 
}