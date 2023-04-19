package UUP; 
import java.io.*; 
import java.text.DecimalFormat; 

public class CelicniStap { public static void main(String[] args) throws Exception { 
		
		/*?eli?ni �tap kvadratnog popre?nog preseka stranice A = 1cm1, du�ine L + 30cm, modula elasti?nosti E + 2 * 104kN / cm2, pod dejstvom aksijalne sile F izdu�i se za ? = 3,2 - 10 -2cm, dok u popre?nom preseku nastaje kontrakcija ?a = 3 * 10-4cm2.
Sastaviti algoritam i napisati program za odre?ivanje intenziteta aksijalne sile F i Poasonovog kofecijenta u.*/

		// A – površina poprečnog preseka štapa 
		// L - dužina štapa 
		// E - modul elastičnosti materijala 
		// deltaL - izduženje štapa 
		// deltaA - kontrakcija 
		// F - intenzitet aksijalne sile 
		// mi - Poasonov koeficijent 
		double A, L, E, deltaL, deltaA, F, mi;   
		DecimalFormat df = new DecimalFormat("#.##");  
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka 
		System.out.print("Unesite vrednost površine poprečnog preseka štapa A: "); 
		A = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost dužine štapa L (cm): "); 
		L = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost modula elastičnosti E: ");
		E = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost izduženja štapa (cm): "); 
		deltaL = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost kontrakcije (cm): "); 
		deltaA = Double.parseDouble(ulaz.readLine()); 
		// Izračunavanje vrednosti intenziteta aksijalne sile i Poasonovog koeficijenta
		F = A * E * deltaL / L; mi = L * deltaA / (A * deltaL); 
		// Štampanje rezultata 
		System.out.println("Intenzitet aksijalne sile je F = " + df.format(F) + "kN\nVrednost Poasonovog koeficijenta je " + df.format(mi)); 
		}
}