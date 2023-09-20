package arraylits;

import java.util.ArrayList;

public class List {

	private static int size;

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
		listanimals2.add("Cat");
		listanimals2.add("Dog");
		listanimals2.add("Eliphant");
        System.out.println(listanimals2);
		ArrayList <String> Finallistanimals= new ArrayList<>(listanimals1);
		Finallistanimals.addAll(listanimals2);
		System.out.println(Finallistanimals);
		System.out.println("taille:"+Finallistanimals.size());
	}
}
	