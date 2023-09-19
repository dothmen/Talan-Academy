package LIBR;

public class BD extends BOOK{
	
	private boolean color;
	private String direction;
	public BD(String title, double price, int num_page, String kind, boolean color, String direction) {
		super(title, price, num_page, kind);
		this.color = color;
		this.direction = direction;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void afficher(){
		super.afficher();
	  System.out.println("couleur:" +color);
	  System.out.println("direction d'écriture:" +direction);
		}
}
