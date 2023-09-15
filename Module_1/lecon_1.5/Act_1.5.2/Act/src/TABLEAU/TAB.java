package TABLEAU;

import java.util.Scanner;

public class TAB {
	
	public static Scanner  sc= new  Scanner (System.in);

	public static void main(String[] args) {
		
		
		int max;
		int min;
		
		
		
		int  tab []= new int[5];
		
		System.out.println("saisir les données de Tableau");
		for (int i = 0; i < tab.length; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            tab[i] = sc.nextInt();
        }
		    max = tab[0];
            min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("La valeur maximale dans le tableau est : " + max);
        System.out.println("La valeur minimale dans le tableau est : " + min);

	
	   System.out.print("Veuillez saisir un entier : ");
       int entierRecherche = sc.nextInt();
       
       boolean existe = rechercheEntier(tab, entierRecherche);
       
       
       if (existe) {
           System.out.println("L'entier " + entierRecherche + " existe dans le tableau.");
       } else {
           System.out.println("L'entier " + entierRecherche + " n'existe pas dans le tableau.");
       }

       
       sc.close();

	}  
	
    public static boolean rechercheEntier(int[] tableau, int entierRecherche) {
        for (int nombre : tableau) {
            if (nombre == entierRecherche) {
                return true;
            }
        }
        return false;
    }

}
