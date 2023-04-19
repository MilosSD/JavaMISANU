package UUP; 
import java.util.Scanner; 
public class RazlikaCifara {

	public static void main(String[] args) {
		
		//Napisati program kojim se unosi dvocifreni broj i izra?unava razlika cifara desetica i jedinica.

		Scanner input = new Scanner(System.in); 

		System.out.print("Unesite dvocifren broj: "); 

		int a = input.nextInt(); 

		System.out.println("Dvocifren broj: " + a); 

		int d, j, r; d = a / 10; j = a % 10; r = d - j; 

		System.out.println("Razlika cifara je: " + r);

	}
}