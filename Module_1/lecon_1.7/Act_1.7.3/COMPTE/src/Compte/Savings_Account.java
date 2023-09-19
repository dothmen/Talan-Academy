package Compte;

public class Savings_Account extends Account{
	    public double interest_rate=0.1;
		public Savings_Account(double balance, int code, double interest_rate) {
			super(balance, code);
			this.interest_rate = interest_rate;
		}
	    public double calculinterest() {
	    	double actualbalence= this.getBalance();
	    	double finalbalence= (actualbalence*1.1);
	    	this.balance=finalbalence;
	    	return finalbalence; 
	    }
}
