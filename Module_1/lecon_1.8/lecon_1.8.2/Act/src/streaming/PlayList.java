package streaming;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class PlayList extends Musique{
		List <Musique> ListMusique;
		public PlayList(String title, String othor, String interpret, String kind, List<Musique> listMusique) {
		super(title, othor, interpret, kind);
		this.ListMusique = new ArrayList<>();
	
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayList other = (PlayList) obj;
		return Objects.equals(title, other.title);
	}

	public String toString() {
		return "titre:"+ title+   "genre" +kind + "liste de musique" +ListMusique;
	}
	public void ajouterMusique() {
		
          Musique nouvelleMusique = new Musique(title, kind, othor, interpret);
 
        ListMusique.add(nouvelleMusique);
       
    }
	 public Musique rechercherMusique(String titre) {
	        for (Musique musique : ListMusique) {
	            if (musique.getTitle().equals(titre)) {
	                return musique;
	            }
	        }
	        return null;
      }
      

}
