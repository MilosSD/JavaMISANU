package zadatak2p1;

public class BankAccount {
	
	double stanje;
	
	public BankAccount() {
		
	}
	public BankAccount (double s){
		this.stanje = s;
	}

	public double dodajStanje (double dodatak) {
		System.out.print("Trenutno stanje na racunu:" + "\n" + stanje);
		System.out.print("\nIznos uplate:" + "\n" + dodatak);
		this.stanje = getStanje() + dodatak;
		System.out.println("\nVase trenutno stanje iznosi: ");
		return stanje;
	}
	public double getStanje() {
		return stanje;
	}
	
}
