package LIBR;

public class Roman extends BOOK {
	private int numb_chapter;
	private String sammary;
	public Roman(String title, double price, int num_page, String kind, int numb_chapter, String sammary) {
		super(title, price, num_page, kind);
		this.numb_chapter = numb_chapter;
		this.sammary = sammary;
	}
	public int getNumb_chapter() {
		return numb_chapter;
	}
	public void setNumb_chapter(int numb_chapter) {
		this.numb_chapter = numb_chapter;
	}
	public String getSammary() {
		return sammary;
	}
	public void setSammary(String sammary) {
		this.sammary = sammary;
	}
	public void afficher(){
		 super.afficher();
		  System.out.println("nombre de chapitre:" +numb_chapter);
		  System.out.println("résumé:" +sammary);
		}
}