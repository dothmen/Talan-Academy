package Compte;

public class Paid_Account extends Account {
	public double Paid_account;

	public Paid_Account(double balance, int code, double paid_account) {
		super(balance, code);
		Paid_account = paid_account;
	}
	public void withdrawal(double amount) {
		this.balance-= (amount+2);
	}
}
