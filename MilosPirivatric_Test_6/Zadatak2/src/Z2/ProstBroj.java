package Z2;

import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Unesite ceo broj: ");
			int n = sc.nextInt();
			
			
			if (n==2) {
				System.out.println("Uneti broj je prost broj! ");
			}
			else if (n == 3) {
				System.out.println("Uneti broj je prost broj! ");
			}
			else if (n%2==0 || n%3==0) {
				System.out.println("Uneti broj nije prost broj! ");
			}
			else
				System.out.println("Uneti broj je prost broj! ");
		} catch (Exception e) {
			
			System.out.println("Niste uneli ceo broj! ");
			main(args);
		}
		finally {
		sc.close();
		}
	}

}
