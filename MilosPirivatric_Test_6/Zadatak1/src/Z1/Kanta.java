package Z1;

public class Kanta extends Valjak{
	
	double pop;
	
	Kanta(double r, double h, double popunjenost){
		super(r,h);
		this.pop = popunjenost;
	}

	public double getPop() {
		return pop;
	}

	public double prazno() {
		return	this.zapremina() - this.pop;
	}
	
	public boolean ispitivanje() {
		boolean puna = false;
		if (this.zapremina()==this.pop) {
			System.out.println("Kanta je skroz puna!");
			puna = true;
		}
		else if (this.zapremina()==0) {
			System.out.println("Kanta je prazna! ");
		}
		else if (this.zapremina()<this.pop){
			System.out.println("Kanta je prepunjena! ");
			this.pop=this.zapremina();
			puna = true;
		}
		else
			System.out.println("U kanti ima mesta: "+ this.prazno());
		return puna;
	}
	
	public void dolij(double v) {
		if (getPop()<zapremina()) {
			this.pop+=v;
			if (getPop()>zapremina()) {
				this.pop=this.zapremina();
			}
		}
		else
			System.out.println("Nema mesta u kanti! ");
	}
	public double odlij(double v) {
		this.pop = getPop() - v;
		return this.pop;
	}
	public void prespi(Kanta k) {
		if (k.prazno()>0) {
			this.odlij(k.prazno());
			k.dolij(k.prazno());
		}
	}
	public String opisKante() {
		return super.opis()+ ",od cega je popunjeno: " + this.getPop();
	}
}
