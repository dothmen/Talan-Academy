package arraylits;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList <String> listanimals1= new ArrayList<>();
		listanimals1.add("Lion");
		listanimals1.add("Tiger");
		listanimals1.add("Cat");
		listanimals1.add("Dog");
        System.out.println(listanimals1);
	    ArrayList <String> listanimals2= new ArrayList<>();
		listanimals2.add("Lion");
		listanimals2.add("Tiger");
		listanimals2.add("Elephant");
		listanimals2.add("Cat");
		listanimals2.add("Dog");
	    System.out.println(listanimals2);
		ArrayList <String> Finallistanimals= new ArrayList<>(listanimals1);
		Finallistanimals.addAll(listanimals2);
		System.out.println(Finallistanimals);
		System.out.println("taille:"+Finallistanimals.size());
		System.out.println("Suppression de l'élément en position:4");
		int indexASupprimer = 4;
	     if (indexASupprimer >= 0 && indexASupprimer < Finallistanimals.size()) {
        	Finallistanimals.remove(indexASupprimer);
            System.out.println("Suppression de l'élément en position : " + indexASupprimer);
            System.out.println("Nouveau tableau : " + Finallistanimals);
            System.out.println("Taille du tableau : " + Finallistanimals.size());
        } else {
            System.out.println("Index invalide pour la suppression.");
        }
	     
       String nomASupprimer = "Cat";
        while (Finallistanimals.contains(nomASupprimer)) {
        	Finallistanimals.remove(nomASupprimer);
        }
        System.out.println("Suppression de l'élément " + nomASupprimer + ".");
        System.out.println("Nouveau tableau : " + Finallistanimals);
        System.out.println("Taille du tableau : " + Finallistanimals.size());
        String animalASupprimer = "Tiger";
        if (Finallistanimals.contains(animalASupprimer)) {
        	Finallistanimals.remove(animalASupprimer);
            System.out.println("Suppression de l'animal (nom) : " + animalASupprimer);
            System.out.println("Nouveau tableau : " + Finallistanimals);
            System.out.println("Taille du tableau : " + Finallistanimals.size());
        } else {
            System.out.println("Animal non trouvé pour la suppression.");
        }
        String nomARechercher = "Elephant";
        if (Finallistanimals.contains(nomARechercher)) {
            int indexElementTrouve = Finallistanimals.indexOf(nomARechercher);
            System.out.println("Élément " + nomARechercher + " trouvé à l'index : " + indexElementTrouve);
        } else {
            System.out.println("Élément " + nomARechercher + " non trouvé.");
        int indexARechercher = 2;
        if (indexARechercher >= 0 && indexARechercher < Finallistanimals.size()) {
            String elementTrouve = Finallistanimals.get(indexARechercher);
            System.out.println("Élément à l'index " + indexARechercher + " : " + elementTrouve);
        } else {
            System.out.println("Index invalide pour la recherche.");
        }      
        }
	}}
        
	
        
    
