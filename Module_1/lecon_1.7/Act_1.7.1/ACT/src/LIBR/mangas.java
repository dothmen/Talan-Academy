package LIBR;

public class mangas extends BOOK{

	private boolean color;
	private String direction;
	public mangas(String title, double price, int num_page, String kind, boolean color, String direction) {
		super(title, price, num_page, kind);
		this.color = color;
		this.direction = direction;
	}
	public boolean getColor() {
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
