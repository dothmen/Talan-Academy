package LIBR;

public class BOOK {
	private String title;
	private double price;
	private int num_page;
	private String kind;	
	public BOOK(String title, double price, int num_page, String kind) {
		super();
		this.title = title;
		this.price = price;
		this.num_page = num_page;
		this.kind = kind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum_page() {
		return num_page;
	}
	public void setNum_page(int num_page) {
		this.num_page = num_page;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	


	public void afficher() {
		System.out.println("Titre : " + title);
        System.out.println("Prix : " + price);
        System.out.println("nombre de page : " + num_page);
        System.out.println("Genre : " + kind);
        
		
	}
	
		
	
	
	}
	
	


