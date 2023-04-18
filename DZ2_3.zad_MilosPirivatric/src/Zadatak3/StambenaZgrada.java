package Zadatak3;

public class StambenaZgrada {

	double povrsinaOsnove;
	int brSpratova;
	int brStanovaPoSpratu;
	int ukupanBrojStanova;
	double prosekPov;

	StambenaZgrada(double po, int brSp, int brStSp, int brStUk, double pPov) {
		this.povrsinaOsnove = po;
		this.brSpratova = brSp;
		this.brStanovaPoSpratu = brStSp;
		this.ukupanBrojStanova = brStUk;
		this.prosekPov = pPov;
	}

	public double getPovrsinaOsnove() {
		return povrsinaOsnove;
	}

	public int getBrSpratova() {
		return brSpratova;
	}

	public int getUkupanBrojStanova() {
		return ukupanBrojStanova;
	}

	public double getProsekPov() {
		return prosekPov;
	}

	public String opis() {
		return this.ukupanBrojStanova * this.prosekPov + " / " + this.brSpratova + " / " + this.ukupanBrojStanova;
	}

}
