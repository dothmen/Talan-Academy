package Epe;

import java.util.Arrays;
import java.util.Scanner;

public class Epee {

	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tab[] = new String[14];
        System.out.println("Entrez les noms de vos collegues:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Nom de collegue " + (i + 1) + ": ");
            tab[i] = sc.nextLine();
        }
        triBulles(tab);
    System.out.println("Noms triés : " + Arrays.toString(tab));
    }

    public static void triBulles(String[] tableau) {
        int n = tableau.length;
        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i].compareTo(tableau[i + 1]) > 0) {
                    
                    String temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    permut = true;
                }
            }
            n--;
        } while (permut);
    }
}
