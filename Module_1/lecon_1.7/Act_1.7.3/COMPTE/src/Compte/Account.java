package Compte;

public class Account {
	protected double balance;
	protected int code;
	public Account(double balance, int code) {
		super();
		this.balance = balance;
		this.code = code;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getcode() {
		return code;
	}
	public void setScode(int code) {
		this.code = code;
	}
	
	public void depost(double amount) {
	this.balance += amount;
	}
	public void withdrawal(double amount) {
	this.balance-= amount;

	}
	public void toconsult(){
		System.out.println("votre solde est:" +this.code+ "€");
	}
	
	public String toString() {

		return "Compte [code=" + code + ", solde=" + code + " €" + "]";
	}
	
	
	}

 

