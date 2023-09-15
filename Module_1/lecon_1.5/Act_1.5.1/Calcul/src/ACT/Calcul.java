package ACT;


import java.util.Scanner;

public class Calcul {
	
	public static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		int a  = getUserInput("Entrez a");
		int b=  getUserInput("Entrez b");
		
		int somme = a + b; 
         System.out.println("la somme est : " + somme);

		  
		  
		  int plusGrand = max(a, b);
	       int factorielle = calculerFactorielle(plusGrand);
	        System.out.println("La factorielle du nombre le plus grand (" + plusGrand + ") est : " + factorielle);
	        
	        
	        
	         int quotient = calculerlaquotient(a/b);
	         System.out.println("La division par zéro n'est pas autorisée.");
	         
	         System.out.println("Le quotient de " + a + " / " + b + " est : " + quotient);
	        
	}
	
	
	
	
	
	
	
	public static int getUserInput(String Userrequest) {
		
	    System.out.println(Userrequest);
		int res = sc.nextInt();
		return res ;
		

	 }
	
	public static int max (int a, int b) {
		int n;
		 
		if (a>b ) {
			n =a ;
			
		}
		else {
			n =b;
					
		}
		return n;
	
	
	}
	public static int calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
          
           
        }
            return fact;
         
	 }
       
   
        public static int calculerquotient(int a , int b){
        	if (b==0) {
        	} else {
               
                int quotient = a / b;
        		
        	}
        	
        	
        	
	 
	
        
        
        
        
     
        
        }
		
	

        
        
}}
	
