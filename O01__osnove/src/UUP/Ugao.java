package UUP; 
import java.util.Scanner; 
public class Ugao { public static void main(String[] args) {

	//Napisati program za izra?unavanje sinusa i kosinusa ugla zadatog u radijanima.

	Scanner input = new Scanner(System.in); 
		
	System.out.print("Unesite vrednost ugla u radijanima: "); 
	double x=input.nextDouble(); 
	
	System.out.println("Sinus zadatog ugla je: " + Math.sin(x)); 
	System.out.print("Kosinus zadatog ugla je: " + Math.cos(x)); 

}
}