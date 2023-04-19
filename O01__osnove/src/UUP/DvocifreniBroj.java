package UUP; 
import java.util.Scanner; 
public class DvocifreniBroj { public static void main(String[] args) {
	
	/*Napisati program za izdvajanje cifara dvocifrenog broja i ispisivanje unazad. 
Opis rešenja: Pri pretvaranju se koristi osobina pozicionog sistema. 
Dvocifren broj broj = d * 101 + j * 100 Ostatak deljenja dvocifrenog broja sa 10 (broj % 10) dobijamo jedinice broja (u ovom slu?aju dvocifrenog). 
Celobrojnim deljenom sa 10 (broj / 10) dvocifrenog broja se dobija cifra desetica.*/

	Scanner input = new Scanner(System.in); 
	
	System.out.println("Cifre dvocifrenog broja ");
	System.out.println("Dvocifreni broj "); 
	int a = input.nextInt(); 
	int d, j;
	
	d = a / 10; 
	j = a % 10; 
	
	int r = d-j;
	System.out.println ("Razlika je = "+ r); 
	
	} 
}