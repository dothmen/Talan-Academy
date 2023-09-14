package Phone;

import java.util.Scanner;

public class Phonebook {
	public static Scanner sc = null;

	public static void main(String[] args) {
		
		
		    sc = new Scanner(System.in);
		    
		    String userlastname  = getUserInput("Entrez un nom de famille");
		    String userfirstname = getUserInput("Entrez un prénom");
		    String userPhonename = getUserInput("Entrez un numéro de téléphone");
		    
		    System.out.println(userfirstname);
			System.out.println(userlastname);
			System.out.println(userPhonename);
			
		    sc.close();
		
	}
	public static String getUserInput(String Userrequest) {
		
		    System.out.println(Userrequest);
			String userlastname = sc.nextLine();
			return userlastname ;
			
		
	}
	

}
