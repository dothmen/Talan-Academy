package voile;

public class myboat {

	

	public static void main(String[] args) {
		
		
	 System.out.println("mon bateau");
	 cabin cabin1 = new cabin("rect", 100, 0);
	 bridge bridge1 = new bridge("rouge", 150, 0);
	 Veil veil1 = new Veil(false, false, "rouge", 0, "rect", "tissu", 0);
	 shell shell1= new shell("acier", "rect", 0, veil1);
	 
	 boat monBateau = new boat("rouge", 200, 0, bridge1, cabin1, shell1);
	 
	 System.out.println(monBateau);
	  
		
	}
	

}
