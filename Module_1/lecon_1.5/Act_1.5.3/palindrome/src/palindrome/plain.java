package palindrome;

import java.util.Scanner;

public class plain {

	public static void main(String[] args) {
	 
		
		       
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Entrez une chaîne de caractères : ");
		        String chaine = scanner.nextLine();

		        
		        chaine = chaine.replaceAll("\\s+", "").toLowerCase();  

		       
		        boolean estPalindrome = estPalindrome(chaine);

		      
		        if (estPalindrome) {
		            System.out.println("La chaîne est un palindrome.");
		        } else {
		            System.out.println("La chaîne n'est pas un palindrome.");
		        }

		     
		        scanner.close();
		    }

		
		    public static boolean estPalindrome(String chaine) {
		        int longueur = chaine.length();
		        for (int i = 0; i < longueur / 2; i++) {
		            if (chaine.charAt(i) != chaine.charAt(longueur - i - 1)) {
		                return false;
		            }
		        }
		        return true;
		    }
	

	

}
