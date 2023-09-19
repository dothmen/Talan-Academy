package Inter;

public class Moto extends vehicle implements ActionVhicle {
	
	 public String brand;
	 public String clor;
	 public String name;
	 public Moto(String brand, String clor, String name, String brand2, String clor2, String name2) {
		super(brand, clor, name);
		brand = brand2;
		clor = clor2;
		name = name2;
	} 
	public void freiner(){
     }
     public void passerVitesse() {
     }
     
     }