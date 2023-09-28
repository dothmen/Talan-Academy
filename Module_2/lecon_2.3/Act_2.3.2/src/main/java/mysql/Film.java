package mysql;

public class Film {
	
    private int id_film;
    private String titre;
    private int duree_min;
    public Film() { 
    }
    public Film(int idFilm, String titre, int dureeMin ) {
        this.id_film = idFilm;
        this.titre = titre;
        this.duree_min = dureeMin;   
    }
   public int getIdFilm() {
		return id_film;
	}
	public void setIdFilm(int id_film) {
		this.id_film = id_film;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDureeMin() {
		return duree_min;
	}
	public void setDureeMin(int dureeMin) {
		this.duree_min = dureeMin;
	}
	@Override
    public String toString() {
        return "Film [id=" + id_film + ", titre=" + titre + duree_min+"]";
    }
}
