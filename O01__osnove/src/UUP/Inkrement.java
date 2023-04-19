package UUP;

public class Inkrement {

	public static void main(String[] args) {
		/*Neka je i = 3 i j = 4. Izra?unaj:
a) j = 3 + --i;
b) j = 3 + i--;
c) j = 3 + ++i;
d) j = 3 + i++*/
		
		int i = 3, j = 4;
		System.out.println("i = " + i + " j = " + j);
		j = 3 + i++;
		// j = 3 + (i - 1) umanji i pa izračunaj
		System.out.println("i = " + i + " j = " + j);
	}
}