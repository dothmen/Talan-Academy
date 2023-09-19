package Compte;

public class Main {

	public static void main(String[] args) {
		Account Compte =new Account(500, 500);
		Paid_Account ComptePayant= new Paid_Account(502, 600, 0);
		Savings_Account CompteEpargne= new Savings_Account(502, 600, 0.03);
		
		Compte.depost(200);		
		System.out.println("Compte simple :");
		Compte.toconsult();
		System.out.println("Compte epargne :");
		CompteEpargne.toconsult();
		System.out.println("Compte payant :");
		ComptePayant.toconsult();
	}
}
