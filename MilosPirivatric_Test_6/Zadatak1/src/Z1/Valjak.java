package Z1;

public class Valjak {

/*Ваљак се задаје полупречником и висином. Омогућити:
- Стварање ваљка задатог полупречника и висине,
- Дохватање полупречника и висине,
- Израчунавање запремине,
- Састављање текстуалног описа ваљка
*/
	private double r;
	private double h;
	
	Valjak (double pprecnik, double visina){
		this.r=pprecnik;
		this.h=visina;
	}

	public double getR() {
		return r;
	}

	public double getH() {
		return h;
	}
	
	public double zapremina() {
		return (Math.pow(this.getR(), 2)*Math.PI)*this.h;   //Moguce je da sam pogresio formulu za zapreminu, nisam siguran.
	}
	
	public String opis() {
		return "Kanta poluprecnika: "+getR()+", visine: "+getH()+" ima zapreminu: "+this.zapremina();
	}
	
	
}
